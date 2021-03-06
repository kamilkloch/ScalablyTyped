package typings
package dcLib.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatPointUnits extends js.Object {
  def precision(precision: scala.Double): UnitFunction
}

object FloatPointUnits {
  @scala.inline
  def apply(precision: scala.Double => UnitFunction): FloatPointUnits = {
    val __obj = js.Dynamic.literal(precision = js.Any.fromFunction1(precision))
  
    __obj.asInstanceOf[FloatPointUnits]
  }
}

