package typings
package nesLib.nesMod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  def broadcast(message: js.Any): scala.Unit = js.native
  def broadcast(message: js.Any, options: nesLib.nesMod.ServerBroadcastOptions): scala.Unit = js.native
  def eachSocket(each: js.Function1[/* socket */ nesLib.nesMod.Socket, scala.Unit]): scala.Unit = js.native
  def eachSocket(
    each: js.Function1[/* socket */ nesLib.nesMod.Socket, scala.Unit],
    options: nesLib.nesMod.ServerEachSocketOptions
  ): scala.Unit = js.native
  def publish(path: java.lang.String, message: js.Any): scala.Unit = js.native
  def publish(path: java.lang.String, message: js.Any, options: nesLib.nesMod.ServerPublishOptions): scala.Unit = js.native
  def subscription(path: java.lang.String): scala.Unit = js.native
  def subscription(path: java.lang.String, options: nesLib.nesMod.ServerSubscriptionOptions): scala.Unit = js.native
}

