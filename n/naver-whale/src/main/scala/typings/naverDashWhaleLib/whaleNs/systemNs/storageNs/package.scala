package typings
package naverDashWhaleLib.whaleNs.systemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storageNs {
  type SystemStorageAttachedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function1[/* info */ chromeLib.chromeNs.systemNs.storageNs.StorageUnitInfo, scala.Unit]
  ]
  type SystemStorageDetachedEvent = chromeLib.chromeNs.eventsNs.Event[js.Function1[/* id */ java.lang.String, scala.Unit]]
}
