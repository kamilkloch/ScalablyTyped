package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetGroupsConfig extends js.Object {
  /**
    * One or more target groups.
    */
  var TargetGroups: js.UndefOr[TargetGroups] = js.undefined
}

object TargetGroupsConfig {
  @scala.inline
  def apply(TargetGroups: TargetGroups = null): TargetGroupsConfig = {
    val __obj = js.Dynamic.literal()
    if (TargetGroups != null) __obj.updateDynamic("TargetGroups")(TargetGroups)
    __obj.asInstanceOf[TargetGroupsConfig]
  }
}

