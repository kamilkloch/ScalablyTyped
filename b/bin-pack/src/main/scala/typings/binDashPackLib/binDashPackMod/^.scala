package typings
package binDashPackLib.binDashPackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bin-pack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T /* <: Bin */](bins: js.Array[T]): PackResult[T] = js.native
  def apply[T /* <: Bin */](bins: js.Array[T], options: Options): PackResult[T] = js.native
}

