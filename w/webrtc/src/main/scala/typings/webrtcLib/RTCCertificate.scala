package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#dom-rtccertificate
trait RTCCertificate extends js.Object {
  val expires: scala.Double
  def getAlgorithm(): java.lang.String
}

object RTCCertificate {
  @scala.inline
  def apply(expires: scala.Double, getAlgorithm: () => java.lang.String): RTCCertificate = {
    val __obj = js.Dynamic.literal(expires = expires, getAlgorithm = js.Any.fromFunction0(getAlgorithm))
  
    __obj.asInstanceOf[RTCCertificate]
  }
}

