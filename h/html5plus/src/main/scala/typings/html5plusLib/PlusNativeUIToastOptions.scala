package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，系统提示消息框要设置的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
trait PlusNativeUIToastOptions extends js.Object {
  /**
    * 提示消息框在屏幕中的水平位置
    * 可选值为"left"、"center"、"right"，分别为水平居左、居中、居右，未设置时默认值为"center"。
    * - left: 水平居左对齐
    * - center: 水平居中对齐
    * - right: 水平居左对齐
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var align: js.UndefOr[
    html5plusLib.html5plusLibStrings.left | html5plusLib.html5plusLibStrings.center | html5plusLib.html5plusLibStrings.right
  ] = js.undefined
  /**
    * 提示消息框显示的时间
    * 可选值为"long"、"short"，值为"long"时显示时间约为3.5s，值为"short"时显示时间约为2s，未设置时默认值为"short"。
    * - long: 长显示时间
    * - short: 短显示时间
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var duration: js.UndefOr[html5plusLib.html5plusLibStrings.long | html5plusLib.html5plusLibStrings.short] = js.undefined
  /**
    * 提示消息框上显示的图标
    * 仅支持本地图片路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 图标的高度
    * 单位为px（逻辑像素值），默认值为图片的高度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var iconHeight: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 图标的宽度
    * 单位为px（逻辑像素值），默认值为图片的宽度。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var iconWidth: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 富文本样式
    * 当type属性值为"richtext"时有效，用于定义富文本的样式，如其文本对齐方式、使用的字体等。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var richTextStyle: js.UndefOr[PlusNativeObjRichTextStyles] = js.undefined
  /**
    * 提示消息框上显示的样式
    * 可取值：
    * 	"block"表示图标与文字分两行显示，上面显示图标，下面显示文字；
    * 	"inline"表示图标与文字在同一行显示，左边显示图标，右边显示文字。
    * 	默认值为"block"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 提示消息框上显示的文本类型
    * 可取值：
    * 		"text" - 显示的消息内容为文本字符串；
    * 		"richtext" - 显示的消息内容为富文本内容。
    * 	默认值为"text"。
    * 	当type为"text"时，富文本使用html的部分标签，具体标签如下：
    * 	图片标签&lt;img src="图片资源url地址" width="图片显示的宽度" height="图片显示的高度" onclick="console.log('clicked img')"&gt;&lt;/img&gt;；
    * 	字体标签&lt;font color="字体颜色"&gt;&lt;/font&gt;，内容在一行显示不下时自动换行，行高默认为字体的1.2倍；
    * 	换行标签&lt;br/&gt;；
    * 	链接标签&lt;a onclick="console.log('clicked a')"&gt;链接地址&lt;/a&gt;。
    * 	如示例“&lt;img onclick="console.log('clicked img')" src="http://img-cdn-qiniu.dcloud.net.cn/icon2.png"/&gt;&lt;a onclick="console.log(clicked a)"&gt;链接地址&lt;/a&gt;”。
    * - text: 文本字符串
    * - richtext: 富文本内容
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var `type`: js.UndefOr[
    html5plusLib.html5plusLibStrings.text | html5plusLib.html5plusLibStrings.richtext
  ] = js.undefined
  /**
    * 提示消息在屏幕中的垂直位置
    * 可选值为"top"、"center"、"bottom"，分别为垂直居顶、居中、居底，未设置时默认值为"bottom"。
    * - top: 垂直居顶对齐
    * - center: 垂直居中对齐
    * - bottom: 垂直居底对齐
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var verticalAlign: js.UndefOr[
    html5plusLib.html5plusLibStrings.top | html5plusLib.html5plusLibStrings.center | html5plusLib.html5plusLibStrings.bottom
  ] = js.undefined
}

object PlusNativeUIToastOptions {
  @scala.inline
  def apply(
    align: html5plusLib.html5plusLibStrings.left | html5plusLib.html5plusLibStrings.center | html5plusLib.html5plusLibStrings.right = null,
    duration: html5plusLib.html5plusLibStrings.long | html5plusLib.html5plusLibStrings.short = null,
    icon: java.lang.String = null,
    iconHeight: java.lang.String = null,
    iconWidth: java.lang.String = null,
    richTextStyle: PlusNativeObjRichTextStyles = null,
    style: java.lang.String = null,
    `type`: html5plusLib.html5plusLibStrings.text | html5plusLib.html5plusLibStrings.richtext = null,
    verticalAlign: html5plusLib.html5plusLibStrings.top | html5plusLib.html5plusLibStrings.center | html5plusLib.html5plusLibStrings.bottom = null
  ): PlusNativeUIToastOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconHeight != null) __obj.updateDynamic("iconHeight")(iconHeight)
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth)
    if (richTextStyle != null) __obj.updateDynamic("richTextStyle")(richTextStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusNativeUIToastOptions]
  }
}

