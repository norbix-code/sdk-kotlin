package dev.norbix.sdk.api

import kotlin.test.Test
import kotlin.test.assertNotNull

class MembershipModuleTest {
    @Test
    fun moduleSurface() {
        val client = NorbixApi(projectId = "proj", bearerToken = "token")
        assertNotNull(client.membership)
    }
}
