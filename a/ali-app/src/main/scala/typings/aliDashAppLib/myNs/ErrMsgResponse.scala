package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrMsgResponse extends js.Object {
  /** 成功：ok，错误：详细信息 */
  var errMsg: aliDashAppLib.aliDashAppLibStrings.ok | java.lang.String
}

object ErrMsgResponse {
  @scala.inline
  def apply(errMsg: aliDashAppLib.aliDashAppLibStrings.ok | java.lang.String): ErrMsgResponse = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrMsgResponse]
  }
}

