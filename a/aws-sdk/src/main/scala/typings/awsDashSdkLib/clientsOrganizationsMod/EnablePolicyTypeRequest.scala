package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnablePolicyTypeRequest extends js.Object {
  /**
    * The policy type that you want to enable.
    */
  var PolicyType: awsDashSdkLib.clientsOrganizationsMod.PolicyType
  /**
    * The unique identifier (ID) of the root in which you want to enable a policy type. You can get the ID from the ListRoots operation. The regex pattern for a root ID string requires "r-" followed by from 4 to 32 lower-case letters or digits.
    */
  var RootId: awsDashSdkLib.clientsOrganizationsMod.RootId
}

object EnablePolicyTypeRequest {
  @scala.inline
  def apply(PolicyType: PolicyType, RootId: RootId): EnablePolicyTypeRequest = {
    val __obj = js.Dynamic.literal(PolicyType = PolicyType.asInstanceOf[js.Any], RootId = RootId)
  
    __obj.asInstanceOf[EnablePolicyTypeRequest]
  }
}

