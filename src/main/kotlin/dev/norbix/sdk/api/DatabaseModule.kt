package dev.norbix.sdk.api

import dev.norbix.sdk.core.Scope
import dev.norbix.sdk.core.Target
import dev.norbix.sdk.core.Transport

class DatabaseModule(private val transport: Transport) {
    fun findTerms(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/database/taxonomies/{taxonomyName}/terms",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun findTermsChildren(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/database/taxonomies/{taxonomyName}/terms/{parentId}/children",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getDatabaseSchema(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/database/schemas/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getDatabaseSchemas(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/database/schemas",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun aggregate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/database/collections/{collectionName}/aggregate",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun changeResponsibility(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/database/collections/{collectionName}/{id}/responsibility",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun count(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/database/collections/{collectionName}/count",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteMany(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/database/collections/{collectionName}/many",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteOne(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/database/collections/{collectionName}/{id}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun distinct(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/database/collections/{collectionName}/distinct",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun executeAggregate(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/database/collections/{collectionName}/aggregates/{aggregateId}/execute",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun find(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/database/collections/{collectionName}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun findOne(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/database/collections/{collectionName}/{id}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun insertMany(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/database/collections/{collectionName}/many",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun insertOne(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/database/collections/{collectionName}",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun replaceOne(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/database/collections/{collectionName}/{id}/replace",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateMany(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/database/collections/{collectionName}/many",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun updateOne(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        target = Target.API,
        path = "/{version}/database/collections/{collectionName}/{id}",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

}
