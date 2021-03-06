package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client point object.
  */
trait ASPxClientPoint extends js.Object {
  /**
    * Gets the point's X-coordinate.
    */
  def GetX(): scala.Double
  /**
    * Gets the point's Y-coordinate.
    */
  def GetY(): scala.Double
}

object ASPxClientPoint {
  @scala.inline
  def apply(GetX: () => scala.Double, GetY: () => scala.Double): ASPxClientPoint = {
    val __obj = js.Dynamic.literal(GetX = js.Any.fromFunction0(GetX), GetY = js.Any.fromFunction0(GetY))
  
    __obj.asInstanceOf[ASPxClientPoint]
  }
}

