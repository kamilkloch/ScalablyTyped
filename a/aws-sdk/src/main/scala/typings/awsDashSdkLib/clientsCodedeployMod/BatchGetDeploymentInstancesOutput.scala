package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetDeploymentInstancesOutput extends js.Object {
  /**
    * Information about errors that might have occurred during the API call.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
  /**
    * Information about the instance.
    */
  var instancesSummary: js.UndefOr[InstanceSummaryList] = js.undefined
}

object BatchGetDeploymentInstancesOutput {
  @scala.inline
  def apply(errorMessage: ErrorMessage = null, instancesSummary: InstanceSummaryList = null): BatchGetDeploymentInstancesOutput = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (instancesSummary != null) __obj.updateDynamic("instancesSummary")(instancesSummary)
    __obj.asInstanceOf[BatchGetDeploymentInstancesOutput]
  }
}

