package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDocumentOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 文件路径
    */
  var filePath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 文件类型，指定文件类型打开文件，有效值 doc, xls, ppt, pdf, docx, xlsx, pptx
    */
  var fileType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object OpenDocumentOptions {
  @scala.inline
  def apply(
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    filePath: java.lang.String = null,
    fileType: java.lang.String = null,
    success: () => scala.Unit = null
  ): OpenDocumentOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (filePath != null) __obj.updateDynamic("filePath")(filePath)
    if (fileType != null) __obj.updateDynamic("fileType")(fileType)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[OpenDocumentOptions]
  }
}

