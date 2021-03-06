package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResellernotifyGetwatchdetailsResponse extends js.Object {
  var serviceAccountEmailAddresses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var topicName: js.UndefOr[java.lang.String] = js.undefined
}

object ResellernotifyGetwatchdetailsResponse {
  @scala.inline
  def apply(
    serviceAccountEmailAddresses: js.Array[java.lang.String] = null,
    topicName: java.lang.String = null
  ): ResellernotifyGetwatchdetailsResponse = {
    val __obj = js.Dynamic.literal()
    if (serviceAccountEmailAddresses != null) __obj.updateDynamic("serviceAccountEmailAddresses")(serviceAccountEmailAddresses)
    if (topicName != null) __obj.updateDynamic("topicName")(topicName)
    __obj.asInstanceOf[ResellernotifyGetwatchdetailsResponse]
  }
}

