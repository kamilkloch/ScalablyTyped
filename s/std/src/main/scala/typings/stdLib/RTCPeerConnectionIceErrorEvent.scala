package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCPeerConnectionIceErrorEvent extends Event {
  val errorCode: scala.Double = js.native
  val errorText: java.lang.String = js.native
  val hostCandidate: java.lang.String = js.native
  val url: java.lang.String = js.native
}

@JSGlobal("RTCPeerConnectionIceErrorEvent")
@js.native
object RTCPeerConnectionIceErrorEvent
  extends ScalablyTyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ RTCPeerConnectionIceErrorEventInit, 
      RTCPeerConnectionIceErrorEvent
    ]
