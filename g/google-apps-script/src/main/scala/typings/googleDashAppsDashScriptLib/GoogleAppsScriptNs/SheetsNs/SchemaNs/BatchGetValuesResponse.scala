package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetValuesResponse extends js.Object {
  var spreadsheetId: js.UndefOr[java.lang.String] = js.undefined
  var valueRanges: js.UndefOr[js.Array[ValueRange]] = js.undefined
}

object BatchGetValuesResponse {
  @scala.inline
  def apply(spreadsheetId: java.lang.String = null, valueRanges: js.Array[ValueRange] = null): BatchGetValuesResponse = {
    val __obj = js.Dynamic.literal()
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    if (valueRanges != null) __obj.updateDynamic("valueRanges")(valueRanges)
    __obj.asInstanceOf[BatchGetValuesResponse]
  }
}

