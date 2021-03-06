package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RobotApplicationConfig extends js.Object {
  /**
    * The application information for the robot application.
    */
  var application: Arn
  /**
    * The version of the robot application.
    */
  var applicationVersion: js.UndefOr[Version] = js.undefined
  /**
    * The launch configuration for the robot application.
    */
  var launchConfig: LaunchConfig
}

object RobotApplicationConfig {
  @scala.inline
  def apply(application: Arn, launchConfig: LaunchConfig, applicationVersion: Version = null): RobotApplicationConfig = {
    val __obj = js.Dynamic.literal(application = application, launchConfig = launchConfig)
    if (applicationVersion != null) __obj.updateDynamic("applicationVersion")(applicationVersion)
    __obj.asInstanceOf[RobotApplicationConfig]
  }
}

