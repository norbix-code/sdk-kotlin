# API · Database

| Method | Verb | Path | Scope |
| --- | --- | --- | --- |
| `findTerms` | `GET` | `/{version}/database/taxonomies/{taxonomyName}/terms` | `project` |
| `findTermsChildren` | `GET` | `/{version}/database/taxonomies/{taxonomyName}/terms/{parentId}/children` | `project` |
| `findTermTree` | `GET` | `/{version}/database/taxonomies/{taxonomyName}/terms/tree` | `project` |
| `findTaxonomyTree` | `GET` | `/{version}/database/taxonomies/tree` | `project` |
| `getDatabaseSchema` | `GET` | `/{version}/database/schemas/{id}` | `project` |
| `getDatabaseSchemas` | `GET` | `/{version}/database/schemas` | `project` |
| `aggregate` | `POST` | `/{version}/database/collections/{collectionName}/aggregate` | `project` |
| `changeResponsibility` | `PUT` | `/{version}/database/collections/{collectionName}/{id}/responsibility` | `project` |
| `count` | `GET` | `/{version}/database/collections/{collectionName}/count` | `project` |
| `deleteMany` | `DELETE` | `/{version}/database/collections/{collectionName}/many` | `project` |
| `deleteOne` | `DELETE` | `/{version}/database/collections/{collectionName}/{id}` | `project` |
| `distinct` | `GET` | `/{version}/database/collections/{collectionName}/distinct` | `project` |
| `executeAggregate` | `POST` | `/{version}/database/collections/{collectionName}/aggregates/{aggregateId}/execute` | `project` |
| `find` | `GET` | `/{version}/database/collections/{collectionName}` | `project` |
| `findOne` | `GET` | `/{version}/database/collections/{collectionName}/{id}` | `project` |
| `insertMany` | `POST` | `/{version}/database/collections/{collectionName}/many` | `project` |
| `insertOne` | `POST` | `/{version}/database/collections/{collectionName}` | `project` |
| `replaceOne` | `PUT` | `/{version}/database/collections/{collectionName}/{id}/replace` | `project` |
| `updateMany` | `PUT` | `/{version}/database/collections/{collectionName}/many` | `project` |
| `updateOne` | `PUT` | `/{version}/database/collections/{collectionName}/{id}` | `project` |
| `findMergedTermTree` | `GET` | `/{version}/database/taxonomies/{taxonomyName}/merged-tree` | `project` |
| `findOwn` | `GET` | `/{version}/database/collections/{collectionName}/own` | `project` |

## Only my records

`findOwn` takes the same filter and paging as `find`, but returns only the
records the signed-in user is responsible for. Use it for "my orders" style
lists in an app; use `find` when the caller may read the whole collection.

```kotlin
val mine = api.database.findOwn(mapOf("collectionName" to "orders", "filter" to "{}"))
```

## Linked records — `expandReferences`

A reference field (a user, a role, a taxonomy term, a record of another
collection) stores only the target's id. Send `expandReferences = true` on
`find`, `findOne` or `findOwn` to get every such value as `{ id, display }`
instead — a `multiple` reference as a list of pairs. `display` is whatever the
schema's `displayField` names on the target (a user's `displayName`, a role's
`name`, a term's `title` or `slug`, a field of the linked record); it is `null`
when the target is gone. Nested forms and arrays are expanded in place, at any
depth. Without the flag the answer is byte-for-byte what it was before.

```kotlin
import ai.norbix.sdk.core.ExpandedReference

val answer = api.database.findOne(mapOf("collectionName" to "posts", "id" to "rec_1", "expandReferences" to true))
val record = (answer as Map<*, *>)["result"] as Map<*, *>
// "author": {"id": "usr_1", "display": "Jane Doe"}
val author = ExpandedReference.from(record["author"])!!
println(author.displayText())            // Jane Doe
// "tags": [{"id": "6650", "display": {"en": "News"}}, {"id": "6651", "display": null}]
val tags = ExpandedReference.listFrom(record["tags"])
println(tags.map { it.displayText("en") }) // [News, null]
println(tags[1].isResolved)              // false — the term is gone
```

`ExpandedReference` is the typed view of one pair: `id`, `display` (a string,
or a language map for a translatable name), `isResolved`, and `displayText(language)`
to flatten the display. `from` also accepts a bare id (a read made without the
flag) and gives an unresolved pair for it.

