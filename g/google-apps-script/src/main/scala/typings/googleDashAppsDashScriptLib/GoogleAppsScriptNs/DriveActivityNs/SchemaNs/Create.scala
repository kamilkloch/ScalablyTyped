package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveActivityNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Create extends js.Object {
  var copy: js.UndefOr[Copy] = js.undefined
  var `new`: js.UndefOr[js.Any] = js.undefined
  var upload: js.UndefOr[js.Any] = js.undefined
}

object Create {
  @scala.inline
  def apply(copy: Copy = null, `new`: js.Any = null, upload: js.Any = null): Create = {
    val __obj = js.Dynamic.literal()
    if (copy != null) __obj.updateDynamic("copy")(copy)
    if (`new` != null) __obj.updateDynamic("new")(`new`)
    if (upload != null) __obj.updateDynamic("upload")(upload)
    __obj.asInstanceOf[Create]
  }
}

