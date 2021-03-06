package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderreportsListDisbursementsResponse extends js.Object {
  var disbursements: js.UndefOr[js.Array[OrderReportDisbursement]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object OrderreportsListDisbursementsResponse {
  @scala.inline
  def apply(
    disbursements: js.Array[OrderReportDisbursement] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): OrderreportsListDisbursementsResponse = {
    val __obj = js.Dynamic.literal()
    if (disbursements != null) __obj.updateDynamic("disbursements")(disbursements)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[OrderreportsListDisbursementsResponse]
  }
}

