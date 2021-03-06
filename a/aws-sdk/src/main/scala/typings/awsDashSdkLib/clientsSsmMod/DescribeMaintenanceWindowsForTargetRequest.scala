package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMaintenanceWindowsForTargetRequest extends js.Object {
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The type of resource you want to retrieve information about. For example, "INSTANCE".
    */
  var ResourceType: MaintenanceWindowResourceType
  /**
    * The instance ID or key/value pair to retrieve information about.
    */
  var Targets: awsDashSdkLib.clientsSsmMod.Targets
}

object DescribeMaintenanceWindowsForTargetRequest {
  @scala.inline
  def apply(
    ResourceType: MaintenanceWindowResourceType,
    Targets: Targets,
    MaxResults: js.UndefOr[MaintenanceWindowSearchMaxResults] = js.undefined,
    NextToken: NextToken = null
  ): DescribeMaintenanceWindowsForTargetRequest = {
    val __obj = js.Dynamic.literal(ResourceType = ResourceType.asInstanceOf[js.Any], Targets = Targets)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeMaintenanceWindowsForTargetRequest]
  }
}

