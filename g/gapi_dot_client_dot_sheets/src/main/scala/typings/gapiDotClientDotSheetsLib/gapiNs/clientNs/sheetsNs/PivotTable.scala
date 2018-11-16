package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PivotTable extends js.Object {
  /** Each column grouping in the pivot table. */
  var columns: js.UndefOr[js.Array[PivotGroup]] = js.undefined
  /**
               * An optional mapping of filters per source column offset.
               *
               * The filters will be applied before aggregating data into the pivot table.
               * The map's key is the column offset of the source range that you want to
               * filter, and the value is the criteria for that column.
               *
               * For example, if the source was `C10:E15`, a key of `0` will have the filter
               * for column `C`, whereas the key `1` is for column `D`.
               */
  var criteria: js.UndefOr[stdLib.Record[java.lang.String, PivotFilterCriteria]] = js.undefined
  /** Each row grouping in the pivot table. */
  var rows: js.UndefOr[js.Array[PivotGroup]] = js.undefined
  /** The range the pivot table is reading data from. */
  var source: js.UndefOr[GridRange] = js.undefined
  /**
               * Whether values should be listed horizontally (as columns)
               * or vertically (as rows).
               */
  var valueLayout: js.UndefOr[java.lang.String] = js.undefined
  /** A list of values to include in the pivot table. */
  var values: js.UndefOr[js.Array[PivotValue]] = js.undefined
}
