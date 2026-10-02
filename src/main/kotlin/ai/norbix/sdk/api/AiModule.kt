package ai.norbix.sdk.api

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

/**
 * End-user AI chat for a signed-in project user.
 *
 * `startEndUserChatTurn` answers at once with a `turnId`; the answer streams
 * over the gateway's SSE endpoint on the user's own channel
 * `ai-chat:{projectId}:{authId}` (events `ai.chat.turn.*` and
 * `ai.chat.session.*`). A subscription to another user's channel is refused
 * with HTTP 403 and `responseStatus.errorCode = "AiChatChannelRefused"`
 * before the stream starts — do not retry it.
 */
class AiModule(private val transport: Transport) {
    fun getEndUserChatAvailability(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/chat/availability",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun listEndUserChatSessions(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/chat/sessions",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun createEndUserChatSession(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/chat/sessions",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEndUserChatSession(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/chat/sessions/{SessionId}",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun renameEndUserChatSession(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/chat/sessions/{SessionId}",
        method = "PATCH",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteEndUserChatSession(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/chat/sessions/{SessionId}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun pinEndUserChatSession(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/chat/sessions/{SessionId}/pin",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun archiveEndUserChatSession(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/chat/sessions/{SessionId}/archive",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun getEndUserChatEntries(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/chat/sessions/{SessionId}/entries",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun setEndUserChatEntryFeedback(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/chat/sessions/{SessionId}/entries/{EntryId}/feedback",
        method = "PUT",
        request = request,
        scope = Scope.PROJECT,
    )

    fun listEndUserChatAttachments(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/chat/sessions/{SessionId}/attachments",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun uploadEndUserChatAttachment(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/chat/sessions/{SessionId}/attachments",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    fun deleteEndUserChatAttachment(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/chat/attachments/{AttachmentId}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun listEndUserChatMemory(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/chat/memory",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    fun forgetEndUserChatMemory(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/chat/memory/{NoteId}",
        method = "DELETE",
        request = request,
        scope = Scope.PROJECT,
    )

    fun startEndUserChatTurn(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/ai/chat/turn",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )
}
