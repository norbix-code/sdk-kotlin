package ai.norbix.sdk.api

import ai.norbix.sdk.core.NorbixError
import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertTrue

/**
 * Every NorbixApi.database method against a throw-away local server (fake
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
        val call: (NorbixApi, Map<String, Any?>) -> Any?,
    )

    private val cases = listOf(
            Case("findTerms", "GET", "/v3/database/taxonomies/services/terms", mapOf("taxonomyName" to "services", "probe" to "p1")) { c, r -> c.database.findTerms(r) },
            Case("findTermsChildren", "GET", "/v3/database/taxonomies/services/terms/term_1/children", mapOf("taxonomyName" to "services", "parentId" to "term_1", "probe" to "p1")) { c, r -> c.database.findTermsChildren(r) },
            Case("findTermTree", "GET", "/v3/database/taxonomies/services/terms/tree", mapOf("taxonomyName" to "services", "probe" to "p1")) { c, r -> c.database.findTermTree(r) },
            Case("findTaxonomyTree", "GET", "/v3/database/taxonomies/tree", mapOf("probe" to "p1")) { c, r -> c.database.findTaxonomyTree(r) },
            Case("getDatabaseSchema", "GET", "/v3/database/schemas/rec_1", mapOf("id" to "rec_1", "probe" to "p1")) { c, r -> c.database.getDatabaseSchema(r) },
            Case("getDatabaseSchemas", "GET", "/v3/database/schemas", mapOf("probe" to "p1")) { c, r -> c.database.getDatabaseSchemas(r) },
            Case("aggregate", "POST", "/v3/database/collections/orders/aggregate", mapOf("collectionName" to "orders", "probe" to "p1")) { c, r -> c.database.aggregate(r) },
            Case("changeResponsibility", "PUT", "/v3/database/collections/orders/rec_1/responsibility", mapOf("collectionName" to "orders", "id" to "rec_1", "probe" to "p1")) { c, r -> c.database.changeResponsibility(r) },
            Case("count", "GET", "/v3/database/collections/orders/count", mapOf("collectionName" to "orders", "probe" to "p1")) { c, r -> c.database.count(r) },
            Case("deleteMany", "DELETE", "/v3/database/collections/orders/many", mapOf("collectionName" to "orders", "probe" to "p1")) { c, r -> c.database.deleteMany(r) },
            Case("deleteOne", "DELETE", "/v3/database/collections/orders/rec_1", mapOf("collectionName" to "orders", "id" to "rec_1", "probe" to "p1")) { c, r -> c.database.deleteOne(r) },
            Case("distinct", "GET", "/v3/database/collections/orders/distinct", mapOf("collectionName" to "orders", "probe" to "p1")) { c, r -> c.database.distinct(r) },
            Case("executeAggregate", "POST", "/v3/database/collections/orders/aggregates/ag_1/execute", mapOf("collectionName" to "orders", "aggregateId" to "ag_1", "probe" to "p1")) { c, r -> c.database.executeAggregate(r) },
            Case("find", "GET", "/v3/database/collections/orders", mapOf("collectionName" to "orders", "probe" to "p1")) { c, r -> c.database.find(r) },
            Case("findOne", "GET", "/v3/database/collections/orders/rec_1", mapOf("collectionName" to "orders", "id" to "rec_1", "probe" to "p1")) { c, r -> c.database.findOne(r) },
            Case("insertMany", "POST", "/v3/database/collections/orders/many", mapOf("collectionName" to "orders", "probe" to "p1")) { c, r -> c.database.insertMany(r) },
            Case("insertOne", "POST", "/v3/database/collections/orders", mapOf("collectionName" to "orders", "probe" to "p1")) { c, r -> c.database.insertOne(r) },
            Case("replaceOne", "PUT", "/v3/database/collections/orders/rec_1/replace", mapOf("collectionName" to "orders", "id" to "rec_1", "probe" to "p1")) { c, r -> c.database.replaceOne(r) },
            Case("updateMany", "PUT", "/v3/database/collections/orders/many", mapOf("collectionName" to "orders", "probe" to "p1")) { c, r -> c.database.updateMany(r) },
            Case("updateOne", "PUT", "/v3/database/collections/orders/rec_1", mapOf("collectionName" to "orders", "id" to "rec_1", "probe" to "p1")) { c, r -> c.database.updateOne(r) },
            Case("findMergedTermTree", "GET", "/v3/database/taxonomies/services/merged-tree", mapOf("taxonomyName" to "services", "probe" to "p1")) { c, r -> c.database.findMergedTermTree(r) },
            Case("findOwn", "GET", "/v3/database/collections/orders/own", mapOf("collectionName" to "orders", "probe" to "p1")) { c, r -> c.database.findOwn(r) },
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
        val client = NorbixApi(projectId = "proj", bearerToken = "token", baseUrl = base)
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
        assertEquals(22, cases.size)
    }

    @Test
    fun missingPathParameterFailsBeforeSending() = withServer { base, seen ->
        val client = NorbixApi(projectId = "proj", bearerToken = "token", baseUrl = base)
        val error = runCatching { client.database.findOne(mapOf("collectionName" to "orders")) }.exceptionOrNull()
        assertEquals("NORBIX_MISSING_PATH_PARAM", assertIs<NorbixError>(error).code)
        assertTrue(seen.isEmpty(), seen.toString())
    }
}
