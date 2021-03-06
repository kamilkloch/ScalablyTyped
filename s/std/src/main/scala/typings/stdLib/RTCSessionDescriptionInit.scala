package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCSessionDescriptionInit extends js.Object {
  var sdp: js.UndefOr[java.lang.String] = js.undefined
  var `type`: RTCSdpType
}

object RTCSessionDescriptionInit {
  @scala.inline
  def apply(`type`: RTCSdpType, sdp: java.lang.String = null): RTCSessionDescriptionInit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (sdp != null) __obj.updateDynamic("sdp")(sdp)
    __obj.asInstanceOf[RTCSessionDescriptionInit]
  }
}

