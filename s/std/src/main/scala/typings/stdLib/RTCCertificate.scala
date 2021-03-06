package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCCertificate extends js.Object {
  val expires: scala.Double
  def getFingerprints(): js.Array[RTCDtlsFingerprint]
}

@JSGlobal("RTCCertificate")
@js.native
class RTCCertificateCls () extends RTCCertificate {
  /* CompleteClass */
  override val expires: scala.Double = js.native
  /* CompleteClass */
  override def getFingerprints(): js.Array[RTCDtlsFingerprint] = js.native
}

@JSGlobal("RTCCertificate")
@js.native
object RTCCertificate
  extends org.scalablytyped.runtime.Instantiable0[RTCCertificate] {
  def getSupportedAlgorithms(): js.Array[stdLib.AlgorithmIdentifier] = js.native
}

