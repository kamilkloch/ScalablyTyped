package typings
package atIonicCliDashFrameworkLib.libExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/executor", JSImport.Namespace)
@js.native
object libExecutorModMembers extends js.Object {
  val EXECUTOR_OPS: ExecutorOperations = js.native
  def execute[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](
    hasNamespaceArgvEnvRest: atIonicCliDashFrameworkLib.Anon_Namespace[N] with (stdLib.Partial[BaseExecutorDeps[C, N, M, I, O]])
  ): stdLib.Promise[scala.Unit] = js.native
}
