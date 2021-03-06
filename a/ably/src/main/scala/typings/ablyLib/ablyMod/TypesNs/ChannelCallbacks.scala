package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelCallbacks extends ChannelBase {
  var presence: PresenceCallbacks = js.native
  def history(): scala.Unit = js.native
  def history(paramsOrCallback: RestHistoryParams): scala.Unit = js.native
  def history(paramsOrCallback: RestHistoryParams, callback: paginatedResultCallback[Message]): scala.Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[Message]): scala.Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[Message], callback: paginatedResultCallback[Message]): scala.Unit = js.native
  def publish(messagesOrName: js.Any): scala.Unit = js.native
  def publish(messagesOrName: js.Any, messagedataOrCallback: errorCallback): scala.Unit = js.native
  def publish(messagesOrName: js.Any, messagedataOrCallback: errorCallback, callback: errorCallback): scala.Unit = js.native
  def publish(messagesOrName: js.Any, messagedataOrCallback: js.Any): scala.Unit = js.native
  def publish(messagesOrName: js.Any, messagedataOrCallback: js.Any, callback: errorCallback): scala.Unit = js.native
}

