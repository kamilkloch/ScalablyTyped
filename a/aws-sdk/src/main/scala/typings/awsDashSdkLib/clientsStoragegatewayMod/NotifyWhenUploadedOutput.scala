package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyWhenUploadedOutput extends js.Object {
  var FileShareARN: js.UndefOr[FileShareARN] = js.undefined
  var NotificationId: js.UndefOr[NotificationId] = js.undefined
}

object NotifyWhenUploadedOutput {
  @scala.inline
  def apply(FileShareARN: FileShareARN = null, NotificationId: NotificationId = null): NotifyWhenUploadedOutput = {
    val __obj = js.Dynamic.literal()
    if (FileShareARN != null) __obj.updateDynamic("FileShareARN")(FileShareARN)
    if (NotificationId != null) __obj.updateDynamic("NotificationId")(NotificationId)
    __obj.asInstanceOf[NotifyWhenUploadedOutput]
  }
}

