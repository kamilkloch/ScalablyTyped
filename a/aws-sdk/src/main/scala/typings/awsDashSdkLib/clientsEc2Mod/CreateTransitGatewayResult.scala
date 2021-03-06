package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTransitGatewayResult extends js.Object {
  /**
    * Information about the transit gateway.
    */
  var TransitGateway: js.UndefOr[TransitGateway] = js.undefined
}

object CreateTransitGatewayResult {
  @scala.inline
  def apply(TransitGateway: TransitGateway = null): CreateTransitGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGateway != null) __obj.updateDynamic("TransitGateway")(TransitGateway)
    __obj.asInstanceOf[CreateTransitGatewayResult]
  }
}

