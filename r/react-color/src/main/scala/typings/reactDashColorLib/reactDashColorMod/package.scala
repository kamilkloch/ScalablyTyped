package typings
package reactDashColorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashColorMod {
  type Color = java.lang.String | HSLColor | RGBColor
  type ColorChangeHandler = js.Function1[/* color */ ColorResult, scala.Unit]
}