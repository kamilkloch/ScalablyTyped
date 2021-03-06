package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIdentitiesRequest extends js.Object {
  /**
    * The type of the identities to list. Possible values are "EmailAddress" and "Domain". If this parameter is omitted, then all identities will be listed.
    */
  var IdentityType: js.UndefOr[IdentityType] = js.undefined
  /**
    * The maximum number of identities per page. Possible values are 1-1000 inclusive.
    */
  var MaxItems: js.UndefOr[MaxItems] = js.undefined
  /**
    * The token to use for pagination.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListIdentitiesRequest {
  @scala.inline
  def apply(
    IdentityType: IdentityType = null,
    MaxItems: js.UndefOr[MaxItems] = js.undefined,
    NextToken: NextToken = null
  ): ListIdentitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (IdentityType != null) __obj.updateDynamic("IdentityType")(IdentityType.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListIdentitiesRequest]
  }
}

