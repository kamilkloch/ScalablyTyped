package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasPattern extends js.Object {
  /**
       * Sets the transformation matrix that will be used when rendering the pattern during a fill or
       * stroke painting operation.
       */
  def setTransform(): scala.Unit = js.native
  /**
       * Sets the transformation matrix that will be used when rendering the pattern during a fill or
       * stroke painting operation.
       */
  def setTransform(transform: DOMMatrix2DInit): scala.Unit = js.native
}

@JSGlobal("CanvasPattern")
@js.native
object CanvasPattern
  extends ScalablyTyped.runtime.Instantiable0[CanvasPattern]
