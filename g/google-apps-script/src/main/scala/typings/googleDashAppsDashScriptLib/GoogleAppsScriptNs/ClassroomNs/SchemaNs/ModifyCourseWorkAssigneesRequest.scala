package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyCourseWorkAssigneesRequest extends js.Object {
  var assigneeMode: js.UndefOr[java.lang.String] = js.undefined
  var modifyIndividualStudentsOptions: js.UndefOr[ModifyIndividualStudentsOptions] = js.undefined
}

object ModifyCourseWorkAssigneesRequest {
  @scala.inline
  def apply(
    assigneeMode: java.lang.String = null,
    modifyIndividualStudentsOptions: ModifyIndividualStudentsOptions = null
  ): ModifyCourseWorkAssigneesRequest = {
    val __obj = js.Dynamic.literal()
    if (assigneeMode != null) __obj.updateDynamic("assigneeMode")(assigneeMode)
    if (modifyIndividualStudentsOptions != null) __obj.updateDynamic("modifyIndividualStudentsOptions")(modifyIndividualStudentsOptions)
    __obj.asInstanceOf[ModifyCourseWorkAssigneesRequest]
  }
}

