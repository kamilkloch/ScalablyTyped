package typings
package inversifyDashBindingDashDecoratorsLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvideOnSyntax[T] extends ProvideDoneSyntax {
  def onActivation(
    fn: js.Function2[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify inversifyInterfaces.Context */ /* context */ js.Any, 
      /* injectable */ T, 
      T
    ]
  ): ProvideWhenSyntax[T] = js.native
}

