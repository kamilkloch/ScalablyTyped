package typings
package awsDashSdkLib.clientsMarketplaceentitlementserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEntitlementsRequest extends js.Object {
  /**
    * Filter is used to return entitlements for a specific customer or for a specific dimension. Filters are described as keys mapped to a lists of values. Filtered requests are unioned for each value in the value list, and then intersected for each filter key.
    */
  var Filter: js.UndefOr[GetEntitlementFilters] = js.undefined
  /**
    * The maximum number of items to retrieve from the GetEntitlements operation. For pagination, use the NextToken field in subsequent calls to GetEntitlements.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  /**
    * For paginated calls to GetEntitlements, pass the NextToken from the previous GetEntitlementsResult.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Product code is used to uniquely identify a product in AWS Marketplace. The product code will be provided by AWS Marketplace when the product listing is created.
    */
  var ProductCode: awsDashSdkLib.clientsMarketplaceentitlementserviceMod.ProductCode
}

object GetEntitlementsRequest {
  @scala.inline
  def apply(
    ProductCode: ProductCode,
    Filter: GetEntitlementFilters = null,
    MaxResults: js.UndefOr[Integer] = js.undefined,
    NextToken: NonEmptyString = null
  ): GetEntitlementsRequest = {
    val __obj = js.Dynamic.literal(ProductCode = ProductCode)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetEntitlementsRequest]
  }
}

