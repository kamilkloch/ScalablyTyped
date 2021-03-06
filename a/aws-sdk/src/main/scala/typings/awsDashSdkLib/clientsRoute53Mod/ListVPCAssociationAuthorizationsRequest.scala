package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVPCAssociationAuthorizationsRequest extends js.Object {
  /**
    * The ID of the hosted zone for which you want a list of VPCs that can be associated with the hosted zone.
    */
  var HostedZoneId: ResourceId
  /**
    *  Optional: An integer that specifies the maximum number of VPCs that you want Amazon Route 53 to return. If you don't specify a value for MaxResults, Route 53 returns up to 50 VPCs per page.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    *  Optional: If a response includes a NextToken element, there are more VPCs that can be associated with the specified hosted zone. To get the next page of results, submit another request, and include the value of NextToken from the response in the nexttoken parameter in another ListVPCAssociationAuthorizations request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListVPCAssociationAuthorizationsRequest {
  @scala.inline
  def apply(HostedZoneId: ResourceId, MaxResults: MaxResults = null, NextToken: PaginationToken = null): ListVPCAssociationAuthorizationsRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListVPCAssociationAuthorizationsRequest]
  }
}

