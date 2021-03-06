package typings
package meteorLib.toolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/tools", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var console: stdLib.Console = js.native
  def execFileAsync(command: java.lang.String): js.Any = js.native
  def execFileAsync(command: java.lang.String, args: js.Array[_]): js.Any = js.native
  def execFileAsync(command: java.lang.String, args: js.Array[_], options: meteorLib.Anon_Cwd): js.Any = js.native
  def execFileSync(command: java.lang.String): java.lang.String = js.native
  def execFileSync(command: java.lang.String, args: js.Array[_]): java.lang.String = js.native
  def execFileSync(command: java.lang.String, args: js.Array[_], options: meteorLib.Anon_Cwd): java.lang.String = js.native
}

