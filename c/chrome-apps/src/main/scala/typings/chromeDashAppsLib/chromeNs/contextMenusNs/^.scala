package typings
package chromeDashAppsLib.chromeNs.contextMenusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.contextMenus")
@js.native
object ^ extends js.Object {
  /**
    * @since Chrome 38.
    * @default 6
    * @description
    * The maximum number of top level extension items that
    * can be added to an app's action context menu.
    * Any items beyond this limit will be ignored.
    */
  val ACTION_MENU_TOP_LEVEL_LIMIT: chromeDashAppsLib.chromeNs.integer = js.native
  /** Fired when a context menu item is clicked. */
  val onClicked: MenuClickedEvent = js.native
  /**
    * Creates a new context menu item. Note that if an error occurs during creation, you may not find out until the creation callback fires (the details will be in chrome.runtime.lastError).
    * @param callback Called when the item has been created in the browser. If there were any problems creating the item, details will be available in chrome.runtime.lastError.
    */
  def create(createProperties: CreateProperties): scala.Unit = js.native
  def create(createProperties: CreateProperties, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Removes a context menu item.
    * @param menuItemId The ID of the context menu item to remove.
    * @param callback Called when the context menu has been removed.
    */
  def remove(menuItemId: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  def remove(menuItemId: chromeDashAppsLib.chromeNs.integer, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def remove(menuItemId: java.lang.String): scala.Unit = js.native
  def remove(menuItemId: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Removes all context menu items added by this app.
    * @param callback Called when removal is complete.
    */
  def removeAll(): scala.Unit = js.native
  def removeAll(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Updates a previously created context menu item.
    * @param id The ID of the item to update.
    * @param updateProperties The properties to update. Accepts the same values as the create function.
    * @param callback Called when the context menu has been updated.
    */
  def update(id: chromeDashAppsLib.chromeNs.integer, updateProperties: UpdateProperties): scala.Unit = js.native
  def update(
    id: chromeDashAppsLib.chromeNs.integer,
    updateProperties: UpdateProperties,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def update(id: java.lang.String, updateProperties: UpdateProperties): scala.Unit = js.native
  def update(id: java.lang.String, updateProperties: UpdateProperties, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

