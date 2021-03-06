package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents data usage information returned by the ConnectionProfile.GetLocalUsage method. */
@JSGlobal("Windows.Networking.Connectivity.DataUsage")
@js.native
abstract class DataUsage () extends js.Object {
  /** Gets a value indicating the number of bytes received by a connection over a specific period of time. */
  var bytesReceived: scala.Double = js.native
  /** Gets a value indicating the number of bytes sent by the connection over a specific period of time. */
  var bytesSent: scala.Double = js.native
}

