package typings
package koaDashSendLib.koaDashSendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-send", JSImport.Namespace)
@js.native
object koaDashSendModMembers extends js.Object {
  def apply(ctx: koaLib.koaMod.ApplicationNs.Context, path: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def apply(
    ctx: koaLib.koaMod.ApplicationNs.Context,
    path: java.lang.String,
    opts: koaDashSendLib.koaDashSendMod.sendNs.SendOptions
  ): stdLib.Promise[java.lang.String] = js.native
}
