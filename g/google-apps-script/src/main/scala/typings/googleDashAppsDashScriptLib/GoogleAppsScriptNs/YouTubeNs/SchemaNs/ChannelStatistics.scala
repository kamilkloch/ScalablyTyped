package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelStatistics extends js.Object {
  var commentCount: js.UndefOr[java.lang.String] = js.undefined
  var hiddenSubscriberCount: js.UndefOr[scala.Boolean] = js.undefined
  var subscriberCount: js.UndefOr[java.lang.String] = js.undefined
  var videoCount: js.UndefOr[java.lang.String] = js.undefined
  var viewCount: js.UndefOr[java.lang.String] = js.undefined
}

object ChannelStatistics {
  @scala.inline
  def apply(
    commentCount: java.lang.String = null,
    hiddenSubscriberCount: js.UndefOr[scala.Boolean] = js.undefined,
    subscriberCount: java.lang.String = null,
    videoCount: java.lang.String = null,
    viewCount: java.lang.String = null
  ): ChannelStatistics = {
    val __obj = js.Dynamic.literal()
    if (commentCount != null) __obj.updateDynamic("commentCount")(commentCount)
    if (!js.isUndefined(hiddenSubscriberCount)) __obj.updateDynamic("hiddenSubscriberCount")(hiddenSubscriberCount)
    if (subscriberCount != null) __obj.updateDynamic("subscriberCount")(subscriberCount)
    if (videoCount != null) __obj.updateDynamic("videoCount")(videoCount)
    if (viewCount != null) __obj.updateDynamic("viewCount")(viewCount)
    __obj.asInstanceOf[ChannelStatistics]
  }
}

