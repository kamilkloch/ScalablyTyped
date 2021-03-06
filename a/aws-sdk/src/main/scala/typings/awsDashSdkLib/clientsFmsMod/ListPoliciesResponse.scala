package typings
package awsDashSdkLib.clientsFmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPoliciesResponse extends js.Object {
  /**
    * If you have more PolicySummary objects than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more PolicySummary objects, submit another ListPolicies request, and specify the NextToken value from the response in the NextToken value in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * An array of PolicySummary objects.
    */
  var PolicyList: js.UndefOr[PolicySummaryList] = js.undefined
}

object ListPoliciesResponse {
  @scala.inline
  def apply(NextToken: PaginationToken = null, PolicyList: PolicySummaryList = null): ListPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PolicyList != null) __obj.updateDynamic("PolicyList")(PolicyList)
    __obj.asInstanceOf[ListPoliciesResponse]
  }
}

