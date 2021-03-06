package typings
package freedomLib.freedomNs.UdpSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends js.Object {
  @JSName("sendTo")
  var sendTo_Original: freedomLib.freedomNs.Method3[stdLib.ArrayBuffer, java.lang.String, scala.Double, scala.Double] = js.native
  def bind(address: java.lang.String, port: scala.Double): js.Promise[scala.Unit] = js.native
  def destroy(): js.Promise[scala.Unit] = js.native
  def getInfo(): js.Promise[SocketInfo] = js.native
  def on(name: java.lang.String, listener: js.Function): scala.Unit = js.native
  def sendTo(a: stdLib.ArrayBuffer, b: java.lang.String, c: scala.Double): js.Promise[scala.Double] = js.native
}

