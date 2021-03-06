package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FusionTablesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointStyle extends js.Object {
  var iconName: js.UndefOr[java.lang.String] = js.undefined
  var iconStyler: js.UndefOr[StyleFunction] = js.undefined
}

object PointStyle {
  @scala.inline
  def apply(iconName: java.lang.String = null, iconStyler: StyleFunction = null): PointStyle = {
    val __obj = js.Dynamic.literal()
    if (iconName != null) __obj.updateDynamic("iconName")(iconName)
    if (iconStyler != null) __obj.updateDynamic("iconStyler")(iconStyler)
    __obj.asInstanceOf[PointStyle]
  }
}

