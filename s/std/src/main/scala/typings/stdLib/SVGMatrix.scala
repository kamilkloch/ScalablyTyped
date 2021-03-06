package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SVGMatrix")
@js.native
class SVGMatrixCls () extends DOMMatrix {
  def this(init: java.lang.String) = this()
  def this(init: js.Array[scala.Double]) = this()
}

@JSGlobal("SVGMatrix")
@js.native
object SVGMatrix
  extends org.scalablytyped.runtime.Instantiable0[DOMMatrix]
     with org.scalablytyped.runtime.Instantiable1[(/* init */ js.Array[scala.Double]) | (/* init */ java.lang.String), DOMMatrix] {
  def fromFloat32Array(array32: stdLib.Float32Array): stdLib.DOMMatrix = js.native
  def fromFloat64Array(array64: stdLib.Float64Array): stdLib.DOMMatrix = js.native
  def fromMatrix(): stdLib.DOMMatrix = js.native
  def fromMatrix(other: stdLib.DOMMatrixInit): stdLib.DOMMatrix = js.native
}

