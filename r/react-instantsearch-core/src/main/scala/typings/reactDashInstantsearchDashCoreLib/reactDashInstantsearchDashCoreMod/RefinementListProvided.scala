package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RefinementListProvided extends js.Object {
  /** the refinement currently applied */
  var currentRefinement: js.Array[java.lang.String]
  /** a boolean that says if the items props contains facet values from the global search or from the search inside items. */
  var isFromSearch: scala.Boolean
  /** the list of items the RefinementList can display. */
  var items: js.Array[Hit[reactDashInstantsearchDashCoreLib.Anon_Count]]
  /** a function to generate a URL for the corresponding search state */
  def createURL(args: js.Any*): js.Any
  /** a function to toggle a refinement */
  def refine(args: js.Any*): js.Any
  /** a function to toggle a search inside items values */
  def searchForItems(args: js.Any*): js.Any
}
