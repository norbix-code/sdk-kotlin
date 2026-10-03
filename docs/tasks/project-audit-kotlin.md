# Project audit — Kotlin SDK: Project module completeness
This file: /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/docs/tasks/project-audit-kotlin.md (branch audit/project)

## Goal
Give the Kotlin SDK every Project-module endpoint the gateway has: admin URL, legal documents, admin portal structure and service user, the public project config and legal pages, the developer MCP endpoint, and AI service users — each with a route test and a doc line.
Not in scope: AI plans, knowledge and credits (decided internal); a streaming (SSE) client.

## Plan
1. [done] docs(sdk-kotlin:project): task file with goal and plan
2. [done] feat(sdk-kotlin:account): admin URL, legal documents, expose legal, admin portal structure and service user on `hub.account`, with route tests
3. [done] feat(sdk-kotlin:public): new `api.publicProjects` module for the public project config and legal pages (API host), sent with no credentials, with route tests
4. [done] feat(sdk-kotlin:account): AI service users (create, list, delete, rotate key, revoke key) on `hub.account`, with route tests
5. [done] feat(sdk-kotlin:mcp): developer MCP endpoint (send, open stream, end session) on `hub.account`, returning the session id from the answer header, with tests
   decision(sdk-kotlin:mcp): one gateway route with three verbs becomes three methods returning `McpResponse`; plain `send` cannot carry it, because the gateway gives the session id only in the `Mcp-Session-Id` answer header and refuses every later call without it (gateway `McpHttpTransport.cs:157-165`); the TypeScript SDK has only the POST, named `mcp`, returning the body
6. [todo] docs(sdk-kotlin:docs): docs/hub/account.md, new docs/api/public_projects.md, both index pages, README
7. [todo] chore(sdk-kotlin:checks): `./gradlew build test` green; push and open the pull request

## Changes
| file (absolute, branch audit/project) | what changed | step |
|------|--------------|------|
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/docs/tasks/project-audit-kotlin.md | this task file | 1 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/src/main/kotlin/ai/norbix/sdk/hub/AccountModule.kt | 5 methods: updateProjectAdminUrl, updateProjectLegalDocuments, updateProjectExposeLegal, getAdminPortalStructure, assignAdminPortalServiceUser | 2 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/src/test/kotlin/ai/norbix/sdk/hub/AccountProjectSettingsRoutesTest.kt | new: verb + path + auth + project header per method (5) | 2 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/src/main/kotlin/ai/norbix/sdk/api/PublicProjectsModule.kt | new module: getPublicProjectConfig, getPublicProjectLegal (Scope.UNAUTHENTICATED) | 3 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/src/main/kotlin/ai/norbix/sdk/api/NorbixApi.kt | exposes `api.publicProjects` | 3 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/src/test/kotlin/ai/norbix/sdk/api/PublicProjectsModuleTest.kt | new: path, verb, no Authorization header (2) | 3 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/src/main/kotlin/ai/norbix/sdk/hub/AccountModule.kt | 5 methods: createAiServiceUser, listAiServiceUsers, rotateAiServiceUserKey, revokeAiServiceUserKey, deleteAiServiceUser | 4 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/src/test/kotlin/ai/norbix/sdk/hub/AccountAiServiceUsersRoutesTest.kt | new: verb + path + auth + project header per method (5) | 4 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/src/main/kotlin/ai/norbix/sdk/core/Transport.kt | new `sendRaw` and `RawResponse`: same credentials and error mapping as `send`, returns status, headers and raw body | 5 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/src/main/kotlin/ai/norbix/sdk/hub/McpResponse.kt | new: statusCode, sessionId, contentType, isEventStream, body, json | 5 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/src/main/kotlin/ai/norbix/sdk/hub/AccountModule.kt | sendMcpMessage, openMcpStream, endMcpSession | 5 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/src/test/kotlin/ai/norbix/sdk/hub/AccountMcpTest.kt | new: session id from header, SSE kept raw, GET asks for SSE, DELETE sends the session, 400 throws (5) | 5 |

## Findings
fix(sdk-kotlin:transport): `send` keeps only the parsed body and has no way to add a request header, so an MCP session (id in an answer header, sent back as a request header) was impossible — done (fixed here with `sendRaw`, step 5)
    where: /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/src/main/kotlin/ai/norbix/sdk/core/Transport.kt:59 (branch audit/project)
```kotlin
// src/main/kotlin/ai/norbix/sdk/core/Transport.kt:59-68 (main)
    fun send(
        path: String,
        method: String,
        request: Map<String, Any?> = emptyMap(),   // <-- here: no per-call headers parameter
        scope: Scope = Scope.PROJECT,
        bearerToken: String? = null,
        timeoutMs: Long? = null,
        env: String? = null,
        region: String? = null,
    ): Any? {                                      // <-- here: answer headers are dropped
```


## Rejected / moved out
- decision(sdk-kotlin:ai): AI plans, knowledge search and AI credits endpoints are not added — rejected — reason: decided internal by the campaign — new ticket/file: none

## Needs you
- [ ] release(sdk-kotlin:project): review and merge the pull request (Squash and merge) — needs you · action: merge the PR linked in the final report

## Open questions
- none
