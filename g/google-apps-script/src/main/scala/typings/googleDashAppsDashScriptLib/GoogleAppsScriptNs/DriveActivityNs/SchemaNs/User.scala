package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var deletedUser: js.UndefOr[js.Any] = js.undefined
  var knownUser: js.UndefOr[KnownUser] = js.undefined
  var unknownUser: js.UndefOr[js.Any] = js.undefined
}

object User {
  @scala.inline
  def apply(deletedUser: js.Any = null, knownUser: KnownUser = null, unknownUser: js.Any = null): User = {
    val __obj = js.Dynamic.literal()
    if (deletedUser != null) __obj.updateDynamic("deletedUser")(deletedUser)
    if (knownUser != null) __obj.updateDynamic("knownUser")(knownUser)
    if (unknownUser != null) __obj.updateDynamic("unknownUser")(unknownUser)
    __obj.asInstanceOf[User]
  }
}

