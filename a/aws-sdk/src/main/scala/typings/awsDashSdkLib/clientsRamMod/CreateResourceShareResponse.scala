package typings
package awsDashSdkLib.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResourceShareResponse extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the resource share.
    */
  var resourceShare: js.UndefOr[ResourceShare] = js.undefined
}

object CreateResourceShareResponse {
  @scala.inline
  def apply(clientToken: String = null, resourceShare: ResourceShare = null): CreateResourceShareResponse = {
    val __obj = js.Dynamic.literal()
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken)
    if (resourceShare != null) __obj.updateDynamic("resourceShare")(resourceShare)
    __obj.asInstanceOf[CreateResourceShareResponse]
  }
}

