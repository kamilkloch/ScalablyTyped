package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Datafeed extends js.Object {
  var attributeLanguage: js.UndefOr[java.lang.String] = js.undefined
  var contentLanguage: js.UndefOr[java.lang.String] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var fetchSchedule: js.UndefOr[DatafeedFetchSchedule] = js.undefined
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[DatafeedFormat] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var intendedDestinations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var targetCountry: js.UndefOr[java.lang.String] = js.undefined
  var targets: js.UndefOr[js.Array[DatafeedTarget]] = js.undefined
}

object Datafeed {
  @scala.inline
  def apply(
    attributeLanguage: java.lang.String = null,
    contentLanguage: java.lang.String = null,
    contentType: java.lang.String = null,
    fetchSchedule: DatafeedFetchSchedule = null,
    fileName: java.lang.String = null,
    format: DatafeedFormat = null,
    id: java.lang.String = null,
    intendedDestinations: js.Array[java.lang.String] = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    targetCountry: java.lang.String = null,
    targets: js.Array[DatafeedTarget] = null
  ): Datafeed = {
    val __obj = js.Dynamic.literal()
    if (attributeLanguage != null) __obj.updateDynamic("attributeLanguage")(attributeLanguage)
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (fetchSchedule != null) __obj.updateDynamic("fetchSchedule")(fetchSchedule)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (intendedDestinations != null) __obj.updateDynamic("intendedDestinations")(intendedDestinations)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (targetCountry != null) __obj.updateDynamic("targetCountry")(targetCountry)
    if (targets != null) __obj.updateDynamic("targets")(targets)
    __obj.asInstanceOf[Datafeed]
  }
}

