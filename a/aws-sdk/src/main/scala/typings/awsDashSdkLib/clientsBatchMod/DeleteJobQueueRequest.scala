package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteJobQueueRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the queue to delete. 
    */
  var jobQueue: String
}

object DeleteJobQueueRequest {
  @scala.inline
  def apply(jobQueue: String): DeleteJobQueueRequest = {
    val __obj = js.Dynamic.literal(jobQueue = jobQueue)
  
    __obj.asInstanceOf[DeleteJobQueueRequest]
  }
}

