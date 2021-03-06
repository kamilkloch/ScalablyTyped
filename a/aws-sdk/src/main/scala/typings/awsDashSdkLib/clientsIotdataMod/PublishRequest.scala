package typings
package awsDashSdkLib.clientsIotdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishRequest extends js.Object {
  /**
    * The state information, in JSON format.
    */
  var payload: js.UndefOr[Payload] = js.undefined
  /**
    * The Quality of Service (QoS) level.
    */
  var qos: js.UndefOr[Qos] = js.undefined
  /**
    * The name of the MQTT topic.
    */
  var topic: Topic
}

object PublishRequest {
  @scala.inline
  def apply(topic: Topic, payload: Payload = null, qos: js.UndefOr[Qos] = js.undefined): PublishRequest = {
    val __obj = js.Dynamic.literal(topic = topic)
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(qos)) __obj.updateDynamic("qos")(qos)
    __obj.asInstanceOf[PublishRequest]
  }
}

