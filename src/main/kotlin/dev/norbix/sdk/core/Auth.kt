package dev.norbix.sdk.core

/**
 * Credentials passed to `NorbixApi.login(...)` / `NorbixHub.login(...)`.
 */
data class LoginCredentials(
    val userName: String,
    val password: String,
    val provider: String = "credentials",
)
