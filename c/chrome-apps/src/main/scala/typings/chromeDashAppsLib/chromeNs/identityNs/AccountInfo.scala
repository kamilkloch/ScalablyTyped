package typings
package chromeDashAppsLib.chromeNs.identityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since Chrome 32. */
trait AccountInfo extends js.Object {
  /**
    * A unique identifier for the account.
    * This ID will not change for the lifetime of the account.
    */
  var id: java.lang.String
}

object AccountInfo {
  @scala.inline
  def apply(id: java.lang.String): AccountInfo = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[AccountInfo]
  }
}

