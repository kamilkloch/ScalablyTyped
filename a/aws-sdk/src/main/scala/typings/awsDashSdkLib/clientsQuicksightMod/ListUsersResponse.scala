package typings
package awsDashSdkLib.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUsersResponse extends js.Object {
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  /**
    * The http status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  /**
    * The list of users.
    */
  var UserList: js.UndefOr[UserList] = js.undefined
}

object ListUsersResponse {
  @scala.inline
  def apply(
    NextToken: String = null,
    RequestId: String = null,
    Status: js.UndefOr[StatusCode] = js.undefined,
    UserList: UserList = null
  ): ListUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (!js.isUndefined(Status)) __obj.updateDynamic("Status")(Status)
    if (UserList != null) __obj.updateDynamic("UserList")(UserList)
    __obj.asInstanceOf[ListUsersResponse]
  }
}

