package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 确认按钮文字，默认‘取消’ */
  var cancelButtonText: java.lang.String
  /** 确认按钮文字，默认‘确定’ */
  var confirmButtonText: java.lang.String
  /** confirm框的内容 */
  var content: java.lang.String
  /** confirm框的标题 */
  var title: java.lang.String
  @JSName("success")
  def success_MConfirmOptions(result: aliDashAppLib.Anon_Confirm): scala.Unit
}

object ConfirmOptions {
  @scala.inline
  def apply(
    cancelButtonText: java.lang.String,
    confirmButtonText: java.lang.String,
    content: java.lang.String,
    success: aliDashAppLib.Anon_Confirm => scala.Unit,
    title: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null
  ): ConfirmOptions = {
    val __obj = js.Dynamic.literal(cancelButtonText = cancelButtonText, confirmButtonText = confirmButtonText, content = content, success = js.Any.fromFunction1(success), title = title)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[ConfirmOptions]
  }
}

