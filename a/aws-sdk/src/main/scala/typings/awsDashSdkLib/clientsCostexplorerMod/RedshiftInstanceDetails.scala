package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedshiftInstanceDetails extends js.Object {
  /**
    * Whether the recommendation is for a current-generation instance.
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined
  /**
    * The instance family of the recommended reservation.
    */
  var Family: js.UndefOr[GenericString] = js.undefined
  /**
    * The type of node that AWS recommends.
    */
  var NodeType: js.UndefOr[GenericString] = js.undefined
  /**
    * The AWS Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.undefined
  /**
    * Whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
}

object RedshiftInstanceDetails {
  @scala.inline
  def apply(
    CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined,
    Family: GenericString = null,
    NodeType: GenericString = null,
    Region: GenericString = null,
    SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
  ): RedshiftInstanceDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CurrentGeneration)) __obj.updateDynamic("CurrentGeneration")(CurrentGeneration)
    if (Family != null) __obj.updateDynamic("Family")(Family)
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (!js.isUndefined(SizeFlexEligible)) __obj.updateDynamic("SizeFlexEligible")(SizeFlexEligible)
    __obj.asInstanceOf[RedshiftInstanceDetails]
  }
}

