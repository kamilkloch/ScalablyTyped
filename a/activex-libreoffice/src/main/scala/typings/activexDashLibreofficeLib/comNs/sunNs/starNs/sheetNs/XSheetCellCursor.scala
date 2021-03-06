package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides advanced methods to control the position of a cursor in a spreadsheet.
  * @see com.sun.star.sheet.SheetCellCursor
  */
trait XSheetCellCursor extends XSheetCellRange {
  /**
    * collapses the cursor into the range of the array formula to which it is currently pointing.
    *
    * To get the correct result, the top left cell of the original cursor must point to any cell containing an array formula. If not, the cursor is left
    * unchanged.
    */
  def collapseToCurrentArray(): scala.Unit
  /**
    * expands the cursor into the region containing the cells to which it currently points.
    *
    * A region is a cell range bounded by empty cells.
    */
  def collapseToCurrentRegion(): scala.Unit
  /**
    * expands the cursor to merged cell ranges.
    *
    * Expands the current cursor range in a way so that all merged cell ranges intersecting the current range will fit completely. If the cursor does not
    * point to any range with merged cells, it is left unchanged.
    */
  def collapseToMergedArea(): scala.Unit
  /**
    * changes the size of a cursor range.
    *
    * The top left cell of the cursor keeps unmodified.
    * @param nColumns the number of columns of the new cursor range.
    * @param nRows the number of rows of the new cursor range.
    */
  def collapseToSize(nColumns: scala.Double, nRows: scala.Double): scala.Unit
  /** expands the cursor to include the entire columns of the cells to which it is currently pointing. */
  def expandToEntireColumns(): scala.Unit
  /** expands the cursor to include the entire rows of the cells to which it is currently pointing. */
  def expandToEntireRows(): scala.Unit
}

object XSheetCellCursor {
  @scala.inline
  def apply(
    Spreadsheet: XSpreadsheet,
    acquire: () => scala.Unit,
    collapseToCurrentArray: () => scala.Unit,
    collapseToCurrentRegion: () => scala.Unit,
    collapseToMergedArea: () => scala.Unit,
    collapseToSize: (scala.Double, scala.Double) => scala.Unit,
    expandToEntireColumns: () => scala.Unit,
    expandToEntireRows: () => scala.Unit,
    getCellByPosition: (scala.Double, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCell,
    getCellRangeByName: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange,
    getCellRangeByPosition: (scala.Double, scala.Double, scala.Double, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange,
    getSpreadsheet: () => XSpreadsheet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XSheetCellCursor = {
    val __obj = js.Dynamic.literal(Spreadsheet = Spreadsheet, acquire = js.Any.fromFunction0(acquire), collapseToCurrentArray = js.Any.fromFunction0(collapseToCurrentArray), collapseToCurrentRegion = js.Any.fromFunction0(collapseToCurrentRegion), collapseToMergedArea = js.Any.fromFunction0(collapseToMergedArea), collapseToSize = js.Any.fromFunction2(collapseToSize), expandToEntireColumns = js.Any.fromFunction0(expandToEntireColumns), expandToEntireRows = js.Any.fromFunction0(expandToEntireRows), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getSpreadsheet = js.Any.fromFunction0(getSpreadsheet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSheetCellCursor]
  }
}

