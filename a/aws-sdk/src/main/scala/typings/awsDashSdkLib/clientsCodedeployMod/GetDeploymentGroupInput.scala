package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeploymentGroupInput extends js.Object {
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
    */
  var applicationName: ApplicationName
  /**
    * The name of a deployment group for the specified application.
    */
  var deploymentGroupName: DeploymentGroupName
}

object GetDeploymentGroupInput {
  @scala.inline
  def apply(applicationName: ApplicationName, deploymentGroupName: DeploymentGroupName): GetDeploymentGroupInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName, deploymentGroupName = deploymentGroupName)
  
    __obj.asInstanceOf[GetDeploymentGroupInput]
  }
}

