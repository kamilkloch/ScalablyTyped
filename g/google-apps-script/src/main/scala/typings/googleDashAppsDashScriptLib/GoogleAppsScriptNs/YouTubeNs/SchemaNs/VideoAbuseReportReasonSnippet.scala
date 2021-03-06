package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoAbuseReportReasonSnippet extends js.Object {
  var label: js.UndefOr[java.lang.String] = js.undefined
  var secondaryReasons: js.UndefOr[js.Array[VideoAbuseReportSecondaryReason]] = js.undefined
}

object VideoAbuseReportReasonSnippet {
  @scala.inline
  def apply(label: java.lang.String = null, secondaryReasons: js.Array[VideoAbuseReportSecondaryReason] = null): VideoAbuseReportReasonSnippet = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (secondaryReasons != null) __obj.updateDynamic("secondaryReasons")(secondaryReasons)
    __obj.asInstanceOf[VideoAbuseReportReasonSnippet]
  }
}

