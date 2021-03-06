package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAddressesRequest extends js.Object {
  /**
    * The number of ADDRESS objects to return.
    */
  var MaxResults: js.UndefOr[ListLimit] = js.undefined
  /**
    * HTTP requests are stateless. To identify what object comes "next" in the list of ADDRESS objects, you have the option of specifying a value for NextToken as the starting point for your list of returned addresses.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeAddressesRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[ListLimit] = js.undefined, NextToken: String = null): DescribeAddressesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeAddressesRequest]
  }
}

