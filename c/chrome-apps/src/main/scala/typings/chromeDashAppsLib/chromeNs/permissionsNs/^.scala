package typings
package chromeDashAppsLib.chromeNs.permissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.permissions")
@js.native
object ^ extends js.Object {
  /** Fired when the app acquires new permissions. */
  val onAdded: PermissionEvent = js.native
  /** Fired when access to permissions has been removed from the app. */
  val onRemoved: PermissionEvent = js.native
  /**
    * Checks if the app has the specified permissions.
    * @param callback Parameter *result*: True if the app has the specified permissions.
    */
  def contains(permissions: Permissions, callback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
    * Gets the app's current set of permissions.
    * @param callback Parameter *permissions*: The app's active permissions.
    */
  def getAll(callback: js.Function1[/* permissions */ Permissions, scala.Unit]): scala.Unit = js.native
  /**
    * Removes access to the specified permissions. If there are any problems removing the permissions, runtime.lastError will be set.
    * @param [callback] Parameter *removed*: True if the permissions were removed.
    */
  def remove(permissions: Permissions): scala.Unit = js.native
  def remove(permissions: Permissions, callback: js.Function1[/* removed */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
    * Requests access to the specified permissions.
    * These permissions must be defined in the optional_permissions field of the manifest.
    * If there are any problems requesting the permissions, runtime.lastError will be set.
    * @param [callback] Parameter *granted*: True if the user granted the specified permissions.
    */
  def request(permissions: Permissions): scala.Unit = js.native
  def request(permissions: Permissions, callback: js.Function1[/* granted */ scala.Boolean, scala.Unit]): scala.Unit = js.native
}

