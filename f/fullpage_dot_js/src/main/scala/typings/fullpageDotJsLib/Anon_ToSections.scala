package typings
package fullpageDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ToSections extends js.Object {
  /**
    * Extension of fullpage.js. Requires fullpage.js >= 2.8.5.
    * Turns horizontal slides into vertical sections.
    */
  def toSections(): scala.Unit
  /**
    * Extension of fullpage.js. Requires fullpage.js >= 2.8.5.
    * Turns back the original slides (now converted into
    * vertical sections) into horizontal slides again.
    */
  def toSlides(): scala.Unit
}

object Anon_ToSections {
  @scala.inline
  def apply(toSections: () => scala.Unit, toSlides: () => scala.Unit): Anon_ToSections = {
    val __obj = js.Dynamic.literal(toSections = js.Any.fromFunction0(toSections), toSlides = js.Any.fromFunction0(toSlides))
  
    __obj.asInstanceOf[Anon_ToSections]
  }
}

