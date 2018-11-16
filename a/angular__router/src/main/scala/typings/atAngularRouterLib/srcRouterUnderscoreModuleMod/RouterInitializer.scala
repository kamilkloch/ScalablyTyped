package typings
package atAngularRouterLib.srcRouterUnderscoreModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/router_module", "RouterInitializer")
@js.native
class RouterInitializer protected () extends js.Object {
  def this(injector: atAngularCoreLib.coreMod.Injector) = this()
  var initNavigation: js.Any = js.native
  var injector: js.Any = js.native
  var isLegacyDisabled: js.Any = js.native
  var isLegacyEnabled: js.Any = js.native
  var resultOfPreactivationDone: js.Any = js.native
  def appInitializer(): stdLib.Promise[_] = js.native
  def bootstrapListener(bootstrappedComponentRef: atAngularCoreLib.coreMod.ComponentRef[_]): scala.Unit = js.native
}
