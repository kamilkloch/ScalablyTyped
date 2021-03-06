package typings
package titaniumLib.TitaniumNs.UINs.iPhoneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for creating standard iOS system buttons.
			 */
@JSGlobal("Titanium.UI.iPhone.SystemButton")
@js.native
object SystemButtonNs extends js.Object {
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Action** button.
  				 */
  val ACTION: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to create an activity indicator that
  				 * can be used in navigation bars and toolbars.
  				 */
  val ACTIVITY: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Add** button.
  				 */
  val ADD: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Bookmarks** button.
  				 */
  val BOOKMARKS: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Camera** button.
  				 */
  val CAMERA: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Cancel** button.
  				 */
  val CANCEL: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Compose** button.
  				 */
  val COMPOSE: scala.Double = js.native
  /**
  				 * Use with [Button.style](Titanium.UI.Button.style) to specify a **ContactAdd** button.
  				 */
  val CONTACT_ADD: scala.Double = js.native
  /**
  				 * Use with [Button.style](Titanium.UI.Button.style) to specify a **Disclosure** button.
  				 */
  val DISCLOSURE: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Done** button.
  				 */
  val DONE: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Edit** button.
  				 */
  val EDIT: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Fast Forward** button.
  				 */
  val FAST_FORWARD: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to create a fixed-width blank space
  				 * for spacing items in toolbars.
  				 */
  val FIXED_SPACE: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to create a flexible blank space
  				 * for spacing items in toolbars.
  				 */
  val FLEXIBLE_SPACE: scala.Double = js.native
  /**
  				 * Use with [Button.style](Titanium.UI.Button.style) to specify a dark-colored **Info** button.
  				 */
  val INFO_DARK: scala.Double = js.native
  /**
  				 * Use with [Button.style](Titanium.UI.Button.style) to specify a light-colored **Info** button.
  				 */
  val INFO_LIGHT: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify an **Organize** button.
  				 */
  val ORGANIZE: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Pause** button.
  				 */
  val PAUSE: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Play** button.
  				 */
  val PLAY: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Refresh** button.
  				 */
  val REFRESH: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Reply** button.
  				 */
  val REPLY: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Rewind** button.
  				 */
  val REWIND: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Save** button.
  				 */
  val SAVE: scala.Double = js.native
  /**
  				 * Identical to [ACTIVITY](Titanium.UI.iPhone.SystemButton.ACTIVITY).
  				 */
  val SPINNER: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Stop** button.
  				 */
  val STOP: scala.Double = js.native
  /**
  				 * Use with [Button.systemButton](Titanium.UI.Button.systemButton) to specify a **Trash** button.
  				 */
  val TRASH: scala.Double = js.native
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: java.lang.String = js.native
  /**
  				 * Indicates if the proxy will bubble an event to its parent.
  				 */
  var bubbleParent: scala.Boolean = js.native
  /**
  				 * Adds the specified callback as an event listener for the named event.
  				 */
  def addEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  				 * Applies the properties to the proxy.
  				 */
  def applyProperties(props: js.Any): scala.Unit = js.native
  /**
  				 * Fires a synthesized event to any registered listeners.
  				 */
  def fireEvent(name: java.lang.String, event: js.Any): scala.Unit = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.SystemButton.apiName> property.
  				 */
  def getApiName(): java.lang.String = js.native
  /**
  				 * Gets the value of the <Titanium.UI.iPhone.SystemButton.bubbleParent> property.
  				 */
  def getBubbleParent(): scala.Boolean = js.native
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: java.lang.String, callback: js.Function1[/* param0 */ js.Any, _]): scala.Unit = js.native
  /**
  				 * Sets the value of the <Titanium.UI.iPhone.SystemButton.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: scala.Boolean): scala.Unit = js.native
}

