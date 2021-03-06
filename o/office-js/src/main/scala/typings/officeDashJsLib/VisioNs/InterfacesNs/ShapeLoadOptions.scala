package typings
package officeDashJsLib.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Shape class.
  *
  * [Api set:  1.1]
  */
trait ShapeLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Shape's identifier. Read-only.
    *
    * [Api set:  1.1]
    */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Shape's name. Read-only.
    *
    * [Api set:  1.1]
    */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns true, if shape is selected. User can set true to select the shape explicitly.
    *
    * [Api set:  1.1]
    */
  var select: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Shape's text. Read-only.
    *
    * [Api set:  1.1]
    */
  var text: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the view of the shape.
    *
    * [Api set:  1.1]
    */
  var view: js.UndefOr[ShapeViewLoadOptions] = js.undefined
}

object ShapeLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    id: js.UndefOr[scala.Boolean] = js.undefined,
    name: js.UndefOr[scala.Boolean] = js.undefined,
    select: js.UndefOr[scala.Boolean] = js.undefined,
    text: js.UndefOr[scala.Boolean] = js.undefined,
    view: ShapeViewLoadOptions = null
  ): ShapeLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select)
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[ShapeLoadOptions]
  }
}

