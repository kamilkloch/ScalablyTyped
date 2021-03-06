package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatBanSnippet extends js.Object {
  var banDurationSeconds: js.UndefOr[java.lang.String] = js.undefined
  var bannedUserDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
  var liveChatId: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object LiveChatBanSnippet {
  @scala.inline
  def apply(
    banDurationSeconds: java.lang.String = null,
    bannedUserDetails: ChannelProfileDetails = null,
    liveChatId: java.lang.String = null,
    `type`: java.lang.String = null
  ): LiveChatBanSnippet = {
    val __obj = js.Dynamic.literal()
    if (banDurationSeconds != null) __obj.updateDynamic("banDurationSeconds")(banDurationSeconds)
    if (bannedUserDetails != null) __obj.updateDynamic("bannedUserDetails")(bannedUserDetails)
    if (liveChatId != null) __obj.updateDynamic("liveChatId")(liveChatId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LiveChatBanSnippet]
  }
}

