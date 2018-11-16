package typings
package subscriptionsDashTransportDashWsLib.subscriptionsDashTransportDashWsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("subscriptions-transport-ws", "SubscriptionServer")
@js.native
class SubscriptionServer protected ()
  extends subscriptionsDashTransportDashWsLib.distServerMod.SubscriptionServer {
  def this(options: subscriptionsDashTransportDashWsLib.distServerMod.ServerOptions, socketOptions: wsLib.wsMod.WebSocketNs.ServerOptions) = this()
}

@JSImport("subscriptions-transport-ws", "SubscriptionServer")
@js.native
object SubscriptionServer extends js.Object {
  def create(
    options: subscriptionsDashTransportDashWsLib.distServerMod.ServerOptions,
    socketOptions: wsLib.wsMod.WebSocketNs.ServerOptions
  ): subscriptionsDashTransportDashWsLib.distServerMod.SubscriptionServer = js.native
}
