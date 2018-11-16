package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DownloadTask")
@js.native
class DownloadTask () extends js.Object {
  /**
       * 中断下载任务
       */
  def abort(): scala.Unit = js.native
  /**
       * 监听下载进度变化事件
       * @param res.progress 下载进度百分比
       * @param res.totalBytesWritten 已经下载的数据长度，单位 Bytes
       * @param res.totalBytesExpectedToWrite 预期需要下载的数据总长度，单位 Bytes
       */
  def onProgressUpdate(callback: Anon_Res): scala.Unit = js.native
}
