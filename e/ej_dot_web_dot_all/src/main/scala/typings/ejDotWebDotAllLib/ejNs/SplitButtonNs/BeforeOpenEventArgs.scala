package typings
package ejDotWebDotAllLib.ejNs.SplitButtonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeOpenEventArgs extends js.Object {
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the split button model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BeforeOpenEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    `type`: java.lang.String = null
  ): BeforeOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeOpenEventArgs]
  }
}

