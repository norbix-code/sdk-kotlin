package dev.norbix.sdk

import dev.norbix.sdk.core.LoginCredentials
import dev.norbix.sdk.core.Norbix
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class NorbixClientTest {
    @Test
    fun authStateTransitions() {
        val client = Norbix(projectId = "proj", apiKey = "k")
        assertTrue(client.isAuthenticated())
        client.setApiKey(null)
        assertFalse(client.isAuthenticated())
        client.setBearerToken("jwt")
        assertTrue(client.isAuthenticated())
    }

    @Test
    fun loginPayloadConstructs() {
        val creds = LoginCredentials(userName = "alice", password = "secret")
        assertTrue(creds.provider == "credentials")
    }
}
