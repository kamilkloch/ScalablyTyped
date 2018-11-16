package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamErrorEvent extends Event {
  val error: MediaStreamError | scala.Null = js.native
}

@JSGlobal("MediaStreamErrorEvent")
@js.native
object MediaStreamErrorEvent
  extends ScalablyTyped.runtime.Instantiable1[/* typeArg */ java.lang.String, MediaStreamErrorEvent]
     with ScalablyTyped.runtime.Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ MediaStreamErrorEventInit, 
      MediaStreamErrorEvent
    ]
