package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLaunchTemplateRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the launch template. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.undefined
  /**
    * The name of the launch template. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateName: js.UndefOr[LaunchTemplateName] = js.undefined
}

object DeleteLaunchTemplateRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    LaunchTemplateId: String = null,
    LaunchTemplateName: LaunchTemplateName = null
  ): DeleteLaunchTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId)
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName)
    __obj.asInstanceOf[DeleteLaunchTemplateRequest]
  }
}

