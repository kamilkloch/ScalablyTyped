package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavefileParams extends js.Object {
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsg, scala.Unit]] = js.undefined
  var filePath: js.UndefOr[java.lang.String] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ wegameDashApiLib.Anon_SavedFilePath, scala.Unit]] = js.undefined
  var tempFilePath: java.lang.String
}

object SavefileParams {
  @scala.inline
  def apply(
    tempFilePath: java.lang.String,
    complete: () => scala.Unit = null,
    fail: /* res */ wegameDashApiLib.Anon_ErrMsg => scala.Unit = null,
    filePath: java.lang.String = null,
    success: /* res */ wegameDashApiLib.Anon_SavedFilePath => scala.Unit = null
  ): SavefileParams = {
    val __obj = js.Dynamic.literal(tempFilePath = tempFilePath)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (filePath != null) __obj.updateDynamic("filePath")(filePath)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SavefileParams]
  }
}

