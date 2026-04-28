package dev.norbix.sdk.hub

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Transport

class DatabaseModule(private val transport: Transport) {
    fun disableDatabase(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/disable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableDatabase(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/enable",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteSchemaTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/triggers/{triggerId}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableSchemaTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/triggers/{triggerId}/disable",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableSchemaTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/triggers/{triggerId}/enable",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSchemaTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/triggers/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getSchemaTriggers(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/triggers",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveSchemaTrigger(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/triggers",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteDatabaseTaxonomy(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/taxonomies/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getDatabaseTaxonomy(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/taxonomies/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getDatabaseTaxonomies(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/taxonomies",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveDatabaseTaxonomy(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/taxonomies",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteDatabaseTaxonomyTerm(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/taxonomies/{TaxonomyId}/terms/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteManyDatabaseTaxonomyTerms(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/taxonomies/{TaxonomyId}/terms/many",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getDatabaseTaxonomyTerm(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/taxonomies/{TaxonomyId}/terms/{Id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveDatabaseTaxonomyTerm(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/taxonomies/{TaxonomyId}/terms",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateDatabaseTaxonomyTerm(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/taxonomies/{TaxonomyId}/terms/{Id}",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteDatabaseSchema(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun discardDatabaseSchemaDraft(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/{Id}/draft",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getDatabaseSchema(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getDatabaseSchemas(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getDatabaseSchemaDraft(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/{Id}/draft",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getDatabaseSchemaVersionDiff(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/{Id}/versions/diff",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getDatabaseSchemaVersions(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/{Id}/versions",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun publishDatabaseSchema(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/{Id}/publish",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun renameDatabaseSchema(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/{Id}/rename",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveDatabaseSchema(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateDatabaseSchemaDraft(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/{Id}/draft",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateDatabaseSchemaSettings(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/{Id}/settings",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteDatabaseIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/integrations/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun disableDatabaseIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/integrations/{Id}/disable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun enableDatabaseIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/integrations/{Id}/enable",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getDatabaseIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/integrations/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getDatabaseIntegrations(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/integrations",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveDatabaseIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/integrations",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun setDatabaseIntegrationAsDefault(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/integrations/{Id}/default",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteDatabaseAggregate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/aggregates/{Id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getDatabaseAggregate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/aggregates/{Id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getDatabaseAggregates(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/aggregates",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun saveDatabaseAggregate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/aggregates",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun testDatabaseAggregate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/aggregates/test",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

}
