package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteHsmRequest extends js.Object {
  /**
    * The ARN of the HSM to delete.
    */
  var HsmArn: awsDashSdkLib.clientsCloudhsmMod.HsmArn
}

object DeleteHsmRequest {
  @scala.inline
  def apply(HsmArn: HsmArn): DeleteHsmRequest = {
    val __obj = js.Dynamic.literal(HsmArn = HsmArn)
  
    __obj.asInstanceOf[DeleteHsmRequest]
  }
}

