package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  /**
    * The date and time that the request was submitted, in Unix date/time format and Coordinated Universal Time (UTC). The value of CreateDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreateDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The code associated with ErrorMessage. Values for ErrorCode include the following:    ACCESS_DENIED     CANNOT_CREATE_HOSTED_ZONE     EXPIRED_TOKEN     HOSTED_ZONE_NOT_FOUND     INTERNAL_FAILURE     INVALID_CHANGE_BATCH     THROTTLED_REQUEST   
    */
  var ErrorCode: js.UndefOr[Code] = js.undefined
  /**
    * If the value of Status is FAIL, the reason that the operation failed.
    */
  var ErrorMessage: js.UndefOr[Message] = js.undefined
  /**
    * The ID of the operation that you want to get information about.
    */
  var Id: js.UndefOr[OperationId] = js.undefined
  /**
    * The status of the operation. Values include the following:    SUBMITTED: This is the initial state immediately after you submit a request.    PENDING: AWS Cloud Map is performing the operation.    SUCCESS: The operation succeeded.    FAIL: The operation failed. For the failure reason, see ErrorMessage.  
    */
  var Status: js.UndefOr[OperationStatus] = js.undefined
  /**
    * The name of the target entity that is associated with the operation:    NAMESPACE: The namespace ID is returned in the ResourceId property.    SERVICE: The service ID is returned in the ResourceId property.    INSTANCE: The instance ID is returned in the ResourceId property.  
    */
  var Targets: js.UndefOr[OperationTargetsMap] = js.undefined
  /**
    * The name of the operation that is associated with the specified ID.
    */
  var Type: js.UndefOr[OperationType] = js.undefined
  /**
    * The date and time that the value of Status changed to the current value, in Unix date/time format and Coordinated Universal Time (UTC). The value of UpdateDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var UpdateDate: js.UndefOr[Timestamp] = js.undefined
}

object Operation {
  @scala.inline
  def apply(
    CreateDate: Timestamp = null,
    ErrorCode: Code = null,
    ErrorMessage: Message = null,
    Id: OperationId = null,
    Status: OperationStatus = null,
    Targets: OperationTargetsMap = null,
    Type: OperationType = null,
    UpdateDate: Timestamp = null
  ): Operation = {
    val __obj = js.Dynamic.literal()
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (UpdateDate != null) __obj.updateDynamic("UpdateDate")(UpdateDate)
    __obj.asInstanceOf[Operation]
  }
}

