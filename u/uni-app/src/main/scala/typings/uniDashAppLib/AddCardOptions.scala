package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCardOptions extends js.Object {
  /**
    * 需要添加的卡券列表
    */
  var cardList: js.UndefOr[js.Array[AddCardData]] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ AddCardRes, scala.Unit]] = js.undefined
}

object AddCardOptions {
  @scala.inline
  def apply(
    cardList: js.Array[AddCardData] = null,
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    success: /* result */ AddCardRes => scala.Unit = null
  ): AddCardOptions = {
    val __obj = js.Dynamic.literal()
    if (cardList != null) __obj.updateDynamic("cardList")(cardList)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AddCardOptions]
  }
}

