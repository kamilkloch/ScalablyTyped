package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatPollItem extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var itemId: js.UndefOr[java.lang.String] = js.undefined
}

object LiveChatPollItem {
  @scala.inline
  def apply(description: java.lang.String = null, itemId: java.lang.String = null): LiveChatPollItem = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    __obj.asInstanceOf[LiveChatPollItem]
  }
}

