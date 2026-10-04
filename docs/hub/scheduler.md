# HUB · Scheduler

Runs a task on a cron schedule. **Only `EmailCampaign` tasks run today**:
each run sends an email campaign.

| Method | Verb | Path | Scope |
| --- | --- | --- | --- |
| `enableScheduler` | `PUT` | `/{version}/scheduler/enable` | `project` |
| `disableScheduler` | `PUT` | `/{version}/scheduler/disable` | `project` |
| `getSchedulerTasks` | `GET` | `/{version}/scheduler/tasks` | `project` |
| `getSchedulerTask` | `GET` | `/{version}/scheduler/tasks/{id}` | `project` |
| `saveSchedulerTask` | `POST` | `/{version}/scheduler/tasks` | `project` |
| `deleteSchedulerTask` | `DELETE` | `/{version}/scheduler/tasks/{Id}` | `project` |
| `enableSchedulerTask` | `PUT` | `/{version}/scheduler/tasks/{Id}/enable` | `project` |
| `disableSchedulerTask` | `PUT` | `/{version}/scheduler/tasks/{Id}/disable` | `project` |

The module switch (`enableScheduler` / `disableScheduler`) sends **PUT** since
this version — it sent GET before; the gateway changed the route.

## Save a task

Every Monday at 09:00 UTC, email every project user with template `tmpl_1`:

```kotlin
val saved = hub.scheduler.saveSchedulerTask(
    mapOf(
        "name" to "Weekly digest",
        "cron" to "0 9 * * 1",          // 5 fields, evaluated in UTC
        "initiatorUserId" to "usr_1",   // you, or a project service user
        "isEnabled" to true,
        "stopOnError" to false,
        "task" to mapOf(
            "type" to "EmailCampaign",  // the only task type today
            "campaign" to mapOf(
                "source" to "AllUsers",
                "templateId" to "tmpl_1",
            ),
            // "databaseIntegrationId" to "...", // optional
        ),
    ),
)
// saved: {"id": "tsk_…", ...}
```

To update a task, send the same body with `"taskId" to "tsk_…"`.

- `cron` has exactly 5 fields (minute, hour, day of month, month, day of
  week) and runs in UTC. A 6-field (seconds) expression is refused.
- `initiatorUserId` (`usr_…`) is required: the task runs as this user. It
  must be the caller or a service user of the project.
- `task.type` is the discriminator. `task.campaign` takes the same shape as an
  email campaign (`source` + `templateId` + the source's own fields, for
  example `rolesNames` / `userTags` for `AllUsers`). The typed shape is
  `EmailCampaignSchedulerTaskRequest` in `references/hub.dtos.kt`.

## List, read, switch and delete

```kotlin
// Filters and paging go in the query.
hub.scheduler.getSchedulerTasks(mapOf("type" to "EmailCampaign", "enabled" to true, "pageSize" to 20))

// The task id goes in the path.
hub.scheduler.getSchedulerTask(mapOf("id" to "tsk_1"))
hub.scheduler.disableSchedulerTask(mapOf("id" to "tsk_1"))
hub.scheduler.enableSchedulerTask(mapOf("id" to "tsk_1"))
hub.scheduler.deleteSchedulerTask(mapOf("id" to "tsk_1"))

// Module switch.
hub.scheduler.enableScheduler()
hub.scheduler.disableScheduler()
```
