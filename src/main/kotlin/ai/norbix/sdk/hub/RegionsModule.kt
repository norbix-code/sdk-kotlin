package ai.norbix.sdk.hub

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

/**
 * Norbix regions — list the regions available to the account and update which
 * regions a project uses.
 *
 * These endpoints manage the *set* of regions. To make requests *against* a
 * given region, set `region` on the client (`NorbixHub(region = "nb-eu-germany")`
 * or `hub.setRegion("nb-eu-germany")`) or per call (the optional `region`
 * argument), which sends the `nb-region` header. Unlike environments there is
 * no default region: when unset, no header is sent.
 */
class RegionsModule(private val transport: Transport) {

    /**
     * GET /{version}/account/regions
     * Lists the regions available to the account. Each item carries `id` (the
     * region code, e.g. "nb-eu-germany"), `continent`, and `name`.
     */
    fun list(request: Map<String, Any?> = emptyMap(), region: String? = null): Any? = transport.send(
        path = "/{version}/account/regions",
        method = "GET",
        request = request,
        scope = Scope.ACCOUNT,
        region = region,
    )

    /**
     * PATCH /{version}/account/projects/{projectId}/settings/regions
     * Updates the project's regions. [primaryRegion] and [additionalRegions]
     * are region code strings (e.g. "nb-eu-germany"); pass null to leave one
     * unchanged. Empty response on success.
     */
    fun updateProjectRegions(
        projectId: String,
        primaryRegion: String? = null,
        additionalRegions: List<String>? = null,
        request: Map<String, Any?> = emptyMap(),
        region: String? = null,
    ): Any? = transport.send(
        path = "/{version}/account/projects/{projectId}/settings/regions",
        method = "PATCH",
        request = request + mapOf(
            "projectId" to projectId,
            "primaryRegion" to primaryRegion,
            "additionalRegions" to additionalRegions,
        ),
        scope = Scope.ACCOUNT,
        region = region,
    )
}
