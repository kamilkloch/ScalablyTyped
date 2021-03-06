package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeOptions
  extends BaseOptions[js.Any, js.Any] {
  var scope: Scope
}

object AuthorizeOptions {
  @scala.inline
  def apply(
    scope: Scope,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): AuthorizeOptions = {
    val __obj = js.Dynamic.literal(scope = scope)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AuthorizeOptions]
  }
}

