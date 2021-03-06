package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAccountsForParentResponse extends js.Object {
  /**
    * A list of the accounts in the specified root or OU.
    */
  var Accounts: js.UndefOr[Accounts] = js.undefined
  /**
    * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListAccountsForParentResponse {
  @scala.inline
  def apply(Accounts: Accounts = null, NextToken: NextToken = null): ListAccountsForParentResponse = {
    val __obj = js.Dynamic.literal()
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAccountsForParentResponse]
  }
}

