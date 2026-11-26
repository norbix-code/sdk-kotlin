package ai.norbix.sdk.core

/**
 * Credentials passed to `NorbixApi.login(...)` / `NorbixHub.login(...)`.
 *
 * [rememberMe] is "Remember me": `true` keeps the session for a sliding
 * 30 days, `false` (the default) for a sliding 12 hours. Never more than
 * 90 days from sign-in. Sent by `NorbixApi.login` (project users) only.
 */
data class LoginCredentials(
    val userName: String,
    val password: String,
    val provider: String = "credentials",
    val rememberMe: Boolean = false,
)
