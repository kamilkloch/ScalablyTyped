package typings
package umbracoLib.umbracoNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.sectionResource
  * @description Loads in data for section
  **/
trait ISectionResource extends js.Object {
  /** Loads in the data to display the section list */
  def getSections(): scala.Unit
}

object ISectionResource {
  @scala.inline
  def apply(getSections: () => scala.Unit): ISectionResource = {
    val __obj = js.Dynamic.literal(getSections = js.Any.fromFunction0(getSections))
  
    __obj.asInstanceOf[ISectionResource]
  }
}

