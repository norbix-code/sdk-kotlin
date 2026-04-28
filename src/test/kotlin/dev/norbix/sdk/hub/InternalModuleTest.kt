package dev.norbix.sdk.hub

import kotlin.test.Test
import kotlin.test.assertNotNull

class InternalModuleTest {
    @Test
    fun moduleSurface() {
        val client = NorbixHub(projectId = "proj", bearerToken = "token")
        assertNotNull(client.system)
    }
}
