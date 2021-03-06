package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneBoundary extends js.Object {
  var condition: js.UndefOr[js.Array[Condition]] = js.undefined
  var customEvaluationTriggerId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ZoneBoundary {
  @scala.inline
  def apply(
    condition: js.Array[Condition] = null,
    customEvaluationTriggerId: js.Array[java.lang.String] = null
  ): ZoneBoundary = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (customEvaluationTriggerId != null) __obj.updateDynamic("customEvaluationTriggerId")(customEvaluationTriggerId)
    __obj.asInstanceOf[ZoneBoundary]
  }
}

