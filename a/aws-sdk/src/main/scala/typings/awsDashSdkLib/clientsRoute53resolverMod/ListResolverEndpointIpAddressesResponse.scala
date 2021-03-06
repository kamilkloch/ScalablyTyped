package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResolverEndpointIpAddressesResponse extends js.Object {
  /**
    * The IP addresses that DNS queries pass through on their way to your network (outbound endpoint) or on the way to Resolver (inbound endpoint).
    */
  var IpAddresses: js.UndefOr[IpAddressesResponse] = js.undefined
  /**
    * The value that you specified for MaxResults in the request.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * If the specified endpoint has more than MaxResults IP addresses, you can submit another ListResolverEndpointIpAddresses request to get the next group of IP addresses. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListResolverEndpointIpAddressesResponse {
  @scala.inline
  def apply(
    IpAddresses: IpAddressesResponse = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListResolverEndpointIpAddressesResponse = {
    val __obj = js.Dynamic.literal()
    if (IpAddresses != null) __obj.updateDynamic("IpAddresses")(IpAddresses)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListResolverEndpointIpAddressesResponse]
  }
}

