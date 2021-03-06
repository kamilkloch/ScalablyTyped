package typings
package ionicLib.libProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectDetailsResultBase extends js.Object {
  val errors: js.Array[ProjectDetailsError]
  val `type`: js.UndefOr[ionicLib.definitionsMod.ProjectType] = js.undefined
}

object ProjectDetailsResultBase {
  @scala.inline
  def apply(errors: js.Array[ProjectDetailsError], `type`: ionicLib.definitionsMod.ProjectType = null): ProjectDetailsResultBase = {
    val __obj = js.Dynamic.literal(errors = errors)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ProjectDetailsResultBase]
  }
}

