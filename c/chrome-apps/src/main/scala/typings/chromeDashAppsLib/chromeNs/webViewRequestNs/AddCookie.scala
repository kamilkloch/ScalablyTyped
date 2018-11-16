package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * @private
         * @template T Type of cookie
         */

trait AddCookie[T] extends js.Object {
  /**
               * Cookie to be added to the request.
               * No field may be undefined.
               * The name and value need to be specified.
               */
  var cookie: T
}
