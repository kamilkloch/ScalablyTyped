package typings
package angularDashResourceLib.angularDashResourceMod.angularMod.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Allow specify more resource methods
// No need to add duplicates for all four overloads.
@js.native
trait IResourceMethod[T] extends js.Object {
  def apply(): T = js.native
  def apply(params: js.Object): T = js.native
  def apply(params: js.Object, data: js.Object): T = js.native
  def apply(params: js.Object, data: js.Object, success: angularLib.angularMod.Global.Function): T = js.native
  def apply(
    params: js.Object,
    data: js.Object,
    success: angularLib.angularMod.Global.Function,
    error: angularLib.angularMod.Global.Function
  ): T = js.native
  def apply(params: js.Object, success: angularLib.angularMod.Global.Function): T = js.native
  def apply(
    params: js.Object,
    success: angularLib.angularMod.Global.Function,
    error: angularLib.angularMod.Global.Function
  ): T = js.native
  def apply(success: angularLib.angularMod.Global.Function): T = js.native
  def apply(success: angularLib.angularMod.Global.Function, error: angularLib.angularMod.Global.Function): T = js.native
}

