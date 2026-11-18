package ai.norbix.sdk.core

import java.math.BigInteger
import java.net.URI

/*
 * A project's own API host.
 *
 * Norbix serves every project on `pr-<32 hex>.api.norbix.ai`. The label is the
 * project id (`pr_` + base62) written as the hex of the same GUID, so it is
 * built here with no call. The gateway's side of this is `ProjectId.HostLabel`.
 */

private const val BASE62 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
private const val PROJECT_ID_PREFIX = "pr_"
private val SIXTY_TWO: BigInteger = BigInteger.valueOf(62)
private val MAX_GUID: BigInteger = BigInteger.ONE.shiftLeft(128)

/** .NET "N" format: the first three groups of a GUID are stored little-endian. */
private val HEX_ORDER = intArrayOf(3, 2, 1, 0, 5, 4, 7, 6, 8, 9, 10, 11, 12, 13, 14, 15)

/**
 * The DNS label of a project: `pr_5XvmrTA6JVggZdmEE5bGdm` →
 * `pr-022c4aca9f9e4df787ab0a20c83c44b6`. Returns `null` for anything that is
 * not a Norbix project id (a test id, another prefix, a value that is not a
 * version-4 GUID) — it never throws.
 */
fun projectHostLabel(projectId: String?): String? {
    if (projectId == null || !projectId.startsWith(PROJECT_ID_PREFIX)) return null
    val digits = projectId.substring(PROJECT_ID_PREFIX.length)
    // 62^22 is just above 2^128: a GUID never needs more than 22 digits.
    if (digits.isEmpty() || digits.length > 22) return null

    var value = BigInteger.ZERO
    for (ch in digits) {
        val digit = BASE62.indexOf(ch)
        if (digit < 0) return null
        value = value.multiply(SIXTY_TWO).add(BigInteger.valueOf(digit.toLong()))
    }
    if (value >= MAX_GUID) return null

    // The number is the GUID's bytes, least significant first (.NET `Guid.ToByteArray()`).
    // BigInteger hands them most significant first, with a sign byte or without leading zeros.
    val bigEndian = value.toByteArray()
    val b = IntArray(16)
    for (i in 0 until 16) {
        val at = bigEndian.size - 1 - i
        b[i] = if (at >= 0) bigEndian[at].toInt() and 0xff else 0
    }

    // Only a version-4 GUID is a Norbix id (the gateway refuses the rest).
    if (b[7] shr 4 != 4 || b[8] shr 6 != 2) return null

    val hex = StringBuilder("pr-")
    for (i in HEX_ORDER) {
        hex.append(Character.forDigit(b[i] shr 4, 16)).append(Character.forDigit(b[i] and 0x0f, 16))
    }
    return hex.toString()
}

/** The placeholder an install's address template carries (`/echo` → `apiUrlTemplate`). */
const val PROJECT_HOST_LABEL_PLACEHOLDER: String = "{projectHostLabel}"

private const val NORBIX_API_DOMAIN = "api.norbix.ai"
private val PROJECT_LABEL = Regex("^pr-[0-9a-f]{32}$", RegexOption.IGNORE_CASE)

/**
 * The two base URLs of a project's API calls: [project] is where its calls go,
 * [shared] is the same address without a project label (the social sign-in
 * link is built on it).
 */
data class ProjectApiBaseUrl(val project: String, val shared: String)

/**
 * Where a project's API calls go, from the API base URL the client has
 * (devops docs/tasks/clients-project-host.md, round 2):
 *
 * - a template with `{projectHostLabel}` (an install on its own domain that
 *   serves project hosts) is filled with the project's label;
 * - an address that is already a project's host (`https://pr-<hex>.…`) gets
 *   the current project's label, so host and `norbix-project-id` always name
 *   the same project;
 * - a norbix.ai API address — `https://api.norbix.ai` or
 *   `https://<region>.api.norbix.ai`, built in or written out — becomes the
 *   project's own host `https://pr-<hex>.api.norbix.ai` (its DNS record
 *   follows the project's region);
 * - any other address is used as given.
 *
 * Scheme, port and path are kept as given; no trailing slash is added. With a
 * project id that is not a Norbix id, `project` is `shared`. Never throws.
 */
fun projectApiBaseUrl(baseUrl: String, projectId: String?): ProjectApiBaseUrl {
    val label = projectHostLabel(projectId)

    if (baseUrl.contains(PROJECT_HOST_LABEL_PLACEHOLDER)) {
        val shared = baseUrl.replace("$PROJECT_HOST_LABEL_PLACEHOLDER.", "")
        return ProjectApiBaseUrl(
            project = if (label != null) baseUrl.replace(PROJECT_HOST_LABEL_PLACEHOLDER, label) else shared,
            shared = shared,
        )
    }

    val asGiven = ProjectApiBaseUrl(baseUrl, baseUrl)
    val uri = runCatching { URI(baseUrl) }.getOrNull() ?: return asGiven
    val host = uri.host ?: return asGiven
    val labels = host.lowercase().split('.')

    if (labels.size > 1 && PROJECT_LABEL.matches(labels[0])) {
        val rest = labels.drop(1).joinToString(".")
        val shared = withHost(uri, rest) ?: return asGiven
        return ProjectApiBaseUrl(
            project = if (label != null) withHost(uri, "$label.$rest") ?: shared else shared,
            shared = shared,
        )
    }

    val lowerHost = labels.joinToString(".")
    val isNorbixApi = lowerHost == NORBIX_API_DOMAIN ||
        (labels.size == 4 && lowerHost.endsWith(".$NORBIX_API_DOMAIN"))
    if (isNorbixApi && uri.scheme.equals("https", ignoreCase = true)) {
        return ProjectApiBaseUrl(
            project = if (label != null) withHost(uri, "$label.$NORBIX_API_DOMAIN") ?: baseUrl else baseUrl,
            shared = baseUrl,
        )
    }

    return asGiven
}

/** [uri] written out again with another host; scheme, user info, port, path, query and fragment kept as given. */
private fun withHost(uri: URI, host: String): String? {
    if (uri.rawAuthority == null) return null
    val out = StringBuilder(uri.scheme).append("://")
    uri.rawUserInfo?.let { out.append(it).append('@') }
    out.append(host)
    if (uri.port >= 0) out.append(':').append(uri.port)
    out.append(uri.rawPath ?: "")
    uri.rawQuery?.let { out.append('?').append(it) }
    uri.rawFragment?.let { out.append('#').append(it) }
    return out.toString()
}

/** `https://{region}.<default host>` for a region, or the plain default when unset. */
internal fun composeRegionalUrl(region: String?, defaultUrl: String): String =
    if (region.isNullOrBlank()) defaultUrl else defaultUrl.replaceFirst("://", "://$region.")
