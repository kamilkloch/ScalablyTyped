package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoSearchProvided[THit] extends js.Object {
  /** the refinement currently applied */
  var currentRefinement: NESW
  /** the records that matched the search */
  var hits: js.Array[THit]
  /** true if the current refinement is set with the map bounds */
  var isRefinedWithMap: scala.Boolean
  /** the position of the search */
  var position: reactDashInstantsearchDashCoreLib.Anon_Lat
  /** a function to generate a URL for the corresponding search state */
  def createURL(args: js.Any*): js.Any
  /** a function to toggle the refinement */
  def refine(refinement: NESW): scala.Unit
}

object GeoSearchProvided {
  @scala.inline
  def apply[THit](
    createURL: /* repeated */ js.Any => js.Any,
    currentRefinement: NESW,
    hits: js.Array[THit],
    isRefinedWithMap: scala.Boolean,
    position: reactDashInstantsearchDashCoreLib.Anon_Lat,
    refine: NESW => scala.Unit
  ): GeoSearchProvided[THit] = {
    val __obj = js.Dynamic.literal(createURL = js.Any.fromFunction1(createURL), currentRefinement = currentRefinement, hits = hits, isRefinedWithMap = isRefinedWithMap, position = position, refine = js.Any.fromFunction1(refine))
  
    __obj.asInstanceOf[GeoSearchProvided[THit]]
  }
}

