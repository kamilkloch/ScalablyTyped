package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NormalMap extends js.Object {
  var normalMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  var normalScale: threeLib.srcRenderersShadersUniformsLibMod.IUniform
}

object Anon_NormalMap {
  @scala.inline
  def apply(
    normalMap: threeLib.srcRenderersShadersUniformsLibMod.IUniform,
    normalScale: threeLib.srcRenderersShadersUniformsLibMod.IUniform
  ): Anon_NormalMap = {
    val __obj = js.Dynamic.literal(normalMap = normalMap, normalScale = normalScale)
  
    __obj.asInstanceOf[Anon_NormalMap]
  }
}

