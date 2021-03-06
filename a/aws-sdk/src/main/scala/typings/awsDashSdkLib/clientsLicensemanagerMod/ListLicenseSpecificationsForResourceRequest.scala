package typings
package awsDashSdkLib.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLicenseSpecificationsForResourceRequest extends js.Object {
  /**
    * Maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[BoxInteger] = js.undefined
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * ARN of an AMI or Amazon EC2 instance that has an associated license configuration.
    */
  var ResourceArn: String
}

object ListLicenseSpecificationsForResourceRequest {
  @scala.inline
  def apply(ResourceArn: String, MaxResults: js.UndefOr[BoxInteger] = js.undefined, NextToken: String = null): ListLicenseSpecificationsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListLicenseSpecificationsForResourceRequest]
  }
}

