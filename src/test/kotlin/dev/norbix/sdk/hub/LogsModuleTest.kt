package dev.norbix.sdk.hub

import kotlin.test.Test
import kotlin.test.assertNotNull

class LogsModuleTest {
    @Test
    fun moduleSurface() {
        val client = NorbixHub(projectId = "proj", bearerToken = "token")
        assertNotNull(client.logs)
    }
}
