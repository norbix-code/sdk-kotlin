# Project audit — Kotlin SDK: Project module completeness
This file: /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/docs/tasks/project-audit-kotlin.md (branch audit/project)

## Goal
Give the Kotlin SDK every Project-module endpoint the gateway has: admin URL, legal documents, admin portal structure and service user, the public project config and legal pages, the developer MCP endpoint, and AI service users — each with a route test and a doc line.
Not in scope: AI plans, knowledge and credits (decided internal); a streaming (SSE) client.

## Plan
1. [done] docs(sdk-kotlin:project): task file with goal and plan
2. [done] feat(sdk-kotlin:account): admin URL, legal documents, expose legal, admin portal structure and service user on `hub.account`, with route tests
3. [todo] feat(sdk-kotlin:public): new `api.publicProjects` module for the public project config and legal pages (API host), sent with no credentials, with route tests
4. [todo] feat(sdk-kotlin:account): AI service users (create, list, delete, rotate key, revoke key) on `hub.account`, with route tests
5. [todo] feat(sdk-kotlin:mcp): developer MCP endpoint (send, open stream, end session) on `hub.account`, returning the session id from the answer header, with tests
6. [todo] docs(sdk-kotlin:docs): docs/hub/account.md, new docs/api/public_projects.md, both index pages, README
7. [todo] chore(sdk-kotlin:checks): `./gradlew build test` green; push and open the pull request

## Changes
| file (absolute, branch audit/project) | what changed | step |
|------|--------------|------|
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/docs/tasks/project-audit-kotlin.md | this task file | 1 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/src/main/kotlin/ai/norbix/sdk/hub/AccountModule.kt | 5 methods: updateProjectAdminUrl, updateProjectLegalDocuments, updateProjectExposeLegal, getAdminPortalStructure, assignAdminPortalServiceUser | 2 |
| /Users/djovaisas/Projects/norbix/worktrees/sdks/norbix-kotlin/audit/project/src/test/kotlin/ai/norbix/sdk/hub/AccountProjectSettingsRoutesTest.kt | new: verb + path + auth + project header per method (5) | 2 |

## Findings

## Rejected / moved out
- decision(sdk-kotlin:ai): AI plans, knowledge search and AI credits endpoints are not added — rejected — reason: decided internal by the campaign — new ticket/file: none

## Needs you
- [ ] release(sdk-kotlin:project): review and merge the pull request (Squash and merge) — needs you · action: merge the PR linked in the final report

## Open questions
- none
