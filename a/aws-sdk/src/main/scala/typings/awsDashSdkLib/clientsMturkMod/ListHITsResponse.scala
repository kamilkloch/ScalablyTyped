package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHITsResponse extends js.Object {
  /**
    *  The list of HIT elements returned by the query.
    */
  var HITs: js.UndefOr[HITList] = js.undefined
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The number of HITs on this page in the filtered results list, equivalent to the number of HITs being returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.undefined
}

object ListHITsResponse {
  @scala.inline
  def apply(
    HITs: HITList = null,
    NextToken: PaginationToken = null,
    NumResults: js.UndefOr[Integer] = js.undefined
  ): ListHITsResponse = {
    val __obj = js.Dynamic.literal()
    if (HITs != null) __obj.updateDynamic("HITs")(HITs)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (!js.isUndefined(NumResults)) __obj.updateDynamic("NumResults")(NumResults)
    __obj.asInstanceOf[ListHITsResponse]
  }
}

