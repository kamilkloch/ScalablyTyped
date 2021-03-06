package typings
package reactDashResolverLib.reactDashResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolver extends js.Object {
  def render(factory: reactLib.reactMod.Factory[_]): scala.Unit = js.native
  def render(factory: reactLib.reactMod.Factory[_], root: stdLib.Node): scala.Unit = js.native
  def resolve[P](factory: reactLib.reactMod.Factory[P]): js.Promise[reactDashResolverLib.Anon_Data[P]] = js.native
}

