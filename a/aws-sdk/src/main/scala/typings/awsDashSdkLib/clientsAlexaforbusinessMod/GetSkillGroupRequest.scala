package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSkillGroupRequest extends js.Object {
  /**
    * The ARN of the skill group for which to get details. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.undefined
}

object GetSkillGroupRequest {
  @scala.inline
  def apply(SkillGroupArn: Arn = null): GetSkillGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (SkillGroupArn != null) __obj.updateDynamic("SkillGroupArn")(SkillGroupArn)
    __obj.asInstanceOf[GetSkillGroupRequest]
  }
}

