package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEffectiveInstanceAssociationsRequest extends js.Object {
  /**
    * The instance ID for which you want to view all associations.
    */
  var InstanceId: awsDashSdkLib.clientsSsmMod.InstanceId
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[EffectiveInstanceAssociationMaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeEffectiveInstanceAssociationsRequest {
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    MaxResults: js.UndefOr[EffectiveInstanceAssociationMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeEffectiveInstanceAssociationsRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeEffectiveInstanceAssociationsRequest]
  }
}

