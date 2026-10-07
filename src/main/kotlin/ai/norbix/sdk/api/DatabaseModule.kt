package ai.norbix.sdk.api

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

class DatabaseModule(private val transport: Transport) {
    fun findTerms(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/taxonomies/{taxonomyName}/terms",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun findTermsChildren(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/taxonomies/{taxonomyName}/terms/{parentId}/children",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun findTermTree(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/taxonomies/{taxonomyName}/terms/tree",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun findTaxonomyTree(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/taxonomies/tree",
        method = "GET",
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

    fun aggregate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/aggregate",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun changeResponsibility(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/{id}/responsibility",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun count(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/count",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteMany(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/many",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteOne(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/{id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun distinct(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/distinct",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun executeAggregate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/aggregates/{aggregateId}/execute",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `GET /{version}/database/collections/{collectionName}`
     *
     * Pass `expandReferences = true` to get every reference value (user, role,
     * taxonomy term, record of another collection) as `{ id, display }`
     * instead of the bare id — a `multiple` reference as a list of them.
     * `display` is the target's `displayField` from the schema, `null` when
     * the target is gone. Read a pair with [ai.norbix.sdk.core.ExpandedReference.from].
     * The caller needs read permission on every source the schema links to,
     * or the read is refused with `CM-ERRORS-DATABASE-056`. Without the flag
     * the answer is exactly what it was before.
     */
    fun find(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `GET /{version}/database/collections/{collectionName}/{id}`
     *
     * Pass `expandReferences = true` to get every reference value (user, role,
     * taxonomy term, record of another collection) as `{ id, display }`
     * instead of the bare id — a `multiple` reference as a list of them.
     * `display` is the target's `displayField` from the schema, `null` when
     * the target is gone. Read a pair with [ai.norbix.sdk.core.ExpandedReference.from].
     * The caller needs read permission on every source the schema links to,
     * or the read is refused with `CM-ERRORS-DATABASE-056`. Without the flag
     * the answer is exactly what it was before.
     */
    fun findOne(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun insertMany(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/many",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun insertOne(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun replaceOne(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/{id}/replace",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `PUT /{version}/database/collections/{collectionName}/many`
     *
     * The `update` body is applied with `$set`. Its keys may be dotted paths
     * into nested data: `{"address.city": "Vilnius"}`, `{"lines.2.qty": 3}`
     * (an element by index), `{"lines.$[].qty": 1}` (every element) or
     * `{"lines.$[line].qty": 3}` together with `arrayFilters` — a JSON array
     * of one filter document per `$[name]` identifier, e.g.
     * `[{"line.sku": "A-1"}]`. A malformed or unpaired `arrayFilters` is
     * refused with `CM-ERRORS-DATABASE-014`.
     */
    fun updateMany(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/many",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `PUT /{version}/database/collections/{collectionName}/{id}`
     *
     * The `update` body is applied with `$set`. Its keys may be dotted paths
     * into nested data: `{"address.city": "Vilnius"}`, `{"lines.2.qty": 3}`
     * (an element by index), `{"lines.$[].qty": 1}` (every element) or
     * `{"lines.$[line].qty": 3}` together with `arrayFilters` — a JSON array
     * of one filter document per `$[name]` identifier, e.g.
     * `[{"line.sku": "A-1"}]`. A malformed or unpaired `arrayFilters` is
     * refused with `CM-ERRORS-DATABASE-014`.
     */
    fun updateOne(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/{id}",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    /** `GET /{version}/database/taxonomies/{taxonomyName}/merged-tree` · request DTO `FindMergedTermTreeRequest`. */
    fun findMergedTermTree(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/taxonomies/{taxonomyName}/merged-tree",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * `GET /{version}/database/collections/{collectionName}/own`
     *
     * Pass `expandReferences = true` to get every reference value (user, role,
     * taxonomy term, record of another collection) as `{ id, display }`
     * instead of the bare id — a `multiple` reference as a list of them.
     * `display` is the target's `displayField` from the schema, `null` when
     * the target is gone. Read a pair with [ai.norbix.sdk.core.ExpandedReference.from].
     * The caller needs read permission on every source the schema links to,
     * or the read is refused with `CM-ERRORS-DATABASE-056`. Without the flag
     * the answer is exactly what it was before.
     */
    fun findOwn(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/database/collections/{collectionName}/own",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

}
