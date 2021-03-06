package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditMessageReplyMarkupOptions extends js.Object {
  var chat_id: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var inline_message_id: js.UndefOr[java.lang.String] = js.undefined
  var message_id: js.UndefOr[scala.Double] = js.undefined
}

object EditMessageReplyMarkupOptions {
  @scala.inline
  def apply(
    chat_id: scala.Double | java.lang.String = null,
    inline_message_id: java.lang.String = null,
    message_id: scala.Int | scala.Double = null
  ): EditMessageReplyMarkupOptions = {
    val __obj = js.Dynamic.literal()
    if (chat_id != null) __obj.updateDynamic("chat_id")(chat_id.asInstanceOf[js.Any])
    if (inline_message_id != null) __obj.updateDynamic("inline_message_id")(inline_message_id)
    if (message_id != null) __obj.updateDynamic("message_id")(message_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditMessageReplyMarkupOptions]
  }
}

