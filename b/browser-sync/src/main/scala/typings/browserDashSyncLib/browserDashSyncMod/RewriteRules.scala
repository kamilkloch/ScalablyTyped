package typings
package browserDashSyncLib.browserDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RewriteRules extends js.Object {
  var fn: js.UndefOr[
    js.Function3[
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      /* match */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
  var `match`: stdLib.RegExp
  var replace: js.UndefOr[java.lang.String] = js.undefined
}

object RewriteRules {
  @scala.inline
  def apply(
    `match`: stdLib.RegExp,
    fn: (/* req */ nodeLib.httpMod.IncomingMessage, /* res */ nodeLib.httpMod.ServerResponse, /* match */ java.lang.String) => java.lang.String = null,
    replace: java.lang.String = null
  ): RewriteRules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`)
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction3(fn))
    if (replace != null) __obj.updateDynamic("replace")(replace)
    __obj.asInstanceOf[RewriteRules]
  }
}

