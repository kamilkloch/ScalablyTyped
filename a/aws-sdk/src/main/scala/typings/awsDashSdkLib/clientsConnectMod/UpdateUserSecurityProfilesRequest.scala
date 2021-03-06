package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserSecurityProfilesRequest extends js.Object {
  /**
    * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
    */
  var InstanceId: awsDashSdkLib.clientsConnectMod.InstanceId
  /**
    * The identifiers for the security profiles to assign to the user.
    */
  var SecurityProfileIds: awsDashSdkLib.clientsConnectMod.SecurityProfileIds
  /**
    * The identifier of the user account to assign the security profiles.
    */
  var UserId: awsDashSdkLib.clientsConnectMod.UserId
}

object UpdateUserSecurityProfilesRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, SecurityProfileIds: SecurityProfileIds, UserId: UserId): UpdateUserSecurityProfilesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId, SecurityProfileIds = SecurityProfileIds, UserId = UserId)
  
    __obj.asInstanceOf[UpdateUserSecurityProfilesRequest]
  }
}

