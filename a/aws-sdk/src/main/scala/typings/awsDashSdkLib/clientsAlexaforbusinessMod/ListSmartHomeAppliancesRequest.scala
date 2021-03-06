package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSmartHomeAppliancesRequest extends js.Object {
  /**
    * The maximum number of appliances to be returned, per paginated calls.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The room that the appliances are associated with.
    */
  var RoomArn: Arn
}

object ListSmartHomeAppliancesRequest {
  @scala.inline
  def apply(RoomArn: Arn, MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: NextToken = null): ListSmartHomeAppliancesRequest = {
    val __obj = js.Dynamic.literal(RoomArn = RoomArn)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListSmartHomeAppliancesRequest]
  }
}

