package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connections extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: scala.Double): WorkbookConnection = js.native
  def Add(
    Name: java.lang.String,
    Description: java.lang.String,
    ConnectionString: java.lang.String,
    CommandText: java.lang.String
  ): WorkbookConnection = js.native
  def Add(
    Name: java.lang.String,
    Description: java.lang.String,
    ConnectionString: java.lang.String,
    CommandText: java.lang.String,
    lCmdtype: js.Any
  ): WorkbookConnection = js.native
  def AddFromFile(Filename: java.lang.String): WorkbookConnection = js.native
  def Item(Index: scala.Double): WorkbookConnection = js.native
  def _Default(Index: js.Any): WorkbookConnection = js.native
}

