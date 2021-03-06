package typings
package typeDashFestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmailUrl extends js.Object {
  /**
  			The email address to which issues should be reported.
  			*/
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
  			The URL to the package's issue tracker.
  			*/
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EmailUrl {
  @scala.inline
  def apply(email: java.lang.String = null, url: java.lang.String = null): Anon_EmailUrl = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_EmailUrl]
  }
}

