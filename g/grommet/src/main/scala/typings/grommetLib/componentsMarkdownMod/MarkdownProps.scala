package typings
package grommetLib.componentsMarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownProps extends js.Object {
  var components: js.UndefOr[js.Object] = js.undefined
}

object MarkdownProps {
  @scala.inline
  def apply(components: js.Object = null): MarkdownProps = {
    val __obj = js.Dynamic.literal()
    if (components != null) __obj.updateDynamic("components")(components)
    __obj.asInstanceOf[MarkdownProps]
  }
}

