package dev.norbix.sdk.api

import dev.norbix.sdk.core.Norbix
import kotlin.test.Test
import kotlin.test.assertNotNull

class MembershipModuleTest {
    @Test
    fun moduleSurface() {
        val client = Norbix(projectId = "proj", bearerToken = "token")
        assertNotNull(client.api.membership)
    }
}
