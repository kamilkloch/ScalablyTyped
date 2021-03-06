package typings
package awsDashSdkLib.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIdentityPoolUsageResponse extends js.Object {
  /**
    * Total number of identities for the identity pool.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  /**
    * Usage information for the identity pools.
    */
  var IdentityPoolUsages: js.UndefOr[IdentityPoolUsageList] = js.undefined
  /**
    * The maximum number of results to be returned.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListIdentityPoolUsageResponse {
  @scala.inline
  def apply(
    Count: js.UndefOr[Integer] = js.undefined,
    IdentityPoolUsages: IdentityPoolUsageList = null,
    MaxResults: js.UndefOr[Integer] = js.undefined,
    NextToken: String = null
  ): ListIdentityPoolUsageResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Count)) __obj.updateDynamic("Count")(Count)
    if (IdentityPoolUsages != null) __obj.updateDynamic("IdentityPoolUsages")(IdentityPoolUsages)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListIdentityPoolUsageResponse]
  }
}

