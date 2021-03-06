package typings
package leafletDashEditableLib.leafletMod.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  /**
    * Options to pass to L.Editable when instanciating.
    */
  var editOptions: js.UndefOr[leafletDashEditableLib.leafletMod.EditOptions] = js.undefined
  /**
    * Whether to create a L.Editable instance at map init or not.
    */
  var editable: js.UndefOr[scala.Boolean] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    editOptions: leafletDashEditableLib.leafletMod.EditOptions = null,
    editable: js.UndefOr[scala.Boolean] = js.undefined
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (editOptions != null) __obj.updateDynamic("editOptions")(editOptions)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    __obj.asInstanceOf[MapOptions]
  }
}

