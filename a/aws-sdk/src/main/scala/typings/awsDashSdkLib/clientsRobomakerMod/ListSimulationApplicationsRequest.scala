package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSimulationApplicationsRequest extends js.Object {
  /**
    * Optional list of filters to limit results. The filter name name is supported. When filtering, you must use the complete value of the filtered item. You can use up to three filters.
    */
  var filters: js.UndefOr[Filters] = js.undefined
  /**
    * The maximum number of deployment job results returned by ListSimulationApplications in paginated output. When this parameter is used, ListSimulationApplications only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListSimulationApplications request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListSimulationApplications returns up to 100 results and a nextToken value if applicable. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The nextToken value returned from a previous paginated ListSimulationApplications request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The version qualifier of the simulation application.
    */
  var versionQualifier: js.UndefOr[VersionQualifier] = js.undefined
}

object ListSimulationApplicationsRequest {
  @scala.inline
  def apply(
    filters: Filters = null,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: PaginationToken = null,
    versionQualifier: VersionQualifier = null
  ): ListSimulationApplicationsRequest = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (versionQualifier != null) __obj.updateDynamic("versionQualifier")(versionQualifier)
    __obj.asInstanceOf[ListSimulationApplicationsRequest]
  }
}

