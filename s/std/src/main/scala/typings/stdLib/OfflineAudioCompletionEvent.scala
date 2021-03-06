package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Web Audio API OfflineAudioCompletionEvent interface represents events that occur when the processing of an OfflineAudioContext is terminated. The complete event implements this interface. */
@js.native
trait OfflineAudioCompletionEvent extends Event {
  val renderedBuffer: AudioBuffer = js.native
}

@JSGlobal("OfflineAudioCompletionEvent")
@js.native
class OfflineAudioCompletionEventCls protected () extends OfflineAudioCompletionEvent {
  def this(`type`: java.lang.String, eventInitDict: OfflineAudioCompletionEventInit) = this()
}

@JSGlobal("OfflineAudioCompletionEvent")
@js.native
object OfflineAudioCompletionEvent
  extends org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ OfflineAudioCompletionEventInit, 
      OfflineAudioCompletionEvent
    ]

