package ai.norbix.sdk.api

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
 * the NorbixApi caller sees it: `expandReferences` on the three record reads
 * and the `{ id, display }` answer, dotted update paths with `arrayFilters`,
 * files by id, the new schema field shapes handed back untouched, and the
 * new refusals (record validation 039–049, references 050–056) as a
 * [NorbixError] with the gateway's code and context.
 * A throw-away local server stands in for the gateway.
 */
class SchemaContentContractTest {

    private fun <T> withServer(
        status: Int = 200,
        answer: String = """{"result":{"ok":true}}""",
        block: (NorbixApi, HashMap<String, String?>) -> T,
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
            return block(NorbixApi(projectId = "proj", bearerToken = "token", baseUrl = base), seen)
        } finally {
            server.stop(0)
        }
    }

    private fun refusal(code: String, message: String, context: String = "{}") = """
        {"responseStatus": {"isSuccess": false, "errors": [
          {"errorCode": "$code", "message": "$message", "context": $context}
        ]}}
    """.trimIndent()

    private val expandedRecord = """
        {"result": {"_id": "rec_1",
          "author": {"id": "usr_1", "display": "Jane Doe"},
          "tags": [{"id": "6650", "display": {"en": "News"}}, {"id": "6651", "display": null}],
          "customer": {"address": {"region": {"id": "trm_9", "display": "Vilnius"}}}}}
    """.trimIndent()

    // --- expandReferences ---------------------------------------------------

    @Test
    fun findSendsExpandReferencesInTheQuery() = withServer { api, seen ->
        api.database.find(mapOf("collectionName" to "posts", "filter" to "{}", "expandReferences" to true))
        assertEquals("GET", seen["method"])
        assertEquals("/v2/database/collections/posts", seen["path"])
        assertEquals("filter={}&expandReferences=true", seen["query"])
    }

    @Test
    fun findOneSendsExpandReferencesInTheQuery() = withServer { api, seen ->
        api.database.findOne(mapOf("collectionName" to "posts", "id" to "rec_1", "expandReferences" to true))
        assertEquals("/v2/database/collections/posts/rec_1", seen["path"])
        assertEquals("expandReferences=true", seen["query"])
    }

    @Test
    fun findOwnSendsExpandReferencesInTheQuery() = withServer { api, seen ->
        api.database.findOwn(mapOf("collectionName" to "posts", "expandReferences" to true))
        assertEquals("/v2/database/collections/posts/own", seen["path"])
        assertEquals("expandReferences=true", seen["query"])
    }

    @Test
    fun aReadWithoutTheFlagSendsNothingNew() = withServer { api, seen ->
        api.database.findOne(mapOf("collectionName" to "posts", "id" to "rec_1"))
        assertNull(seen["query"])
    }

    @Test
    @Suppress("UNCHECKED_CAST")
    fun anExpandedAnswerReadsAsIdAndDisplayPairsAtAnyDepth() = withServer(answer = expandedRecord) { api, _ ->
        val record = (api.database.findOne(mapOf("collectionName" to "posts", "id" to "rec_1", "expandReferences" to true))
            as Map<String, Any?>)["result"] as Map<String, Any?>

        val author = ExpandedReference.from(record["author"])!!
        assertEquals("usr_1", author.id)
        assertEquals("Jane Doe", author.displayText())

        val tags = ExpandedReference.listFrom(record["tags"])
        assertEquals(listOf("6650", "6651"), tags.map { it.id })
        assertEquals("News", tags[0].displayText("en"))
        assertNull(tags[1].display, "a missing target shows display null")

        val customer = record["customer"] as Map<String, Any?>
        val address = customer["address"] as Map<String, Any?>
        assertEquals("Vilnius", ExpandedReference.from(address["region"])!!.displayText())
    }

    @Test
    fun aSourceTheCallerMayNotReadIsRefusedWith056() = withServer(
        403,
        refusal(
            "CM-ERRORS-DATABASE-056", "Reference expansion refused",
            """{"SourceKind": "collection", "Source": "customers", "Fields": ["customer"], "MissingPermissions": ["database:read"]}""",
        ),
    ) { api, _ ->
        val error = assertFailsWith<NorbixError> {
            api.database.find(mapOf("collectionName" to "orders", "expandReferences" to true))
        }
        assertEquals("CM-ERRORS-DATABASE-056", error.errorCode)
        assertEquals(403, error.httpStatus)
        val context = error.errors.single().context
        assertEquals("customers", context["Source"])
        assertEquals(listOf("database:read"), context["MissingPermissions"])
    }

    @Test
    fun aTaxonomyTheProjectDoesNotHaveIsRefusedWith055OnTheRead() =
        withServer(400, refusal("CM-ERRORS-DATABASE-055", "Field 'tags' is invalid: taxonomy 'topics' is not in the project", """{"FieldName": "tags", "Keyword": "reference", "Target": "topics"}""")) { api, _ ->
            val error = assertFailsWith<NorbixError> {
                api.database.find(mapOf("collectionName" to "posts", "expandReferences" to true))
            }
            assertEquals("CM-ERRORS-DATABASE-055", error.errorCode)
            assertEquals("topics", error.errors.single().context["Target"])
        }

    // --- nested documents: dotted paths + arrayFilters ------------------------

    @Test
    fun updateOneSendsADottedPathAndArrayFiltersInTheBody() = withServer { api, seen ->
        api.database.updateOne(
            mapOf(
                "collectionName" to "orders", "id" to "rec_1",
                "update" to """{"lines.$[line].qty":3}""",
                "arrayFilters" to """[{"line.sku":"A-1"}]""",
            ),
        )
        assertEquals("PUT", seen["method"])
        assertEquals("/v2/database/collections/orders/rec_1", seen["path"])
        assertEquals("""{"update":"{\"lines.$[line].qty\":3}","arrayFilters":"[{\"line.sku\":\"A-1\"}]"}""", seen["body"])
    }

    @Test
    fun updateManySendsArrayFiltersNextToTheFilter() = withServer { api, seen ->
        api.database.updateMany(
            mapOf(
                "collectionName" to "orders",
                "filter" to """{"status":"open"}""",
                "update" to """{"lines.$[].qty":1,"address.city":"Vilnius"}""",
                "arrayFilters" to "[]",
            ),
        )
        assertEquals("/v2/database/collections/orders/many", seen["path"])
        assertEquals(
            """{"filter":"{\"status\":\"open\"}","update":"{\"lines.$[].qty\":1,\"address.city\":\"Vilnius\"}","arrayFilters":"[]"}""",
            seen["body"],
        )
    }

    @Test
    fun anUnpairedArrayFilterIsRefusedWith014() =
        withServer(400, refusal("CM-ERRORS-DATABASE-014", "Invalid update document", """{"propertyName": "ArrayFilters", "reason": "identifier 'line' has no filter"}""")) { api, _ ->
            val error = assertFailsWith<NorbixError> {
                api.database.updateOne(mapOf("collectionName" to "orders", "id" to "rec_1", "update" to """{"lines.$[line].qty":3}"""))
            }
            assertEquals("CM-ERRORS-DATABASE-014", error.errorCode)
            assertEquals("ArrayFilters", error.errors.single().context["propertyName"])
        }

    @Test
    fun aNestedRefusalNamesTheFullPathAndTheKeyword() =
        withServer(400, refusal("CM-ERRORS-DATABASE-047", "Field 'lines[1].extra' is invalid: unknown member", """{"FieldName": "lines[1].extra", "Keyword": "properties"}""")) { api, _ ->
            val error = assertFailsWith<NorbixError> {
                api.database.insertOne(mapOf("collectionName" to "orders", "document" to """{"lines":[{"sku":"A"},{"sku":"B","extra":1}]}"""))
            }
            assertEquals("CM-ERRORS-DATABASE-047", error.errorCode)
            assertEquals("lines[1].extra", error.errors.single().context["FieldName"])
            assertEquals("properties", error.errors.single().context["Keyword"])
        }

    @Test
    fun aSortOnAListIsRefusedWith039() =
        withServer(400, refusal("CM-ERRORS-DATABASE-039", "Field 'lines' is invalid: is an array — a list cannot be sorted or paged on", """{"FieldName": "lines", "Keyword": "type"}""")) { api, seen ->
            val error = assertFailsWith<NorbixError> {
                api.database.find(mapOf("collectionName" to "orders", "sortBy" to "lines.qty"))
            }
            assertEquals("sortBy=lines.qty", seen["query"])
            assertEquals("CM-ERRORS-DATABASE-039", error.errorCode)
        }

    // --- record validation codes 040–049 (one keyword each) -------------------

    @Test
    fun everyRecordValidationKeywordArrivesWithItsOwnCode() {
        val cases = listOf(
            "CM-ERRORS-DATABASE-040" to "length",
            "CM-ERRORS-DATABASE-041" to "pattern",
            "CM-ERRORS-DATABASE-042" to "format",
            "CM-ERRORS-DATABASE-043" to "range",
            "CM-ERRORS-DATABASE-044" to "multipleOf",
            "CM-ERRORS-DATABASE-045" to "enum",
            "CM-ERRORS-DATABASE-046" to "uniqueItems",
            "CM-ERRORS-DATABASE-048" to "coordinates",
            "CM-ERRORS-DATABASE-049" to "translateOptions",
        )
        for ((code, keyword) in cases) {
            withServer(400, refusal(code, "Field 'f' is invalid", """{"FieldName": "f", "Keyword": "$keyword"}""")) { api, _ ->
                val error = assertFailsWith<NorbixError> {
                    api.database.insertOne(mapOf("collectionName" to "orders", "document" to "{}"))
                }
                assertEquals(code, error.errorCode)
                assertEquals(keyword, error.errors.single().context["Keyword"])
            }
        }
    }

    @Test
    fun aReferenceToAMissingTargetArrivesWithTheMissingId() {
        val cases = listOf(
            "CM-ERRORS-DATABASE-050" to "usr_x",
            "CM-ERRORS-DATABASE-051" to "rol_x",
            "CM-ERRORS-DATABASE-052" to "trm_x",
            "CM-ERRORS-DATABASE-053" to "rec_x",
            "CM-ERRORS-DATABASE-054" to "nbfl_x",
        )
        for ((code, missing) in cases) {
            withServer(400, refusal(code, "Field 'ref' is invalid: '$missing' not found", """{"FieldName": "ref", "Keyword": "reference", "MissingId": "$missing"}""")) { api, _ ->
                val error = assertFailsWith<NorbixError> {
                    api.database.insertOne(mapOf("collectionName" to "orders", "document" to """{"ref":"$missing"}"""))
                }
                assertEquals(code, error.errorCode)
                assertEquals(missing, error.errors.single().context["MissingId"])
                assertEquals("reference", error.errors.single().context["Keyword"])
            }
        }
    }

    // --- schema read: the new field shapes are handed back untouched ------------

    @Test
    @Suppress("UNCHECKED_CAST")
    fun aSchemaWithNestedAndJsonFieldsIsHandedBackAsSent() = withServer(
        answer = """
            {"result": {"id": "sch_1", "fields": [
              {"${'$'}fieldType": "object", "name": "address", "required": ["city"], "properties": [
                {"${'$'}fieldType": "string", "name": "city", "unique": false, "default": "Vilnius"}]},
              {"${'$'}fieldType": "array", "name": "lines", "minItems": 1, "maxItems": 10, "uniqueItems": false,
                "items": {"${'$'}fieldType": "object", "name": "line", "properties": [
                  {"${'$'}fieldType": "collection", "name": "product", "collectionName": "products", "displayField": "title"}]}},
              {"${'$'}fieldType": "json", "name": "settings", "maxBytes": 65536},
              {"${'$'}fieldType": "currency", "name": "price", "multipleOf": 0.01, "minimum": 0, "default": {"value": 9.99, "currency": "EUR"}},
              {"${'$'}fieldType": "file", "name": "scans", "minItems": 0, "maxItems": 3, "allowedFileType": "application/pdf", "maxSizeMb": 5}
            ]}}
        """.trimIndent(),
    ) { api, _ ->
        val schema = (api.database.getDatabaseSchema(mapOf("id" to "sch_1")) as Map<String, Any?>)["result"] as Map<String, Any?>
        val fields = schema["fields"] as List<Map<String, Any?>>
        assertEquals(listOf("object", "array", "json", "currency", "file"), fields.map { it["${'$'}fieldType"] })

        val address = fields[0]
        assertEquals(listOf("city"), address["required"])
        assertEquals("Vilnius", (address["properties"] as List<Map<String, Any?>>)[0]["default"])

        val lines = fields[1]
        assertEquals(1.0, lines["minItems"])
        val item = lines["items"] as Map<String, Any?>
        val product = (item["properties"] as List<Map<String, Any?>>)[0]
        assertEquals("title", product["displayField"])

        assertEquals(65536.0, fields[2]["maxBytes"])
        assertEquals(mapOf("value" to 9.99, "currency" to "EUR"), fields[3]["default"])
        assertEquals("application/pdf", fields[4]["allowedFileType"])
        assertEquals(5.0, fields[4]["maxSizeMb"])
    }

    @Test
    fun termRowsCarryTheirSlug() = withServer(answer = """{"list": [{"id": "trm_1", "name": "France", "slug": "france"}]}""") { api, _ ->
        @Suppress("UNCHECKED_CAST")
        val rows = (api.database.findTerms(mapOf("taxonomyName" to "countries")) as Map<String, Any?>)["list"] as List<Map<String, Any?>>
        assertEquals("france", rows.single()["slug"])
    }

    // --- files by id ---------------------------------------------------------------

    @Test
    fun getFileByIdReadsTheByIdRoute() = withServer(
        answer = """{"file": {"id": "nbfl_1", "fileName": "report.pdf"}, "isPublic": false, "publicUrl": null}""",
    ) { api, seen ->
        @Suppress("UNCHECKED_CAST")
        val answer = api.files.getFileById(mapOf("filesIntegrationId" to "nbin_1", "id" to "nbfl_1")) as Map<String, Any?>
        assertEquals("GET", seen["method"])
        assertEquals("/v2/files/nbin_1/by-id/nbfl_1", seen["path"])
        assertNull(seen["query"])
        assertEquals("report.pdf", (answer["file"] as Map<*, *>)["fileName"])
        assertEquals(false, answer["isPublic"])
    }

    @Test
    fun anUnknownFileIdIsA404() =
        withServer(404, refusal("CM-ERRORS-FILES-016", "File not found")) { api, _ ->
            val error = assertFailsWith<NorbixError> {
                api.files.getFileById(mapOf("filesIntegrationId" to "nbin_1", "id" to "nbfl_nope"))
            }
            assertEquals(404, error.httpStatus)
            assertEquals("CM-ERRORS-FILES-016", error.errorCode)
        }
}
