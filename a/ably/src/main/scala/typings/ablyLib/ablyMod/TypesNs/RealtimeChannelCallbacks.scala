package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimeChannelCallbacks extends RealtimeChannelBase {
  var presence: RealtimePresenceCallbacks = js.native
  def attach(): scala.Unit = js.native
  def attach(callback: standardCallback): scala.Unit = js.native
  def detach(): scala.Unit = js.native
  def detach(callback: standardCallback): scala.Unit = js.native
  def history(): scala.Unit = js.native
  def history(paramsOrCallback: RealtimeHistoryParams): scala.Unit = js.native
  def history(paramsOrCallback: RealtimeHistoryParams, callback: paginatedResultCallback[Message]): scala.Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[Message]): scala.Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[Message], callback: paginatedResultCallback[Message]): scala.Unit = js.native
  def publish(messagesOrName: js.Any): scala.Unit = js.native
  def publish(messagesOrName: js.Any, messageDataOrCallback: errorCallback): scala.Unit = js.native
  def publish(messagesOrName: js.Any, messageDataOrCallback: errorCallback, callback: errorCallback): scala.Unit = js.native
  def publish(messagesOrName: js.Any, messageDataOrCallback: js.Any): scala.Unit = js.native
  def publish(messagesOrName: js.Any, messageDataOrCallback: js.Any, callback: errorCallback): scala.Unit = js.native
  def subscribe(eventOrCallback: messageCallback[Message]): scala.Unit = js.native
  def subscribe(eventOrCallback: messageCallback[Message], listener: messageCallback[Message]): scala.Unit = js.native
  def subscribe(
    eventOrCallback: messageCallback[Message],
    listener: messageCallback[Message],
    callbackWhenAttached: standardCallback
  ): scala.Unit = js.native
  def subscribe(eventOrCallback: java.lang.String): scala.Unit = js.native
  def subscribe(eventOrCallback: java.lang.String, listener: messageCallback[Message]): scala.Unit = js.native
  def subscribe(
    eventOrCallback: java.lang.String,
    listener: messageCallback[Message],
    callbackWhenAttached: standardCallback
  ): scala.Unit = js.native
  def subscribe(eventOrCallback: js.Array[java.lang.String]): scala.Unit = js.native
  def subscribe(eventOrCallback: js.Array[java.lang.String], listener: messageCallback[Message]): scala.Unit = js.native
  def subscribe(
    eventOrCallback: js.Array[java.lang.String],
    listener: messageCallback[Message],
    callbackWhenAttached: standardCallback
  ): scala.Unit = js.native
  def whenState(targetState: ChannelState, callback: channelEventCallback): scala.Unit = js.native
}

