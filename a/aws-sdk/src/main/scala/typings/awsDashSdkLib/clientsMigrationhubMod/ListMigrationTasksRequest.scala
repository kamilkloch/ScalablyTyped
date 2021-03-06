package typings
package awsDashSdkLib.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMigrationTasksRequest extends js.Object {
  /**
    * Value to specify how many results are returned per page.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * Filter migration tasks by discovered resource name.
    */
  var ResourceName: js.UndefOr[ResourceName] = js.undefined
}

object ListMigrationTasksRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: Token = null,
    ResourceName: ResourceName = null
  ): ListMigrationTasksRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ResourceName != null) __obj.updateDynamic("ResourceName")(ResourceName)
    __obj.asInstanceOf[ListMigrationTasksRequest]
  }
}

