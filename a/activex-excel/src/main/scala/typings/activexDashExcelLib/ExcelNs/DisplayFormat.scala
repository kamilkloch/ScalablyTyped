package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.DisplayFormat")
@js.native
class DisplayFormat protected () extends js.Object {
  val AddIndent: scala.Boolean | scala.Null = js.native
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  val Creator: XlCreator = js.native
  var `Excel.DisplayFormat_typekey`: DisplayFormat = js.native
  val Font: activexDashExcelLib.ExcelNs.Font = js.native
  val FormulaHidden: scala.Boolean | scala.Null = js.native
  val HorizontalAlignment: js.Any = js.native
  val IndentLevel: js.Any = js.native
  val Interior: activexDashExcelLib.ExcelNs.Interior = js.native
  val Locked: scala.Boolean | scala.Null = js.native
  val MergeCells: scala.Boolean = js.native
  val NumberFormat: java.lang.String | scala.Null = js.native
  val NumberFormatLocal: java.lang.String | scala.Null = js.native
  val Orientation: js.Any = js.native
  val Parent: js.Any = js.native
  val ReadingOrder: scala.Double = js.native
  val ShrinkToFit: scala.Boolean = js.native
  val Style: activexDashExcelLib.ExcelNs.Style = js.native
  val VerticalAlignment: js.Any = js.native
  val WrapText: scala.Boolean = js.native
  def Borders(Index: XlBordersIndex): Border = js.native
  def Characters(): activexDashExcelLib.ExcelNs.Characters = js.native
  def Characters(Start: scala.Double): activexDashExcelLib.ExcelNs.Characters = js.native
  def Characters(Start: scala.Double, Length: scala.Double): activexDashExcelLib.ExcelNs.Characters = js.native
}

