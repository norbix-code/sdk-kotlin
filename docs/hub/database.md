# HUB · Database

| Method | Verb | Path | Scope |
| --- | --- | --- | --- |
| `disableDatabase` | `PUT` | `/{version}/database/disable` | `project` |
| `enableDatabase` | `PUT` | `/{version}/database/enable` | `project` |
| `deleteSchemaTrigger` | `DELETE` | `/{version}/database/schemas/triggers/{triggerId}` | `project` |
| `disableSchemaTrigger` | `PATCH` | `/{version}/database/schemas/triggers/{triggerId}/disable` | `project` |
| `enableSchemaTrigger` | `PATCH` | `/{version}/database/schemas/triggers/{triggerId}/enable` | `project` |
| `getSchemaTrigger` | `GET` | `/{version}/database/schemas/triggers/{id}` | `project` |
| `getSchemaTriggers` | `GET` | `/{version}/database/schemas/triggers` | `project` |
| `saveSchemaTrigger` | `POST` | `/{version}/database/schemas/triggers` | `project` |
| `deleteDatabaseTaxonomy` | `DELETE` | `/{version}/database/taxonomies/{Id}` | `project` |
| `getDatabaseTaxonomy` | `GET` | `/{version}/database/taxonomies/{id}` | `project` |
| `getDatabaseTaxonomies` | `GET` | `/{version}/database/taxonomies` | `project` |
| `saveDatabaseTaxonomy` | `POST` | `/{version}/database/taxonomies` | `project` |
| `deleteDatabaseTaxonomyTerm` | `DELETE` | `/{version}/database/taxonomies/{TaxonomyId}/terms/{Id}` | `project` |
| `deleteManyDatabaseTaxonomyTerms` | `DELETE` | `/{version}/database/taxonomies/{TaxonomyId}/terms/many` | `project` |
| `getDatabaseTaxonomyTerm` | `GET` | `/{version}/database/taxonomies/{TaxonomyId}/terms/{Id}` | `project` |
| `saveDatabaseTaxonomyTerm` | `POST` | `/{version}/database/taxonomies/{TaxonomyId}/terms` | `project` |
| `updateDatabaseTaxonomyTerm` | `PUT` | `/{version}/database/taxonomies/{TaxonomyId}/terms/{Id}` | `project` |
| `deleteDatabaseSchema` | `DELETE` | `/{version}/database/schemas/{Id}` | `project` |
| `discardDatabaseSchemaDraft` | `DELETE` | `/{version}/database/schemas/{Id}/draft` | `project` |
| `getDatabaseSchema` | `GET` | `/{version}/database/schemas/{id}` | `project` |
| `getDatabaseSchemas` | `GET` | `/{version}/database/schemas` | `project` |
| `getDatabaseSchemaDraft` | `GET` | `/{version}/database/schemas/{Id}/draft` | `project` |
| `getDatabaseSchemaVersionDiff` | `GET` | `/{version}/database/schemas/{Id}/versions/diff` | `project` |
| `getDatabaseSchemaVersions` | `GET` | `/{version}/database/schemas/{Id}/versions` | `project` |
| `publishDatabaseSchema` | `POST` | `/{version}/database/schemas/{Id}/publish` | `project` |
| `renameDatabaseSchema` | `PUT` | `/{version}/database/schemas/{Id}/rename` | `project` |
| `saveDatabaseSchema` | `POST` | `/{version}/database/schemas` | `project` |
| `updateDatabaseSchemaDraft` | `PUT` | `/{version}/database/schemas/{Id}/draft` | `project` |
| `updateDatabaseSchemaSettings` | `PUT` | `/{version}/database/schemas/{Id}/settings` | `project` |
| `deleteDatabaseIntegration` | `DELETE` | `/{version}/database/integrations/{Id}` | `project` |
| `disableDatabaseIntegration` | `PUT` | `/{version}/database/integrations/{Id}/disable` | `project` |
| `enableDatabaseIntegration` | `PUT` | `/{version}/database/integrations/{Id}/enable` | `project` |
| `getDatabaseIntegration` | `GET` | `/{version}/database/integrations/{id}` | `project` |
| `getDatabaseIntegrations` | `GET` | `/{version}/database/integrations` | `project` |
| `saveDatabaseIntegration` | `POST` | `/{version}/database/integrations` | `project` |
| `setDatabaseIntegrationAsDefault` | `PUT` | `/{version}/database/integrations/{Id}/default` | `project` |
| `deleteDatabaseAggregate` | `DELETE` | `/{version}/database/aggregates/{Id}` | `project` |
| `getDatabaseAggregate` | `GET` | `/{version}/database/aggregates/{Id}` | `project` |
| `getDatabaseAggregates` | `GET` | `/{version}/database/aggregates` | `project` |
| `saveDatabaseAggregate` | `POST` | `/{version}/database/aggregates` | `project` |
| `testDatabaseAggregate` | `POST` | `/{version}/database/aggregates/test` | `project` |
| `getAllowedFlexTiers` | `GET` | `/{version}/database/integrations/flex-tiers` | `project` |
| `testDatabaseIntegration` | `POST` | `/{version}/database/integrations/test` | `project` |
| `revealManagedFlexConnectionString` | `GET` | `/{version}/database/integrations/{Id}/connection-string` | `project` |
| `getDatabaseTaxonomyTree` | `GET` | `/{version}/database/taxonomies/tree` | `project` |
| `getDatabaseMergedTermTree` | `GET` | `/{version}/database/taxonomies/{TaxonomyName}/merged-tree` | `project` |
| `getDatabaseTaxonomyTermTree` | `GET` | `/{version}/database/taxonomies/{TaxonomyName}/terms/tree` | `project` |
| `applyDatabaseSchemaBundle` | `POST` | `/{version}/database/schemas/apply-bundle` | `project` |
| `updateDatabaseSchemaEmbed` | `PUT` | `/{version}/database/schemas/{Id}/embed` | `project` |
| `getDatabaseSchemaListSettings` | `GET` | `/{version}/database/schemas/{Id}/list-settings` | `project` |
| `updateDatabaseSchemaListSettings` | `PUT` | `/{version}/database/schemas/{Id}/list-settings` | `project` |
| `findRecords` | `GET` | `/{version}/database/collections/{collectionName}` | `project` |
| `findOneRecord` | `GET` | `/{version}/database/collections/{collectionName}/{id}` | `project` |
| `insertRecord` | `POST` | `/{version}/database/collections/{collectionName}` | `project` |
| `insertManyRecords` | `POST` | `/{version}/database/collections/{collectionName}/many` | `project` |
| `updateOneRecord` | `PUT` | `/{version}/database/collections/{collectionName}/{id}` | `project` |
| `updateManyRecords` | `PUT` | `/{version}/database/collections/{collectionName}/many` | `project` |
| `replaceRecord` | `PUT` | `/{version}/database/collections/{collectionName}/{id}/replace` | `project` |
| `deleteRecord` | `DELETE` | `/{version}/database/collections/{collectionName}/{id}` | `project` |
| `deleteManyRecords` | `DELETE` | `/{version}/database/collections/{collectionName}/many` | `project` |
| `countRecords` | `GET` | `/{version}/database/collections/{collectionName}/count` | `project` |
| `distinctRecordValues` | `GET` | `/{version}/database/collections/{collectionName}/distinct` | `project` |
| `aggregateRecords` | `POST` | `/{version}/database/collections/{collectionName}/aggregate` | `project` |
| `executeRecordsAggregate` | `POST` | `/{version}/database/collections/{collectionName}/aggregates/{aggregateId}/execute` | `project` |
| `changeRecordResponsibility` | `PUT` | `/{version}/database/collections/{collectionName}/{id}/responsibility` | `project` |
| `getCollectionIndexes` | `GET` | `/{version}/database/collections/{collectionName}/indexes` | `project` |
| `seedCollectionRecords` | `POST` | `/{version}/database/collections/seed` | `project` |
| `createCollectionImport` | `POST` | `/{version}/database/imports` | `project` |
| `deleteCollectionImport` | `DELETE` | `/{version}/database/imports/{Id}` | `project` |
| `getCollectionImport` | `GET` | `/{version}/database/imports/{Id}` | `project` |
| `getCollectionImports` | `GET` | `/{version}/database/imports` | `project` |
| `requestImportUploadUrl` | `POST` | `/{version}/database/imports/upload-url` | `project` |
| `analyzeImportFile` | `POST` | `/{version}/database/imports/analyze` | `project` |

