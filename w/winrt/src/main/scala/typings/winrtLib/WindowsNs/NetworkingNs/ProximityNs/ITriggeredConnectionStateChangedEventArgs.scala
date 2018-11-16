package typings
package winrtLib.WindowsNs.NetworkingNs.ProximityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITriggeredConnectionStateChangedEventArgs extends js.Object {
  var id: scala.Double
  var socket: winrtLib.WindowsNs.NetworkingNs.SocketsNs.StreamSocket
  var state: TriggeredConnectState
}
