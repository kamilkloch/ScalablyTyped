package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RTCRtpReceiver extends js.Object {
  val rtcpTransport: RTCDtlsTransport | scala.Null
  val track: MediaStreamTrack
  val transport: RTCDtlsTransport | scala.Null
  def getContributingSources(): js.Array[RTCRtpContributingSource]
  def getParameters(): RTCRtpReceiveParameters
  def getStats(): Promise[RTCStatsReport]
  def getSynchronizationSources(): js.Array[RTCRtpSynchronizationSource]
}

@JSGlobal("RTCRtpReceiver")
@js.native
object RTCRtpReceiver
  extends ScalablyTyped.runtime.Instantiable0[RTCRtpReceiver] {
  def getCapabilities(kind: java.lang.String): stdLib.RTCRtpCapabilities | scala.Null = js.native
}
