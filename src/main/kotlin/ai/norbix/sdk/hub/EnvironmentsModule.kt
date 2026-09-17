package ai.norbix.sdk.hub

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

/**
 * Project environments — list, create, and delete the named environments a
 * project owns (PROD plus any TEST/STAGING/… the user adds).
 *
 * These endpoints manage the *set* of environments. To make requests *inside*
 * a given environment, set `env` on the client (`NorbixHub(env = "TEST")` or
 * `hub.setEnv("TEST")`) or per call (the optional `env` argument), which sends
 * the `norbix-env` header.
 */
class EnvironmentsModule(private val transport: Transport) {

    /**
     * GET /{version}/account/projects/environments
     * Lists the project's environments. The response always includes "PROD".
     */
    fun list(request: Map<String, Any?> = emptyMap(), env: String? = null): Any? = transport.send(
        path = "/{version}/account/projects/environments",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
        env = env,
    )

    /**
     * POST /{version}/account/projects/environments
     * Creates a new environment. [environmentName] e.g. "TEST"; [integration] is
     * a database integration that seeds the new env and becomes its default.
     */
    fun create(
        environmentName: String,
        integration: Map<String, Any?>,
        request: Map<String, Any?> = emptyMap(),
        env: String? = null,
    ): Any? = transport.send(
        path = "/{version}/account/projects/environments",
        method = "POST",
        request = request + mapOf("environmentName" to environmentName, "integration" to integration),
        scope = Scope.PROJECT,
        env = env,
    )

    /**
     * DELETE /{version}/account/projects/environments/{environmentName}
     * Deletes a non-PROD environment, cascading its integrations. PROD is
     * rejected by the backend.
     */
    fun delete(environmentName: String, env: String? = null): Any? = transport.send(
        path = "/{version}/account/projects/environments/{environmentName}",
        method = "DELETE",
        request = mapOf("environmentName" to environmentName),
        scope = Scope.PROJECT,
        env = env,
    )
}