The caller needs read permission on **every** source the schema links to
(users, roles, the taxonomy, the other collection, the files integration).
When one is missing the whole read is refused with `CM-ERRORS-DATABASE-056`,
whose context names the `SourceKind`, the `Source`, the `Fields` and the
`MissingPermissions` — read again without the flag to get the ids. A taxonomy
the schema names that the project does not have is `CM-ERRORS-DATABASE-055`.

## Nested documents — dotted paths and `arrayFilters`

A schema can declare an **object** field (a nested form, closed: an undeclared
member is refused with `CM-ERRORS-DATABASE-047`) and an **array** field (a list
of any field type, with `minItems` / `maxItems` / `uniqueItems`). Records carry
them as plain JSON; filters use MongoDB's dotted paths and `$elemMatch`:

```kotlin
api.database.find(mapOf(
    "collectionName" to "orders",
    "filter" to """{"address.city":"Vilnius","lines":{"${'$'}elemMatch":{"sku":"A-1","qty":{"${'$'}gte":2}}}}""",
    "sortBy" to "address.city",   // a path through nested forms sorts and pages
))
```

A sort **on or through a list** (`lines`, `lines.qty`, `tags`, or an array
position such as `lines.0.qty`) is refused — a cursor on a multi-valued path
repeats or skips rows.

`updateOne` / `updateMany` apply the `update` body with `$set`, and its keys
may be dotted paths into nested data:

```kotlin
// one nested member
api.database.updateOne(mapOf("collectionName" to "orders", "id" to id, "update" to """{"address.city":"Vilnius"}"""))
// an element by index, or every element
api.database.updateOne(mapOf("collectionName" to "orders", "id" to id, "update" to """{"lines.2.qty":3}"""))
api.database.updateOne(mapOf("collectionName" to "orders", "id" to id, "update" to """{"lines.${'$'}[].qty":1}"""))
// the elements a filter matches: one filter per $[name] identifier
api.database.updateOne(mapOf(
    "collectionName" to "orders", "id" to id,
    "update" to """{"lines.${'$'}[line].qty":3}""",
    "arrayFilters" to """[{"line.sku":"A-1"}]""",
))
```

`arrayFilters` is a JSON array of filter documents (identifiers are lower-case
letters and digits, starting with a letter; `$and` / `$or` / `$nor` are allowed
inside a filter). A filter without its identifier, an identifier without its
filter, or keys that overlap (`address` and `address.city` in one update) are
refused with `CM-ERRORS-DATABASE-014` and a reason. A **JSON** field (a free-form
object, `maxBytes` optional) is set as a whole when it has a cap.

## Schema field shapes

`getDatabaseSchema` / `getDatabaseSchemas` describe each field with a
`$fieldType`. New with this contract: `object` (`properties`, `required`),
`array` (`items`, `minItems`, `maxItems`, `uniqueItems`), `json` (`maxBytes`),
and a typed `default` on string / integer / decimal / date / boolean / enum /
tags / currency (`{ value, currency }`); `unique` on string / integer / decimal;
`multipleOf` / `minimum` / `maximum` on currency; `minItems` / `maxItems` on
tags and files plus `allowedFileType` / `maxSizeMb` on files; `displayField` on
every reference kind (`collection`, `user`, `taxonomy`, `role`). The SDK hands
the shapes back untouched — see `references/api.dtos.kt` (`ObjectFieldDto`,
`ArrayFieldDto`, `JsonFieldDto`, `CurrencyDefaultDto`) for the exact members.
Term rows (`findTerms`, trees) carry `slug` next to `name`.

## Writing records — rules the gateway checks

### Change or delete every record (`allRecords`)

`updateMany` and `deleteMany` refuse an empty filter `{}` — it matches every
record of the collection — with `CM-ERRORS-DATABASE-037`. To really touch
every record, send `allRecords = true` as well. For `updateMany` a missing
filter counts as `{}`.

```kotlin
// refused: CM-ERRORS-DATABASE-037
api.database.deleteMany(mapOf("collectionName" to "orders", "filter" to "{}"))

// deletes every record of the collection
api.database.deleteMany(mapOf("collectionName" to "orders", "filter" to "{}", "allRecords" to true))
```

The marketplace built-ins `db.update` and `db.delete` take the same
`allRecords` argument.

### Callers who may only touch their own records

A caller with only own-record rights (`createAsUser`, `updateOwn`,
`deleteOwn`) may call `insertMany`, `updateMany` and `deleteMany`. The
gateway limits these calls to the caller's own records: `insertMany` makes the
caller the owner of every new record, `updateMany` / `deleteMany` touch only
records the caller owns. Before, these calls were refused with HTTP 403.

