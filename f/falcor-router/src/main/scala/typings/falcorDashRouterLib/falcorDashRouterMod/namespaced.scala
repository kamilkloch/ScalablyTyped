package typings
package falcorDashRouterLib.falcorDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("falcor-router", JSImport.Namespace)
@js.native
class namespaced protected () extends FalcorRouter {
  def this(routes: js.Array[falcorDashRouterLib.falcorDashRouterMod.FalcorRouterNs.RouteDefinition]) = this()
  def this(routes: js.Array[falcorDashRouterLib.falcorDashRouterMod.FalcorRouterNs.RouteDefinition], options: falcorDashRouterLib.falcorDashRouterMod.FalcorRouterNs.RouterOptions) = this()
}

@JSImport("falcor-router", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def createClass(): ScalablyTyped.runtime.Instantiable1[
    /* options */ js.UndefOr[
      /* options */ falcorDashRouterLib.falcorDashRouterMod.FalcorRouterNs.RouterOptions
    ], 
    falcorDashRouterLib.falcorDashRouterMod.FalcorRouterNs.CreatedRouter
  ] = js.native
  def createClass(routes: js.Array[falcorDashRouterLib.falcorDashRouterMod.FalcorRouterNs.RouteDefinition]): ScalablyTyped.runtime.Instantiable1[
    /* options */ js.UndefOr[
      /* options */ falcorDashRouterLib.falcorDashRouterMod.FalcorRouterNs.RouterOptions
    ], 
    falcorDashRouterLib.falcorDashRouterMod.FalcorRouterNs.CreatedRouter
  ] = js.native
}
