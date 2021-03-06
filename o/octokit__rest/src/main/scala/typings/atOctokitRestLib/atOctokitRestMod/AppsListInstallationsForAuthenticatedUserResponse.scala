package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsListInstallationsForAuthenticatedUserResponse extends js.Object {
  var installations: js.Array[AppsListInstallationsForAuthenticatedUserResponseInstallationsItem]
  var total_count: scala.Double
}

object AppsListInstallationsForAuthenticatedUserResponse {
  @scala.inline
  def apply(
    installations: js.Array[AppsListInstallationsForAuthenticatedUserResponseInstallationsItem],
    total_count: scala.Double
  ): AppsListInstallationsForAuthenticatedUserResponse = {
    val __obj = js.Dynamic.literal(installations = installations, total_count = total_count)
  
    __obj.asInstanceOf[AppsListInstallationsForAuthenticatedUserResponse]
  }
}

