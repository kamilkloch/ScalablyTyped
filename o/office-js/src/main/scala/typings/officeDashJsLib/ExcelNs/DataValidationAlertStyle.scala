package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataValidationAlertStyle extends js.Object

/**
  *
  * Represents Data validation error alert style. The default is "Stop".
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationAlertStyle")
@js.native
object DataValidationAlertStyle extends js.Object {
  @js.native
  sealed trait information
    extends officeDashJsLib.ExcelNs.DataValidationAlertStyle
  
  @js.native
  sealed trait stop
    extends officeDashJsLib.ExcelNs.DataValidationAlertStyle
  
  @js.native
  sealed trait warning
    extends officeDashJsLib.ExcelNs.DataValidationAlertStyle
  
  /* "Information" */ val information: information with java.lang.String = js.native
  /* "Stop" */ val stop: stop with java.lang.String = js.native
  /* "Warning" */ val warning: warning with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.DataValidationAlertStyle with java.lang.String] = js.native
}

