package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSpotDatafeedSubscriptionRequest extends js.Object {
  /**
    * The Amazon S3 bucket in which to store the Spot Instance data feed.
    */
  var Bucket: String
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * A prefix for the data feed file names.
    */
  var Prefix: js.UndefOr[String] = js.undefined
}

object CreateSpotDatafeedSubscriptionRequest {
  @scala.inline
  def apply(Bucket: String, DryRun: js.UndefOr[Boolean] = js.undefined, Prefix: String = null): CreateSpotDatafeedSubscriptionRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    __obj.asInstanceOf[CreateSpotDatafeedSubscriptionRequest]
  }
}

