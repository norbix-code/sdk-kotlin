package dev.norbix.sdk.api

import dev.norbix.sdk.core.Transport

class ApiNamespace(transport: Transport) {
    val access_token = AccessTokenModule(transport)
    val apikeys = ApikeysModule(transport)
    val auth = AuthModule(transport)
    val chat = ChatModule(transport)
    val database = DatabaseModule(transport)
    val echo = EchoModule(transport)
    val membership = MembershipModule(transport)
}
