package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementBuilder[Placement] extends DisplayBuilder[PlacementBuilder[Placement]] {
  def withUrl(url: java.lang.String): PlacementBuilder[Placement]
}

object PlacementBuilder {
  @scala.inline
  def apply[Placement](
    build: () => AdWordsOperation[PlacementBuilder[Placement]],
    exclude: () => AdWordsOperation[PlacementBuilder[Placement]],
    withCpc: scala.Double => PlacementBuilder[Placement],
    withCpm: scala.Double => PlacementBuilder[Placement],
    withUrl: java.lang.String => PlacementBuilder[Placement]
  ): PlacementBuilder[Placement] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), exclude = js.Any.fromFunction0(exclude), withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm), withUrl = js.Any.fromFunction1(withUrl))
  
    __obj.asInstanceOf[PlacementBuilder[Placement]]
  }
}

