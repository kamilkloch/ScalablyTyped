package typings
package saslDashDigestDashMd5Lib.saslDashDigestDashMd5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var genNonce: js.UndefOr[js.Function0[scala.Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(genNonce: () => scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (genNonce != null) __obj.updateDynamic("genNonce")(js.Any.fromFunction0(genNonce))
    __obj.asInstanceOf[Options]
  }
}

