package typings
package jqueryLib.JQueryNs.AjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// Writable properties on XMLHttpRequest
/* Inlined parent std.Partial<std.Pick<std.XMLHttpRequest, 'onreadystatechange' | 'responseType' | 'timeout' | 'withCredentials'>> */
trait XHRFields extends js.Object {
  var msCaching: js.UndefOr[java.lang.String] = js.undefined
  var onreadystatechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ stdLib.Event, _]) | scala.Null] = js.undefined
  var responseType: js.UndefOr[stdLib.XMLHttpRequestResponseType] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object XHRFields {
  @scala.inline
  def apply(
    msCaching: java.lang.String = null,
    onreadystatechange: js.ThisFunction1[XHRFields, /* ev */ stdLib.Event, _] = null,
    responseType: stdLib.XMLHttpRequestResponseType = null,
    timeout: scala.Int | scala.Double = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): XHRFields = {
    val __obj = js.Dynamic.literal()
    if (msCaching != null) __obj.updateDynamic("msCaching")(msCaching)
    if (onreadystatechange != null) __obj.updateDynamic("onreadystatechange")(onreadystatechange)
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[XHRFields]
  }
}

