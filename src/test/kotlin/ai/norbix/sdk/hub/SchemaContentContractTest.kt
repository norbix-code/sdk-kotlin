package ai.norbix.sdk.hub

import ai.norbix.sdk.core.ExpandedReference
import ai.norbix.sdk.core.NorbixError
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull

/**
 * The schema-content contract (gateway audit/schema-content, 2026-10-07) as
 * the NorbixHub caller sees it: `expandReferences` on the record reads,
 * `arrayFilters` on the record updates, the file by id, the term slug, and
 * the new schema refusals (SCHEMA-036…041, TAXONOMIES-012 / -013) as a
 * [NorbixError] with the gateway's code and context.
 * A throw-away local server stands in for the gateway.
 */
class SchemaContentContractTest {

    private fun <T> withServer(
        status: Int = 200,
        answer: String = """{"result":{"ok":true}}""",
        block: (NorbixHub, HashMap<String, String?>) -> T,
    ): T {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val seen = HashMap<String, String?>()
        server.createContext("/") { ex ->
            seen["method"] = ex.requestMethod
            seen["path"] = ex.requestURI.path
            seen["query"] = ex.requestURI.query
            seen["body"] = ex.requestBody.readAllBytes().toString(Charsets.UTF_8)
            val bytes = answer.toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(status, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        try {
            val base = "http://127.0.0.1:${server.address.port}"
            return block(NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = base), seen)
        } finally {
            server.stop(0)
        }
    }

    private fun refusal(code: String, message: String, context: String = "{}") = """
        {"responseStatus": {"isSuccess": false, "errors": [
          {"errorCode": "$code", "message": "$message", "context": $context}
        ]}}
    """.trimIndent()

    // --- expandReferences ---------------------------------------------------

    @Test
    fun findRecordsSendsExpandReferencesInTheQuery() = withServer { hub, seen ->
        hub.database.findRecords(mapOf("collectionName" to "posts", "pageSize" to 50, "expandReferences" to true))
        assertEquals("GET", seen["method"])
        assertEquals("/v2/database/collections/posts", seen["path"])
        assertEquals("pageSize=50&expandReferences=true", seen["query"])
    }

    @Test
    fun findOneRecordSendsExpandReferencesInTheQuery() = withServer(
        answer = """{"result": {"_id": "rec_1", "owner": {"id": "usr_1", "display": "jane@team.io"}}}""",
    ) { hub, seen ->
        @Suppress("UNCHECKED_CAST")
        val record = (hub.database.findOneRecord(mapOf("collectionName" to "posts", "id" to "rec_1", "expandReferences" to true))
            as Map<String, Any?>)["result"] as Map<String, Any?>
        assertEquals("/v2/database/collections/posts/rec_1", seen["path"])
        assertEquals("expandReferences=true", seen["query"])
        assertEquals("jane@team.io", ExpandedReference.from(record["owner"])!!.displayText())
    }

    @Test
    fun aSourceTheCallerMayNotReadIsRefusedWith056() =
        withServer(403, refusal("CM-ERRORS-DATABASE-056", "Reference expansion refused", """{"SourceKind": "user", "Source": "users", "Fields": ["owner"], "MissingPermissions": ["membership:users:read"]}""")) { hub, _ ->
            val error = assertFailsWith<NorbixError> {
                hub.database.findRecords(mapOf("collectionName" to "posts", "expandReferences" to true))
            }
            assertEquals("CM-ERRORS-DATABASE-056", error.errorCode)
            assertEquals(listOf("owner"), error.errors.single().context["Fields"])
        }

    // --- nested documents: dotted paths + arrayFilters ------------------------

    @Test
    fun updateOneRecordSendsArrayFiltersInTheBody() = withServer { hub, seen ->
        hub.database.updateOneRecord(
            mapOf("collectionName" to "orders", "id" to "rec_1", "update" to """{"lines.$[line].qty":3}""", "arrayFilters" to """[{"line.sku":"A-1"}]"""),
        )
        assertEquals("PUT", seen["method"])
        assertEquals("/v2/database/collections/orders/rec_1", seen["path"])
        assertEquals("""{"update":"{\"lines.$[line].qty\":3}","arrayFilters":"[{\"line.sku\":\"A-1\"}]"}""", seen["body"])
    }

    @Test
    fun updateManyRecordsSendsArrayFiltersInTheBody() = withServer { hub, seen ->
        hub.database.updateManyRecords(
            mapOf("collectionName" to "orders", "filter" to """{"status":"open"}""", "update" to """{"address.city":"Vilnius"}""", "arrayFilters" to "[]"),
        )
        assertEquals("/v2/database/collections/orders/many", seen["path"])
        assertEquals("""{"filter":"{\"status\":\"open\"}","update":"{\"address.city\":\"Vilnius\"}","arrayFilters":"[]"}""", seen["body"])
    }

    @Test
    fun overlappingUpdatePathsAreRefusedWith014() =
        withServer(400, refusal("CM-ERRORS-DATABASE-014", "paths 'address' and 'address.city' overlap — set the whole value or its members, not both")) { hub, _ ->
            val error = assertFailsWith<NorbixError> {
                hub.database.updateOneRecord(mapOf("collectionName" to "orders", "id" to "rec_1", "update" to """{"address":{},"address.city":"x"}"""))
            }
            assertEquals("CM-ERRORS-DATABASE-014", error.errorCode)
        }

    // --- schema refusals ------------------------------------------------------------

    @Test
    fun everyNewSchemaRefusalArrivesWithItsCode() {
        val cases = listOf(
            "CM-ERRORS-SCHEMA-036" to "nesting too deep",
            "CM-ERRORS-SCHEMA-037" to "default breaks the field's rules",
            "CM-ERRORS-SCHEMA-038" to "nested required names an undeclared field",
            "CM-ERRORS-SCHEMA-039" to "displayField is not a field of the target schema",
            "CM-ERRORS-SCHEMA-022" to "'minimum' is 1E+300 — outside what a decimal number can hold",
        )
        for ((code, message) in cases) {
            withServer(400, refusal(code, message)) { hub, _ ->
                val error = assertFailsWith<NorbixError> {
                    hub.database.saveDatabaseSchema(mapOf("title" to "Orders", "dataSchema" to "{}"))
                }
                assertEquals(code, error.errorCode)
                assertEquals(message, error.message)
            }
        }
    }

    @Test
    fun aDisplayFieldAnotherSchemaShowsCannotBeDroppedOrItsSchemaDeleted() {
        withServer(400, refusal("CM-ERRORS-SCHEMA-040", "displayField in use", """{"Dependents": ["orders.customer → name"]}""")) { hub, _ ->
            val error = assertFailsWith<NorbixError> {
                hub.database.updateDatabaseSchemaDraft(mapOf("Id" to "sch_customers", "dataSchema" to "{}"))
            }
            assertEquals("CM-ERRORS-SCHEMA-040", error.errorCode)
            assertEquals(listOf("orders.customer → name"), error.errors.single().context["Dependents"])
        }
        withServer(400, refusal("CM-ERRORS-SCHEMA-041", "referenced by collection selections")) { hub, _ ->
            val error = assertFailsWith<NorbixError> { hub.database.deleteDatabaseSchema(mapOf("Id" to "sch_customers")) }
            assertEquals("CM-ERRORS-SCHEMA-041", error.errorCode)
        }
    }

    // --- term slug ---------------------------------------------------------------------

    @Test
    fun aTermIsSavedWithAnExplicitSlugAndReadBackWithIt() = withServer(
        answer = """{"result": {"id": "trm_1", "name": "Côte dIvoire", "slug": "cote-divoire"}}""",
    ) { hub, seen ->
        @Suppress("UNCHECKED_CAST")
        val term = (hub.database.saveDatabaseTaxonomyTerm(
            mapOf("TaxonomyId" to "tax_1", "document" to """{"name":"Côte dIvoire","slug":"cote-divoire"}"""),
        ) as Map<String, Any?>)["result"] as Map<String, Any?>
        assertEquals("POST", seen["method"])
        assertEquals("""{"document":"{\"name\":\"Côte dIvoire\",\"slug\":\"cote-divoire\"}"}""", seen["body"])
        assertEquals("cote-divoire", term["slug"])
    }

    @Test
    fun anExplicitSlugAnotherTermHasIsRefusedWith012AndABadOneWith013() {
        withServer(400, refusal("CM-ERRORS-TAXONOMIES-012", "slug 'france' is used by term trm_2", """{"Slug": "france", "OtherTermId": "trm_2"}""")) { hub, _ ->
            val error = assertFailsWith<NorbixError> {
                hub.database.updateDatabaseTaxonomyTerm(mapOf("TaxonomyId" to "tax_1", "Id" to "trm_1", "update" to """{"slug":"france"}"""))
            }
            assertEquals("CM-ERRORS-TAXONOMIES-012", error.errorCode)
            assertEquals("trm_2", error.errors.single().context["OtherTermId"])
        }
        withServer(400, refusal("CM-ERRORS-TAXONOMIES-013", "slug has no letter or digit")) { hub, _ ->
            val error = assertFailsWith<NorbixError> {
                hub.database.saveDatabaseTaxonomyTerm(mapOf("TaxonomyId" to "tax_1", "document" to """{"name":"x","slug":"---"}"""))
            }
            assertEquals("CM-ERRORS-TAXONOMIES-013", error.errorCode)
        }
    }

    // --- files by id ---------------------------------------------------------------

    @Test
    fun getFileByIdSendsBothIdsInTheQuery() = withServer(
        answer = """{"file": {"id": "nbfl_1", "fileName": "report.pdf"}, "isPublic": true, "publicUrl": "https://files.norbix.ai/nbpf_1/report.pdf"}""",
    ) { hub, seen ->
        @Suppress("UNCHECKED_CAST")
        val answer = hub.files.getFileById(mapOf("filesIntegrationId" to "nbin_1", "id" to "nbfl_1")) as Map<String, Any?>
        assertEquals("GET", seen["method"])
        assertEquals("/v2/files/item/by-id", seen["path"])
        assertEquals("filesIntegrationId=nbin_1&id=nbfl_1", seen["query"])
        assertNull(seen["body"]?.takeIf { it.isNotEmpty() })
        assertEquals("https://files.norbix.ai/nbpf_1/report.pdf", answer["publicUrl"])
    }
}
