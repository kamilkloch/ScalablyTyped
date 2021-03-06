package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCreateAccountStatusResponse extends js.Object {
  /**
    * A structure that contains the current status of an account creation request.
    */
  var CreateAccountStatus: js.UndefOr[CreateAccountStatus] = js.undefined
}

object DescribeCreateAccountStatusResponse {
  @scala.inline
  def apply(CreateAccountStatus: CreateAccountStatus = null): DescribeCreateAccountStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (CreateAccountStatus != null) __obj.updateDynamic("CreateAccountStatus")(CreateAccountStatus)
    __obj.asInstanceOf[DescribeCreateAccountStatusResponse]
  }
}

