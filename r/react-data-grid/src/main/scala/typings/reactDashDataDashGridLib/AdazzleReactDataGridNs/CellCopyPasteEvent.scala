package typings
package reactDashDataDashGridLib.AdazzleReactDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Information about a copy paste
     */

trait CellCopyPasteEvent extends js.Object {
  /**
           * The key of the column where the copy paste occurred.
           */
  var cellKey: java.lang.String
  /**
           * The row that was copied from.
           */
  var fromRow: scala.Double
  /**
           * The row that was pasted to.
           */
  var rowIdx: scala.Double
  /**
           * The row that was pasted to.
           */
  var toRow: scala.Double
  /**
           * The value that was pasted.
           */
  var value: js.Any
}
