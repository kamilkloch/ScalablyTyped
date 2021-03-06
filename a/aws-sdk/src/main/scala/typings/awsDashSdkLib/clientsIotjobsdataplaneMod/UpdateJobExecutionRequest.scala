package typings
package awsDashSdkLib.clientsIotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateJobExecutionRequest extends js.Object {
  /**
    * Optional. A number that identifies a particular job execution on a particular device.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
  /**
    * Optional. The expected current version of the job execution. Each time you update the job execution, its version is incremented. If the version of the job execution stored in Jobs does not match, the update is rejected with a VersionMismatch error, and an ErrorResponse that contains the current job execution status data is returned. (This makes it unnecessary to perform a separate DescribeJobExecution request in order to obtain the job execution status data.)
    */
  var expectedVersion: js.UndefOr[ExpectedVersion] = js.undefined
  /**
    * Optional. When set to true, the response contains the job document. The default is false.
    */
  var includeJobDocument: js.UndefOr[IncludeJobDocument] = js.undefined
  /**
    * Optional. When included and set to true, the response contains the JobExecutionState data. The default is false.
    */
  var includeJobExecutionState: js.UndefOr[IncludeExecutionState] = js.undefined
  /**
    * The unique identifier assigned to this job when it was created.
    */
  var jobId: JobId
  /**
    * The new status for the job execution (IN_PROGRESS, FAILED, SUCCESS, or REJECTED). This must be specified on every update.
    */
  var status: JobExecutionStatus
  /**
    *  Optional. A collection of name/value pairs that describe the status of the job execution. If not specified, the statusDetails are unchanged.
    */
  var statusDetails: js.UndefOr[DetailsMap] = js.undefined
  /**
    * Specifies the amount of time this device has to finish execution of this job. If the job execution status is not set to a terminal state before this timer expires, or before the timer is reset (by again calling UpdateJobExecution, setting the status to IN_PROGRESS and specifying a new timeout value in this field) the job execution status will be automatically set to TIMED_OUT. Note that setting or resetting this timeout has no effect on that job execution timeout which may have been specified when the job was created (CreateJob using field timeoutConfig).
    */
  var stepTimeoutInMinutes: js.UndefOr[StepTimeoutInMinutes] = js.undefined
  /**
    * The name of the thing associated with the device.
    */
  var thingName: ThingName
}

object UpdateJobExecutionRequest {
  @scala.inline
  def apply(
    jobId: JobId,
    status: JobExecutionStatus,
    thingName: ThingName,
    executionNumber: js.UndefOr[ExecutionNumber] = js.undefined,
    expectedVersion: js.UndefOr[ExpectedVersion] = js.undefined,
    includeJobDocument: js.UndefOr[IncludeJobDocument] = js.undefined,
    includeJobExecutionState: js.UndefOr[IncludeExecutionState] = js.undefined,
    statusDetails: DetailsMap = null,
    stepTimeoutInMinutes: js.UndefOr[StepTimeoutInMinutes] = js.undefined
  ): UpdateJobExecutionRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId, status = status.asInstanceOf[js.Any], thingName = thingName)
    if (!js.isUndefined(executionNumber)) __obj.updateDynamic("executionNumber")(executionNumber)
    if (!js.isUndefined(expectedVersion)) __obj.updateDynamic("expectedVersion")(expectedVersion)
    if (!js.isUndefined(includeJobDocument)) __obj.updateDynamic("includeJobDocument")(includeJobDocument)
    if (!js.isUndefined(includeJobExecutionState)) __obj.updateDynamic("includeJobExecutionState")(includeJobExecutionState)
    if (statusDetails != null) __obj.updateDynamic("statusDetails")(statusDetails)
    if (!js.isUndefined(stepTimeoutInMinutes)) __obj.updateDynamic("stepTimeoutInMinutes")(stepTimeoutInMinutes)
    __obj.asInstanceOf[UpdateJobExecutionRequest]
  }
}

