package typings
package koaDashLogLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-log", JSImport.Namespace)
@js.native
object koaDashLogMod extends js.Object {
  def apply(`type`: java.lang.String): koaLib.koaMod.Middleware[_, js.Object] = js.native
  @JSName("morgan")
  @js.native
  object morganNs extends js.Object {
    def cookie(ctx: koaLib.koaMod.BaseContext, key: java.lang.String): java.lang.String = js.native
    def date(ctx: koaLib.koaMod.BaseContext, format: java.lang.String): java.lang.String = js.native
    def format(name: java.lang.String): java.lang.String = js.native
    def length(ctx: koaLib.koaMod.BaseContext): js.UndefOr[scala.Double] = js.native
    def method(ctx: koaLib.koaMod.BaseContext): java.lang.String = js.native
    def referrer(ctx: koaLib.koaMod.BaseContext): java.lang.String = js.native
    def status(ctx: koaLib.koaMod.BaseContext): scala.Double = js.native
    def token(name: java.lang.String, fn: js.Function1[/* ctx */ koaLib.koaMod.BaseContext, java.lang.String]): scala.Unit = js.native
    def url(ctx: koaLib.koaMod.BaseContext): java.lang.String = js.native
  }
  
}

