package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageReportsWarnings extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Array[UsageReportsWarningsData]] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object UsageReportsWarnings {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    data: js.Array[UsageReportsWarningsData] = null,
    message: java.lang.String = null
  ): UsageReportsWarnings = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (data != null) __obj.updateDynamic("data")(data)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[UsageReportsWarnings]
  }
}

