package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UploadImageConfig extends js.Object {
  /**
           * 默认为1，显示进度提示
           */
  var isShowProgressTips: js.UndefOr[scala.Double] = js.undefined
  /**
           * 要上传的图片的本地 ID，由 chooseImage 接口获得
           */
  var localId: java.lang.String
  /**
           * res: var serverId = res.serverId;  返回图片的服务器端 ID
           */
  def success(res: js.Any): scala.Unit
}
