package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDeliveryStreamOutput extends js.Object {
  /**
    * The ARN of the delivery stream.
    */
  var DeliveryStreamARN: js.UndefOr[DeliveryStreamARN] = js.undefined
}

object CreateDeliveryStreamOutput {
  @scala.inline
  def apply(DeliveryStreamARN: DeliveryStreamARN = null): CreateDeliveryStreamOutput = {
    val __obj = js.Dynamic.literal()
    if (DeliveryStreamARN != null) __obj.updateDynamic("DeliveryStreamARN")(DeliveryStreamARN)
    __obj.asInstanceOf[CreateDeliveryStreamOutput]
  }
}

