package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Property dialog options object
    */

trait IPropertyDialogOptions extends js.Object {
  /*callback function*/
  var callback: js.Function
  /*editor to use to edit a given value and return on callback*/
  var editor: java.lang.String
  /*value sent to the property editor*/
  var value: js.Object
}
