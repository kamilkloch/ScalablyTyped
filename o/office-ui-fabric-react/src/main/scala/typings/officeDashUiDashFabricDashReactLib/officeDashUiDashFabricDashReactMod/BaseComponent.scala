package typings
package officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "BaseComponent")
@js.native
class BaseComponent[TProps /* <: atUifabricUtilitiesLib.libBaseComponentMod.IBaseProps[_] */, TState] protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[TProps, TState] {
  /**
    * BaseComponent constructor
    * @param props - The props for the component.
    * @param context - The context for the component.
    */
  def this(props: TProps) = this()
  def this(props: TProps, context: js.Any) = this()
}

/* static members */
@JSImport("office-ui-fabric-react", "BaseComponent")
@js.native
object BaseComponent extends js.Object {
  /**
    * @deprecated Use React's error boundaries instead.
    */
  def onError(): scala.Unit = js.native
  def onError(errorMessage: java.lang.String): scala.Unit = js.native
  def onError(errorMessage: java.lang.String, ex: js.Any): scala.Unit = js.native
}

