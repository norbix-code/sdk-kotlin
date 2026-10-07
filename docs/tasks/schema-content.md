# Schema-content campaign — Kotlin SDK (client side)
This file: /Users/djovaisas/Projects/norbix/worktrees/norbix-kotlin/audit/schema-content/docs/tasks/schema-content.md (branch audit/schema-content, repo norbix-code/sdk-kotlin)

Gateway campaign: /Users/djovaisas/Projects/norbix/worktrees/gateway/audit/schema-content/campaign/docs/tasks/schema-content.md
(branch audit/schema-content — NOT on refactoringV2 yet). This pull request is opened with
`nbx-ship --no-merge` and waits until the gateway campaign lands; it is not merged in this wave.

## Goal
Give the Kotlin SDK the schema-content contract: `expandReferences` on the record reads with a typed
`{ id, display }` view, dotted update paths + `arrayFilters`, files by id on both clients, the new
schema field shapes (object / array / json, default, unique, displayField, …), term slug, and the new
error codes in the docs — with the Hub and API references regenerated from the campaign hosts.
Not in scope: a typed Kotlin client (the SDK is Map-based by design — `ArchitectOverview.md` #12);
merging the pull request; the coverage matrix (Routine C runs after the gateway campaign lands).

## Plan
1. [done] chore(sdk-kotlin:types): regenerate `references/{hub,api}.dtos.kt` with `x kotlin` from the campaign Hub (:49826) and Api (:49877) — Hub 1371 → 1377 classes, Api 209 → 215, nothing removed — commit `3d40cbb`
2. [done] feat(sdk-kotlin:database+files): `ExpandedReference` (core), `api.files.getFileById`, `hub.files.getFileById`, KDoc on find / findOne / findOwn / findRecords / findOneRecord (expandReferences) and updateOne / updateMany / updateOneRecord / updateManyRecords (dotted paths, arrayFilters) — no method shape changed — commit `c34df39`
3. [done] test(sdk-kotlin:database): Api + Hub `SchemaContentContractTest`, `ExpandedReferenceTest` — 38 new tests against a fake gateway — commit `19e7ea3`
4. [done] docs(sdk-kotlin): API/HUB · Database (expandReferences, nested documents, schema shapes, codes 014 / 030 / 039–049 / 050–056 / SCHEMA-022, 036–041 / TAXONOMIES-012, 013), API/HUB · Files (by id), index counts — commit `2e4ed12`
5. [done] chore(sdk-kotlin:ship): this task file; `./gradlew build test` BUILD SUCCESSFUL, 219 tests, 0 failures (181 before); `nbx-ship --no-merge` → pull request https://github.com/norbix-code/sdk-kotlin/pull/27 (open, not merged)

## Changes
| file (absolute, branch audit/schema-content) | what changed | step |
|---|---|---|
| /Users/djovaisas/Projects/norbix/worktrees/norbix-kotlin/audit/schema-content/references/hub.dtos.kt | regenerated: expandReferences, arrayFilters, GetFileById / GetFileByIdResponse, ObjectFieldDto / ArrayFieldDto / JsonFieldDto / CurrencyDefaultDto, Default / Unique / DisplayField / MultipleOf / Minimum / Maximum / MinItems / MaxItems / AllowedFileType / MaxSizeMb, TermDto.slug; descriptions | 1 |
| /Users/djovaisas/Projects/norbix/worktrees/norbix-kotlin/audit/schema-content/references/api.dtos.kt | regenerated: same members on the Api DTOs; GetFileByIdRequest | 1 |
| /Users/djovaisas/Projects/norbix/worktrees/norbix-kotlin/audit/schema-content/src/main/kotlin/ai/norbix/sdk/core/ExpandedReference.kt | new: data class `ExpandedReference(id, display)`, `isResolved`, `displayText(language)`, `from(Any?)`, `listFrom(Any?)` | 2 |
| /Users/djovaisas/Projects/norbix/worktrees/norbix-kotlin/audit/schema-content/src/main/kotlin/ai/norbix/sdk/api/FilesModule.kt | `getFileById` — GET /{version}/files/{filesIntegrationId}/by-id/{id} | 2 |
| /Users/djovaisas/Projects/norbix/worktrees/norbix-kotlin/audit/schema-content/src/main/kotlin/ai/norbix/sdk/hub/FilesModule.kt | `getFileById` — GET /{version}/files/item/by-id | 2 |
| /Users/djovaisas/Projects/norbix/worktrees/norbix-kotlin/audit/schema-content/src/main/kotlin/ai/norbix/sdk/api/DatabaseModule.kt | KDoc on find / findOne / findOwn / updateOne / updateMany | 2 |
| /Users/djovaisas/Projects/norbix/worktrees/norbix-kotlin/audit/schema-content/src/main/kotlin/ai/norbix/sdk/hub/DatabaseModule.kt | KDoc on findRecords / findOneRecord / updateOneRecord / updateManyRecords | 2 |
| /Users/djovaisas/Projects/norbix/worktrees/norbix-kotlin/audit/schema-content/src/test/kotlin/ai/norbix/sdk/core/ExpandedReferenceTest.kt | new, 5 tests | 3 |
| /Users/djovaisas/Projects/norbix/worktrees/norbix-kotlin/audit/schema-content/src/test/kotlin/ai/norbix/sdk/api/SchemaContentContractTest.kt | new, 20 tests: query / body / path per call, expanded answer at depth, schema shapes untouched, term slug, by-id, refusals 014 / 039 / 047 / 040–049 / 050–054 / 055 / 056 / FILES 404 | 3 |
| /Users/djovaisas/Projects/norbix/worktrees/norbix-kotlin/audit/schema-content/src/test/kotlin/ai/norbix/sdk/hub/SchemaContentContractTest.kt | new, 13 tests: findRecords / findOneRecord / updateOneRecord / updateManyRecords / getFileById on the wire, term slug round trip, SCHEMA-022 / 036–041, TAXONOMIES-012 / 013, DATABASE-014 / 056 | 3 |
| /Users/djovaisas/Projects/norbix/worktrees/norbix-kotlin/audit/schema-content/docs/api/database.md | 3 new sections + 7 error rows | 4 |
| /Users/djovaisas/Projects/norbix/worktrees/norbix-kotlin/audit/schema-content/docs/hub/database.md | record rules, schema contract, term slug bullets | 4 |
| /Users/djovaisas/Projects/norbix/worktrees/norbix-kotlin/audit/schema-content/docs/api/files.md · /Users/djovaisas/Projects/norbix/worktrees/norbix-kotlin/audit/schema-content/docs/hub/files.md | `getFileById` row + "Files by id" section | 4 |
| /Users/djovaisas/Projects/norbix/worktrees/norbix-kotlin/audit/schema-content/docs/api/_index.md · /Users/djovaisas/Projects/norbix/worktrees/norbix-kotlin/audit/schema-content/docs/hub/_index.md | files module count +1 | 4 |
| /Users/djovaisas/Projects/norbix/worktrees/norbix-kotlin/audit/schema-content/docs/tasks/schema-content.md | this file | 5 |

## Findings
- F1 (open, test-side only): Gson's default HTML-safe escaping writes `'` as `\u0027` in every request body (`Transport.kt`, `Gson()`). Valid JSON, the gateway reads it the same; only an exact body assertion sees it. The slug test uses a name without an apostrophe.
- F2 (open): `docs/hub/_index.md` said `files` had 17 methods while the module table in `docs/hub/files.md` lists 23 (now 24); the count was stale before this item. Bumped by one here, not recounted.
- F3 (note): the SDK is untyped (`Map<String, Any?>` in, `Any?` out), so the new request members (`expandReferences`, `arrayFilters`) and the new field DTOs pass through with no code change; the typed piece asked for is `ExpandedReference`. A fully typed client stays `ArchitectOverview.md` #12.
- F4 (note): `sdk-management.md` lists norbix-kotlin as "no generator yet"; the references are regenerated with `x kotlin <file>` (edit the `BaseUrl:` line to the running host, run, put it back) — same as commit `047d743`.

## Rejected / moved out
- Merging the pull request — the computed task says open only (`--no-merge`), the gateway campaign is not on refactoringV2 yet.
- Routine C (coverage matrix) — runs after the gateway campaign lands.

## Needs you
- [ ] Merge the pull request (Rebase and merge) after the gateway branch audit/schema-content lands on refactoringV2.

## Open questions
- none
