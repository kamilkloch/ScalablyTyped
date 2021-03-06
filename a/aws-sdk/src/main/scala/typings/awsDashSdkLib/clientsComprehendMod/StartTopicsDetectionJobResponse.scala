package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartTopicsDetectionJobResponse extends js.Object {
  /**
    * The identifier generated for the job. To get the status of the job, use this identifier with the DescribeTopicDetectionJob operation.
    */
  var JobId: js.UndefOr[JobId] = js.undefined
  /**
    * The status of the job:    SUBMITTED - The job has been received and is queued for processing.   IN_PROGRESS - Amazon Comprehend is processing the job.   COMPLETED - The job was successfully completed and the output is available.   FAILED - The job did not complete. To get details, use the DescribeTopicDetectionJob operation.  
    */
  var JobStatus: js.UndefOr[JobStatus] = js.undefined
}

object StartTopicsDetectionJobResponse {
  @scala.inline
  def apply(JobId: JobId = null, JobStatus: JobStatus = null): StartTopicsDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTopicsDetectionJobResponse]
  }
}

