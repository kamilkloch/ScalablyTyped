package typings
package chromeLib.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.Error")
@js.native
class Error protected () extends js.Object {
  /**
           * @param {!chrome.cast.ErrorCode} code
           * @param {string=} opt_description
           * @param {Object=} opt_details
           * @constructor
           * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Error
           */
  def this(code: ErrorCode) = this()
  /**
           * @param {!chrome.cast.ErrorCode} code
           * @param {string=} opt_description
           * @param {Object=} opt_details
           * @constructor
           * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Error
           */
  def this(code: ErrorCode, description: java.lang.String) = this()
  /**
           * @param {!chrome.cast.ErrorCode} code
           * @param {string=} opt_description
           * @param {Object=} opt_details
           * @constructor
           * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Error
           */
  def this(code: ErrorCode, description: java.lang.String, details: js.Object) = this()
  var code: ErrorCode = js.native
  var description: js.UndefOr[java.lang.String] = js.native
  var details: js.UndefOr[java.lang.String] = js.native
}
