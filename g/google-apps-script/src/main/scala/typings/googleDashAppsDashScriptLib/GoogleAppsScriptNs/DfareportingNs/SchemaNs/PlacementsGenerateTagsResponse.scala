package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementsGenerateTagsResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var placementTags: js.UndefOr[js.Array[PlacementTag]] = js.undefined
}

object PlacementsGenerateTagsResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, placementTags: js.Array[PlacementTag] = null): PlacementsGenerateTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (placementTags != null) __obj.updateDynamic("placementTags")(placementTags)
    __obj.asInstanceOf[PlacementsGenerateTagsResponse]
  }
}

