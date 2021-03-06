package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsCollection extends js.Object {
  // Gets a single location by ID.
  def get(id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Location
  // Retrieves a list of locations for the user.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.LocationsListResponse
}

object LocationsCollection {
  @scala.inline
  def apply(
    get: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.Location,
    list: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs.LocationsListResponse
  ): LocationsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list))
  
    __obj.asInstanceOf[LocationsCollection]
  }
}

