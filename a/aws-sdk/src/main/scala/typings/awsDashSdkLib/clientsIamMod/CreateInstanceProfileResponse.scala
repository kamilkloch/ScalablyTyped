package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInstanceProfileResponse extends js.Object {
  /**
    * A structure containing details about the new instance profile.
    */
  var InstanceProfile: awsDashSdkLib.clientsIamMod.InstanceProfile
}

object CreateInstanceProfileResponse {
  @scala.inline
  def apply(InstanceProfile: InstanceProfile): CreateInstanceProfileResponse = {
    val __obj = js.Dynamic.literal(InstanceProfile = InstanceProfile)
  
    __obj.asInstanceOf[CreateInstanceProfileResponse]
  }
}

