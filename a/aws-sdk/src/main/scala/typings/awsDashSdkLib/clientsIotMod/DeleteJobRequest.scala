package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteJobRequest extends js.Object {
  /**
    * (Optional) When true, you can delete a job which is "IN_PROGRESS". Otherwise, you can only delete a job which is in a terminal state ("COMPLETED" or "CANCELED") or an exception will occur. The default is false.  Deleting a job which is "IN_PROGRESS", will cause a device which is executing the job to be unable to access job information or update the job execution status. Use caution and ensure that each device executing a job which is deleted is able to recover to a valid state. 
    */
  var force: js.UndefOr[ForceFlag] = js.undefined
  /**
    * The ID of the job to be deleted. After a job deletion is completed, you may reuse this jobId when you create a new job. However, this is not recommended, and you must ensure that your devices are not using the jobId to refer to the deleted job.
    */
  var jobId: JobId
}

object DeleteJobRequest {
  @scala.inline
  def apply(jobId: JobId, force: js.UndefOr[ForceFlag] = js.undefined): DeleteJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[DeleteJobRequest]
  }
}

