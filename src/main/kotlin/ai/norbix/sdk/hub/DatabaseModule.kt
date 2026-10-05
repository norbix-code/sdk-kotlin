package ai.norbix.sdk.hub

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

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

    fun getAllowedFlexTiers(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/integrations/flex-tiers",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun testDatabaseIntegration(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/integrations/test",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun revealManagedFlexConnectionString(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/integrations/{Id}/connection-string",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `GET /{version}/database/taxonomies/tree` · request DTO `GetDatabaseTaxonomyTreeRequest`. */
    fun getDatabaseTaxonomyTree(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/taxonomies/tree",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `GET /{version}/database/taxonomies/{TaxonomyName}/merged-tree` · request DTO `GetDatabaseMergedTermTreeRequest`. */
    fun getDatabaseMergedTermTree(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/taxonomies/{TaxonomyName}/merged-tree",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `GET /{version}/database/taxonomies/{TaxonomyName}/terms/tree` · request DTO `GetDatabaseTaxonomyTermTreeRequest`. */
    fun getDatabaseTaxonomyTermTree(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/taxonomies/{TaxonomyName}/terms/tree",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `POST /{version}/database/schemas/apply-bundle` · request DTO `ApplyDatabaseSchemaBundleRequest`. */
    fun applyDatabaseSchemaBundle(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/apply-bundle",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `PUT /{version}/database/schemas/{Id}/embed` · request DTO `UpdateDatabaseSchemaEmbedRequest`. */
    fun updateDatabaseSchemaEmbed(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/{Id}/embed",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `GET /{version}/database/schemas/{Id}/list-settings` · request DTO `GetDatabaseSchemaListSettings`. */
    fun getDatabaseSchemaListSettings(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/{Id}/list-settings",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `PUT /{version}/database/schemas/{Id}/list-settings` · request DTO `UpdateDatabaseSchemaListSettingsRequest`. */
    fun updateDatabaseSchemaListSettings(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/schemas/{Id}/list-settings",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `GET /{version}/database/collections/{collectionName}` · request DTO `FindRecords`. */
    fun findRecords(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `GET /{version}/database/collections/{collectionName}/{id}` · request DTO `FindOneRecord`. */
    fun findOneRecord(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `POST /{version}/database/collections/{collectionName}` · request DTO `InsertRecord`. */
    fun insertRecord(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `POST /{version}/database/collections/{collectionName}/many` · request DTO `InsertManyRecords`. */
    fun insertManyRecords(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/many",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `PUT /{version}/database/collections/{collectionName}/{id}` · request DTO `UpdateOneRecord`. */
    fun updateOneRecord(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/{id}",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `PUT /{version}/database/collections/{collectionName}/many` · request DTO `UpdateManyRecords`. */
    fun updateManyRecords(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/many",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `PUT /{version}/database/collections/{collectionName}/{id}/replace` · request DTO `ReplaceRecord`. */
    fun replaceRecord(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/{id}/replace",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `DELETE /{version}/database/collections/{collectionName}/{id}` · request DTO `DeleteRecord`. */
    fun deleteRecord(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/{id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `DELETE /{version}/database/collections/{collectionName}/many` · request DTO `DeleteManyRecords`. */
    fun deleteManyRecords(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/many",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `GET /{version}/database/collections/{collectionName}/count` · request DTO `CountRecords`. */
    fun countRecords(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/count",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `GET /{version}/database/collections/{collectionName}/distinct` · request DTO `DistinctRecordValues`. */
    fun distinctRecordValues(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/distinct",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `POST /{version}/database/collections/{collectionName}/aggregate` · request DTO `AggregateRecords`. */
    fun aggregateRecords(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/aggregate",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `POST /{version}/database/collections/{collectionName}/aggregates/{aggregateId}/execute` · request DTO `ExecuteRecordsAggregate`. */
    fun executeRecordsAggregate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/aggregates/{aggregateId}/execute",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `PUT /{version}/database/collections/{collectionName}/{id}/responsibility` · request DTO `ChangeRecordResponsibility`. */
    fun changeRecordResponsibility(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/{id}/responsibility",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `GET /{version}/database/collections/{collectionName}/indexes` · request DTO `GetCollectionIndexes`. */
    fun getCollectionIndexes(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/indexes",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `POST /{version}/database/collections/seed` · request DTO `SeedCollectionRecords`. */
    fun seedCollectionRecords(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/seed",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

}
