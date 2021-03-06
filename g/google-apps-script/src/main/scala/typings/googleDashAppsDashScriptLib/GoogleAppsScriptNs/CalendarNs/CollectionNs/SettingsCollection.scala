package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsCollection extends js.Object {
  // Returns a single user setting.
  def get(setting: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Setting = js.native
  // Returns a single user setting.
  def get(setting: java.lang.String, optionalArgs: js.Object, headers: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Setting = js.native
  // Returns all user settings for the authenticated user.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Settings = js.native
  // Returns all user settings for the authenticated user.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Settings = js.native
  // Returns all user settings for the authenticated user.
  def list(optionalArgs: js.Object, headers: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Settings = js.native
  // Watch for changes to Settings resources.
  def watch(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel = js.native
  // Watch for changes to Settings resources.
  def watch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel = js.native
  // Watch for changes to Settings resources.
  def watch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel = js.native
}

