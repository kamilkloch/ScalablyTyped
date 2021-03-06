package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteJobExecutionRequest extends js.Object {
  /**
    * The ID of the job execution to be deleted. The executionNumber refers to the execution of a particular job on a particular device. Note that once a job execution is deleted, the executionNumber may be reused by IoT, so be sure you get and use the correct value here.
    */
  var executionNumber: ExecutionNumber
  /**
    * (Optional) When true, you can delete a job execution which is "IN_PROGRESS". Otherwise, you can only delete a job execution which is in a terminal state ("SUCCEEDED", "FAILED", "REJECTED", "REMOVED" or "CANCELED") or an exception will occur. The default is false.  Deleting a job execution which is "IN_PROGRESS", will cause the device to be unable to access job information or update the job execution status. Use caution and ensure that the device is able to recover to a valid state. 
    */
  var force: js.UndefOr[ForceFlag] = js.undefined
  /**
    * The ID of the job whose execution on a particular device will be deleted.
    */
  var jobId: JobId
  /**
    * The name of the thing whose job execution will be deleted.
    */
  var thingName: ThingName
}

object DeleteJobExecutionRequest {
  @scala.inline
  def apply(
    executionNumber: ExecutionNumber,
    jobId: JobId,
    thingName: ThingName,
    force: js.UndefOr[ForceFlag] = js.undefined
  ): DeleteJobExecutionRequest = {
    val __obj = js.Dynamic.literal(executionNumber = executionNumber, jobId = jobId, thingName = thingName)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[DeleteJobExecutionRequest]
  }
}

