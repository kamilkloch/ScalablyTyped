package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PermissionRequestHandler extends js.Object {
  /** Allow the permission request. */
  def allow(): scala.Unit
  /** Deny the permission request. This is the default behavior if allow is not called. */
  def deny(): scala.Unit
}
