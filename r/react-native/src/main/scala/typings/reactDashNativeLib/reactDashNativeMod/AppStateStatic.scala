package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppStateStatic extends js.Object {
  var currentState: AppStateStatus
  /**
    * Add a handler to AppState changes by listening to the change event
    * type and providing the handler
    */
  def addEventListener(`type`: AppStateEvent, listener: js.Function1[/* state */ AppStateStatus, scala.Unit]): scala.Unit
  /**
    * Remove a handler by passing the change event type and the handler
    */
  def removeEventListener(`type`: AppStateEvent, listener: js.Function1[/* state */ AppStateStatus, scala.Unit]): scala.Unit
}

object AppStateStatic {
  @scala.inline
  def apply(
    addEventListener: (AppStateEvent, js.Function1[/* state */ AppStateStatus, scala.Unit]) => scala.Unit,
    currentState: AppStateStatus,
    removeEventListener: (AppStateEvent, js.Function1[/* state */ AppStateStatus, scala.Unit]) => scala.Unit
  ): AppStateStatic = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), currentState = currentState, removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[AppStateStatic]
  }
}

