package typings
package parseLib.ParseNs.PushNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Push")
@js.native
object PushNsMembers extends js.Object {
  def send[T](data: PushData): parseLib.ParseNs.Promise[T] = js.native
  def send[T](data: PushData, options: SendOptions): parseLib.ParseNs.Promise[T] = js.native
}
