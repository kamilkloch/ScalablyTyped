package typings
package semanticDashUiDashReactLib.distCommonjsElementsButtonButtonOrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictButtonOrProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Or buttons can have their text localized, or adjusted by using the text prop. */
  var text: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object StrictButtonOrProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    className: java.lang.String = null,
    text: scala.Double | java.lang.String = null
  ): StrictButtonOrProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (className != null) __obj.updateDynamic("className")(className)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictButtonOrProps]
  }
}

