package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePublicDnsNamespaceResponse extends js.Object {
  /**
    * A value that you can use to determine whether the request completed successfully. To get the status of the operation, see GetOperation.
    */
  var OperationId: js.UndefOr[OperationId] = js.undefined
}

object CreatePublicDnsNamespaceResponse {
  @scala.inline
  def apply(OperationId: OperationId = null): CreatePublicDnsNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId)
    __obj.asInstanceOf[CreatePublicDnsNamespaceResponse]
  }
}

