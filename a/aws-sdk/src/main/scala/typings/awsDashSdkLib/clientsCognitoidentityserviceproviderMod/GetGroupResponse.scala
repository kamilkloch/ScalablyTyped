package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupResponse extends js.Object {
  /**
    * The group object for the group.
    */
  var Group: js.UndefOr[GroupType] = js.undefined
}

object GetGroupResponse {
  @scala.inline
  def apply(Group: GroupType = null): GetGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group)
    __obj.asInstanceOf[GetGroupResponse]
  }
}

