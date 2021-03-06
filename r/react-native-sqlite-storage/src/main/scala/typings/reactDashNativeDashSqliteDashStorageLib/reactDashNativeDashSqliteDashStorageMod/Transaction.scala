package typings
package reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  def executeSql(sqlStatement: java.lang.String): js.Promise[js.Tuple2[Transaction, ResultSet]] = js.native
  def executeSql(sqlStatement: java.lang.String, arguments: js.Array[_]): js.Promise[js.Tuple2[Transaction, ResultSet]] = js.native
  def executeSql(sqlStatement: java.lang.String, arguments: js.Array[_], callback: StatementCallback): scala.Unit = js.native
  def executeSql(
    sqlStatement: java.lang.String,
    arguments: js.Array[_],
    callback: StatementCallback,
    errorCallback: StatementErrorCallback
  ): scala.Unit = js.native
  @JSName("executeSql")
  def executeSql_Unit(sqlStatement: java.lang.String): scala.Unit = js.native
  @JSName("executeSql")
  def executeSql_Unit(sqlStatement: java.lang.String, arguments: js.Array[_]): scala.Unit = js.native
}

