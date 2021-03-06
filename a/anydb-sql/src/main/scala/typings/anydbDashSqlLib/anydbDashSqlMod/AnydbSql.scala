package typings
package anydbDashSqlLib.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnydbSql extends DatabaseConnection {
  var functions: anydbDashSqlLib.Anon_LOWER = js.native
  var models: Dictionary[Table[_]] = js.native
  def allOf(tables: Table[_]*): js.Any = js.native
  def begin(): Transaction = js.native
  def close(): scala.Unit = js.native
  def define[T](map: TableDefinition): Table[T] = js.native
  def dialect(): java.lang.String = js.native
  def getPool(): AnyDBPool = js.native
  def makeFunction(name: java.lang.String): js.Function = js.native
  def open(): scala.Unit = js.native
  def transaction[T](fn: js.Function1[/* tx */ Transaction, bluebirdLib.bluebirdMod.^[T]]): bluebirdLib.bluebirdMod.^[T] = js.native
}

