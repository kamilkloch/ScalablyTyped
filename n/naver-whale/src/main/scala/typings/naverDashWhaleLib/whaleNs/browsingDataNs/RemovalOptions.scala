package typings
package naverDashWhaleLib.whaleNs.browsingDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemovalOptions extends js.Object {
  /**
    * Optional.
    * Since Chrome 21.
    * An object whose properties specify which origin types ought to be cleared. If this object isn't specified, it defaults to clearing only "unprotected" origins. Please ensure that you really want to remove application data before adding 'protectedWeb' or 'extensions'.
    */
  var originTypes: js.UndefOr[chromeLib.chromeNs.browsingDataNs.OriginTypes] = js.undefined
  /** Optional. Remove data accumulated on or after this date, represented in milliseconds since the epoch (accessible via the getTime method of the JavaScript Date object). If absent, defaults to 0 (which would remove all browsing data).  */
  var since: js.UndefOr[scala.Double] = js.undefined
}

object RemovalOptions {
  @scala.inline
  def apply(
    originTypes: chromeLib.chromeNs.browsingDataNs.OriginTypes = null,
    since: scala.Int | scala.Double = null
  ): RemovalOptions = {
    val __obj = js.Dynamic.literal()
    if (originTypes != null) __obj.updateDynamic("originTypes")(originTypes)
    if (since != null) __obj.updateDynamic("since")(since.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovalOptions]
  }
}

