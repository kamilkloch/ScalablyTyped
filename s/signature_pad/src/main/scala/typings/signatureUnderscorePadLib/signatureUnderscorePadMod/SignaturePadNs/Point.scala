package typings
package signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var time: scala.Double
  var x: scala.Double
  var y: scala.Double
  def distanceTo(start: Point): scala.Double
  def velocityFrom(start: Point): scala.Double
}

object Point {
  @scala.inline
  def apply(
    distanceTo: Point => scala.Double,
    time: scala.Double,
    velocityFrom: Point => scala.Double,
    x: scala.Double,
    y: scala.Double,
    color: java.lang.String = null
  ): Point = {
    val __obj = js.Dynamic.literal(distanceTo = js.Any.fromFunction1(distanceTo), time = time, velocityFrom = js.Any.fromFunction1(velocityFrom), x = x, y = y)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[Point]
  }
}

