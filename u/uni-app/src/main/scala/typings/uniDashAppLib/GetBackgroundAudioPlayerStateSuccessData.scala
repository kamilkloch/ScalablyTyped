package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBackgroundAudioPlayerStateSuccessData extends js.Object {
  /**
    * 选定音频的播放位置（单位：s），只有在当前有音乐播放时返回
    */
  var currentPosition: js.UndefOr[scala.Double] = js.undefined
  /**
    * 歌曲数据链接，只有在当前有音乐播放时返回
    */
  var dataUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 音频的下载进度（整数，80 代表 80%），只有在当前有音乐播放时返回
    */
  var downloadPercent: js.UndefOr[scala.Double] = js.undefined
  /**
    * 选定音频的长度（单位：s），只有在当前有音乐播放时返回
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * 播放状态（2：没有音乐在播放，1：播放中，0：暂停中）
    */
  var status: js.UndefOr[scala.Double] = js.undefined
}

object GetBackgroundAudioPlayerStateSuccessData {
  @scala.inline
  def apply(
    currentPosition: scala.Int | scala.Double = null,
    dataUrl: java.lang.String = null,
    downloadPercent: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    status: scala.Int | scala.Double = null
  ): GetBackgroundAudioPlayerStateSuccessData = {
    val __obj = js.Dynamic.literal()
    if (currentPosition != null) __obj.updateDynamic("currentPosition")(currentPosition.asInstanceOf[js.Any])
    if (dataUrl != null) __obj.updateDynamic("dataUrl")(dataUrl)
    if (downloadPercent != null) __obj.updateDynamic("downloadPercent")(downloadPercent.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackgroundAudioPlayerStateSuccessData]
  }
}

