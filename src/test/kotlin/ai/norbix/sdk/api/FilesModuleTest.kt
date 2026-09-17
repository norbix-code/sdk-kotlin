package ai.norbix.sdk.api

import kotlin.test.Test
import kotlin.test.assertNotNull

class FilesModuleTest {
    @Test
    fun moduleSurface() {
        val client = NorbixApi(projectId = "proj", bearerToken = "token")
        assertNotNull(client.files)
    }
}
