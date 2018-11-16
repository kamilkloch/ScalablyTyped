package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UnmergeCellsRequest extends js.Object {
  /**
               * The range within which all cells should be unmerged.
               * If the range spans multiple merges, all will be unmerged.
               * The range must not partially span any merge.
               */
  var range: js.UndefOr[GridRange] = js.undefined
}
