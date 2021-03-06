package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityUserLinkPermissions extends js.Object {
  var effective: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var local: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object EntityUserLinkPermissions {
  @scala.inline
  def apply(effective: js.Array[java.lang.String] = null, local: js.Array[java.lang.String] = null): EntityUserLinkPermissions = {
    val __obj = js.Dynamic.literal()
    if (effective != null) __obj.updateDynamic("effective")(effective)
    if (local != null) __obj.updateDynamic("local")(local)
    __obj.asInstanceOf[EntityUserLinkPermissions]
  }
}

