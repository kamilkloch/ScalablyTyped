package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.ButtonGroup")
@js.native
class ButtonGroup protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: ButtonGroupOptions) = this()
  @JSName("options")
  var options_ButtonGroup: ButtonGroupOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def badge(button: java.lang.String, value: java.lang.String): java.lang.String = js.native
  def badge(button: java.lang.String, value: scala.Boolean): java.lang.String = js.native
  def badge(button: scala.Double, value: java.lang.String): java.lang.String = js.native
  def badge(button: scala.Double, value: scala.Boolean): java.lang.String = js.native
  def current(): kendoDashUiLib.JQuery = js.native
  def enable(enable: scala.Boolean): scala.Unit = js.native
  def select(li: kendoDashUiLib.JQuery): scala.Unit = js.native
  def select(li: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.ButtonGroup")
@js.native
object ButtonGroup extends js.Object {
  var fn: kendoDashUiLib.kendoNs.mobileNs.uiNs.ButtonGroup = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.mobileNs.uiNs.ButtonGroup = js.native
}

