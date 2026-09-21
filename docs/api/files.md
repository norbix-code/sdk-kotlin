# API · Files

| Method | Verb | Path | Scope |
| --- | --- | --- | --- |
| `deleteFileApi` | `DELETE` | `/{version}/files/{filesIntegrationId}` | `project` |
| `listFiles` | `GET` | `/{version}/files/{filesIntegrationId}` | `project` |
| `deleteManyFilesApi` | `DELETE` | `/{version}/files/{filesIntegrationId}/bulk` | `project` |
| `commitUpload` | `POST` | `/{version}/files/{filesIntegrationId}/commit` | `project` |
| `downloadFileApi` | `GET` | `/{version}/files/{filesIntegrationId}/download` | `project` |
| `getFileInfo` | `GET` | `/{version}/files/{filesIntegrationId}/info` | `project` |
| `getSignedUrl` | `GET` | `/{version}/files/{filesIntegrationId}/sign` | `project` |
| `requestUploadUrl` | `POST` | `/{version}/files/{filesIntegrationId}/upload-url` | `project` |
| `testFilesIntegration` | `POST` | `/{version}/files/{filesIntegrationId}/test` | `project` |
| `getPublicFile` | `GET` | `/{version}/files/public/{PublicId}/{Name*}` | `unauthenticated` |

## Public links

`getPublicFile(publicId, name)` reads a file somebody published from the Hub
side. It is the one Files call that sends **no** `Authorization` header — the
link has to work in an e-mail, in an `<img src>`, or in a browser on a
stranger's phone, so the unguessable `nbpf_…` id is the whole credential. It
answers with the raw bytes, not parsed JSON.

```kotlin
val bytes: ByteArray = api.files.getPublicFile(
    publicId = "nbpf_abc",
    name = "2026/q1/report.pdf",   // slashes stay slashes for a folder link
)
```

Every miss — unknown id, wrong name, made private again, file gone — is the
same plain `404`, on purpose: a more precise answer would tell a stranger that
the file exists.

## Testing a saved integration

`testFilesIntegration` runs a live probe against a files integration that is
already saved: the gateway uploads a small file, reads it back, lists the
folder and deletes the file again. It answers with one entry per step, so you
can see which step broke. Because the probe writes to the storage, the API key
needs the `files:create` permission.

```kotlin
val response = api.files.testFilesIntegration(mapOf("filesIntegrationId" to "nbin_1"))
// { "items": [ { "operation": "UploadFile", "result": "OK" },
//              { "operation": "GetFile", "result": "FAILED", "errors": ["…"] },
//              { "operation": "GetAllFiles", "result": "NOT_TESTED" },
//              { "operation": "DeleteFile", "result": "NOT_TESTED" } ] }
```

The steps are `UploadFile`, `GetFile`, `GetAllFiles` and `DeleteFile`, in that
order. Each `result` is `OK`, `FAILED` (with the provider's `errors`) or
`NOT_TESTED` — once a step fails, the later steps are not run.

This is not the Hub client's `testFilesIntegration`
(`POST /{version}/files/integrations/test`, id in the body), though both probe
an integration that is already saved, using its stored credentials.
