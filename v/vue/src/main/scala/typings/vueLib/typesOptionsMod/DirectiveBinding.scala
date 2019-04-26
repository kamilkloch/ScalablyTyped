package typings
package vueLib.typesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Readonly<vue.vue/types/vnode.VNodeDirective> */
trait DirectiveBinding extends js.Object {
  val arg: js.UndefOr[java.lang.String]
  val expression: js.UndefOr[_]
  val modifiers: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  val name: java.lang.String
  val oldArg: js.UndefOr[java.lang.String]
  val oldValue: js.UndefOr[_]
  val value: js.UndefOr[_]
}

object DirectiveBinding {
  @scala.inline
  def apply(
    modifiers: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    name: java.lang.String,
    arg: java.lang.String = null,
    expression: js.Any = null,
    oldArg: java.lang.String = null,
    oldValue: js.Any = null,
    value: js.Any = null
  ): DirectiveBinding = {
    val __obj = js.Dynamic.literal(modifiers = modifiers, name = name)
    if (arg != null) __obj.updateDynamic("arg")(arg)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (oldArg != null) __obj.updateDynamic("oldArg")(oldArg)
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DirectiveBinding]
  }
}

