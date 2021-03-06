package typings
package awsDashSdkLib.clientsIotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobExecutionState extends js.Object {
  /**
    * The status of the job execution. Can be one of: "QUEUED", "IN_PROGRESS", "FAILED", "SUCCESS", "CANCELED", "REJECTED", or "REMOVED".
    */
  var status: js.UndefOr[JobExecutionStatus] = js.undefined
  /**
    * A collection of name/value pairs that describe the status of the job execution.
    */
  var statusDetails: js.UndefOr[DetailsMap] = js.undefined
  /**
    * The version of the job execution. Job execution versions are incremented each time they are updated by a device.
    */
  var versionNumber: js.UndefOr[VersionNumber] = js.undefined
}

object JobExecutionState {
  @scala.inline
  def apply(
    status: JobExecutionStatus = null,
    statusDetails: DetailsMap = null,
    versionNumber: js.UndefOr[VersionNumber] = js.undefined
  ): JobExecutionState = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusDetails != null) __obj.updateDynamic("statusDetails")(statusDetails)
    if (!js.isUndefined(versionNumber)) __obj.updateDynamic("versionNumber")(versionNumber)
    __obj.asInstanceOf[JobExecutionState]
  }
}

