package dev.norbix.sdk.hub

import dev.norbix.sdk.core.Transport

class HubNamespace(transport: Transport) {
    val access_token = AccessTokenModule(transport)
    val account = AccountModule(transport)
    val ai = AiModule(transport)
    val apikeys = ApikeysModule(transport)
    val auth = AuthModule(transport)
    val database = DatabaseModule(transport)
    val echo = EchoModule(transport)
    val email = EmailModule(transport)
    val files = FilesModule(transport)
    val internal_ = InternalModule(transport)
    val logs = LogsModule(transport)
    val membership = MembershipModule(transport)
    val notifications = NotificationsModule(transport)
    val payments = PaymentsModule(transport)
    val scheduler = SchedulerModule(transport)
    val webhooks = WebhooksModule(transport)
}
