package dev.norbix.sdk.api

import kotlin.test.Test
import kotlin.test.assertNotNull

class ChatModuleTest {
    @Test
    fun moduleSurface() {
        val client = NorbixApi(projectId = "proj", bearerToken = "token")
        assertNotNull(client.chat)
    }
}
