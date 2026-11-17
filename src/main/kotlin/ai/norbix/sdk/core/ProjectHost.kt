package ai.norbix.sdk.core

import java.math.BigInteger

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

/**
 * The project's own base URL under a default one: `https://api.norbix.ai` +
 * `pr_5Xvm…` → `https://pr-022c….api.norbix.ai`. `null` when the id is not a
 * Norbix project id.
 */
internal fun composeProjectUrl(projectId: String?, defaultUrl: String): String? =
    projectHostLabel(projectId)?.let { defaultUrl.replaceFirst("://", "://$it.") }

/** `https://{region}.<default host>` for a region, or the plain default when unset. */
internal fun composeRegionalUrl(region: String?, defaultUrl: String): String =
    if (region.isNullOrBlank()) defaultUrl else defaultUrl.replaceFirst("://", "://$region.")
