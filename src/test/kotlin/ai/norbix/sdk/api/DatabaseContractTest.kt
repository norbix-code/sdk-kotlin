package ai.norbix.sdk.api

import ai.norbix.sdk.core.NorbixError
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

/**
 * The Database last-wave contract (gateway refactoringV2, 2026-10-05) as the
 * NorbixApi caller sees it: the new `allRecords` flag reaches the gateway
 * (query string for DELETE, JSON body for PUT), and the new refusals arrive
 * as a [NorbixError] carrying the gateway's own code and context.
 * A throw-away local server stands in for the gateway.
 */
class DatabaseContractTest {

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

    @Test
    fun deleteManySendsAllRecordsInTheQuery() = withServer { api, seen ->
        api.database.deleteMany(mapOf("collectionName" to "orders", "filter" to "{}", "allRecords" to true))
        assertEquals("DELETE", seen["method"])
        assertEquals("/v3/database/collections/orders/many", seen["path"])
        assertEquals("filter={}&allRecords=true", seen["query"])
    }

    @Test
    fun updateManySendsAllRecordsInTheBody() = withServer { api, seen ->
        api.database.updateMany(
            mapOf("collectionName" to "orders", "filter" to "{}", "allRecords" to true, "update" to """{"paid":true}"""),
        )
        assertEquals("PUT", seen["method"])
        assertEquals("""{"filter":"{}","allRecords":true,"update":"{\"paid\":true}"}""", seen["body"])
    }

    @Test
    fun anEmptyFilterWithoutAllRecordsIsRefusedWith037() =
        withServer(400, refusal("CM-ERRORS-DATABASE-037", "An empty filter matches every record. Set AllRecords to true.")) { api, _ ->
            val error = assertFailsWith<NorbixError> {
                api.database.deleteMany(mapOf("collectionName" to "orders", "filter" to "{}"))
            }
            assertEquals("CM-ERRORS-DATABASE-037", error.errorCode)
            assertEquals(400, error.httpStatus)
        }

    @Test
    fun anOperatorUpdateBodyIsRefusedWith035() =
        withServer(400, refusal("CM-ERRORS-DATABASE-035", "Update operators are not allowed")) { api, _ ->
            val error = assertFailsWith<NorbixError> {
                api.database.updateOne(mapOf("collectionName" to "orders", "id" to "rec_1", "document" to """{"${'$'}inc":{"n":1}}"""))
            }
            assertEquals("CM-ERRORS-DATABASE-035", error.errorCode)
        }

    @Test
    fun aBrokenInsertManyDocumentIsRefusedWith036AndItsIndex() =
        withServer(400, refusal("CM-ERRORS-DATABASE-036", "Invalid record document", """{"Index": 2}""")) { api, _ ->
            val error = assertFailsWith<NorbixError> {
                api.database.insertMany(mapOf("collectionName" to "orders", "documents" to listOf("{}", "{}", "{broken")))
            }
            assertEquals("CM-ERRORS-DATABASE-036", error.errorCode)
            assertEquals("Invalid record document", error.message)
            assertEquals(2, (error.errors.single().context["Index"] as Number).toInt())
        }

    @Test
    fun aNewOwnerWhoIsNotAProjectUserIsRefusedWith012() =
        withServer(400, refusal("CM-ERRORS-MEMBERSHIP-USERS-012", "User not found")) { api, _ ->
            val error = assertFailsWith<NorbixError> {
                api.database.changeResponsibility(mapOf("collectionName" to "orders", "id" to "rec_1", "newResponsibleUserId" to "usr_x"))
            }
            assertEquals("CM-ERRORS-MEMBERSHIP-USERS-012", error.errorCode)
        }

    @Test
    fun aServerSideJavaScriptTermFilterIsRefusedWith031() =
        withServer(400, refusal("CM-ERRORS-DATABASE-031", "Operator not allowed")) { api, _ ->
            val error = assertFailsWith<NorbixError> {
                api.database.findTerms(mapOf("taxonomyName" to "services", "filter" to """{"${'$'}where":"1"}"""))
            }
            assertEquals("CM-ERRORS-DATABASE-031", error.errorCode)
        }

    @Test
    fun anUnknownTaxonomyNameIsRefusedWith010() =
        withServer(404, refusal("CM-ERRORS-TAXONOMIES-010", "Taxonomy not found")) { api, _ ->
            val error = assertFailsWith<NorbixError> {
                api.database.findMergedTermTree(mapOf("taxonomyName" to "nope"))
            }
            assertEquals("CM-ERRORS-TAXONOMIES-010", error.errorCode)
            assertEquals(404, error.httpStatus)
        }

    @Test
    fun aTermTreeOver5000TermsIsRefusedWith011() =
        withServer(400, refusal("CM-ERRORS-TAXONOMIES-011", "Term tree too large")) { api, _ ->
            val error = assertFailsWith<NorbixError> {
                api.database.findTermTree(mapOf("taxonomyName" to "huge"))
            }
            assertEquals("CM-ERRORS-TAXONOMIES-011", error.errorCode)
        }
}
