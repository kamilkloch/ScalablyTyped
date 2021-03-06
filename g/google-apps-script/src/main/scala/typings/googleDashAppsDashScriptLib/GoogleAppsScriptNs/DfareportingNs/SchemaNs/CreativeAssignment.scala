package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeAssignment extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var applyEventTags: js.UndefOr[scala.Boolean] = js.undefined
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.undefined
  var companionCreativeOverrides: js.UndefOr[js.Array[CompanionClickThroughOverride]] = js.undefined
  var creativeGroupAssignments: js.UndefOr[js.Array[CreativeGroupAssignment]] = js.undefined
  var creativeId: js.UndefOr[java.lang.String] = js.undefined
  var creativeIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  var richMediaExitOverrides: js.UndefOr[js.Array[RichMediaExitOverride]] = js.undefined
  var sequence: js.UndefOr[scala.Double] = js.undefined
  var sslCompliant: js.UndefOr[scala.Boolean] = js.undefined
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object CreativeAssignment {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    applyEventTags: js.UndefOr[scala.Boolean] = js.undefined,
    clickThroughUrl: ClickThroughUrl = null,
    companionCreativeOverrides: js.Array[CompanionClickThroughOverride] = null,
    creativeGroupAssignments: js.Array[CreativeGroupAssignment] = null,
    creativeId: java.lang.String = null,
    creativeIdDimensionValue: DimensionValue = null,
    endTime: java.lang.String = null,
    richMediaExitOverrides: js.Array[RichMediaExitOverride] = null,
    sequence: scala.Int | scala.Double = null,
    sslCompliant: js.UndefOr[scala.Boolean] = js.undefined,
    startTime: java.lang.String = null,
    weight: scala.Int | scala.Double = null
  ): CreativeAssignment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(applyEventTags)) __obj.updateDynamic("applyEventTags")(applyEventTags)
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl)
    if (companionCreativeOverrides != null) __obj.updateDynamic("companionCreativeOverrides")(companionCreativeOverrides)
    if (creativeGroupAssignments != null) __obj.updateDynamic("creativeGroupAssignments")(creativeGroupAssignments)
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId)
    if (creativeIdDimensionValue != null) __obj.updateDynamic("creativeIdDimensionValue")(creativeIdDimensionValue)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (richMediaExitOverrides != null) __obj.updateDynamic("richMediaExitOverrides")(richMediaExitOverrides)
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeAssignment]
  }
}

