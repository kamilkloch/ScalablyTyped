package typings
package assertDashEqualDashJsxLib.assertDashEqualDashJsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsssertOptions extends js.Object {
  var sanitize: js.UndefOr[js.Function1[/* str */ java.lang.String, java.lang.String]] = js.undefined
}

object AsssertOptions {
  @scala.inline
  def apply(sanitize: /* str */ java.lang.String => java.lang.String = null): AsssertOptions = {
    val __obj = js.Dynamic.literal()
    if (sanitize != null) __obj.updateDynamic("sanitize")(js.Any.fromFunction1(sanitize))
    __obj.asInstanceOf[AsssertOptions]
  }
}

