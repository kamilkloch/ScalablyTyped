package typings
package antdLib.antdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Form")
@js.native
class Form protected ()
  extends antdLib.libFormMod.default {
  def this(props: antdLib.libFormFormMod.FormProps) = this()
}

@JSImport("antd", "Form")
@js.native
object Form extends js.Object {
  var Item: ScalablyTyped.runtime.Instantiable0[antdLib.libFormFormItemMod.default] = js.native
  var childContextTypes: antdLib.Anon_Vertical = js.native
  var createFormField: js.Any = js.native
  var defaultProps: antdLib.Anon_OnSubmit = js.native
  var propTypes: antdLib.Anon_ChildrenPrefixCls = js.native
  def create[TOwnProps](): antdLib.libFormFormMod.ComponentDecorator = js.native
  def create[TOwnProps](options: antdLib.libFormFormMod.FormCreateOption[TOwnProps]): antdLib.libFormFormMod.ComponentDecorator = js.native
}
