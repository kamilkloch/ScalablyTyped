package typings
package mailcheckLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def mailcheck(opts: mailcheckLib.MailcheckModuleNs.IOptions): scala.Unit
}

object JQuery {
  @scala.inline
  def apply(mailcheck: mailcheckLib.MailcheckModuleNs.IOptions => scala.Unit): JQuery = {
    val __obj = js.Dynamic.literal(mailcheck = js.Any.fromFunction1(mailcheck))
  
    __obj.asInstanceOf[JQuery]
  }
}

