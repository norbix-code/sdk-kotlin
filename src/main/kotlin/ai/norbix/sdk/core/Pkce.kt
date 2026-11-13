package ai.norbix.sdk.core

import java.security.MessageDigest
import java.security.SecureRandom
import java.util.Base64

/**
 * A PKCE (RFC 7636, S256) verifier and its challenge for social sign-in and
 * link identity. Keep [codeVerifier] in memory (never in a URL); send
 * [codeChallenge] on the start (`socialSignInUrl(codeChallenge = …)`,
 * `codeChallenge` on `startLinkIdentity`) and [codeVerifier] on the exchange
 * or the link finish (`codeVerifier`). A code started with a challenge works
 * only with the matching verifier: CM-ERRORS-MEMBERSHIP-058 otherwise, and the
 * code is used up. A challenge that is not S256 is CM-ERRORS-MEMBERSHIP-059.
 */
data class PkcePair(val codeVerifier: String, val codeChallenge: String)

object Pkce {
    private val random = SecureRandom()
    private val encoder = Base64.getUrlEncoder().withoutPadding()
    private val verifierPattern = Regex("""^[A-Za-z0-9\-._~]{43,128}$""")

    /** A fresh verifier (32 bytes from SecureRandom, base64url, 43 characters) and its S256 challenge. */
    fun create(): PkcePair {
        val bytes = ByteArray(32).also(random::nextBytes)
        val verifier = encoder.encodeToString(bytes)
        return PkcePair(verifier, challengeOf(verifier))
    }

    /** The S256 challenge of a verifier: base64url (no padding) of SHA-256 over its ASCII bytes. */
    fun challengeOf(codeVerifier: String): String {
        require(verifierPattern.matches(codeVerifier)) {
            "A PKCE code verifier is 43 to 128 characters of A-Z a-z 0-9 - . _ ~."
        }
        val digest = MessageDigest.getInstance("SHA-256").digest(codeVerifier.toByteArray(Charsets.US_ASCII))
        return encoder.encodeToString(digest)
    }
}
