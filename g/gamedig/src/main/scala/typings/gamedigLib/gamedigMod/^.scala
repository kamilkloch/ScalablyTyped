package typings
package gamedigLib.gamedigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gamedig", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def query(options: QueryOptions): js.Promise[QueryResult] = js.native
  def query(
    options: QueryOptions,
    callback: js.Function2[/* error */ js.Any, /* state */ QueryResult, scala.Unit]
  ): scala.Unit = js.native
}

