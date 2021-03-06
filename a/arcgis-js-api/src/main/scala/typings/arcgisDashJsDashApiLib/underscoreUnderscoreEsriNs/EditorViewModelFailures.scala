package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorViewModelFailures
  extends stdLib.Object {
  /**
    * The readonly error message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#failures)
    */
  var error: Error
}

object EditorViewModelFailures {
  @scala.inline
  def apply(
    constructor: js.Function,
    error: Error,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): EditorViewModelFailures = {
    val __obj = js.Dynamic.literal(constructor = constructor, error = error, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[EditorViewModelFailures]
  }
}

