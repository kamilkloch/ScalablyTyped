package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentPropertyDescriptions extends js.Object {
  /**
    * Describes the execution property groups.
    */
  var PropertyGroupDescriptions: js.UndefOr[PropertyGroups] = js.undefined
}

object EnvironmentPropertyDescriptions {
  @scala.inline
  def apply(PropertyGroupDescriptions: PropertyGroups = null): EnvironmentPropertyDescriptions = {
    val __obj = js.Dynamic.literal()
    if (PropertyGroupDescriptions != null) __obj.updateDynamic("PropertyGroupDescriptions")(PropertyGroupDescriptions)
    __obj.asInstanceOf[EnvironmentPropertyDescriptions]
  }
}

