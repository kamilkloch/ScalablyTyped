package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartAxisScaleType extends js.Object

/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartAxisScaleType")
@js.native
object ChartAxisScaleType extends js.Object {
  @js.native
  sealed trait linear
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisScaleType
  
  @js.native
  sealed trait logarithmic
    extends officeDashJsDashPreviewLib.ExcelNs.ChartAxisScaleType
  
  /* "Linear" */ val linear: linear with java.lang.String = js.native
  /* "Logarithmic" */ val logarithmic: logarithmic with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ChartAxisScaleType with java.lang.String] = js.native
}

