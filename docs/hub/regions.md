# HUB · Regions

| Method | Verb | Path | Scope |
| --- | --- | --- | --- |
| `list` | `GET` | `/{version}/account/regions` | `account` |
| `updateProjectRegions` | `PATCH` | `/{version}/account/projects/{projectId}/settings/regions` | `account` |

These endpoints manage the *set* of regions. To make requests *against* a
given region, set `region` on the client (`NorbixHub(region = "nb-eu-germany")`
or `hub.setRegion("nb-eu-germany")`) or per call (the optional `region`
argument on each method above), which sends the `nb-region` header. There is
no default region: when unset, no header is sent. See the
[Regions section of the README](../../README.md#regions).

- `list(request, region)` — lists the regions available to the account. Each
  item in the response `items` array carries `id` (the region code, e.g.
  `nb-eu-germany`), `continent`, and `name`.
- `updateProjectRegions(projectId, primaryRegion, additionalRegions, request, region)` —
  updates the project's regions. `primaryRegion` (a region code string) and
  `additionalRegions` (a list of region code strings) are optional; pass
  `null` to leave one unchanged. Empty response on success.
