package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.MultiSelect")
@js.native
class MultiSelect protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: MultiSelectOptions) = this()
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  var input: kendoDashUiLib.JQuery = js.native
  var list: kendoDashUiLib.JQuery = js.native
  @JSName("options")
  var options_MultiSelect: MultiSelectOptions = js.native
  var tagList: kendoDashUiLib.JQuery = js.native
  var ul: kendoDashUiLib.JQuery = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def close(): scala.Unit = js.native
  def dataItems(): js.Any = js.native
  def enable(enable: scala.Boolean): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def items(): js.Any = js.native
  def open(): scala.Unit = js.native
  def readonly(readonly: scala.Boolean): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def search(word: java.lang.String): scala.Unit = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource): scala.Unit = js.native
  def toggle(): scala.Unit = js.native
  def toggle(toggle: scala.Boolean): scala.Unit = js.native
  def value(): js.Any = js.native
  def value(value: java.lang.String): scala.Unit = js.native
  def value(value: js.Any): scala.Unit = js.native
}

@JSGlobal("kendo.ui.MultiSelect")
@js.native
object MultiSelect extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.MultiSelect = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.MultiSelect = js.native
}
