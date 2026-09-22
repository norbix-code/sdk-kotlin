package ai.norbix.sdk.core

/** One error inside the gateway's `responseStatus.errors` list. */
data class NorbixErrorItem(
    /** The gateway's own code, e.g. `CM-ERRORS-FILES-016`. */
    val errorCode: String? = null,
    /** The gateway's own text. */
    val message: String? = null,
    /** The request field the error is about, when it is about one. */
    val fieldName: String? = null,
    /** Extra values the gateway attached to this error. */
    val context: Map<String, Any?> = emptyMap(),
)

class NorbixError(
    val code: String = "NORBIX_ERROR",
    val status: Int = 0,
    override val message: String,
    val details: Map<String, Any?> = emptyMap(),
    /** Every error the gateway sent, in the order it sent them. */
    val errors: List<NorbixErrorItem> = emptyList(),
    /** The answer exactly as it arrived, for whoever needs the rest of it. */
    val body: Any? = null,
) : RuntimeException("$code ($status): $message") {

    /** Same value as [status]. The name every Norbix SDK uses for it. */
    val httpStatus: Int get() = status

    /** Same value as [code]. The name every Norbix SDK uses for it. */
    val errorCode: String get() = code

    companion object {
        /**
         * Build the error a gateway answer describes.
         *
         * The gateway puts its message and its error code inside
         * `responseStatus.errors[]`, not at the top of the block, so that list
         * is read first: the first entry gives the message and the code, and
         * every entry is kept in [errors]. Only when the body has no
         * `responseStatus` are the top-level `message` and `errorCode` read.
         * `Request failed (HTTP N)` is the last fallback, used when the body
         * says nothing at all — a 500 page that is not JSON, say.
         */
        @JvmStatic
        fun fromBody(status: Int, parsed: Map<String, Any?>, raw: Any? = null): NorbixError {
            // `source` is responseStatus when the body has one, the body itself
            // when it has none — so the top-level fields are read only then.
            val source = responseStatusOf(parsed) ?: parsed

            val items = itemsOf(source["errors"])
            val first = items.firstOrNull { it.message != null || it.errorCode != null }

            val message = first?.message
                ?: text(source["message"])
                ?: "Request failed (HTTP $status)"
            // Callers switch on `code`, so it is never left empty; the
            // gateway's own code wins whenever the gateway sent one.
            val code = first?.errorCode
                ?: text(source["errorCode"])
                ?: "HTTP_$status"

            return NorbixError(
                code = code,
                status = status,
                message = message,
                details = parsed,
                errors = items,
                body = raw ?: parsed,
            )
        }

        /**
         * `true` when the body carries `responseStatus.isSuccess == false`.
         *
         * The gateway answers a business refusal — an unknown id, a rule that
         * says no — with HTTP 200 and that flag. Without this check the SDK
         * would hand such an answer back as a value and the caller would carry
         * on as if the call had worked (10b-files, issue #67).
         */
        @JvmStatic
        fun saysItFailed(parsed: Any?): Boolean {
            @Suppress("UNCHECKED_CAST")
            val body = parsed as? Map<String, Any?> ?: return false
            val status = responseStatusOf(body) ?: return false
            for (key in listOf("isSuccess", "IsSuccess")) {
                if (status.containsKey(key)) return status[key] == false
            }
            return false
        }

        /** The `responseStatus` block of a body, whatever the casing of the key. */
        private fun responseStatusOf(body: Map<String, Any?>): Map<String, Any?>? {
            for (key in listOf("responseStatus", "ResponseStatus")) {
                @Suppress("UNCHECKED_CAST")
                val value = body[key] as? Map<String, Any?>
                if (value != null) return value
            }
            return null
        }

        private fun itemsOf(value: Any?): List<NorbixErrorItem> {
            val list = value as? List<*> ?: return emptyList()
            return list.mapNotNull { entry ->
                @Suppress("UNCHECKED_CAST")
                val map = entry as? Map<String, Any?> ?: return@mapNotNull null
                @Suppress("UNCHECKED_CAST")
                val context = map["context"] as? Map<String, Any?> ?: emptyMap()
                NorbixErrorItem(
                    errorCode = text(map["errorCode"]),
                    message = text(map["message"]),
                    fieldName = text(map["fieldName"]),
                    context = context,
                )
            }
        }

        private fun text(value: Any?): String? =
            (value as? String)?.takeIf { it.isNotEmpty() }
    }
}
