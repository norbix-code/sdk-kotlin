package dev.norbix.sdk.core

class NorbixError(
    val code: String = "NORBIX_ERROR",
    val status: Int = 0,
    override val message: String,
    val details: Map<String, Any?> = emptyMap(),
) : RuntimeException("$code ($status): $message")
