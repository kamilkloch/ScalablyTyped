package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStream extends js.Object {
  var cdn: js.UndefOr[CdnSettings] = js.undefined
  var contentDetails: js.UndefOr[LiveStreamContentDetails] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var snippet: js.UndefOr[LiveStreamSnippet] = js.undefined
  var status: js.UndefOr[LiveStreamStatus] = js.undefined
}

object LiveStream {
  @scala.inline
  def apply(
    cdn: CdnSettings = null,
    contentDetails: LiveStreamContentDetails = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    snippet: LiveStreamSnippet = null,
    status: LiveStreamStatus = null
  ): LiveStream = {
    val __obj = js.Dynamic.literal()
    if (cdn != null) __obj.updateDynamic("cdn")(cdn)
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[LiveStream]
  }
}

