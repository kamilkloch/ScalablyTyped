package typings
package reactDashReduxLib.reactDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-redux", JSImport.Namespace)
@js.native
object reactDashReduxModMembers extends js.Object {
  val connect: Connect = js.native
  def connectAdvanced[S, TProps, TOwnProps, TFactoryOptions](selectorFactory: SelectorFactory[S, TProps, TOwnProps, TFactoryOptions]): AdvancedComponentDecorator[TProps, TOwnProps] = js.native
  def connectAdvanced[S, TProps, TOwnProps, TFactoryOptions](
    selectorFactory: SelectorFactory[S, TProps, TOwnProps, TFactoryOptions],
    connectOptions: ConnectOptions with TFactoryOptions
  ): AdvancedComponentDecorator[TProps, TOwnProps] = js.native
  def createProvider(storeKey: java.lang.String): ScalablyTyped.runtime.Instantiable0[Provider[reduxLib.reduxMod.AnyAction]] = js.native
}
