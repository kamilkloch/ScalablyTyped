package typings
package reconnectingwebsocketLib.reconnectingwebsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reconnectingwebsocket", JSImport.Namespace)
@js.native
class ^ protected () extends ReconnectingWebSocket {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, protocols: js.Array[java.lang.String]) = this()
  def this(url: java.lang.String, protocols: js.Array[java.lang.String], options: Options) = this()
}

@JSImport("reconnectingwebsocket", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var CLOSED: scala.Double = js.native
  var CLOSING: scala.Double = js.native
  var CONNECTING: scala.Double = js.native
  var OPEN: scala.Double = js.native
  var debugAll: scala.Boolean = js.native
}

