package typings
package apnLib.apnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apn", "Notification")
@js.native
class Notification () extends js.Object {
  /**
     * You can optionally pass in an object representing the payload, or configure properties on the returned object.
     */
  def this(payload: js.Any) = this()
  /**
     * The value to specify for `payload.aps.alert` can be either a `String` or an `Object` as outlined by the payload documentation.
     */
  var alert: java.lang.String | NotificationAlertOptions = js.native
  var aps: Aps = js.native
  /**
     * The value to specify for `payload.aps.badge`
     */
  var badge: scala.Double = js.native
  var collapseId: java.lang.String = js.native
  /**
     * Setting this to true will specify "content-available" in the payload when it is compiled.
     */
  var contentAvailable: scala.Boolean = js.native
  /**
     * The UNIX timestamp representing when the notification should expire. This does not contribute to the 2048 byte payload size limit. An expiry of 0 indicates that the notification expires immediately.
     */
  var expiry: scala.Double = js.native
  /**
     * A UUID to identify the notification with APNS. If an id is not supplied, APNS will generate one automatically. If an error occurs the response will contain the id. This property populates the apns-id header.
     */
  var id: java.lang.String = js.native
  /**
     * The value to specify for the `mdm` field where applicable.
     */
  var mdm: java.lang.String | js.Object = js.native
  /**
     *
     */
  var mutableContent: scala.Boolean = js.native
  /**
     * This Object is JSON encoded and sent as the notification payload. When properties have been set on notification.aps (either directly or with convenience setters) these are added to the payload just before it is sent. If payload already contains an aps property it is replaced.
     */
  var payload: js.Any = js.native
  /**
     * Provide one of the following values:
     *
     * - 10 - The push message is sent immediately. (Default)
     *   > The push notification must trigger an alert, sound, or badge on the device. It is an error use this priority for a push that contains only the content-available key.
     * - 5 - The push message is sent at a time that conserves power on the device receiving it.
     */
  var priority: scala.Double = js.native
  /**
     * If supplied this payload will be encoded and transmitted as-is. The convenience setters will have no effect on the JSON output.
     */
  var rawPayload: js.Any = js.native
  /**
     * The value to specify for `payload.aps.sound`
     */
  var sound: java.lang.String = js.native
  var threadId: java.lang.String = js.native
  /**
     * Required: The destination topic for the notification.
     */
  var topic: java.lang.String = js.native
  /**
     * The value to specify for `payload.aps['url-args']`. This used for Safari Push NOtifications and should be an array of values in accordance with the Web Payload Documentation.
     */
  var urlArgs: js.Array[java.lang.String] = js.native
}
