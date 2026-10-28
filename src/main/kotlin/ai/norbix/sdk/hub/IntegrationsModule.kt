package ai.norbix.sdk.hub

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

/** Helpers shared by the integrations of every module (files, email, code). */
class IntegrationsModule(private val transport: Transport) {
    /**
     * GET /{version}/integrations/keyless/setup — what a developer needs before
     * saving a keyless cloud integration.
     *
     * Request: `module` (files, email or code), `cloud` (azure, aws or google),
     * optional `integrationId` (an existing integration). The answer carries
     * `integrationId` (save with it), `env`, `module`, `cloud`, `issuer`,
     * `subject`, `audience`, `available` (with `unavailableReason` when false)
     * and the cloud setup `script`. `templates`: ready CloudFormation / Bicep /
     * Terraform files for this integration (a list of `kind` / `fileName` /
     * `content` maps).
     */
    fun getKeylessIntegrationSetup(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/integrations/keyless/setup",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )
}