## Records from the dashboard side

`NorbixHub` has its own record calls (`findRecords`, `findOneRecord`,
`insertRecord`, `updateOneRecord`, `deleteManyRecords`, `aggregateRecords`,
...). They use the same paths as the `NorbixApi.database` calls (`find`,
`findOne`, `insertOne`, ...) but go to the Hub with a dashboard user's token:
use them in admin tools, and the `NorbixApi` calls in a customer-facing app.
`getCollectionIndexes` lists a collection's indexes. `seedCollectionRecords`
fills collections with sample records (`mode` `dummy` or `realistic`).

```kotlin
val page = hub.database.findRecords(mapOf("collectionName" to "orders", "filter" to "{}"))
hub.database.insertRecord(mapOf("collectionName" to "orders", "document" to """{"total":10}"""))
```

## Schema extras

| Call | What it does |
| --- | --- |
| `getDatabaseSchemaListSettings` / `updateDatabaseSchemaListSettings` | Read / save how the dashboard shows the schema's records list. |
| `updateDatabaseSchemaEmbed` | Save which records go into the project's AI knowledge. |
| `applyDatabaseSchemaBundle` | Create every collection and taxonomy of a compiled bundle, linked and published. |
| `getDatabaseTaxonomyTree` | The taxonomies as a tree. |
| `getDatabaseTaxonomyTermTree` | One taxonomy's terms as a tree. |
| `getDatabaseMergedTermTree` | One term tree across a taxonomy and its child taxonomies. |

## Import a CSV file into a collection

Four steps, each one call:

1. `requestImportUploadUrl` — a signed URL; upload the file there.
2. `analyzeImportFile` — the file's columns and first rows, so you can map
   columns to schema fields.
3. `createCollectionImport` — start the import (`schemaId` or
   `collectionName`, the file reference, `delimiter`, `hasHeader`, the column
   mapping). It answers the import id; the rows are written in the background.
4. `getCollectionImport` — progress and row errors. `getCollectionImports`
   lists every import of the project; `deleteCollectionImport` removes one.

```kotlin
val importId = hub.database.createCollectionImport(mapOf(
    "collectionName" to "orders",
    "file" to mapOf("id" to "fil_123"),
    "hasHeader" to true,
))
val progress = hub.database.getCollectionImport(mapOf("Id" to "imp_123"))
```
