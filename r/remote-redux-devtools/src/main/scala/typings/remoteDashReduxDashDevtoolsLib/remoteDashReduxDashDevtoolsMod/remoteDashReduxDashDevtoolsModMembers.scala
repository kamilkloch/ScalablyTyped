package typings
package remoteDashReduxDashDevtoolsLib.remoteDashReduxDashDevtoolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("remote-redux-devtools", JSImport.Namespace)
@js.native
object remoteDashReduxDashDevtoolsModMembers extends js.Object {
  def composeWithDevTools(): js.Function1[
    /* repeated */reduxLib.reduxMod.StoreEnhancer[js.Object, js.Object], 
    reduxLib.reduxMod.StoreEnhancer[js.Object, js.Object]
  ] = js.native
  def composeWithDevTools(funcs: (reduxLib.reduxMod.StoreEnhancer[js.Object, js.Object])*): reduxLib.reduxMod.StoreEnhancer[js.Object, js.Object] = js.native
  def composeWithDevTools(options: RemoteReduxDevToolsOptions): js.Function1[
    /* repeated */reduxLib.reduxMod.StoreEnhancer[js.Object, js.Object], 
    reduxLib.reduxMod.StoreEnhancer[js.Object, js.Object]
  ] = js.native
}
