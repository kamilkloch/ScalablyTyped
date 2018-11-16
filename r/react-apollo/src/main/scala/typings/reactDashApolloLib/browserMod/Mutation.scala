package typings
package reactDashApolloLib.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/browser", "Mutation")
@js.native
class Mutation[TData, TVariables] protected ()
  extends reactDashApolloLib.mutationMod.default[TData, TVariables] {
  def this(props: reactDashApolloLib.mutationMod.MutationProps[TData, TVariables], context: js.Any) = this()
}

@JSImport("react-apollo/browser", "Mutation")
@js.native
object Mutation extends js.Object {
  var contextTypes: reactDashApolloLib.Anon_ClientOperationsValidator = js.native
  var propTypes: reactDashApolloLib.Anon_ChildrenArgsMutation = js.native
}
