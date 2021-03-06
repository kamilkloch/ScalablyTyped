package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServiceSpecificCredentialsRequest extends js.Object {
  /**
    * Filters the returned results to only those for the specified AWS service. If not specified, then AWS returns service-specific credentials for all services.
    */
  var ServiceName: js.UndefOr[serviceName] = js.undefined
  /**
    * The name of the user whose service-specific credentials you want information about. If this value is not specified, then the operation assumes the user whose credentials are used to call the operation. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: js.UndefOr[userNameType] = js.undefined
}

object ListServiceSpecificCredentialsRequest {
  @scala.inline
  def apply(ServiceName: serviceName = null, UserName: userNameType = null): ListServiceSpecificCredentialsRequest = {
    val __obj = js.Dynamic.literal()
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[ListServiceSpecificCredentialsRequest]
  }
}

