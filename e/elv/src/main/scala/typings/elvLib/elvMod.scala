package typings
package elvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elv", JSImport.Namespace)
@js.native
object elvMod extends js.Object {
  def apply(`val`: js.Any): scala.Boolean = js.native
  def coalesce(args: js.Any*): js.Any = js.native
  def ncoalesce(args: js.Any*): js.Any = js.native
  def populated(`val`: js.Any): scala.Boolean = js.native
  def tryGet(`val`: js.Array[_], index: scala.Double): js.Any = js.native
  def tryGet(`val`: js.Array[_], index: scala.Double, `def`: js.Any): js.Any = js.native
  @js.native
  object behavior extends js.Object {
    var enableFalse: scala.Boolean = js.native
    var enableNaN: scala.Boolean = js.native
    var enableNull: scala.Boolean = js.native
    var enableUndefined: scala.Boolean = js.native
  }
  
}

