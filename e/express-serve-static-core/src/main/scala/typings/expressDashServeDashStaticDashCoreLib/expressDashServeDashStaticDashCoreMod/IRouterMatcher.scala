package typings
package expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouterMatcher[T] extends js.Object {
  def apply(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): T = js.native
}
