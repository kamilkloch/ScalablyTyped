package typings
package koaDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-convert", JSImport.Namespace)
@js.native
object koaDashConvertMod extends js.Object {
  def apply(
    mw: js.Function2[
      /* context */ koaLib.koaMod.ApplicationNs.Context, 
      /* next */ js.Function0[stdLib.Promise[_]], 
      stdLib.Generator
    ]
  ): koaLib.koaMod.ApplicationNs.Middleware = js.native
}
