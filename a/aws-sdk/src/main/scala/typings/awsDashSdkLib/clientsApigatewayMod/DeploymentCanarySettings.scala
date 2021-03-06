package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentCanarySettings extends js.Object {
  /**
    * The percentage (0.0-100.0) of traffic routed to the canary deployment.
    */
  var percentTraffic: js.UndefOr[Double] = js.undefined
  /**
    * A stage variable overrides used for the canary release deployment. They can override existing stage variables or add new stage variables for the canary release deployment. These stage variables are represented as a string-to-string map between stage variable names and their values.
    */
  var stageVariableOverrides: js.UndefOr[MapOfStringToString] = js.undefined
  /**
    * A Boolean flag to indicate whether the canary release deployment uses the stage cache or not.
    */
  var useStageCache: js.UndefOr[Boolean] = js.undefined
}

object DeploymentCanarySettings {
  @scala.inline
  def apply(
    percentTraffic: js.UndefOr[Double] = js.undefined,
    stageVariableOverrides: MapOfStringToString = null,
    useStageCache: js.UndefOr[Boolean] = js.undefined
  ): DeploymentCanarySettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(percentTraffic)) __obj.updateDynamic("percentTraffic")(percentTraffic)
    if (stageVariableOverrides != null) __obj.updateDynamic("stageVariableOverrides")(stageVariableOverrides)
    if (!js.isUndefined(useStageCache)) __obj.updateDynamic("useStageCache")(useStageCache)
    __obj.asInstanceOf[DeploymentCanarySettings]
  }
}

