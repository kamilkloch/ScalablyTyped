package typings
package pixiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PIXINs {
  type RendererPlugins = DefaultRendererPlugins
  type UniformDataMap[U] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof U ]: pixi.js.PIXI.UniformData<U[K]>}
    */ pixiDotJsLib.pixiDotJsLibStrings.UniformDataMap with U
  type WebGLRendererOptions = RendererOptions
}
