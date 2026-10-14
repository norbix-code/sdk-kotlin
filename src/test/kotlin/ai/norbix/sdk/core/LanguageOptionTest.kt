package ai.norbix.sdk.core

import ai.norbix.sdk.api.NorbixApi
import ai.norbix.sdk.hub.NorbixHub
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull

/**
 * The client-level `language` option: sent as the standard `Accept-Language`
 * header, no default (no header when unset), per-call override, runtime
 * setLanguage / getLanguage. Mirrors RegionsModuleTest.
 */
class LanguageOptionTest {

    @Test
    fun defaultsToUnset() {
        val hub = NorbixHub(projectId = "proj", apiKey = "k")
        assertNull(hub.getLanguage())
        assertNull(hub.transport.config.language)

        val api = NorbixApi(projectId = "proj", apiKey = "k")
        assertNull(api.getLanguage())
        assertNull(api.transport.config.language)
    }

    @Test
    fun acceptsConfiguredLanguageWithoutTouchingBaseUrl() {
        val hub = NorbixHub(projectId = "proj", apiKey = "k", language = "lt-LT, en;q=0.8")
        assertEquals("lt-LT, en;q=0.8", hub.getLanguage())
        assertEquals(NorbixHub.DEFAULT_BASE_URL, hub.transport.config.baseUrl)

        val api = NorbixApi(projectId = "proj", apiKey = "k", language = "lt")
        assertEquals("lt", api.getLanguage())
        assertEquals(NorbixApi.DEFAULT_BASE_URL, api.transport.config.baseUrl)
    }

    @Test
    fun blankLanguageIsUnset() {
        assertNull(NorbixHub(projectId = "proj", apiKey = "k", language = "  ").getLanguage())
        assertNull(NorbixApi(projectId = "proj", apiKey = "k", language = "").getLanguage())
    }

    @Test
    fun setLanguageRuntimeAndUnsetReset() {
        for (client in listOf<Pair<(String?) -> Unit, () -> String?>>(
            NorbixHub(projectId = "proj", apiKey = "k").let { it::setLanguage to it::getLanguage },
            NorbixApi(projectId = "proj", apiKey = "k").let { it::setLanguage to it::getLanguage },
        )) {
            val (set, get) = client
            set("lt")
            assertEquals("lt", get())
            set("en-US, en;q=0.9")
            assertEquals("en-US, en;q=0.9", get())
            set(" ")
            assertNull(get())
            set("de")
            set(null)
            assertNull(get())
        }
    }

    // End-to-end header check against a tiny local server.
    @Test
    fun sendsAcceptLanguageOnlyWhenResolved() {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val seen = HashMap<String, String?>()
        server.createContext("/") { ex ->
            seen["accept-language"] = ex.requestHeaders.getFirst("Accept-Language")
            seen["accept-language-count"] = (ex.requestHeaders["Accept-Language"]?.size ?: 0).toString()
            seen["culture"] = ex.requestHeaders.getFirst("CultureCode")
            seen["norbix-language"] = ex.requestHeaders.getFirst("norbix-language")
            seen["query"] = ex.requestURI.rawQuery
            seen["body"] = ex.requestBody.readAllBytes().toString(Charsets.UTF_8)
            val body = "{}".toByteArray()
            ex.responseHeaders.add("Content-Language", "lt")
            ex.sendResponseHeaders(200, body.size.toLong())
            ex.responseBody.use { it.write(body) }
        }
        server.start()
        try {
            val base = "http://127.0.0.1:${server.address.port}"

            // Unset: no header.
            NorbixApi(projectId = "proj", apiKey = "k", baseUrl = base).echo.echo()
            assertNull(seen["accept-language"])

            // Configured language: header present, sent as given (q-values kept).
            NorbixApi(projectId = "proj", apiKey = "k", language = "lt-LT, en;q=0.8", baseUrl = base).echo.echo()
            assertEquals("lt-LT, en;q=0.8", seen["accept-language"])
            // The removed selectors are never sent.
            assertNull(seen["culture"])
            assertNull(seen["norbix-language"])
            assertFalse((seen["query"] ?: "").contains("cultureCode", ignoreCase = true))

            // Per-call override wins over the client language.
            val hub = NorbixHub(
                projectId = "proj", apiKey = "k", accountId = "acc",
                language = "lt", baseUrl = base,
            )
            hub.regions.list(language = "de")
            assertEquals("de", seen["accept-language"])
            hub.regions.list()
            assertEquals("lt", seen["accept-language"])

            // Transport.send per-call override, and runtime switch.
            hub.transport.send(path = "/{version}/echo", method = "GET", language = "fr")
            assertEquals("fr", seen["accept-language"])
            hub.setLanguage("en")
            hub.regions.list()
            assertEquals("en", seen["accept-language"])

            // The client language replaces an Accept-Language default header
            // rather than sending two of them.
            NorbixApi(
                projectId = "proj", apiKey = "k", language = "lt", baseUrl = base,
                defaultHeaders = mapOf("Accept-Language" to "en"),
            ).echo.echo()
            assertEquals("lt", seen["accept-language"])
            assertEquals("1", seen["accept-language-count"])

            hub.setLanguage(null)
            hub.regions.list()
            assertNull(seen["accept-language"])

            // sendRaw carries the client language too, and the answer's
            // Content-Language is readable.
            hub.setLanguage("lt")
            val raw = hub.transport.sendRaw(path = "/{version}/echo", method = "GET")
            assertEquals("lt", seen["accept-language"])
            assertEquals("lt", raw.header("Content-Language"))
        } finally {
            server.stop(0)
        }
    }
}
