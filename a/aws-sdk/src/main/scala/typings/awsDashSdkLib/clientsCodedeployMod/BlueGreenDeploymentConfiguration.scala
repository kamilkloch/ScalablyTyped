package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlueGreenDeploymentConfiguration extends js.Object {
  /**
    * Information about the action to take when newly provisioned instances are ready to receive traffic in a blue/green deployment.
    */
  var deploymentReadyOption: js.UndefOr[DeploymentReadyOption] = js.undefined
  /**
    * Information about how instances are provisioned for a replacement environment in a blue/green deployment.
    */
  var greenFleetProvisioningOption: js.UndefOr[GreenFleetProvisioningOption] = js.undefined
  /**
    * Information about whether to terminate instances in the original fleet during a blue/green deployment.
    */
  var terminateBlueInstancesOnDeploymentSuccess: js.UndefOr[BlueInstanceTerminationOption] = js.undefined
}

object BlueGreenDeploymentConfiguration {
  @scala.inline
  def apply(
    deploymentReadyOption: DeploymentReadyOption = null,
    greenFleetProvisioningOption: GreenFleetProvisioningOption = null,
    terminateBlueInstancesOnDeploymentSuccess: BlueInstanceTerminationOption = null
  ): BlueGreenDeploymentConfiguration = {
    val __obj = js.Dynamic.literal()
    if (deploymentReadyOption != null) __obj.updateDynamic("deploymentReadyOption")(deploymentReadyOption)
    if (greenFleetProvisioningOption != null) __obj.updateDynamic("greenFleetProvisioningOption")(greenFleetProvisioningOption)
    if (terminateBlueInstancesOnDeploymentSuccess != null) __obj.updateDynamic("terminateBlueInstancesOnDeploymentSuccess")(terminateBlueInstancesOnDeploymentSuccess)
    __obj.asInstanceOf[BlueGreenDeploymentConfiguration]
  }
}