### Errors

| Code | When |
| --- | --- |
| `CM-ERRORS-DATABASE-031` | `findTerms` / `findTermsChildren`: the filter uses `$where`, `$function` or `$accumulator` (code that would run on the server). |
| `CM-ERRORS-DATABASE-035` | `updateOne` / `updateMany`: the update body has `$` operators such as `$inc` or `$set`. Send the plain fields to change; the gateway applies them with `$set` itself. |
| `CM-ERRORS-DATABASE-036` | `insertOne` / `insertMany` / `replaceOne`: the record body is not a valid document ("Invalid record document"). For `insertMany` the error context has `Index` — the position of the broken document. Before, this answered `CM-ERRORS-DATABASE-005` "Invalid filter document". |
| `CM-ERRORS-DATABASE-037` | `updateMany` / `deleteMany`: empty filter without `allRecords = true`. |
| `CM-ERRORS-MEMBERSHIP-USERS-012` | `changeResponsibility`: the new owner is not a user of the project in the request env. |
| `CM-ERRORS-DATABASE-014` | `updateOne` / `updateMany`: `arrayFilters` is malformed or not paired with the `$[name]` identifiers in `update`, or two update keys overlap (`address` and `address.city`). The context carries the reason. |
| `CM-ERRORS-DATABASE-030` | a required field is missing or `null` on insert / replace (also inside a nested form). |
| `CM-ERRORS-DATABASE-039` … `049` | the record breaks one rule of the published schema — one code per keyword, in the context as `Keyword`, with `FieldName` = the full path (`customer.address.zip`, `lines[0].qty`): `039` type, `040` length (`minLength` / `maxLength`, `minItems` / `maxItems`, a JSON field over `maxBytes`), `041` pattern, `042` format (email, uri, a file id), `043` range (`minimum` / `maximum`), `044` multipleOf, `045` enum, `046` uniqueItems, `047` an unknown or missing member of a nested form / currency / geolocation, `048` coordinates, `049` translateOptions. |
| `CM-ERRORS-DATABASE-050` … `054` | a reference names a target that does not exist — `050` user, `051` role (the stored value is the role **id**; a name is refused), `052` taxonomy term, `053` record of the linked collection, `054` file. The context carries `MissingId`. |
| `CM-ERRORS-DATABASE-055` | the declared target itself cannot be read (the taxonomy is not in the project, the collection has no repository, the files integration cannot be opened). Context `Target`. |
| `CM-ERRORS-DATABASE-056` | `expandReferences = true` and the caller lacks read on a linked source. Context `SourceKind`, `Source`, `Fields`, `MissingPermissions`. |

```kotlin
try {
    api.database.insertMany(mapOf("collectionName" to "orders", "documents" to docs))
} catch (e: NorbixError) {
    if (e.errorCode == "CM-ERRORS-DATABASE-036") {
        println("document #${e.errors.first().context["Index"]} is broken")
    }
}
```

### Soft-deleted records

`updateOne`, `updateMany`, `replaceOne` and `changeResponsibility` no longer
match soft-deleted records: for a single-record call such a record is "not
found", and a bulk update skips it.

## Working with terms

A **taxonomy** is a named tree of **terms** (labels). A term can have one parent (a clean hierarchy) or several parents (the same item under many categories). Pick the call that matches what you want:

| I want to… | Call | Returns |
| --- | --- | --- |
| Get a taxonomy's terms as a flat list | `findTerms` | a paginated `list` of terms |
| Get only the children of one term | `findTermsChildren` | a `list` of child terms (direct + multi-parent) |
| Get a taxonomy's terms as a ready-made tree | `findTermTree` | a `tree` of nested term nodes |
| Get the taxonomy structure (e.g. Countries → Cities) | `findTaxonomyTree` | a `tree` of taxonomy nodes |
| Get one term tree across a taxonomy and its child taxonomies | `findMergedTermTree` | one merged `tree` of term nodes |

The examples below all use one example `services` taxonomy shaped like this:

```text
Indoors
  └─ Air conditioning
       └─ Wall-mounted
Outdoors
  └─ Solar panels
```

---

### List a taxonomy's terms (flat)
**Goal:** show every term of `services` in a simple list, in display order.

```kotlin
val terms = client.api.database.findTerms(
    mapOf("taxonomyName" to "services"),
)
```

