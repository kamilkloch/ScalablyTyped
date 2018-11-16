package typings
package speakeasyLib.speakeasyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HotpOptions extends DigestOptions {
  /**
       * The digest, automatically generated by default
       */
  var digest: js.UndefOr[nodeLib.Buffer] = js.undefined
  /**
       * The number of digits for the one-time passcode, defaults to 6
       */
  var digits: js.UndefOr[scala.Double] = js.undefined
  /**
       * @deprecated use digits
       */
  var length: js.UndefOr[scala.Double] = js.undefined
}
