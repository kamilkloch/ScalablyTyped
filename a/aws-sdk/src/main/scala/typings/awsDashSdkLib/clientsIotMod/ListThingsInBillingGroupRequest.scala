package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThingsInBillingGroupRequest extends js.Object {
  /**
    * The name of the billing group.
    */
  var billingGroupName: BillingGroupName
  /**
    * The maximum number of results to return per request.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.undefined
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListThingsInBillingGroupRequest {
  @scala.inline
  def apply(
    billingGroupName: BillingGroupName,
    maxResults: js.UndefOr[RegistryMaxResults] = js.undefined,
    nextToken: NextToken = null
  ): ListThingsInBillingGroupRequest = {
    val __obj = js.Dynamic.literal(billingGroupName = billingGroupName)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListThingsInBillingGroupRequest]
  }
}

