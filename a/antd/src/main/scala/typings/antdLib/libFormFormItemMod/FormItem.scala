package typings
package antdLib.libFormFormItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormItem
  extends reactLib.reactMod.Component[FormItemProps, js.Any, js.Any] {
  @JSName("context")
  var context_FormItem: FormItemContext = js.native
  var helpShow: scala.Boolean = js.native
  @JSName("componentDidMount")
  def componentDidMount_MFormItem(): scala.Unit = js.native
  def getChildProp(prop: java.lang.String): js.Any = js.native
  def getControls(children: reactLib.reactMod.ReactNs.ReactNode, recursively: scala.Boolean): js.Array[reactLib.reactMod.ReactNs.ReactElement[_]] = js.native
  def getField(): js.Any = js.native
  def getHelpMessage(): js.Any = js.native
  def getId(): js.Any = js.native
  def getMeta(): js.Any = js.native
  def getOnlyControl(): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def getValidateStatus(): antdLib.antdLibStrings.error | antdLib.antdLibStrings.Empty | antdLib.antdLibStrings.success | antdLib.antdLibStrings.validating = js.native
  def isRequired(): js.Any = js.native
  def onHelpAnimEnd(_key: java.lang.String, helpShow: scala.Boolean): scala.Unit = js.native
  def onLabelClick(e: js.Any): scala.Unit = js.native
  def renderChildren(): js.Array[reactLib.reactMod.Global.JSXNs.Element | scala.Null] = js.native
  def renderExtra(): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def renderFormItem(children: reactLib.reactMod.ReactNs.ReactNode): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderHelp(): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderLabel(): reactLib.reactMod.Global.JSXNs.Element | scala.Null = js.native
  def renderValidateWrapper(
    c1: reactLib.reactMod.ReactNs.ReactNode,
    c2: reactLib.reactMod.ReactNs.ReactNode,
    c3: reactLib.reactMod.ReactNs.ReactNode
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderWrapper(children: reactLib.reactMod.ReactNs.ReactNode): reactLib.reactMod.Global.JSXNs.Element = js.native
}
