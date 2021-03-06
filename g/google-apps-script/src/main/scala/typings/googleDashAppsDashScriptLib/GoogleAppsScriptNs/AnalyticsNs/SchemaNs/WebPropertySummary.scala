package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPropertySummary extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var level: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var profiles: js.UndefOr[js.Array[ProfileSummary]] = js.undefined
  var starred: js.UndefOr[scala.Boolean] = js.undefined
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
}

object WebPropertySummary {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    internalWebPropertyId: java.lang.String = null,
    kind: java.lang.String = null,
    level: java.lang.String = null,
    name: java.lang.String = null,
    profiles: js.Array[ProfileSummary] = null,
    starred: js.UndefOr[scala.Boolean] = js.undefined,
    websiteUrl: java.lang.String = null
  ): WebPropertySummary = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (level != null) __obj.updateDynamic("level")(level)
    if (name != null) __obj.updateDynamic("name")(name)
    if (profiles != null) __obj.updateDynamic("profiles")(profiles)
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred)
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl)
    __obj.asInstanceOf[WebPropertySummary]
  }
}

