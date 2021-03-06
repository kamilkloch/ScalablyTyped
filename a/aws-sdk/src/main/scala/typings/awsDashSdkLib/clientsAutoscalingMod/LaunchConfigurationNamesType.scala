package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchConfigurationNamesType extends js.Object {
  /**
    * The launch configuration names. If you omit this parameter, all launch configurations are described.
    */
  var LaunchConfigurationNames: js.UndefOr[LaunchConfigurationNames] = js.undefined
  /**
    * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[MaxRecords] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}

object LaunchConfigurationNamesType {
  @scala.inline
  def apply(
    LaunchConfigurationNames: LaunchConfigurationNames = null,
    MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
    NextToken: XmlString = null
  ): LaunchConfigurationNamesType = {
    val __obj = js.Dynamic.literal()
    if (LaunchConfigurationNames != null) __obj.updateDynamic("LaunchConfigurationNames")(LaunchConfigurationNames)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[LaunchConfigurationNamesType]
  }
}

