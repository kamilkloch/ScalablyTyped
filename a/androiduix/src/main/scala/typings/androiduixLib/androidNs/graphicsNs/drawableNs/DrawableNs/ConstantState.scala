package typings
package androiduixLib.androidNs.graphicsNs.drawableNs.DrawableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstantState extends js.Object {
  def newDrawable(): androiduixLib.androidNs.graphicsNs.drawableNs.Drawable
}

object ConstantState {
  @scala.inline
  def apply(newDrawable: () => androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): ConstantState = {
    val __obj = js.Dynamic.literal(newDrawable = js.Any.fromFunction0(newDrawable))
  
    __obj.asInstanceOf[ConstantState]
  }
}

