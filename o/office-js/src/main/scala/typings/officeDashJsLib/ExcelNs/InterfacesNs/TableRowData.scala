package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "tableRow.toJSON()". */

trait TableRowData extends js.Object {
  /**
               *
               * Returns the index number of the row within the rows collection of the table. Zero-indexed. Read-only.
               *
               * [Api set: ExcelApi 1.1]
               */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Represents the raw values of the specified range. The data returned could be of type string, number, or a boolean. Cells that contain an error will return the error string.
               *
               * [Api set: ExcelApi 1.1]
               */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
}
