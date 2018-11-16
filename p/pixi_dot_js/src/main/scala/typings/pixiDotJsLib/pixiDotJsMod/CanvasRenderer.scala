package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "CanvasRenderer")
@js.native
class CanvasRenderer ()
  extends pixiDotJsLib.PIXINs.CanvasRenderer {
  // plugintarget mixin end
  def this(options: pixiDotJsLib.PIXINs.RendererOptions) = this()
  def this(screenWidth: scala.Double) = this()
  def this(screenWidth: scala.Double, screenHeight: scala.Double) = this()
  def this(screenWidth: scala.Double, screenHeight: scala.Double, options: pixiDotJsLib.PIXINs.RendererOptions) = this()
}

@JSImport("pixi.js", "CanvasRenderer")
@js.native
object CanvasRenderer extends js.Object {
  // plugintarget mixin start
  var __plugins: ScalablyTyped.runtime.StringDictionary[pixiDotJsLib.Anon_Renderer] = js.native
  def registerPlugin(pluginName: java.lang.String, ctor: pixiDotJsLib.Anon_Renderer): scala.Unit = js.native
}
