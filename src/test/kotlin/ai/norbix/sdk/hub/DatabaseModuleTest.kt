package ai.norbix.sdk.hub

import ai.norbix.sdk.core.NorbixError
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertTrue

/**
 * Every NorbixHub.database method against a throw-away local server (fake
 * transport, never a real gateway): the verb, the path with its parameters
 * filled in, and where the rest of the request goes — the query string for
 * GET / DELETE, the JSON body for every other verb.
 */
class DatabaseModuleTest {

    private class Case(
        val name: String,
        val verb: String,
        val path: String,
        val request: Map<String, Any?>,
        val call: (NorbixHub, Map<String, Any?>) -> Any?,
    )

    private val cases = listOf(
            Case("disableDatabase", "PUT", "/v2/database/disable", mapOf("probe" to "p1")) { c, r -> c.database.disableDatabase(r) },
            Case("enableDatabase", "PUT", "/v2/database/enable", mapOf("probe" to "p1")) { c, r -> c.database.enableDatabase(r) },
            Case("deleteSchemaTrigger", "DELETE", "/v2/database/schemas/triggers/tr_1", mapOf("triggerId" to "tr_1", "probe" to "p1")) { c, r -> c.database.deleteSchemaTrigger(r) },
            Case("disableSchemaTrigger", "PATCH", "/v2/database/schemas/triggers/tr_1/disable", mapOf("triggerId" to "tr_1", "probe" to "p1")) { c, r -> c.database.disableSchemaTrigger(r) },
            Case("enableSchemaTrigger", "PATCH", "/v2/database/schemas/triggers/tr_1/enable", mapOf("triggerId" to "tr_1", "probe" to "p1")) { c, r -> c.database.enableSchemaTrigger(r) },
            Case("getSchemaTrigger", "GET", "/v2/database/schemas/triggers/rec_1", mapOf("id" to "rec_1", "probe" to "p1")) { c, r -> c.database.getSchemaTrigger(r) },
            Case("getSchemaTriggers", "GET", "/v2/database/schemas/triggers", mapOf("probe" to "p1")) { c, r -> c.database.getSchemaTriggers(r) },
            Case("saveSchemaTrigger", "POST", "/v2/database/schemas/triggers", mapOf("probe" to "p1")) { c, r -> c.database.saveSchemaTrigger(r) },
            Case("deleteDatabaseTaxonomy", "DELETE", "/v2/database/taxonomies/rec_1", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.deleteDatabaseTaxonomy(r) },
            Case("getDatabaseTaxonomy", "GET", "/v2/database/taxonomies/rec_1", mapOf("id" to "rec_1", "probe" to "p1")) { c, r -> c.database.getDatabaseTaxonomy(r) },
            Case("getDatabaseTaxonomies", "GET", "/v2/database/taxonomies", mapOf("probe" to "p1")) { c, r -> c.database.getDatabaseTaxonomies(r) },
            Case("saveDatabaseTaxonomy", "POST", "/v2/database/taxonomies", mapOf("probe" to "p1")) { c, r -> c.database.saveDatabaseTaxonomy(r) },
            Case("deleteDatabaseTaxonomyTerm", "DELETE", "/v2/database/taxonomies/tx_1/terms/rec_1", mapOf("TaxonomyId" to "tx_1", "Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.deleteDatabaseTaxonomyTerm(r) },
            Case("deleteManyDatabaseTaxonomyTerms", "DELETE", "/v2/database/taxonomies/tx_1/terms/many", mapOf("TaxonomyId" to "tx_1", "probe" to "p1")) { c, r -> c.database.deleteManyDatabaseTaxonomyTerms(r) },
            Case("getDatabaseTaxonomyTerm", "GET", "/v2/database/taxonomies/tx_1/terms/rec_1", mapOf("TaxonomyId" to "tx_1", "Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.getDatabaseTaxonomyTerm(r) },
            Case("saveDatabaseTaxonomyTerm", "POST", "/v2/database/taxonomies/tx_1/terms", mapOf("TaxonomyId" to "tx_1", "probe" to "p1")) { c, r -> c.database.saveDatabaseTaxonomyTerm(r) },
            Case("updateDatabaseTaxonomyTerm", "PUT", "/v2/database/taxonomies/tx_1/terms/rec_1", mapOf("TaxonomyId" to "tx_1", "Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.updateDatabaseTaxonomyTerm(r) },
            Case("deleteDatabaseSchema", "DELETE", "/v2/database/schemas/rec_1", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.deleteDatabaseSchema(r) },
            Case("discardDatabaseSchemaDraft", "DELETE", "/v2/database/schemas/rec_1/draft", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.discardDatabaseSchemaDraft(r) },
            Case("getDatabaseSchema", "GET", "/v2/database/schemas/rec_1", mapOf("id" to "rec_1", "probe" to "p1")) { c, r -> c.database.getDatabaseSchema(r) },
            Case("getDatabaseSchemas", "GET", "/v2/database/schemas", mapOf("probe" to "p1")) { c, r -> c.database.getDatabaseSchemas(r) },
            Case("getDatabaseSchemaDraft", "GET", "/v2/database/schemas/rec_1/draft", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.getDatabaseSchemaDraft(r) },
            Case("getDatabaseSchemaVersionDiff", "GET", "/v2/database/schemas/rec_1/versions/diff", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.getDatabaseSchemaVersionDiff(r) },
            Case("getDatabaseSchemaVersions", "GET", "/v2/database/schemas/rec_1/versions", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.getDatabaseSchemaVersions(r) },
            Case("publishDatabaseSchema", "POST", "/v2/database/schemas/rec_1/publish", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.publishDatabaseSchema(r) },
            Case("renameDatabaseSchema", "PUT", "/v2/database/schemas/rec_1/rename", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.renameDatabaseSchema(r) },
            Case("saveDatabaseSchema", "POST", "/v2/database/schemas", mapOf("probe" to "p1")) { c, r -> c.database.saveDatabaseSchema(r) },
            Case("updateDatabaseSchemaDraft", "PUT", "/v2/database/schemas/rec_1/draft", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.updateDatabaseSchemaDraft(r) },
            Case("updateDatabaseSchemaSettings", "PUT", "/v2/database/schemas/rec_1/settings", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.updateDatabaseSchemaSettings(r) },
            Case("deleteDatabaseIntegration", "DELETE", "/v2/database/integrations/rec_1", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.deleteDatabaseIntegration(r) },
            Case("disableDatabaseIntegration", "PUT", "/v2/database/integrations/rec_1/disable", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.disableDatabaseIntegration(r) },
            Case("enableDatabaseIntegration", "PUT", "/v2/database/integrations/rec_1/enable", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.enableDatabaseIntegration(r) },
            Case("getDatabaseIntegration", "GET", "/v2/database/integrations/rec_1", mapOf("id" to "rec_1", "probe" to "p1")) { c, r -> c.database.getDatabaseIntegration(r) },
            Case("getDatabaseIntegrations", "GET", "/v2/database/integrations", mapOf("probe" to "p1")) { c, r -> c.database.getDatabaseIntegrations(r) },
            Case("saveDatabaseIntegration", "POST", "/v2/database/integrations", mapOf("probe" to "p1")) { c, r -> c.database.saveDatabaseIntegration(r) },
            Case("setDatabaseIntegrationAsDefault", "PUT", "/v2/database/integrations/rec_1/default", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.setDatabaseIntegrationAsDefault(r) },
            Case("deleteDatabaseAggregate", "DELETE", "/v2/database/aggregates/rec_1", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.deleteDatabaseAggregate(r) },
            Case("getDatabaseAggregate", "GET", "/v2/database/aggregates/rec_1", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.getDatabaseAggregate(r) },
            Case("getDatabaseAggregates", "GET", "/v2/database/aggregates", mapOf("probe" to "p1")) { c, r -> c.database.getDatabaseAggregates(r) },
            Case("saveDatabaseAggregate", "POST", "/v2/database/aggregates", mapOf("probe" to "p1")) { c, r -> c.database.saveDatabaseAggregate(r) },
            Case("testDatabaseAggregate", "POST", "/v2/database/aggregates/test", mapOf("probe" to "p1")) { c, r -> c.database.testDatabaseAggregate(r) },
            Case("getAllowedFlexTiers", "GET", "/v2/database/integrations/flex-tiers", mapOf("probe" to "p1")) { c, r -> c.database.getAllowedFlexTiers(r) },
            Case("testDatabaseIntegration", "POST", "/v2/database/integrations/test", mapOf("probe" to "p1")) { c, r -> c.database.testDatabaseIntegration(r) },
            Case("revealManagedFlexConnectionString", "GET", "/v2/database/integrations/rec_1/connection-string", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.revealManagedFlexConnectionString(r) },
            Case("getDatabaseTaxonomyTree", "GET", "/v2/database/taxonomies/tree", mapOf("probe" to "p1")) { c, r -> c.database.getDatabaseTaxonomyTree(r) },
            Case("getDatabaseMergedTermTree", "GET", "/v2/database/taxonomies/services/merged-tree", mapOf("TaxonomyName" to "services", "probe" to "p1")) { c, r -> c.database.getDatabaseMergedTermTree(r) },
            Case("getDatabaseTaxonomyTermTree", "GET", "/v2/database/taxonomies/services/terms/tree", mapOf("TaxonomyName" to "services", "probe" to "p1")) { c, r -> c.database.getDatabaseTaxonomyTermTree(r) },
            Case("applyDatabaseSchemaBundle", "POST", "/v2/database/schemas/apply-bundle", mapOf("probe" to "p1")) { c, r -> c.database.applyDatabaseSchemaBundle(r) },
            Case("updateDatabaseSchemaEmbed", "PUT", "/v2/database/schemas/rec_1/embed", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.updateDatabaseSchemaEmbed(r) },
            Case("getDatabaseSchemaListSettings", "GET", "/v2/database/schemas/rec_1/list-settings", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.getDatabaseSchemaListSettings(r) },
            Case("updateDatabaseSchemaListSettings", "PUT", "/v2/database/schemas/rec_1/list-settings", mapOf("Id" to "rec_1", "probe" to "p1")) { c, r -> c.database.updateDatabaseSchemaListSettings(r) },
            Case("findRecords", "GET", "/v2/database/collections/orders", mapOf("collectionName" to "orders", "probe" to "p1")) { c, r -> c.database.findRecords(r) },
            Case("findOneRecord", "GET", "/v2/database/collections/orders/rec_1", mapOf("collectionName" to "orders", "id" to "rec_1", "probe" to "p1")) { c, r -> c.database.findOneRecord(r) },
            Case("insertRecord", "POST", "/v2/database/collections/orders", mapOf("collectionName" to "orders", "probe" to "p1")) { c, r -> c.database.insertRecord(r) },
            Case("insertManyRecords", "POST", "/v2/database/collections/orders/many", mapOf("collectionName" to "orders", "probe" to "p1")) { c, r -> c.database.insertManyRecords(r) },
            Case("updateOneRecord", "PUT", "/v2/database/collections/orders/rec_1", mapOf("collectionName" to "orders", "id" to "rec_1", "probe" to "p1")) { c, r -> c.database.updateOneRecord(r) },
            Case("updateManyRecords", "PUT", "/v2/database/collections/orders/many", mapOf("collectionName" to "orders", "probe" to "p1")) { c, r -> c.database.updateManyRecords(r) },
            Case("replaceRecord", "PUT", "/v2/database/collections/orders/rec_1/replace", mapOf("collectionName" to "orders", "id" to "rec_1", "probe" to "p1")) { c, r -> c.database.replaceRecord(r) },
            Case("deleteRecord", "DELETE", "/v2/database/collections/orders/rec_1", mapOf("collectionName" to "orders", "id" to "rec_1", "probe" to "p1")) { c, r -> c.database.deleteRecord(r) },
            Case("deleteManyRecords", "DELETE", "/v2/database/collections/orders/many", mapOf("collectionName" to "orders", "probe" to "p1")) { c, r -> c.database.deleteManyRecords(r) },
            Case("countRecords", "GET", "/v2/database/collections/orders/count", mapOf("collectionName" to "orders", "probe" to "p1")) { c, r -> c.database.countRecords(r) },
            Case("distinctRecordValues", "GET", "/v2/database/collections/orders/distinct", mapOf("collectionName" to "orders", "probe" to "p1")) { c, r -> c.database.distinctRecordValues(r) },
            Case("aggregateRecords", "POST", "/v2/database/collections/orders/aggregate", mapOf("collectionName" to "orders", "probe" to "p1")) { c, r -> c.database.aggregateRecords(r) },
            Case("executeRecordsAggregate", "POST", "/v2/database/collections/orders/aggregates/ag_1/execute", mapOf("collectionName" to "orders", "aggregateId" to "ag_1", "probe" to "p1")) { c, r -> c.database.executeRecordsAggregate(r) },
            Case("changeRecordResponsibility", "PUT", "/v2/database/collections/orders/rec_1/responsibility", mapOf("collectionName" to "orders", "id" to "rec_1", "probe" to "p1")) { c, r -> c.database.changeRecordResponsibility(r) },
            Case("getCollectionIndexes", "GET", "/v2/database/collections/orders/indexes", mapOf("collectionName" to "orders", "probe" to "p1")) { c, r -> c.database.getCollectionIndexes(r) },
            Case("seedCollectionRecords", "POST", "/v2/database/collections/seed", mapOf("probe" to "p1")) { c, r -> c.database.seedCollectionRecords(r) },
    )

    private fun <T> withServer(block: (String, HashMap<String, String?>) -> T): T {
        val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
        val seen = HashMap<String, String?>()
        server.createContext("/") { ex ->
            seen["method"] = ex.requestMethod
            seen["path"] = ex.requestURI.path
            seen["query"] = ex.requestURI.query
            seen["body"] = ex.requestBody.readAllBytes().toString(Charsets.UTF_8)
            seen["auth"] = ex.requestHeaders.getFirst("Authorization")
            seen["project"] = ex.requestHeaders.getFirst("X-CM-ProjectId")
            val body = """{"result":{"ok":true}}""".toByteArray()
            ex.sendResponseHeaders(200, body.size.toLong())
            ex.responseBody.use { it.write(body) }
        }
        server.start()
        try {
            return block("http://127.0.0.1:${server.address.port}", seen)
        } finally {
            server.stop(0)
        }
    }

    @Test
    fun everyMethodHitsItsRoute() = withServer { base, seen ->
        val client = NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = base)
        for (case in cases) {
            seen.clear()
            val answer = case.call(client, case.request)
            assertEquals(case.verb, seen["method"], case.name)
            assertEquals(case.path, seen["path"], case.name)
            assertEquals("Bearer token", seen["auth"], case.name)
            assertEquals("proj", seen["project"], case.name)
            if (case.verb == "GET" || case.verb == "DELETE") {
                assertEquals("probe=p1", seen["query"], case.name)
                assertEquals("", seen["body"], case.name)
            } else {
                assertEquals(null, seen["query"], case.name)
                assertEquals("""{"probe":"p1"}""", seen["body"], case.name)
            }
            assertEquals(mapOf("result" to mapOf("ok" to true)), answer, case.name)
        }
    }

    @Test
    fun everyMethodIsCovered() {
        val declared = DatabaseModule::class.java.declaredMethods
            .filter { java.lang.reflect.Modifier.isPublic(it.modifiers) && !it.name.contains('$') }
            .map { it.name }
            .toSortedSet()
        assertEquals(declared, cases.map { it.name }.toSortedSet())
        assertEquals(67, cases.size)
    }

    @Test
    fun missingPathParameterFailsBeforeSending() = withServer { base, seen ->
        val client = NorbixHub(projectId = "proj", bearerToken = "token", baseUrl = base)
        val error = runCatching { client.database.findOneRecord(mapOf("collectionName" to "orders")) }.exceptionOrNull()
        assertEquals("NORBIX_MISSING_PATH_PARAM", assertIs<NorbixError>(error).code)
        assertTrue(seen.isEmpty(), seen.toString())
    }
}
