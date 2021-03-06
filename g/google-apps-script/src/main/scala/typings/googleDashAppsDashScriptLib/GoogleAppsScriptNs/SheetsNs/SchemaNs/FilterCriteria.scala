package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterCriteria extends js.Object {
  var condition: js.UndefOr[BooleanCondition] = js.undefined
  var hiddenValues: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object FilterCriteria {
  @scala.inline
  def apply(condition: BooleanCondition = null, hiddenValues: js.Array[java.lang.String] = null): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (hiddenValues != null) __obj.updateDynamic("hiddenValues")(hiddenValues)
    __obj.asInstanceOf[FilterCriteria]
  }
}

