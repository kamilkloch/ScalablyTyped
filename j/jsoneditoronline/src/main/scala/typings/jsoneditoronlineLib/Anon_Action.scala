package typings
package jsoneditoronlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  def addEventListener(
    element: stdLib.HTMLElement,
    action: java.lang.String,
    listener: js.Function1[/* event */ js.UndefOr[stdLib.Event], scala.Unit],
    useCapture: scala.Boolean
  ): js.Function1[/* event */ js.UndefOr[stdLib.Event], scala.Unit]
  def preventDefault(event: stdLib.Event): scala.Unit
  def removeEventListener(
    element: stdLib.HTMLElement,
    action: java.lang.String,
    listener: js.Function1[/* event */ js.UndefOr[stdLib.Event], scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit
  def stopPropagation(event: stdLib.Event): scala.Unit
}

object Anon_Action {
  @scala.inline
  def apply(
    addEventListener: (stdLib.HTMLElement, java.lang.String, js.Function1[/* event */ js.UndefOr[stdLib.Event], scala.Unit], scala.Boolean) => js.Function1[/* event */ js.UndefOr[stdLib.Event], scala.Unit],
    preventDefault: stdLib.Event => scala.Unit,
    removeEventListener: (stdLib.HTMLElement, java.lang.String, js.Function1[/* event */ js.UndefOr[stdLib.Event], scala.Unit], scala.Boolean) => scala.Unit,
    stopPropagation: stdLib.Event => scala.Unit
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction4(addEventListener), preventDefault = js.Any.fromFunction1(preventDefault), removeEventListener = js.Any.fromFunction4(removeEventListener), stopPropagation = js.Any.fromFunction1(stopPropagation))
  
    __obj.asInstanceOf[Anon_Action]
  }
}

