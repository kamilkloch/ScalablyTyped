package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SpeechRecognitionResultList
  extends /* index */ ScalablyTyped.runtime.NumberDictionary[SpeechRecognitionResult] {
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SpeechRecognitionResult]]
  val length: scala.Double
  def item(index: scala.Double): SpeechRecognitionResult
}

@JSGlobal("SpeechRecognitionResultList")
@js.native
object SpeechRecognitionResultList
  extends ScalablyTyped.runtime.Instantiable0[SpeechRecognitionResultList]
