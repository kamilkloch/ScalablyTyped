package typings
package naverDashWhaleLib.whaleNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebRequestBodyEvent
  extends chromeLib.chromeNs.eventsNs.Event[
      js.Function1[/* details */ chromeLib.chromeNs.webRequestNs.WebRequestBodyDetails, scala.Unit]
    ] {
  def addListener(
    callback: js.Function1[/* details */ chromeLib.chromeNs.webRequestNs.WebRequestBodyDetails, scala.Unit],
    filter: chromeLib.chromeNs.webRequestNs.RequestFilter
  ): scala.Unit = js.native
  def addListener(
    callback: js.Function1[/* details */ chromeLib.chromeNs.webRequestNs.WebRequestBodyDetails, scala.Unit],
    filter: chromeLib.chromeNs.webRequestNs.RequestFilter,
    opt_extraInfoSpec: js.Array[java.lang.String]
  ): scala.Unit = js.native
}

