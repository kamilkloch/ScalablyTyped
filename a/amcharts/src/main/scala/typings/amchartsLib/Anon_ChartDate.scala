package typings
package amchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChartDate extends js.Object {
  var chart: this.type
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var endDate: js.UndefOr[stdLib.Date] = js.undefined
  var eventObject: js.UndefOr[amchartsLib.stockEventMod.default] = js.undefined
  var graph: js.UndefOr[amchartsLib.stockGraphMod.default] = js.undefined
  var panel: js.UndefOr[amchartsLib.stockPanelMod.default] = js.undefined
  var period: js.UndefOr[java.lang.String] = js.undefined
  var startDate: js.UndefOr[stdLib.Date] = js.undefined
  var `type`: java.lang.String
}

object Anon_ChartDate {
  @scala.inline
  def apply(
    chart: Anon_ChartDate,
    `type`: java.lang.String,
    date: stdLib.Date = null,
    endDate: stdLib.Date = null,
    eventObject: amchartsLib.stockEventMod.default = null,
    graph: amchartsLib.stockGraphMod.default = null,
    panel: amchartsLib.stockPanelMod.default = null,
    period: java.lang.String = null,
    startDate: stdLib.Date = null
  ): Anon_ChartDate = {
    val __obj = js.Dynamic.literal(chart = chart)
    __obj.updateDynamic("type")(`type`)
    if (date != null) __obj.updateDynamic("date")(date)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (eventObject != null) __obj.updateDynamic("eventObject")(eventObject)
    if (graph != null) __obj.updateDynamic("graph")(graph)
    if (panel != null) __obj.updateDynamic("panel")(panel)
    if (period != null) __obj.updateDynamic("period")(period)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[Anon_ChartDate]
  }
}

