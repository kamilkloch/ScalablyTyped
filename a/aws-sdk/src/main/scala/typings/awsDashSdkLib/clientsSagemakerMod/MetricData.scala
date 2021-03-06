package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricData extends js.Object {
  /**
    * The name of the metric.
    */
  var MetricName: js.UndefOr[MetricName] = js.undefined
  /**
    * The date and time that the algorithm emitted the metric.
    */
  var Timestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The value of the metric.
    */
  var Value: js.UndefOr[Float] = js.undefined
}

object MetricData {
  @scala.inline
  def apply(
    MetricName: MetricName = null,
    Timestamp: Timestamp = null,
    Value: js.UndefOr[Float] = js.undefined
  ): MetricData = {
    val __obj = js.Dynamic.literal()
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[MetricData]
  }
}

