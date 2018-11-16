package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectInfo extends js.Object {
  /**
           * Open a port to a specific frame identified by frameId instead of all frames in the tab.
           * @since Chrome 41.
           */
  var frameId: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Will be passed into onConnect for content scripts that are listening for the connection event. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}
