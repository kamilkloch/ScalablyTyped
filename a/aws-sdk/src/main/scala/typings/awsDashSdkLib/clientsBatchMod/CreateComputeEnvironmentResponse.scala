package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateComputeEnvironmentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the compute environment. 
    */
  var computeEnvironmentArn: js.UndefOr[String] = js.undefined
  /**
    * The name of the compute environment.
    */
  var computeEnvironmentName: js.UndefOr[String] = js.undefined
}

object CreateComputeEnvironmentResponse {
  @scala.inline
  def apply(computeEnvironmentArn: String = null, computeEnvironmentName: String = null): CreateComputeEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    if (computeEnvironmentArn != null) __obj.updateDynamic("computeEnvironmentArn")(computeEnvironmentArn)
    if (computeEnvironmentName != null) __obj.updateDynamic("computeEnvironmentName")(computeEnvironmentName)
    __obj.asInstanceOf[CreateComputeEnvironmentResponse]
  }
}

