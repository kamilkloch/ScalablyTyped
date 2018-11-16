package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region "cell-methods"
@js.native
trait CommonCellMethods extends CommonSubMethods {
  /**
           * Invalidate the data held in DataTables for the selected cells
           *
           * @param source Data source to read the new data from.
           */
  def invalidate(): Api = js.native
  /**
           * Invalidate the data held in DataTables for the selected cells
           *
           * @param source Data source to read the new data from.
           */
  def invalidate(source: java.lang.String): Api = js.native
  /**
           * Get data for the selected cell
           *
           * @param f Data type to get. This can be one of: 'display', 'filter', 'sort', 'type'
           */
  def render(t: java.lang.String): js.Any = js.native
}
