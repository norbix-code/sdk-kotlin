package dev.norbix.sdk.api

import com.sun.net.httpserver.HttpServer
import dev.norbix.sdk.core.NorbixError
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull

class FilesPublicLinkTest {

    private class Recorder {
        var path: String? = null
        var method: String? = null
        var auth: String? = null
    }

    private fun withServer(
        status: Int = 200,
        body: ByteArray = "{}".toByteArray(),
        contentType: String = "application/octet-stream",
        block: (String, Recorder) -> Unit,
    ) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.path = ex.requestURI.path
            rec.method = ex.requestMethod
            rec.auth = ex.requestHeaders.getFirst("Authorization")
            ex.responseHeaders.add("Content-Type", contentType)
            ex.sendResponseHeaders(status, body.size.toLong())
            ex.responseBody.use { it.write(body) }
        }
        server.start()
        try {
            block("http://127.0.0.1:${server.address.port}", rec)
        } finally {
            server.stop(0)
        }
    }

    @Test
    fun getPublicFileSendsNoAuthorizationHeader() {
        withServer(body = "PDF-BYTES".toByteArray()) { base, rec ->
            val api = NorbixApi(projectId = "proj", apiKey = "k", baseUrl = base)
            api.files.getPublicFile(publicId = "nbpf_abc", name = "report.pdf")
            assertNull(rec.auth, "a public link must work without signing in")
        }
    }

    @Test
    fun getPublicFileHitsThePublicRouteAndReturnsBytes() {
        withServer(body = "PDF-BYTES".toByteArray()) { base, rec ->
            val api = NorbixApi(projectId = "proj", apiKey = "k", baseUrl = base)
            val bytes = api.files.getPublicFile(publicId = "nbpf_abc", name = "report.pdf")

            assertEquals("GET", rec.method)
            assertEquals("/v2/files/public/nbpf_abc/report.pdf", rec.path)
            assertEquals("PDF-BYTES", String(bytes, Charsets.UTF_8))
        }
    }

    @Test
    fun getPublicFileKeepsSlashesInAFolderRelativeName() {
        withServer { base, rec ->
            val api = NorbixApi(projectId = "proj", apiKey = "k", baseUrl = base)
            api.files.getPublicFile(publicId = "nbpf_folder", name = "2026/q1/report.pdf")

            // The gateway route ends in a wildcard token, so the slashes of a
            // folder-relative name have to survive as slashes.
            assertEquals("/v2/files/public/nbpf_folder/2026/q1/report.pdf", rec.path)
        }
    }

    @Test
    fun getPublicFileReturnsBinaryBytesUnmangled() {
        // 0x89 'P' 'N' 'G' … — the PNG magic number. A JSON parse of this
        // either throws or silently turns it into something else.
        val png = byteArrayOf(0x89.toByte(), 0x50, 0x4E, 0x47, 0x0D, 0x0A, 0x1A, 0x0A)
        withServer(body = png, contentType = "image/png") { base, _ ->
            val api = NorbixApi(projectId = "proj", apiKey = "k", baseUrl = base)
            val bytes = api.files.getPublicFile(publicId = "nbpf_img", name = "logo.png")
            assertContentEquals(png, bytes)
        }
    }

    @Test
    fun getPublicFileSurfacesAPlain404() {
        val body = """{"message":"Not Found"}""".toByteArray()
        withServer(status = 404, body = body, contentType = "application/json") { base, _ ->
            val api = NorbixApi(projectId = "proj", apiKey = "k", baseUrl = base)
            val error = assertFailsWith<NorbixError> {
                api.files.getPublicFile(publicId = "nbpf_gone", name = "x.pdf")
            }
            assertEquals(404, error.status)
        }
    }
}
