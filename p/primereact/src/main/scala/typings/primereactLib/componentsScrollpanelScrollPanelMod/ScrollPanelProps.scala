package typings
package primereactLib.componentsScrollpanelScrollPanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollPanelProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object ScrollPanelProps {
  @scala.inline
  def apply(className: java.lang.String = null, id: java.lang.String = null, style: js.Object = null): ScrollPanelProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ScrollPanelProps]
  }
}

