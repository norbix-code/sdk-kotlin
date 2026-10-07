package ai.norbix.sdk.core

/**
 * One reference value as the gateway returns it when a record read is sent
 * with `expandReferences = true` (gateway campaign schema-content, 2026-10).
 *
 * A reference field (a user, a role, a taxonomy term, a record of another
 * collection) normally stores only the target's id. With `expandReferences`
 * every such value comes back as `{ "id": "...", "display": ... }`, and a
 * `multiple` reference as a list of them. This class is the typed view of
 * one such pair; the SDK leaves the record itself untyped, so read the pair
 * out of the record with [from] or [listFrom].
 *
 * @property id the stored id, exactly as the record holds it.
 * @property display what the schema's `displayField` names on the target:
 *   a string for most fields, a language map (`{ "en": "News" }`) for a
 *   translatable name, or `null` when the target is gone or the caller may
 *   not read it.
 */
data class ExpandedReference(
    val id: String?,
    val display: Any?,
) {
    /** `true` when the gateway found a target to show. */
    val isResolved: Boolean get() = display != null

    /**
     * [display] as plain text: the string itself, or for a language map the
     * value under [language] (falling back to the first entry). `null` when
     * there is nothing to show.
     */
    fun displayText(language: String? = null): String? = when (val d = display) {
        null -> null
        is String -> d
        is Map<*, *> -> {
            val byLanguage = language?.let { d[it] }
            (byLanguage ?: d.values.firstOrNull())?.toString()
        }
        else -> d.toString()
    }

    companion object {
        /**
         * Reads one expanded pair. Accepts the `{ id, display }` map the
         * gateway returns; a bare string (a read made without the flag) is
         * handed back as an unresolved reference with that id; `null` and
         * anything else give `null`.
         */
        @JvmStatic
        fun from(value: Any?): ExpandedReference? = when (value) {
            null -> null
            is ExpandedReference -> value
            is String -> ExpandedReference(id = value, display = null)
            is Map<*, *> -> ExpandedReference(id = value["id"]?.toString(), display = value["display"])
            else -> null
        }

        /**
         * Reads a `multiple` reference: a list of expanded pairs. A single
         * pair is wrapped in a one-item list; `null` gives an empty list.
         */
        @JvmStatic
        fun listFrom(value: Any?): List<ExpandedReference> = when (value) {
            null -> emptyList()
            is List<*> -> value.mapNotNull { from(it) }
            else -> listOfNotNull(from(value))
        }
    }
}
