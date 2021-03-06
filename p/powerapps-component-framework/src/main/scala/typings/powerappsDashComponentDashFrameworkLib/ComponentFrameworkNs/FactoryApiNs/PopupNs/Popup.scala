package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.FactoryApiNs.PopupNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Popup extends js.Object {
  /**
  			 * Indicates whether popup close on an outside mouse click.
  			 * When it's false, the popup will not be closed on an outside mouse click.
  			 */
  var closeOnOutsideClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * Static DOM element to be inserted
  			 */
  var content: stdLib.HTMLElement
  /**
  			 * The id to be set to the anchor control if any.
  			 */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * The name of the Popup. Used as the reference to open Popups.
  			 */
  var name: java.lang.String
  /**
  			 * The name of Popup which should be opened.
  			 * Should be defined ONLY in a Root Popup.
  			 * To open nested Popups, should be provided string like "rootName.nestedName.[allOtherNestedNames]".
  			 * To close Popups, should be provided empty string.
  			 * This prop will be automatically propagated to children.
  			 */
  var popupToOpen: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * The type of Popup, which is described in PopupType enum. Should be only one "root" Popup for each set of Popups.
  			 */
  var `type`: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.FactoryApiNs.PopupNs.TypesNs.PopupType
}

object Popup {
  @scala.inline
  def apply(
    content: stdLib.HTMLElement,
    name: java.lang.String,
    `type`: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.FactoryApiNs.PopupNs.TypesNs.PopupType,
    closeOnOutsideClick: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    popupToOpen: java.lang.String = null
  ): Popup = {
    val __obj = js.Dynamic.literal(content = content, name = name)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(closeOnOutsideClick)) __obj.updateDynamic("closeOnOutsideClick")(closeOnOutsideClick)
    if (id != null) __obj.updateDynamic("id")(id)
    if (popupToOpen != null) __obj.updateDynamic("popupToOpen")(popupToOpen)
    __obj.asInstanceOf[Popup]
  }
}

