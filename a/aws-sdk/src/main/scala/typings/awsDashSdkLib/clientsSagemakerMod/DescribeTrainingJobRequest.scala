package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTrainingJobRequest extends js.Object {
  /**
    * The name of the training job.
    */
  var TrainingJobName: awsDashSdkLib.clientsSagemakerMod.TrainingJobName
}

object DescribeTrainingJobRequest {
  @scala.inline
  def apply(TrainingJobName: TrainingJobName): DescribeTrainingJobRequest = {
    val __obj = js.Dynamic.literal(TrainingJobName = TrainingJobName)
  
    __obj.asInstanceOf[DescribeTrainingJobRequest]
  }
}

