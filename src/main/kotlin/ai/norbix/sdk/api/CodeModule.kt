package ai.norbix.sdk.api

import ai.norbix.sdk.core.Scope
import ai.norbix.sdk.core.Transport

/**
 * Code workflows on the data plane (gateway contract `Code.Workflows.md` §7):
 * a project user lists the runs that wait for them and answers a waiting
 * step, or opens / uses a one-click resume link.
 *
 * Beta: Workflows are in beta; bugs may occur.
 *
 * Request and response shapes: `GetCodeWorkflowWaitingRuns`,
 * `ResumeCodeWorkflowRun`, `OpenCodeWorkflowResumeLink`,
 * `UseCodeWorkflowResumeLink`, `WorkflowRunsResponse`, `WorkflowRunResponse`,
 * `CodeWorkflowResumeLinkResponse` in `references/api.dtos.kt`.
 */
class CodeModule(private val transport: Transport) {
    /**
     * Beta: `GET /{version}/code/workflows/runs` — runs across workflows
     * (waiting by default): `status?`, `waitingKind?`, `assignee?` (`me` or
     * `usr_…`), `workflowId?`, `key?`, `pageSize?`, `startingAfter?`,
     * `endingBefore?` (query).
     */
    fun getCodeWorkflowWaitingRuns(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/runs",
        method = "GET",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * Beta: `POST /{version}/code/workflows/runs/{RunId}/resume` — answer a
     * waiting step: `runId` (path), `stepId?`, `decision?` (`approved` |
     * `rejected`), `payload?` (body).
     */
    fun resumeCodeWorkflowRun(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/runs/{RunId}/resume",
        method = "POST",
        request = request,
        scope = Scope.PROJECT,
    )

    /**
     * Beta: `GET /{version}/code/workflows/resume/{Token}` — what a one-click
     * resume link will do; nothing changes: `token` (path). The signed token is
     * the key, so no sign-in is needed: auth is sent only when the client has
     * one ([Scope.OPTIONAL]).
     */
    fun openCodeWorkflowResumeLink(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/resume/{Token}",
        method = "GET",
        request = request,
        scope = Scope.OPTIONAL,
    )

    /**
     * Beta: `POST /{version}/code/workflows/resume/{Token}` — answer a waiting
     * step with a one-click resume link: `token` (path). No sign-in needed; the
     * run goes on as the workflow's execution identity. Auth is sent only when
     * the client has one ([Scope.OPTIONAL]).
     */
    fun useCodeWorkflowResumeLink(request: Map<String, Any?> = emptyMap()): Any? = transport.send(
        path = "/{version}/code/workflows/resume/{Token}",
        method = "POST",
        request = request,
        scope = Scope.OPTIONAL,
    )
}
