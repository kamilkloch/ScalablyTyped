package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var items: js.UndefOr[js.Array[ReportingMetadataEntry]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(items: js.Array[ReportingMetadataEntry] = null, kind: java.lang.String = null): Metadata = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Metadata]
  }
}

