package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivityGroupsListResponse extends js.Object {
  var floodlightActivityGroups: js.UndefOr[js.Array[FloodlightActivityGroup]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object FloodlightActivityGroupsListResponse {
  @scala.inline
  def apply(
    floodlightActivityGroups: js.Array[FloodlightActivityGroup] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): FloodlightActivityGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivityGroups != null) __obj.updateDynamic("floodlightActivityGroups")(floodlightActivityGroups)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[FloodlightActivityGroupsListResponse]
  }
}

