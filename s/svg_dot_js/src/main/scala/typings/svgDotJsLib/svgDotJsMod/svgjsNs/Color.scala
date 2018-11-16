package typings
package svgDotJsLib.svgDotJsMod.svgjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color
  extends ColorLike
     with ScalablyTyped.runtime.Instantiable0[Color]
     with ScalablyTyped.runtime.Instantiable1[/* color */ ColorAlias, Color] {
  def at(pos: scala.Double): Color = js.native
  def brightness(): scala.Double = js.native
  def morph(color: ColorAlias): Color = js.native
  def toHex(): java.lang.String = js.native
  def toRgb(): java.lang.String = js.native
}
