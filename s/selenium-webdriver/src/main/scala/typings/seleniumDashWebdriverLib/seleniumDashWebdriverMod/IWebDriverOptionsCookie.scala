package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IWebDriverOptionsCookie extends js.Object {
  /**
     * The domain the cookie is visible to. Defaults to the current browsing
     * context's document's URL when adding a cookie.
     */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
     * When the cookie expires.
     *
     * When {@linkplain Options#addCookie() adding a cookie}, this may be specified
     * in _seconds_ since Unix epoch (January 1, 1970). The expiry will default to
     * 20 years in the future if omitted.
     *
     * The expiry is always returned in seconds since epoch when
     * {@linkplain Options#getCookies() retrieving cookies} from the browser.
     *
     * @type {(!Date|number|undefined)}
     */
  var expiry: js.UndefOr[scala.Double | stdLib.Date] = js.undefined
  /**
     * Whether the cookie is an HTTP only cookie. Defaults to false when adding a
     * new cookie.
     */
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * The name of the cookie.
     */
  var name: java.lang.String
  /**
     * The cookie path. Defaults to "/" when adding a cookie.
     */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Whether the cookie is a secure cookie. Defaults to false when adding a new
     * cookie.
     */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * The cookie value.
     */
  var value: java.lang.String
}
