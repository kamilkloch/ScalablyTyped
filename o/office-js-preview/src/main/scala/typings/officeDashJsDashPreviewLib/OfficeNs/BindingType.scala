package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BindingType extends js.Object

/**
  * Specifies the type of the binding object that should be returned.
  */
@JSGlobal("Office.BindingType")
@js.native
object BindingType extends js.Object {
  /**
    * Tabular data without a header row. Data is returned as an array of arrays, for example in this form: 
    * [[row1column1, row1column2],[row2column1, row2column2]]
    */
  @js.native
  sealed trait Matrix
    extends officeDashJsDashPreviewLib.OfficeNs.BindingType
  
  /**
    * Tabular data with a header row. Data is returned as a {@link Office.TableData | TableData} object.
    */
  @js.native
  sealed trait Table
    extends officeDashJsDashPreviewLib.OfficeNs.BindingType
  
  /**
    * Plain text. Data is returned as a run of characters.
    */
  @js.native
  sealed trait Text
    extends officeDashJsDashPreviewLib.OfficeNs.BindingType
  
  val Matrix: Matrix with java.lang.String = js.native
  val Table: Table with java.lang.String = js.native
  val Text: Text with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.OfficeNs.BindingType with java.lang.String] = js.native
}

