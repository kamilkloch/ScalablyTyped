package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRows extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): ListRow = js.native
  def apply(Index: scala.Double): ListRow = js.native
  def Add(): ListRow = js.native
  def Add(Position: scala.Double): ListRow = js.native
  def Add(Position: scala.Double, AlwaysInsert: scala.Boolean): ListRow = js.native
  def Item(Index: java.lang.String): ListRow = js.native
  def Item(Index: scala.Double): ListRow = js.native
  def _Add(): ListRow = js.native
  def _Add(Position: js.Any): ListRow = js.native
  def _Default(Index: js.Any): ListRow = js.native
}
