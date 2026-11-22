package ai.norbix.sdk.api

import ai.norbix.sdk.core.EMAIL_NOT_VERIFIED_ERROR_CODE
import ai.norbix.sdk.core.NorbixError
import ai.norbix.sdk.core.NorbixErrorItem
import ai.norbix.sdk.core.isEmailNotVerifiedError
import com.google.gson.Gson
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import java.nio.charset.StandardCharsets
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * E-mail address verification for password sign-up (gateway d7d080c92): the
 * confirm and resend calls are public, and a password sign-in refused because
 * the e-mail is not verified (401, CM-ERRORS-MEMBERSHIP-USERS-052) is
 * recognised by [isEmailNotVerifiedError].
 */
class EmailAddressVerificationTest {

    private class Recorder {
        var calls = 0
        var path: String? = null
        var method: String? = null
        var hasAuth = false
        var auth: String? = null
        var project: String? = null
        var body: Map<*, *>? = null
    }

    private fun withServer(status: Int, answer: String, block: (String, Recorder) -> Unit) {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val rec = Recorder()
        server.createContext("/") { ex ->
            rec.calls++
            rec.path = ex.requestURI.rawPath
            rec.method = ex.requestMethod
            rec.hasAuth = ex.requestHeaders.containsKey("Authorization")
            rec.auth = ex.requestHeaders.getFirst("Authorization")
            rec.project = ex.requestHeaders.getFirst("norbix-project-id")
            val raw = ex.requestBody.readBytes().toString(StandardCharsets.UTF_8)
            rec.body = if (raw.isBlank()) null else Gson().fromJson(raw, Map::class.java)
            val bytes = answer.toByteArray()
            ex.responseHeaders.add("Content-Type", "application/json")
            ex.sendResponseHeaders(status, bytes.size.toLong())
            ex.responseBody.use { it.write(bytes) }
        }
        server.start()
        try {
            block("http://127.0.0.1:${server.address.port}", rec)
        } finally {
            server.stop(0)
        }
    }

    /** A client that knows its project and nothing else — no key, no token. */
    private fun anonymousClient(base: String): NorbixApi =
        NorbixApi(projectId = "proj", baseUrl = base).also {
            it.transport.config.apiKey = null
            it.transport.config.bearerToken = null
        }

    @Test
    fun verifyEmailAddressPostsTheTokenWithoutCredentials() {
        withServer(200, """{"authId":"auth-1","verifiedAtUtc":"2026-11-22T10:00:00Z"}""") { base, rec ->
            val result = anonymousClient(base).membership.verifyEmailAddress(mapOf("token" to "tok-1"))

            assertEquals(1, rec.calls)
            assertEquals("POST", rec.method)
            assertEquals("/v3/membership/userauth/email-verification/confirm", rec.path)
            assertFalse(rec.hasAuth, "verifying an e-mail address must not send an Authorization header")
            assertEquals("proj", rec.project)
            assertEquals(mapOf("token" to "tok-1"), rec.body)
            val answer = result as Map<*, *>
            assertEquals("auth-1", answer["authId"])
            assertEquals("2026-11-22T10:00:00Z", answer["verifiedAtUtc"])
        }
    }

    @Test
    fun resendEmailAddressVerificationPostsTheEmailWithoutCredentials() {
        withServer(200, """{}""") { base, rec ->
            anonymousClient(base).membership.resendEmailAddressVerification(
                mapOf("email" to "new@example.com", "databaseIntegrationId" to "int_1"),
            )

            assertEquals(1, rec.calls)
            assertEquals("POST", rec.method)
            assertEquals("/v3/membership/userauth/email-verification/resend", rec.path)
            assertFalse(rec.hasAuth, "a resend must not send an Authorization header")
            assertEquals("proj", rec.project)
            assertEquals(mapOf("email" to "new@example.com", "databaseIntegrationId" to "int_1"), rec.body)
        }
    }

    @Test
    fun verifyEmailAddressCarriesTheTokenWhenTheClientHasOne() {
        withServer(200, """{}""") { base, rec ->
            NorbixApi(projectId = "proj", bearerToken = "jwt-1", baseUrl = base)
                .membership.verifyEmailAddress(mapOf("token" to "tok-1"))

            assertEquals("/v3/membership/userauth/email-verification/confirm", rec.path)
            assertEquals("Bearer jwt-1", rec.auth)
        }
    }

    @Test
    fun anExpiredLinkIsRefusedWithTheGatewayCode() {
        val body = """{"responseStatus":{"errorCode":"Error","message":"x","errors":[""" +
            """{"errorCode":"CM-ERRORS-MEMBERSHIP-051","message":"The link is no longer valid."}]}}"""
        withServer(400, body) { base, _ ->
            val error = assertFailsWith<NorbixError> {
                anonymousClient(base).membership.verifyEmailAddress(mapOf("token" to "old"))
            }
            assertEquals("CM-ERRORS-MEMBERSHIP-051", error.code)
            assertFalse(isEmailNotVerifiedError(error))
        }
    }

    @Test
    fun aPasswordSignInRefusedForAnUnverifiedEmailIsRecognised() {
        val body = """{"responseStatus":{"errorCode":"Unauthorized","message":"x","errors":[""" +
            """{"errorCode":"CM-ERRORS-MEMBERSHIP-USERS-052","message":"Verify your e-mail address first."}]}}"""
        withServer(401, body) { base, _ ->
            val error = assertFailsWith<NorbixError> {
                anonymousClient(base).auth.authenticate(
                    mapOf("provider" to "credentials", "userName" to "new@example.com", "password" to "secret1"),
                )
            }
            assertEquals(401, error.status)
            assertEquals(EMAIL_NOT_VERIFIED_ERROR_CODE, error.code)
            assertTrue(isEmailNotVerifiedError(error))
        }
    }

    @Test
    fun theCodeIsRecognisedAnywhereInTheErrorList() {
        val error = NorbixError(
            code = "HTTP_401",
            status = 401,
            message = "Unauthorized",
            errors = listOf(
                NorbixErrorItem(errorCode = "Unauthorized"),
                NorbixErrorItem(errorCode = "CM-ERRORS-MEMBERSHIP-USERS-052"),
            ),
        )
        assertTrue(isEmailNotVerifiedError(error))
    }

    @Test
    fun otherErrorsAreNotTheEmailRefusal() {
        assertEquals("CM-ERRORS-MEMBERSHIP-USERS-052", EMAIL_NOT_VERIFIED_ERROR_CODE)
        assertFalse(isEmailNotVerifiedError(null))
        assertFalse(isEmailNotVerifiedError(IllegalStateException("CM-ERRORS-MEMBERSHIP-USERS-052")))
        assertFalse(
            isEmailNotVerifiedError(NorbixError(code = "CM-ERRORS-MEMBERSHIP-USERS-050", status = 401, message = "x")),
        )
    }
}
