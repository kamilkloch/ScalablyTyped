package typings
package ejDotWebDotAllLib.ejNs.CheckBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BeforeChangeEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the event model values
               */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the status whether the element is checked or not.
               */
  var isChecked: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the CheckBox model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}
