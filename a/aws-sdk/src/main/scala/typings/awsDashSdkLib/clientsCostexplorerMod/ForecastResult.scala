package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForecastResult extends js.Object {
  /**
    * The mean value of the forecast.
    */
  var MeanValue: js.UndefOr[GenericString] = js.undefined
  /**
    * The lower limit for the prediction interval. 
    */
  var PredictionIntervalLowerBound: js.UndefOr[GenericString] = js.undefined
  /**
    * The upper limit for the prediction interval. 
    */
  var PredictionIntervalUpperBound: js.UndefOr[GenericString] = js.undefined
  /**
    * The period of time that the forecast covers.
    */
  var TimePeriod: js.UndefOr[DateInterval] = js.undefined
}

object ForecastResult {
  @scala.inline
  def apply(
    MeanValue: GenericString = null,
    PredictionIntervalLowerBound: GenericString = null,
    PredictionIntervalUpperBound: GenericString = null,
    TimePeriod: DateInterval = null
  ): ForecastResult = {
    val __obj = js.Dynamic.literal()
    if (MeanValue != null) __obj.updateDynamic("MeanValue")(MeanValue)
    if (PredictionIntervalLowerBound != null) __obj.updateDynamic("PredictionIntervalLowerBound")(PredictionIntervalLowerBound)
    if (PredictionIntervalUpperBound != null) __obj.updateDynamic("PredictionIntervalUpperBound")(PredictionIntervalUpperBound)
    if (TimePeriod != null) __obj.updateDynamic("TimePeriod")(TimePeriod)
    __obj.asInstanceOf[ForecastResult]
  }
}

