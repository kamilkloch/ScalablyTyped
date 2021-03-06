package typings
package androiduixLib.ukNs.coNs.senabNs.photoviewNs.GestureDetectorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGestureListener extends js.Object {
  def onDrag(dx: scala.Double, dy: scala.Double): scala.Unit
  def onFling(startX: scala.Double, startY: scala.Double, velocityX: scala.Double, velocityY: scala.Double): scala.Unit
  def onScale(scaleFactor: scala.Double, focusX: scala.Double, focusY: scala.Double): scala.Unit
}

object OnGestureListener {
  @scala.inline
  def apply(
    onDrag: (scala.Double, scala.Double) => scala.Unit,
    onFling: (scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    onScale: (scala.Double, scala.Double, scala.Double) => scala.Unit
  ): OnGestureListener = {
    val __obj = js.Dynamic.literal(onDrag = js.Any.fromFunction2(onDrag), onFling = js.Any.fromFunction4(onFling), onScale = js.Any.fromFunction3(onScale))
  
    __obj.asInstanceOf[OnGestureListener]
  }
}

