package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountYouTubeChannelLink extends js.Object {
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object AccountYouTubeChannelLink {
  @scala.inline
  def apply(channelId: java.lang.String = null, status: java.lang.String = null): AccountYouTubeChannelLink = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[AccountYouTubeChannelLink]
  }
}

