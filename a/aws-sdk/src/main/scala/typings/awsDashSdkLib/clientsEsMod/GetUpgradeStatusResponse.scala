package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUpgradeStatusResponse extends js.Object {
  /**
    *  One of 4 statuses that a step can go through returned as part of the  GetUpgradeStatusResponse  object. The status can take one of the following values:  In Progress Succeeded Succeeded with Issues Failed  
    */
  var StepStatus: js.UndefOr[UpgradeStatus] = js.undefined
  /**
    * A string that describes the update briefly
    */
  var UpgradeName: js.UndefOr[UpgradeName] = js.undefined
  /**
    *  Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:  PreUpgradeCheck Snapshot Upgrade  
    */
  var UpgradeStep: js.UndefOr[UpgradeStep] = js.undefined
}

object GetUpgradeStatusResponse {
  @scala.inline
  def apply(StepStatus: UpgradeStatus = null, UpgradeName: UpgradeName = null, UpgradeStep: UpgradeStep = null): GetUpgradeStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (StepStatus != null) __obj.updateDynamic("StepStatus")(StepStatus.asInstanceOf[js.Any])
    if (UpgradeName != null) __obj.updateDynamic("UpgradeName")(UpgradeName)
    if (UpgradeStep != null) __obj.updateDynamic("UpgradeStep")(UpgradeStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUpgradeStatusResponse]
  }
}

