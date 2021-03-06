package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backend extends js.Object {
  /**
    * Specifies a virtual service to use as a backend for a virtual node. 
    */
  var virtualService: js.UndefOr[VirtualServiceBackend] = js.undefined
}

object Backend {
  @scala.inline
  def apply(virtualService: VirtualServiceBackend = null): Backend = {
    val __obj = js.Dynamic.literal()
    if (virtualService != null) __obj.updateDynamic("virtualService")(virtualService)
    __obj.asInstanceOf[Backend]
  }
}

