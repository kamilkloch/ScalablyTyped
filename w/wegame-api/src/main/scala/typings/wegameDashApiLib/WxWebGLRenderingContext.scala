package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * IOS及安卓不支持：
 *     pixelStorei 当第一个参数是 gl.UNPACK_COLORSPACE_CONVERSION_WEBGL 时不支持
 *     compressedTexImage2D不支持
 *     compressedTexSubImage2D不支持
 * 安卓不支持：
 *     getExtension
 *     getSupportedExtensions
 */
@JSGlobal("WxWebGLRenderingContext")
@js.native
class WxWebGLRenderingContext ()
  extends stdLib.WebGLRenderingContext {
  /**
       * 将一个Canvas对应的Texture绑定到WebGL上下文。(目前该方法仅支持 iOS 6.6.6 以上版本，Android/开发者工具暂不支持。)
       *   示例：gl.wxBindCanvasTexture(gl.TEXTURE_2D, canvas)
       * @param texture WebGL的纹理类型枚举值
       * @param canvas 需要绑定为Texture的Canvas
       */
  def wxBindCanvasTexture(texture: scala.Double, canvas: Canvas): scala.Unit = js.native
}
