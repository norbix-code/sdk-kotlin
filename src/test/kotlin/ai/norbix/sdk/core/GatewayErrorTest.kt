package ai.norbix.sdk.core

import ai.norbix.sdk.api.NorbixApi
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotNull
import kotlin.test.assertNull

/**
 * What the caller sees when a call fails (10b-files slice ERRORS, #66, #67).
 *
 * Two rules are pinned here. First, the message and the error code are the
 * gateway's own: the gateway puts them inside `responseStatus.errors[]`, so
 * reading the top of that block gave every caller "Request failed" and
 * `HTTP_404` — that was #66. Second, a call fails when the gateway says it
 * failed, even with HTTP 200 and `responseStatus.isSuccess = false` — that was
 * #67.
 *
 * Every test starts its own throw-away local server, so the order the tests
 * run in does not matter and no real gateway is contacted.
 */
class GatewayErrorTest {

    private fun withServer(
        status: Int,
        body: String,
        contentType: String = "application/json",
        block: (NorbixApi) -> Unit,
    ) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        server.createContext("/") { ex ->
            val bytes = body.toByteArray()
            ex.responseHeaders.add("Content-Type", contentType)
            ex.sendResponseHeaders(status, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        try {
            val base = "http://127.0.0.1:${server.address.port}"
            block(NorbixApi(projectId = "proj", apiKey = "k", baseUrl = base))
        } finally {
            server.stop(0)
        }
    }

    /** Any call does; the transport is the same for all of them. */
    private fun aCall(api: NorbixApi): Any? =
        api.files.testFilesIntegration(mapOf("filesIntegrationId" to "int_7"))

    /** (a) HTTP 400 with two errors inside responseStatus.errors. */
    @Test
    fun a400TakesMessageAndCodeFromTheFirstErrorAndKeepsThemAll() {
        val body = """
            {"responseStatus": {"isSuccess": false, "errors": [
              {"message": "File name is required", "errorCode": "CM-ERRORS-FILES-002", "fieldName": "fileName"},
              {"message": "Folder does not exist", "errorCode": "CM-ERRORS-FILES-016", "context": {"Provider": "Local"}}
            ]}}
        """.trimIndent()

        withServer(status = 400, body = body) { api ->
            val error = assertFailsWith<NorbixError> { aCall(api) }

            assertEquals("File name is required", error.message)
            assertEquals("CM-ERRORS-FILES-002", error.errorCode)
            assertEquals(400, error.httpStatus)
            assertEquals(2, error.errors.size)
            assertEquals("fileName", error.errors[0].fieldName)
            assertEquals("CM-ERRORS-FILES-016", error.errors[1].errorCode)
            assertEquals("Local", error.errors[1].context["Provider"])
            assertNotNull(error.body, "the answer as it arrived is kept")
        }
    }

    /** (b) HTTP 200 whose body says the call failed. */
    @Test
    fun a200ThatSaysItFailedIsAnError() {
        val body = """
            {"responseStatus": {"isSuccess": false, "errors": [
              {"message": "Integration with id int_7 not found", "errorCode": "CM-ERRORS-INTEGRATIONS-001"}
            ]}}
        """.trimIndent()

        withServer(status = 200, body = body) { api ->
            val error = assertFailsWith<NorbixError> { aCall(api) }

            assertEquals(200, error.httpStatus)
            assertEquals("Integration with id int_7 not found", error.message)
            assertEquals("CM-ERRORS-INTEGRATIONS-001", error.errorCode)
        }
    }

    /** (c) HTTP 200 that says the call worked — unchanged. */
    @Test
    fun a200ThatSaysItWorkedStillComesBackAsAValue() {
        val body = """
            {"items": [{"operation": "UploadFile", "result": "OK"}],
             "responseStatus": {"isSuccess": true}}
        """.trimIndent()

        withServer(status = 200, body = body) { api ->
            val response = aCall(api)

            @Suppress("UNCHECKED_CAST")
            val items = (response as Map<String, Any?>)["items"] as List<Map<String, Any?>>
            assertEquals("OK", items[0]["result"])
        }
    }

    @Test
    fun a200WithNoResponseStatusStillComesBackAsAValue() {
        withServer(status = 200, body = """{"items": []}""") { api ->
            assertNotNull(aCall(api))
        }
    }

    /** (d) a 500 whose body is not JSON at all. */
    @Test
    fun a500WithABodyThatIsNotJsonUsesTheFallbackText() {
        withServer(
            status = 500,
            body = "<html>Bad Gateway</html>",
            contentType = "text/html",
        ) { api ->
            val error = assertFailsWith<NorbixError> { aCall(api) }

            assertEquals("Request failed (HTTP 500)", error.message)
            assertEquals("HTTP_500", error.errorCode)
            assertEquals("<html>Bad Gateway</html>", error.body)
            assertNull(error.errors.firstOrNull())
        }
    }

    @Test
    fun anEmptyErrorBodyUsesTheFallbackTextToo() {
        withServer(status = 404, body = "{}") { api ->
            val error = assertFailsWith<NorbixError> { aCall(api) }

            assertEquals("Request failed (HTTP 404)", error.message)
        }
    }

    @Test
    fun readsTheTopOfTheBodyWhenThereIsNoResponseStatus() {
        val body = """{"message": "Already exists", "errorCode": "CM-ERRORS-FILES-009"}"""

        withServer(status = 409, body = body) { api ->
            val error = assertFailsWith<NorbixError> { aCall(api) }

            assertEquals("Already exists", error.message)
            assertEquals("CM-ERRORS-FILES-009", error.errorCode)
        }
    }
}
