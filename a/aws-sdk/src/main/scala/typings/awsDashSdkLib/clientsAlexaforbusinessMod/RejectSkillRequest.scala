package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RejectSkillRequest extends js.Object {
  /**
    * The unique identifier of the skill.
    */
  var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.SkillId
}

object RejectSkillRequest {
  @scala.inline
  def apply(SkillId: SkillId): RejectSkillRequest = {
    val __obj = js.Dynamic.literal(SkillId = SkillId)
  
    __obj.asInstanceOf[RejectSkillRequest]
  }
}

