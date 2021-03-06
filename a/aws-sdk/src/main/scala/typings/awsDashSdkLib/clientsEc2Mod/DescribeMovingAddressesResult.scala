package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMovingAddressesResult extends js.Object {
  /**
    * The status for each Elastic IP address.
    */
  var MovingAddressStatuses: js.UndefOr[MovingAddressStatusSet] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeMovingAddressesResult {
  @scala.inline
  def apply(MovingAddressStatuses: MovingAddressStatusSet = null, NextToken: String = null): DescribeMovingAddressesResult = {
    val __obj = js.Dynamic.literal()
    if (MovingAddressStatuses != null) __obj.updateDynamic("MovingAddressStatuses")(MovingAddressStatuses)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeMovingAddressesResult]
  }
}

