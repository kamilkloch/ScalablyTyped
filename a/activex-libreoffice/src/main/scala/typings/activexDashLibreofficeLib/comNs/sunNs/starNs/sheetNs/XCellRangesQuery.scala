package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to query for cell ranges with specific contents.
  *
  * All methods return a collection of cell ranges.
  * @see com.sun.star.sheet.SheetRangesQuery
  * @see com.sun.star.sheet.SheetCellRanges
  */
trait XCellRangesQuery
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * queries all cells with different values in a specified row.
    *
    * This method takes each column of the current cell range(s) and compares all cells with the cell in the specified row. All cells which are different to
    * this comparison cell will be returned.
    * @param aCompare contains a cell address with the row index used for comparison. Only this row index is of interest.
    * @returns all cells of the current cell range(s) which are different to the comparison cell of each column.
    */
  def queryColumnDifferences(aCompare: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress): XSheetCellRanges
  /**
    * queries all cells with the specified content type(s).
    * @param nContentFlags a combination of {@link CellFlags} flags.  Attention: Despite the {@link CellFlags} flags are `long` values, this method expects a
    * @returns all cells of the current cell range(s) with the specified content type(s).
    */
  def queryContentCells(nContentFlags: scala.Double): XSheetCellRanges
  /**
    * queries all empty cells.
    * @returns the empty cells of the current cell range(s).
    */
  def queryEmptyCells(): XSheetCellRanges
  /**
    * queries all formula cells with the specified result type.
    * @param nResultFlags a combination of {@link FormulaResult} flags.
    * @returns all formula cells of the current cell range(s) with the specified result type(s).
    */
  def queryFormulaCells(nResultFlags: scala.Double): XSheetCellRanges
  /**
    * intersects the current cell range(s) with the specified cell range.
    * @param aRange contains the cell range for intersection.
    * @returns all cells of the current cell range(s) which are contained in the passed cell range.
    */
  def queryIntersection(aRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress): XSheetCellRanges
  /**
    * queries all cells with different values in a specified column.
    *
    * This method takes each row of the current cell range(s) and compares all cells with the cell in the specified column. All cells which are different to
    * this comparison cell will be returned.
    * @param aCompare contains a cell address with the column index used for comparison. Only this column index is of interest.
    * @returns all cells of the current cell range(s) which are different to the comparison cell of each row.
    */
  def queryRowDifferences(aCompare: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress): XSheetCellRanges
  /**
    * queries all visible cells.
    * @returns the visible (not hidden) cells of the current cell range(s).
    */
  def queryVisibleCells(): XSheetCellRanges
}

object XCellRangesQuery {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryColumnDifferences: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress => XSheetCellRanges,
    queryContentCells: scala.Double => XSheetCellRanges,
    queryEmptyCells: () => XSheetCellRanges,
    queryFormulaCells: scala.Double => XSheetCellRanges,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    queryIntersection: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress => XSheetCellRanges,
    queryRowDifferences: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress => XSheetCellRanges,
    queryVisibleCells: () => XSheetCellRanges,
    release: () => scala.Unit
  ): XCellRangesQuery = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryColumnDifferences = js.Any.fromFunction1(queryColumnDifferences), queryContentCells = js.Any.fromFunction1(queryContentCells), queryEmptyCells = js.Any.fromFunction0(queryEmptyCells), queryFormulaCells = js.Any.fromFunction1(queryFormulaCells), queryInterface = js.Any.fromFunction1(queryInterface), queryIntersection = js.Any.fromFunction1(queryIntersection), queryRowDifferences = js.Any.fromFunction1(queryRowDifferences), queryVisibleCells = js.Any.fromFunction0(queryVisibleCells), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCellRangesQuery]
  }
}

