package typings
package androiduixLib.androidNs.viewNs.ViewTreeObserverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGlobalFocusChangeListener extends js.Object {
  def onGlobalFocusChanged(oldFocus: androiduixLib.androidNs.viewNs.View, newFocus: androiduixLib.androidNs.viewNs.View): js.Any
}

object OnGlobalFocusChangeListener {
  @scala.inline
  def apply(
    onGlobalFocusChanged: (androiduixLib.androidNs.viewNs.View, androiduixLib.androidNs.viewNs.View) => js.Any
  ): OnGlobalFocusChangeListener = {
    val __obj = js.Dynamic.literal(onGlobalFocusChanged = js.Any.fromFunction2(onGlobalFocusChanged))
  
    __obj.asInstanceOf[OnGlobalFocusChangeListener]
  }
}

