package typings
package parseLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/react-native", "Session")
@js.native
class Session ()
  extends parseLib.nodeMod.Session

/* static members */
@JSImport("parse/react-native", "Session")
@js.native
object Session extends js.Object {
  def current(): js.Promise[parseLib.ParseNs.Session] = js.native
}

