package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceLimits extends js.Object {
  /**
    * The maximum number of training jobs that a hyperparameter tuning job can launch.
    */
  var MaxNumberOfTrainingJobs: awsDashSdkLib.clientsSagemakerMod.MaxNumberOfTrainingJobs
  /**
    * The maximum number of concurrent training jobs that a hyperparameter tuning job can launch.
    */
  var MaxParallelTrainingJobs: awsDashSdkLib.clientsSagemakerMod.MaxParallelTrainingJobs
}

object ResourceLimits {
  @scala.inline
  def apply(MaxNumberOfTrainingJobs: MaxNumberOfTrainingJobs, MaxParallelTrainingJobs: MaxParallelTrainingJobs): ResourceLimits = {
    val __obj = js.Dynamic.literal(MaxNumberOfTrainingJobs = MaxNumberOfTrainingJobs, MaxParallelTrainingJobs = MaxParallelTrainingJobs)
  
    __obj.asInstanceOf[ResourceLimits]
  }
}

