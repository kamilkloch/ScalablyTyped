package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestSpotFleetRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The configuration for the Spot Fleet request.
    */
  var SpotFleetRequestConfig: SpotFleetRequestConfigData
}

object RequestSpotFleetRequest {
  @scala.inline
  def apply(SpotFleetRequestConfig: SpotFleetRequestConfigData, DryRun: js.UndefOr[Boolean] = js.undefined): RequestSpotFleetRequest = {
    val __obj = js.Dynamic.literal(SpotFleetRequestConfig = SpotFleetRequestConfig)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[RequestSpotFleetRequest]
  }
}

