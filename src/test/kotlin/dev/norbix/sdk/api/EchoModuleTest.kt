package dev.norbix.sdk.api

import kotlin.test.Test
import kotlin.test.assertNotNull

class EchoModuleTest {
    @Test
    fun moduleSurface() {
        val client = NorbixApi(projectId = "proj", bearerToken = "token")
        assertNotNull(client.echo)
    }
}
