package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativesListResponse extends js.Object {
  var creatives: js.UndefOr[js.Array[Creative]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object CreativesListResponse {
  @scala.inline
  def apply(
    creatives: js.Array[Creative] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): CreativesListResponse = {
    val __obj = js.Dynamic.literal()
    if (creatives != null) __obj.updateDynamic("creatives")(creatives)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[CreativesListResponse]
  }
}

