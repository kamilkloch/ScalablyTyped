package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackHandlerStatic extends js.Object {
  def addEventListener(eventName: BackPressEventName, handler: js.Function0[scala.Unit]): NativeEventSubscription
  def exitApp(): scala.Unit
  def removeEventListener(eventName: BackPressEventName, handler: js.Function0[scala.Unit]): scala.Unit
}

object BackHandlerStatic {
  @scala.inline
  def apply(
    addEventListener: (BackPressEventName, js.Function0[scala.Unit]) => NativeEventSubscription,
    exitApp: () => scala.Unit,
    removeEventListener: (BackPressEventName, js.Function0[scala.Unit]) => scala.Unit
  ): BackHandlerStatic = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), exitApp = js.Any.fromFunction0(exitApp), removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[BackHandlerStatic]
  }
}

