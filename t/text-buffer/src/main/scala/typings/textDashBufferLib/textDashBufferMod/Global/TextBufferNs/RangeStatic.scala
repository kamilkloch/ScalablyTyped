package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The static side to the Range class. */
@js.native
trait RangeStatic
  extends /** Construct a Range object. */
ScalablyTyped.runtime.Instantiable0[Range]
     with /** Construct a Range object. */
ScalablyTyped.runtime.Instantiable1[/* pointA */ PointCompatible, Range]
     with /** Construct a Range object. */
ScalablyTyped.runtime.Instantiable2[/* pointA */ PointCompatible, /* pointB */ PointCompatible, Range] {
  /** Call this with the result of Range::serialize to construct a new Range. */
  def deserialize(array: js.Object): Range = js.native
  /** Convert any range-compatible object to a Range. */
  def fromObject(`object`: RangeCompatible): Range = js.native
  /** Convert any range-compatible object to a Range. */
  def fromObject(`object`: RangeCompatible, copy: scala.Boolean): Range = js.native
}
