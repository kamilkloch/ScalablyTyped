package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIdentitiesResponse extends js.Object {
  /**
    * An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.
    */
  var UnprocessedIdentityIds: js.UndefOr[UnprocessedIdentityIdList] = js.undefined
}

object DeleteIdentitiesResponse {
  @scala.inline
  def apply(UnprocessedIdentityIds: UnprocessedIdentityIdList = null): DeleteIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (UnprocessedIdentityIds != null) __obj.updateDynamic("UnprocessedIdentityIds")(UnprocessedIdentityIds)
    __obj.asInstanceOf[DeleteIdentitiesResponse]
  }
}

