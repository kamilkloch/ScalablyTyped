package typings
package seleniumDashWebdriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_X extends js.Object {
  var x: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var y: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Anon_X {
  @scala.inline
  def apply(x: scala.Double | java.lang.String = null, y: scala.Double | java.lang.String = null): Anon_X = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_X]
  }
}

