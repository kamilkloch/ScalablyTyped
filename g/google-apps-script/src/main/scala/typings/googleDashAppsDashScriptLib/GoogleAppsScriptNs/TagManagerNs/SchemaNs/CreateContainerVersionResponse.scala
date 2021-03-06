package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContainerVersionResponse extends js.Object {
  var compilerError: js.UndefOr[scala.Boolean] = js.undefined
  var containerVersion: js.UndefOr[ContainerVersion] = js.undefined
  var newWorkspacePath: js.UndefOr[java.lang.String] = js.undefined
  var syncStatus: js.UndefOr[SyncStatus] = js.undefined
}

object CreateContainerVersionResponse {
  @scala.inline
  def apply(
    compilerError: js.UndefOr[scala.Boolean] = js.undefined,
    containerVersion: ContainerVersion = null,
    newWorkspacePath: java.lang.String = null,
    syncStatus: SyncStatus = null
  ): CreateContainerVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compilerError)) __obj.updateDynamic("compilerError")(compilerError)
    if (containerVersion != null) __obj.updateDynamic("containerVersion")(containerVersion)
    if (newWorkspacePath != null) __obj.updateDynamic("newWorkspacePath")(newWorkspacePath)
    if (syncStatus != null) __obj.updateDynamic("syncStatus")(syncStatus)
    __obj.asInstanceOf[CreateContainerVersionResponse]
  }
}

