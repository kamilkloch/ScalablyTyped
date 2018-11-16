package typings
package reactDashApolloLib.reactDashApolloMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo", "ApolloProvider")
@js.native
class ApolloProvider[TCache] protected ()
  extends reactDashApolloLib.apolloproviderMod.ApolloProvider[TCache] {
  def this(props: reactDashApolloLib.apolloproviderMod.ApolloProviderProps[TCache], context: js.Any) = this()
}

@JSImport("react-apollo", "ApolloProvider")
@js.native
object ApolloProvider extends js.Object {
  var childContextTypes: reactDashApolloLib.Anon_ClientOperationsValidator = js.native
  var propTypes: reactDashApolloLib.Anon_ClientChildren = js.native
}
