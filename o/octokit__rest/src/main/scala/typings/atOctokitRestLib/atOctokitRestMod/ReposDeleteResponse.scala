package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteResponse extends js.Object {
  var documentation_url: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object ReposDeleteResponse {
  @scala.inline
  def apply(documentation_url: java.lang.String = null, message: java.lang.String = null): ReposDeleteResponse = {
    val __obj = js.Dynamic.literal()
    if (documentation_url != null) __obj.updateDynamic("documentation_url")(documentation_url)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ReposDeleteResponse]
  }
}

