# API · Code

Workflows are in beta; bugs may occur.

| Method | Verb | Path | Scope |
| --- | --- | --- | --- |
| `getCodeWorkflowWaitingRuns` | `GET` | `/{version}/code/workflows/runs` | `project` |
| `resumeCodeWorkflowRun` | `POST` | `/{version}/code/workflows/runs/{RunId}/resume` | `project` |
| `openCodeWorkflowResumeLink` | `GET` | `/{version}/code/workflows/resume/{Token}` | `optional` |
| `useCodeWorkflowResumeLink` | `POST` | `/{version}/code/workflows/resume/{Token}` | `optional` |

## Workflows (beta)

A project user lists the runs that wait for them and answers a waiting step.
`getCodeWorkflowWaitingRuns` takes `status?` (`waiting` by default),
`waitingKind?` (`approval` | `event` | `delay`), `assignee?` (`me` or `usr_…`),
`workflowId?`, `key?` and `pageSize` / `startingAfter` / `endingBefore`.
`resumeCodeWorkflowRun` takes `runId` (path), `stepId?`, `decision?`
(`approved` | `rejected`) and `payload?`.

The two `resume/{Token}` routes are the one-click links of a waiting step: the
signed `token` is the key, so no sign-in is needed (scope `optional`). GET shows
what the link will do; POST answers the step.

```kotlin
val waiting = api.code.getCodeWorkflowWaitingRuns(mapOf("assignee" to "me"))
api.code.resumeCodeWorkflowRun(mapOf("runId" to "wfr_…", "decision" to "approved"))
val link = api.code.openCodeWorkflowResumeLink(mapOf("token" to token))
api.code.useCodeWorkflowResumeLink(mapOf("token" to token))
```
