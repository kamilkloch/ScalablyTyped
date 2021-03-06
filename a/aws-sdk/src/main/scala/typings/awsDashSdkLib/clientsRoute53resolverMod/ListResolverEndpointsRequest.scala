package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResolverEndpointsRequest extends js.Object {
  /**
    * An optional specification to return a subset of resolver endpoints, such as all inbound resolver endpoints.  If you submit a second or subsequent ListResolverEndpoints request and specify the NextToken parameter, you must use the same values for Filters, if any, as in the previous request. 
    */
  var Filters: js.UndefOr[Filters] = js.undefined
  /**
    * The maximum number of resolver endpoints that you want to return in the response to a ListResolverEndpoints request. If you don't specify a value for MaxResults, Resolver returns up to 100 resolver endpoints. 
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * For the first ListResolverEndpoints request, omit this value. If you have more than MaxResults resolver endpoints, you can submit another ListResolverEndpoints request to get the next group of resolver endpoints. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListResolverEndpointsRequest {
  @scala.inline
  def apply(
    Filters: Filters = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListResolverEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListResolverEndpointsRequest]
  }
}

