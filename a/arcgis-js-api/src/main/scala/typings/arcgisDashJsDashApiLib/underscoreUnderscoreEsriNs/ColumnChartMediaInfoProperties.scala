package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnChartMediaInfoProperties
  extends MediaInfoProperties
     with ChartMediaInfoProperties

object ColumnChartMediaInfoProperties {
  @scala.inline
  def apply(
    caption: java.lang.String = null,
    title: java.lang.String = null,
    value: ChartMediaInfoValueProperties = null
  ): ColumnChartMediaInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (title != null) __obj.updateDynamic("title")(title)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ColumnChartMediaInfoProperties]
  }
}

