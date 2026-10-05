package ai.norbix.sdk.hub

import ai.norbix.sdk.core.NorbixError
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

/**
 * The Database last-wave contract (gateway refactoringV2, 2026-10-05) as the
 * NorbixHub caller sees it: `allRecords` on the bulk record calls, the env
 * filter on schema triggers, the new response fields (`dependencyRefs`,
 * `joinedCollections`, trigger `env`) handed back untouched, and the new
 * refusals as a [NorbixError] with the gateway's code and context.
 * A throw-away local server stands in for the gateway.
 */
class DatabaseContractTest {

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

    @Test
    fun deleteManyRecordsSendsAllRecordsInTheQuery() = withServer { hub, seen ->
        hub.database.deleteManyRecords(mapOf("collectionName" to "orders", "filter" to "{}", "allRecords" to true))
        assertEquals("DELETE", seen["method"])
        assertEquals("filter={}&allRecords=true", seen["query"])
    }

    @Test
    fun updateManyRecordsSendsAllRecordsInTheBody() = withServer { hub, seen ->
        hub.database.updateManyRecords(mapOf("collectionName" to "orders", "filter" to "{}", "allRecords" to true))
        assertEquals("PUT", seen["method"])
        assertEquals("""{"filter":"{}","allRecords":true}""", seen["body"])
    }

    @Test
    fun anEmptyFilterWithoutAllRecordsIsRefusedWith037() =
        withServer(400, refusal("CM-ERRORS-DATABASE-037", "An empty filter matches every record. Set AllRecords to true.")) { hub, _ ->
            val error = assertFailsWith<NorbixError> {
                hub.database.updateManyRecords(mapOf("collectionName" to "orders", "filter" to "{}", "update" to """{"paid":true}"""))
            }
            assertEquals("CM-ERRORS-DATABASE-037", error.errorCode)
        }

    @Test
    fun getSchemaTriggersSendsTheEnvAndKeepsTheRowEnv() =
        withServer(answer = """{"result":[{"id":"trg_1","schemaId":"sch_1","env":"TEST"}]}""") { hub, seen ->
            val rows = hub.database.getSchemaTriggers(mapOf("env" to "TEST"))
            assertEquals("GET", seen["method"])
            assertEquals("env=TEST", seen["query"])
            assertEquals(mapOf("result" to listOf(mapOf("id" to "trg_1", "schemaId" to "sch_1", "env" to "TEST"))), rows)
        }

    @Test
    fun aTriggerWithNoCopyInTheRequestEnvIsNotFound() =
        withServer(404, refusal("CM-ERRORS-TRIGGERS-002", "Trigger not found")) { hub, seen ->
            val error = assertFailsWith<NorbixError> {
                hub.database.enableSchemaTrigger(mapOf("triggerId" to "trg_1", "env" to "TEST"))
            }
            assertEquals("PATCH", seen["method"])
            assertEquals("""{"env":"TEST"}""", seen["body"])
            assertEquals("CM-ERRORS-TRIGGERS-002", error.errorCode)
        }

    @Test
    fun taxonomyListRowsCarryDependencyRefsInOrder() =
        withServer(
            answer = """{"result":[{"viewId":"txn_1","dependencies":["txn_2","txn_gone"],
                "dependencyRefs":[{"id":"txn_2","name":"Cities"},{"id":"txn_gone","name":null}]}]}""",
        ) { hub, _ ->
            @Suppress("UNCHECKED_CAST")
            val answer = hub.database.getDatabaseTaxonomies() as Map<String, Any?>
            val row = (answer["result"] as List<Map<String, Any?>>).single()
            assertEquals(
                listOf(mapOf("id" to "txn_2", "name" to "Cities"), mapOf("id" to "txn_gone", "name" to null)),
                row["dependencyRefs"],
            )
        }

    @Test
    fun aSavedAggregateCarriesItsJoinedCollections() =
        withServer(answer = """{"result":{"viewId":"agg_1","joinedCollections":["customers","invoices"]}}""") { hub, _ ->
            @Suppress("UNCHECKED_CAST")
            val answer = hub.database.getDatabaseAggregate(mapOf("Id" to "agg_1")) as Map<String, Any?>
            val aggregate = answer["result"] as Map<String, Any?>
            assertEquals(listOf("customers", "invoices"), aggregate["joinedCollections"])
        }

    @Test
    fun aSchemaThatASavedAggregateJoinsCannotBeDeleted() =
        withServer(
            400,
            refusal(
                "CM-ERRORS-SCHEMA-018",
                "Schema is used by aggregates",
                """{"BlockerAggregateIds":["agg_1"],"BlockerAggregateNames":["Orders with customers"]}""",
            ),
        ) { hub, _ ->
            val error = assertFailsWith<NorbixError> { hub.database.deleteDatabaseSchema(mapOf("Id" to "sch_1")) }
            assertEquals("CM-ERRORS-SCHEMA-018", error.errorCode)
            assertEquals(listOf("Orders with customers"), error.errors.single().context["BlockerAggregateNames"])
        }

    @Test
    fun aRenameToANameAnotherSchemaUsesIsRefusedWith002() =
        withServer(400, refusal("CM-ERRORS-SCHEMA-002", "Another schema already uses this name", """{"SchemaName":"orders"}""")) { hub, seen ->
            val error = assertFailsWith<NorbixError> {
                hub.database.renameDatabaseSchema(mapOf("Id" to "sch_1", "title" to "Orders"))
            }
            assertEquals("""{"title":"Orders"}""", seen["body"])
            assertEquals("CM-ERRORS-SCHEMA-002", error.errorCode)
        }

    @Test
    fun anAggregateTestWithReadOnlyRightsIsForbidden() =
        withServer(403, refusal("CM-ERRORS-PERMISSIONS-001", "Forbidden")) { hub, _ ->
            val error = assertFailsWith<NorbixError> {
                hub.database.testDatabaseAggregate(mapOf("schemaId" to "sch_1", "pipeline" to "[]"))
            }
            assertEquals(403, error.httpStatus)
        }

    @Test
    fun aTaxonomyTreeWithTermsFailsWhenTheTermReadFails() =
        withServer(400, refusal("CM-ERRORS-TAXONOMIES-011", "Term tree too large")) { hub, seen ->
            val error = assertFailsWith<NorbixError> {
                hub.database.getDatabaseTaxonomyTree(mapOf("includeTerms" to true))
            }
            assertEquals("includeTerms=true", seen["query"])
            assertEquals("CM-ERRORS-TAXONOMIES-011", error.errorCode)
        }
}
