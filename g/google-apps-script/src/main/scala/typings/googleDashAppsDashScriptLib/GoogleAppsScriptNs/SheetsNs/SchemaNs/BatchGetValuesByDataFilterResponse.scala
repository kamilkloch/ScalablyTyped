package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetValuesByDataFilterResponse extends js.Object {
  var spreadsheetId: js.UndefOr[java.lang.String] = js.undefined
  var valueRanges: js.UndefOr[js.Array[MatchedValueRange]] = js.undefined
}

object BatchGetValuesByDataFilterResponse {
  @scala.inline
  def apply(spreadsheetId: java.lang.String = null, valueRanges: js.Array[MatchedValueRange] = null): BatchGetValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    if (valueRanges != null) __obj.updateDynamic("valueRanges")(valueRanges)
    __obj.asInstanceOf[BatchGetValuesByDataFilterResponse]
  }
}

