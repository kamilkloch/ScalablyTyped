package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchProvisionedProductsInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
  /**
    * The access level to use to obtain results. The default is User.
    */
  var AccessLevelFilter: js.UndefOr[AccessLevelFilter] = js.undefined
  /**
    * The search filters. When the key is SearchQuery, the searchable fields are arn, createdTime, id, lastRecordId, idempotencyToken, name, physicalId, productId, provisioningArtifact, type, status, tags, userArn, and userArnSession. Example: "SearchQuery":["status:AVAILABLE"] 
    */
  var Filters: js.UndefOr[ProvisionedProductFilters] = js.undefined
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[SearchProvisionedProductsPageSize] = js.undefined
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * The sort field. If no value is specified, the results are not sorted. The valid values are arn, id, name, and lastRecordId.
    */
  var SortBy: js.UndefOr[SortField] = js.undefined
  /**
    * The sort order. If no value is specified, the results are not sorted.
    */
  var SortOrder: js.UndefOr[SortOrder] = js.undefined
}

object SearchProvisionedProductsInput {
  @scala.inline
  def apply(
    AcceptLanguage: AcceptLanguage = null,
    AccessLevelFilter: AccessLevelFilter = null,
    Filters: ProvisionedProductFilters = null,
    PageSize: js.UndefOr[SearchProvisionedProductsPageSize] = js.undefined,
    PageToken: PageToken = null,
    SortBy: SortField = null,
    SortOrder: SortOrder = null
  ): SearchProvisionedProductsInput = {
    val __obj = js.Dynamic.literal()
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (AccessLevelFilter != null) __obj.updateDynamic("AccessLevelFilter")(AccessLevelFilter)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken)
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy)
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProvisionedProductsInput]
  }
}

