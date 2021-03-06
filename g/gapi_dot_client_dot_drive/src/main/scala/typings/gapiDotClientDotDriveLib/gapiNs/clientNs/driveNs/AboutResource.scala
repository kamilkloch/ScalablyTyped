package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AboutResource extends js.Object {
  /** Gets information about the user, the user's Drive, and system capabilities. */
  def get(request: gapiDotClientDotDriveLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[About]
}

object AboutResource {
  @scala.inline
  def apply(get: gapiDotClientDotDriveLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[About]): AboutResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[AboutResource]
  }
}

