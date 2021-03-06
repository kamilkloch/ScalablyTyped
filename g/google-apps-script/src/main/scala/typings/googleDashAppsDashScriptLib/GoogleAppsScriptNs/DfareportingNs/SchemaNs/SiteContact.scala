package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteContact extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var contactType: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var firstName: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var lastName: js.UndefOr[java.lang.String] = js.undefined
  var phone: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object SiteContact {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    contactType: java.lang.String = null,
    email: java.lang.String = null,
    firstName: java.lang.String = null,
    id: java.lang.String = null,
    lastName: java.lang.String = null,
    phone: java.lang.String = null,
    title: java.lang.String = null
  ): SiteContact = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (contactType != null) __obj.updateDynamic("contactType")(contactType)
    if (email != null) __obj.updateDynamic("email")(email)
    if (firstName != null) __obj.updateDynamic("firstName")(firstName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastName != null) __obj.updateDynamic("lastName")(lastName)
    if (phone != null) __obj.updateDynamic("phone")(phone)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SiteContact]
  }
}

