package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataValidationType extends js.Object

/**
  *
  * Represents Data validation type enum.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataValidationType")
@js.native
object DataValidationType extends js.Object {
  /**
    *
    * Custom data validation type
    *
    */
  @js.native
  sealed trait custom
    extends officeDashJsLib.ExcelNs.DataValidationType
  
  /**
    *
    * Date data validation type
    *
    */
  @js.native
  sealed trait date
    extends officeDashJsLib.ExcelNs.DataValidationType
  
  /**
    *
    * Decimal data validation type
    *
    */
  @js.native
  sealed trait decimal
    extends officeDashJsLib.ExcelNs.DataValidationType
  
  /**
    *
    * Inconsistent means that the range has inconsistent data validation (there are different rules on different cells)
    *
    */
  @js.native
  sealed trait inconsistent
    extends officeDashJsLib.ExcelNs.DataValidationType
  
  /**
    *
    * List data validation type
    *
    */
  @js.native
  sealed trait list
    extends officeDashJsLib.ExcelNs.DataValidationType
  
  /**
    *
    * MixedCriteria means that the range has data validation present on some but not all cells
    *
    */
  @js.native
  sealed trait mixedCriteria
    extends officeDashJsLib.ExcelNs.DataValidationType
  
  /**
    *
    * None means allow any value and so there is no data validation in the range.
    *
    */
  @js.native
  sealed trait none
    extends officeDashJsLib.ExcelNs.DataValidationType
  
  /**
    *
    * Text length data validation type
    *
    */
  @js.native
  sealed trait textLength
    extends officeDashJsLib.ExcelNs.DataValidationType
  
  /**
    *
    * Time data validation type
    *
    */
  @js.native
  sealed trait time
    extends officeDashJsLib.ExcelNs.DataValidationType
  
  /**
    *
    * Whole number data validation type
    *
    */
  @js.native
  sealed trait wholeNumber
    extends officeDashJsLib.ExcelNs.DataValidationType
  
  /* "Custom" */ val custom: custom with java.lang.String = js.native
  /* "Date" */ val date: date with java.lang.String = js.native
  /* "Decimal" */ val decimal: decimal with java.lang.String = js.native
  /* "Inconsistent" */ val inconsistent: inconsistent with java.lang.String = js.native
  /* "List" */ val list: list with java.lang.String = js.native
  /* "MixedCriteria" */ val mixedCriteria: mixedCriteria with java.lang.String = js.native
  /* "None" */ val none: none with java.lang.String = js.native
  /* "TextLength" */ val textLength: textLength with java.lang.String = js.native
  /* "Time" */ val time: time with java.lang.String = js.native
  /* "WholeNumber" */ val wholeNumber: wholeNumber with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.DataValidationType with java.lang.String] = js.native
}