```json
{
  "list": {
    "items": [
      { "id": "term_indoors",   "taxonomyName": "services", "parentId": null,           "order": 1, "name": "Indoors" },
      { "id": "term_air_con",   "taxonomyName": "services", "parentId": "term_indoors", "order": 1, "name": "Air conditioning" },
      { "id": "term_wall",      "taxonomyName": "services", "parentId": "term_air_con", "order": 1, "name": "Wall-mounted" },
      { "id": "term_outdoors",  "taxonomyName": "services", "parentId": null,           "order": 2, "name": "Outdoors" },
      { "id": "term_solar",     "taxonomyName": "services", "parentId": "term_outdoors","order": 1, "name": "Solar panels" }
    ],
    "hasMore": false, "hasPrevious": false, "startingAfter": null, "endingBefore": null
  },
  "responseStatus": { "isSuccess": true }
}
```

The list is flat — every term is one row, with its `parentId` telling you where it sits. The nesting is not built for you here (use `findTermTree` for that).

---

### List only top-level terms (filtered)
**Goal:** show just the roots (no parent) — for the first level of a menu.

```kotlin
val roots = client.api.database.findTerms(
    mapOf("taxonomyName" to "services", "filter" to "{ \"parentId\": null }"),
)
```

```json
{
  "list": {
    "items": [
      { "id": "term_indoors",  "taxonomyName": "services", "parentId": null, "order": 1, "name": "Indoors" },
      { "id": "term_outdoors", "taxonomyName": "services", "parentId": null, "order": 2, "name": "Outdoors" }
    ],
    "hasMore": false, "hasPrevious": false, "startingAfter": null, "endingBefore": null
  },
  "responseStatus": { "isSuccess": true }
}
```

`filter` is an optional MongoDB filter, ANDed with the taxonomy. Use it to fetch one level at a time (lazy tree loading) or to find terms by any field.

---

### Get a term's children
**Goal:** the user expanded *Indoors* — load what is directly under it.

```kotlin
val children = client.api.database.findTermsChildren(
    mapOf("taxonomyName" to "services", "parentId" to "term_indoors"),
)
```

```json
{
  "list": {
    "items": [
      {
        "id": "term_air_con",
        "taxonomyName": "services",
        "parentId": "term_indoors",
        "order": 1,
        "name": "Air conditioning",
        "multiParents": [
          { "taxonomyId": "tax_service_types", "parentId": "term_indoors",          "name": "Indoors" },
          { "taxonomyId": "tax_service_types", "parentId": "term_energy_efficient", "name": "Energy efficient" }
        ]
      }
    ],
    "hasMore": false, "hasPrevious": false
  },
  "responseStatus": { "isSuccess": true }
}
```

This returns **both** direct children (their `parentId` is `term_indoors`) **and** multi-parent children (terms that list `term_indoors` in `multiParents`). Parent names are already resolved, so no second lookup.

---

### Multi-parent: one product in several categories
**Goal:** in a `products` taxonomy, a *Relaxing massage oil* belongs to *For couples*, *Gift ideas*, **and** *Body care*. Listing the children of **any** of those categories returns it.

```kotlin
val giftIdeas = client.api.database.findTermsChildren(
    mapOf("taxonomyName" to "products", "parentId" to "term_gift_ideas"),
)
```

```json
{
  "list": {
    "items": [
      {
        "id": "term_relaxing_oil",
        "taxonomyName": "products",
        "name": "Relaxing massage oil",
        "multiParents": [
          { "taxonomyId": "tax_categories", "parentId": "term_for_couples", "name": "For couples" },
          { "taxonomyId": "tax_categories", "parentId": "term_gift_ideas",  "name": "Gift ideas" },
          { "taxonomyId": "tax_categories", "parentId": "term_body_care",   "name": "Body care" }
        ]
      }
    ],
    "hasMore": false, "hasPrevious": false
  },
  "responseStatus": { "isSuccess": true }
}
```

One product, three category links — no duplicate listings. The same product would also come back from the children of `term_for_couples` and `term_body_care`.

---

### Get the whole term tree in one call
**Goal:** render the full `services` tree at once, already nested.

```kotlin
val tree = client.api.database.findTermTree(
    mapOf("taxonomyName" to "services"),
)
```

