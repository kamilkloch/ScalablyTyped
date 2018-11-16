package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "WebGLRenderer")
@js.native
class WebGLRenderer ()
  extends threeLib.threeDashCoreMod.WebGLRenderer {
  /**
       * parameters is an optional object with properties defining the renderer's behaviour. The constructor also accepts no parameters at all. In all cases, it will assume sane defaults when parameters are missing.
       */
  def this(parameters: threeLib.threeDashCoreMod.WebGLRendererParameters) = this()
}
