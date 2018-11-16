package typings
package chromeLib.chromeNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.storage")
@js.native
object storageNsMembers extends js.Object {
  var local: LocalStorageArea = js.native
  var managed: StorageArea = js.native
  var onChanged: StorageChangedEvent = js.native
  var sync: SyncStorageArea = js.native
}
