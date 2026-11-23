package ai.norbix.sdk.hub

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

/** Helpers shared by the integrations of every module: keyless setup and saved secrets. */
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

    /**
     * GET /{version}/integrations/{IntegrationId}/secrets — which secrets of an
     * integration (any module) are saved and which are optional. Never a value
     * or any part of one.
     *
     * The answer's `result` is a list of `key` / `field` / `isSet` /
     * `isOptional` maps (`field` is the save request property that fills the
     * key). Empty for keyless and Norbix-owned integrations and for MCP,
     * Marketplace and Webhook integrations. [env] picks the environment
     * (default: the client's).
     */
    fun getIntegrationSecrets(integrationId: String, env: String? = null): Any? = transport.send(
        path = "/{version}/integrations/{IntegrationId}/secrets",
        method = "GET",
        request = mapOf("IntegrationId" to integrationId, "env" to env),
        scope = Scope.PROJECT,
    )

    /**
     * POST /{version}/integrations/{IntegrationId}/secrets/remove — removes
     * optional secrets ([keys] as [getIntegrationSecrets] lists them). A key the
     * integration needs is refused with `CM-ERRORS-SECRETS-012` (400) and
     * nothing is written. The answer carries `id`.
     */
    fun removeIntegrationSecrets(integrationId: String, keys: List<String>, env: String? = null): Any? = transport.send(
        path = "/{version}/integrations/{IntegrationId}/secrets/remove",
        method = "POST",
        request = mapOf("IntegrationId" to integrationId, "keys" to keys, "env" to env),
        scope = Scope.PROJECT,
    )
}
