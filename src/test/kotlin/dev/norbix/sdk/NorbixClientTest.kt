package dev.norbix.sdk

import dev.norbix.sdk.api.NorbixApi
import dev.norbix.sdk.core.LoginCredentials
import dev.norbix.sdk.hub.NorbixHub
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class NorbixClientTest {

    @Test
    fun apiAuthStateTransitions() {
        val client = NorbixApi(projectId = "proj", apiKey = "k")
        assertTrue(client.isAuthenticated())
        client.setApiKey(null)
        assertFalse(client.isAuthenticated())
        client.setBearerToken("jwt")
        assertTrue(client.isAuthenticated())
    }

    @Test
    fun hubAuthStateTransitions() {
        val client = NorbixHub(projectId = "proj", apiKey = "k")
        assertTrue(client.isAuthenticated())
        client.setApiKey(null)
        assertFalse(client.isAuthenticated())
        client.setBearerToken("jwt")
        assertTrue(client.isAuthenticated())
    }

    @Test
    fun apiUsesDefaultBaseUrl() {
        val client = NorbixApi(projectId = "proj", apiKey = "k")
        assertEquals("https://api.norbix.ai", client.transport.config.baseUrl)
    }

    @Test
    fun hubUsesDefaultBaseUrl() {
        val client = NorbixHub(projectId = "proj", apiKey = "k")
        assertEquals("https://hub.norbix.ai", client.transport.config.baseUrl)
    }

    @Test
    fun apiAcceptsCustomBaseUrl() {
        val client = NorbixApi(
            projectId = "proj",
            apiKey = "k",
            baseUrl = "http://localhost:5000",
        )
        assertEquals("http://localhost:5000", client.transport.config.baseUrl)
    }

    @Test
    fun hubAcceptsCustomBaseUrl() {
        val client = NorbixHub(
            projectId = "proj",
            apiKey = "k",
            baseUrl = "https://hub.norbix.isidos.lt",
        )
        assertEquals("https://hub.norbix.isidos.lt", client.transport.config.baseUrl)
    }

    @Test
    fun apiRequiresProjectId() {
        assertFailsWith<IllegalArgumentException> {
            NorbixApi(apiKey = "k")
        }
    }

    @Test
    fun hubRequiresProjectId() {
        assertFailsWith<IllegalArgumentException> {
            NorbixHub(apiKey = "k")
        }
    }

    @Test
    fun loginPayloadConstructs() {
        val creds = LoginCredentials(userName = "alice", password = "secret")
        assertEquals("credentials", creds.provider)
    }
}