```json
{
  "tree": [
    {
      "id": "term_indoors",
      "name": "Indoors",
      "order": 1,
      "children": [
        {
          "id": "term_air_con",
          "name": "Air conditioning",
          "order": 1,
          "children": [
            { "id": "term_wall", "name": "Wall-mounted", "order": 1, "children": null }
          ]
        }
      ]
    },
    {
      "id": "term_outdoors",
      "name": "Outdoors",
      "order": 2,
      "children": [
        { "id": "term_solar", "name": "Solar panels", "order": 1, "children": null }
      ]
    }
  ],
  "responseStatus": { "isSuccess": true }
}
```

Roots are in `tree`; each node carries its own `children`; a leaf has `children: null`. The tree arrives ready to render — no client-side tree building.

---

### Get only a sub-tree, capped by depth
**Goal:** start from *Indoors* and go at most 2 levels deep.

```kotlin
val subTree = client.api.database.findTermTree(
    mapOf(
        "taxonomyName" to "services",
        "rootTermId" to "term_indoors",
        "depth" to 2,
    ),
)
```

```json
{
  "tree": [
    {
      "id": "term_indoors",
      "name": "Indoors",
      "order": 1,
      "children": [
        { "id": "term_air_con", "name": "Air conditioning", "order": 1, "children": null }
      ]
    }
  ],
  "responseStatus": { "isSuccess": true }
}
```

With `depth` 2 you get *Indoors* (level 1) and *Air conditioning* (level 2); *Wall-mounted* (level 3) is cut off, so *Air conditioning* shows `children: null`.

---

### Get the taxonomy structure tree — without terms
**Goal:** see how taxonomies relate to each other (e.g. a `Cities` taxonomy whose parent is `Countries`), structure only.

```kotlin
val structure = client.api.database.findTaxonomyTree()
```

```json
{
  "tree": [
    {
      "viewId": "txn_countries",
      "taxonomyName": "Countries",
      "taxonomySlug": "countries",
      "parentId": null,
      "children": [
        { "viewId": "txn_cities", "taxonomyName": "Cities", "taxonomySlug": "cities", "parentId": "txn_countries", "children": null, "terms": null }
      ],
      "terms": null
    }
  ],
  "responseStatus": { "isSuccess": true }
}
```

This is the **taxonomy** tree, not the term tree: nodes are taxonomies. Every `terms` is `null` because we did not ask for terms.

---

### Get the taxonomy structure tree — with terms
**Goal:** same structure, but also pull each taxonomy's terms in the same call.

```kotlin
val structureWithTerms = client.api.database.findTaxonomyTree(
    mapOf("includeTerms" to true),
)
```

```json
{
  "tree": [
    {
      "viewId": "txn_countries",
      "taxonomyName": "Countries",
      "taxonomySlug": "countries",
      "parentId": null,
      "terms": [
        { "id": "term_lt", "name": "Lithuania", "order": 1, "children": null },
        { "id": "term_lv", "name": "Latvia",    "order": 2, "children": null }
      ],
      "children": [
        {
          "viewId": "txn_cities",
          "taxonomyName": "Cities",
          "taxonomySlug": "cities",
          "parentId": "txn_countries",
          "terms": [
            { "id": "term_vilnius", "name": "Vilnius", "order": 1, "children": null },
            { "id": "term_kaunas",  "name": "Kaunas",  "order": 2, "children": null }
          ],
          "children": null
        }
      ]
    }
  ],
  "responseStatus": { "isSuccess": true }
}
```

Now each taxonomy node's `terms` holds that taxonomy's full term tree (same shape as `findTermTree`) — *Countries* carries its countries, *Cities* carries its cities.

### Term reads — permissions and errors

- Every term read by taxonomy name (`findTerms`, `findTermsChildren`,
  `findTermTree`, `findMergedTermTree`) asks `database:read` on
  `database:term:<taxonomy id>` — the taxonomy **id**, not its name.
  `findMergedTermTree` asks it on every nested taxonomy too.
- Terms belong to the taxonomy id, so renaming a taxonomy keeps its terms.
- `CM-ERRORS-TAXONOMIES-010` — the taxonomy name is unknown.
- `CM-ERRORS-TAXONOMIES-011` — the tree has more than 5000 terms (whole
  taxonomy, merged tree, or `findTaxonomyTree` with `includeTerms`). Read a
  sub-tree instead (`rootTermId`, `depth`).
- `CM-ERRORS-TAXONOMIES-005` — the taxonomy name is longer than 40 characters.
- `findTaxonomyTree` with `includeTerms = true` fails when a term read fails;
  before, it silently returned the taxonomies without terms.

> Every term-reading call also accepts an optional `databaseIntegrationId` key to target a non-default database.
