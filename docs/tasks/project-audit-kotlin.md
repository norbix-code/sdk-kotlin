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
6. [done] docs(sdk-kotlin:docs): docs/hub/account.md, new docs/api/public_projects.md, both index pages, README
7. [done] chore(sdk-kotlin:checks): `./gradlew build test` BUILD SUCCESSFUL, 112 tests, 0 failures (18 new); push and open the pull request
8. [done] feat(sdk-kotlin:account): expose brand and expose auth switches (`updateProjectExposeBrand`, `updateProjectExposeAuth`) on `hub.account`, twins of `updateProjectExposeLegal`, with route tests and docs rows — item B3c, gateway routes from item B1; `./gradlew build test` BUILD SUCCESSFUL, 112 tests, 0 failures (the route table test now checks 7 routes)

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
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/docs/hub/account.md | 13 new rows; MCP section with example | 6 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/docs/api/public_projects.md | new page: 2 rows and example | 6 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/docs/hub/_index.md | account count 36 → 56 (was already stale at 43 rows) | 6 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/docs/api/_index.md | public_projects row | 6 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/README.md | module table per client; new section with the 15 new methods | 6 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/src/main/kotlin/ai/norbix/sdk/hub/AccountModule.kt | 2 methods: updateProjectExposeBrand, updateProjectExposeAuth | 8 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/src/test/kotlin/ai/norbix/sdk/hub/AccountProjectSettingsRoutesTest.kt | 2 route cases (verb, path, auth, project header); case count 5 → 7 | 8 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/docs/hub/account.md | 2 table rows | 8 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/README.md | method list + example lines | 8 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/docs/tasks/project-audit-kotlin.md | step 8 | 8 |

## Findings
docs(sdk-kotlin:docs): the hub index said `account` has 36 endpoints while account.md already listed 43 — done (fixed here, step 6: now 56)
    where: /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/docs/hub/_index.md (branch audit/project)
```markdown
<!-- before — docs/hub/_index.md:6 (main) -->
| [`account`](./account.md) | 36 |      <!-- <-- here: grep -c '^| `' docs/hub/account.md → 43 -->
```

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

chore(sdk-kotlin:references): `references/hub.dtos.kt` has no `UpdateProjectExposeBrand` / `UpdateProjectExposeAuth` DTOs — generated before gateway item B1 added the routes; the methods were written from the gateway source — left open (regenerate the references after B1 merges)
    where: /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/references/hub.dtos.kt (branch audit/project)
```kotlin
// references/hub.dtos.kt:1084 (audit/project) — only the legal twin exists
@Route(Path="/{version}/account/projects/{projectId}/settings/legal/expose", Verbs="PATCH")
open class UpdateProjectExposeLegal : CodeMashRequestBase(), IReturn<EmptyResponse>
// <-- here: no settings/brand/expose or settings/auth/expose class
```

test(sdk-kotlin:hub): the route test checks verb, path and headers but not the JSON body, so a lost `exposed` key would still pass — left open (same for every case in AccountProjectSettingsRoutesTest)
    where: /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/src/test/kotlin/ai/norbix/sdk/hub/AccountProjectSettingsRoutesTest.kt:33 (branch audit/project)
```kotlin
            ex.requestBody.readAllBytes()   // <-- here: body read and dropped, never recorded
```

## Rejected / moved out
- decision(sdk-kotlin:ai): AI plans, knowledge search and AI credits endpoints are not added — rejected — reason: decided internal by the campaign — new ticket/file: none

## Needs you
- [ ] release(sdk-kotlin:project): review and merge the pull request (Squash and merge) — needs you · action: merge the PR linked in the final report

## Open questions
- none
