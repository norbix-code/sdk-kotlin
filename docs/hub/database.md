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

## Record rules (same as `NorbixApi.database`)

The Hub record calls follow the same rules as the API ones — see
[API · Database → Writing records](../api/database.md):

- `updateManyRecords` / `deleteManyRecords` refuse an empty filter `{}` with
  `CM-ERRORS-DATABASE-037` unless `allRecords = true` is sent.
- `$` operators in an update body → `CM-ERRORS-DATABASE-035`; a broken record
  body → `CM-ERRORS-DATABASE-036` (with `Index` for `insertManyRecords`).
- Own-record callers may use the bulk calls; they touch only their own records.
- `changeRecordResponsibility` refuses a new owner who is not a user of the
  project in the request env (`CM-ERRORS-MEMBERSHIP-USERS-012`).
- Updates, replaces and owner changes skip soft-deleted records.

```kotlin
hub.database.updateManyRecords(mapOf(
    "collectionName" to "orders",
    "filter" to "{}",
    "allRecords" to true,
    "update" to """{"archived":true}""",
))
```

## Schemas

- `renameDatabaseSchema` takes only `title`. A rename to a name another schema
  in the same env already uses is always refused with `CM-ERRORS-SCHEMA-002`
  (context `SchemaName`). The old `renameUniqueName` switch is gone.
- `deleteDatabaseSchema` is refused with `CM-ERRORS-SCHEMA-018` while a saved
  aggregate starts on the schema **or joins it**. The error context lists
  `BlockerAggregateIds` and `BlockerAggregateNames`.
- `deleteDatabaseSchema` also **drops the schema's records**: its MongoDB
  collection, with its indexes, in the request environment (in every active
  database integration of that environment). For a schema with AI embed on,
  its records are also removed from the AI knowledge. Nothing is dropped when
  the delete is refused (a saved aggregate or a schema trigger still uses the
  schema). The request and the response did not change. A retry is safe: a
  second delete of the same schema does no harm.

## Aggregates

- `getDatabaseAggregate` / `getDatabaseAggregates` rows carry
  `joinedCollections`: every collection the pipeline joins (`$lookup`,
  `$graphLookup`, `$unionWith`, nested pipelines). Running the aggregate needs
  read on the start collection and on each of these.
- `testDatabaseAggregate` needs `database:create` **or** `database:update` on
  `database:aggregate:<schemaId>`, plus read on the collections. A caller with
  read rights only is refused.

## Taxonomies

- `getDatabaseTaxonomies` rows carry `dependencyRefs`: a list of
  `{ id, name }`, one per id in `dependencies` and in the same order. An id
  that no longer resolves keeps its place with `name = null`. The old
  `dependencyNames` list is gone.
- `saveDatabaseTaxonomy` with the `viewId` of an existing taxonomy is an
  update and asks `database:update` on `database:taxonomy:<viewId>`. Without a
  `viewId` (or with an unknown one) it is a create and asks `database:create`.
- Term reads by name (`getDatabaseTaxonomyTermTree`,
  `getDatabaseMergedTermTree`) ask `database:read` on
  `database:term:<taxonomy id>`; unknown name → `CM-ERRORS-TAXONOMIES-010`;
  more than 5000 terms → `CM-ERRORS-TAXONOMIES-011`; a name over 40
  characters → `CM-ERRORS-TAXONOMIES-005`.
- `getDatabaseTaxonomyTree` with `includeTerms = true` fails when a term read
  fails (before, it returned the taxonomies without terms).

```kotlin
val list = hub.database.getDatabaseTaxonomies()
// each row: "dependencies": ["txn_2", "txn_gone"],
//           "dependencyRefs": [{"id": "txn_2", "name": "Cities"}, {"id": "txn_gone", "name": null}]
```

## Schema triggers per environment

A schema trigger has one copy per environment. Send `env` (for example
`"TEST"`) to work on that copy; without `env` the call works on `PROD`.

- `getSchemaTriggers` lists only the rows of the request env; every row has
  `env`.
- `getSchemaTrigger` returns `env`, and `schemaId` is the owning schema id
  (`sch_…`). Before, `schemaId` wrongly held the trigger's own id (`trg_…`).
- `enableSchemaTrigger`, `disableSchemaTrigger` and `deleteSchemaTrigger` act
  on the copy in the request env. No copy in that env →
  `CM-ERRORS-TRIGGERS-002` (not found).
- `saveSchemaTrigger` with an existing trigger id under another schema →
  `CM-ERRORS-TRIGGERS-002`. A trigger cannot be moved to another schema.

```kotlin
val testTriggers = hub.database.getSchemaTriggers(mapOf("env" to "TEST"))
hub.database.disableSchemaTrigger(mapOf("triggerId" to "trg_1", "env" to "TEST"))
```

## Integrations per environment

`getDatabaseIntegrations` lists only the request env's copies; each row has
`env`. `getDatabaseIntegration` returns `isSystemOwned`.

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
