package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuplicateFilterViewRequest extends js.Object {
  var filterId: js.UndefOr[scala.Double] = js.undefined
}

object DuplicateFilterViewRequest {
  @scala.inline
  def apply(filterId: scala.Int | scala.Double = null): DuplicateFilterViewRequest = {
    val __obj = js.Dynamic.literal()
    if (filterId != null) __obj.updateDynamic("filterId")(filterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DuplicateFilterViewRequest]
  }
}

