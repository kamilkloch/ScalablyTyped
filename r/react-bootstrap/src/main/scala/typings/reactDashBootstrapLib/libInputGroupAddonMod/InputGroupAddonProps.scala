package typings
package reactDashBootstrapLib.libInputGroupAddonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputGroupAddonProps
  extends reactLib.reactMod.HTMLProps[InputGroupAddon] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
}

object InputGroupAddonProps {
  @scala.inline
  def apply(HTMLProps: reactLib.reactMod.HTMLProps[InputGroupAddon] = null, bsClass: java.lang.String = null): InputGroupAddonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[InputGroupAddonProps]
  }
}

