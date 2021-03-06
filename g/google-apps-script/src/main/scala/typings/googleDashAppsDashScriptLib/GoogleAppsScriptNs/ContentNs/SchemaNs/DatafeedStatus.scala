package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedStatus extends js.Object {
  var country: js.UndefOr[java.lang.String] = js.undefined
  var datafeedId: js.UndefOr[java.lang.String] = js.undefined
  var errors: js.UndefOr[js.Array[DatafeedStatusError]] = js.undefined
  var itemsTotal: js.UndefOr[java.lang.String] = js.undefined
  var itemsValid: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var lastUploadDate: js.UndefOr[java.lang.String] = js.undefined
  var processingStatus: js.UndefOr[java.lang.String] = js.undefined
  var warnings: js.UndefOr[js.Array[DatafeedStatusError]] = js.undefined
}

object DatafeedStatus {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    datafeedId: java.lang.String = null,
    errors: js.Array[DatafeedStatusError] = null,
    itemsTotal: java.lang.String = null,
    itemsValid: java.lang.String = null,
    kind: java.lang.String = null,
    language: java.lang.String = null,
    lastUploadDate: java.lang.String = null,
    processingStatus: java.lang.String = null,
    warnings: js.Array[DatafeedStatusError] = null
  ): DatafeedStatus = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (datafeedId != null) __obj.updateDynamic("datafeedId")(datafeedId)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (itemsTotal != null) __obj.updateDynamic("itemsTotal")(itemsTotal)
    if (itemsValid != null) __obj.updateDynamic("itemsValid")(itemsValid)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (language != null) __obj.updateDynamic("language")(language)
    if (lastUploadDate != null) __obj.updateDynamic("lastUploadDate")(lastUploadDate)
    if (processingStatus != null) __obj.updateDynamic("processingStatus")(processingStatus)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[DatafeedStatus]
  }
}

