package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoRecordingDetails extends js.Object {
  var location: js.UndefOr[GeoPoint] = js.undefined
  var locationDescription: js.UndefOr[java.lang.String] = js.undefined
  var recordingDate: js.UndefOr[java.lang.String] = js.undefined
}

object VideoRecordingDetails {
  @scala.inline
  def apply(
    location: GeoPoint = null,
    locationDescription: java.lang.String = null,
    recordingDate: java.lang.String = null
  ): VideoRecordingDetails = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location)
    if (locationDescription != null) __obj.updateDynamic("locationDescription")(locationDescription)
    if (recordingDate != null) __obj.updateDynamic("recordingDate")(recordingDate)
    __obj.asInstanceOf[VideoRecordingDetails]
  }
}

