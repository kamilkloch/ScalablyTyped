package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 一组用于定义页面或控件变形的属性
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewTransform extends js.Object {
  /**
    * 暂不支持
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var matrix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 暂不支持
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var rotate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 暂不支持
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var scale: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 暂不支持
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var skew: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 暂不支持
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var translate: js.UndefOr[java.lang.String] = js.undefined
}

object PlusWebviewWebviewTransform {
  @scala.inline
  def apply(
    matrix: java.lang.String = null,
    rotate: java.lang.String = null,
    scale: java.lang.String = null,
    skew: java.lang.String = null,
    translate: java.lang.String = null
  ): PlusWebviewWebviewTransform = {
    val __obj = js.Dynamic.literal()
    if (matrix != null) __obj.updateDynamic("matrix")(matrix)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate)
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (skew != null) __obj.updateDynamic("skew")(skew)
    if (translate != null) __obj.updateDynamic("translate")(translate)
    __obj.asInstanceOf[PlusWebviewWebviewTransform]
  }
}

