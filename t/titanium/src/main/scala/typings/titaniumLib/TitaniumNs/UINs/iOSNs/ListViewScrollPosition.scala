package typings
package titaniumLib.TitaniumNs.UINs.iOSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A set of constants for the position value that can be used for the `position` property of
			 * <ListViewAnimationProperties> when invoking the ListView's `scrollToItem`, `appendSection`,
			 * `deleteSectionAt`, `insertSectionAt` and `replaceSectionAt` methods.
			 */
trait ListViewScrollPosition
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * The list view scrolls the row of interest to the bottom of the visible list view.
  				 */
  val BOTTOM: scala.Double
  /**
  				 * The list view scrolls the row of interest to the middle of the list table view.
  				 */
  val MIDDLE: scala.Double
  /**
  				 * The table view scrolls the row of interest to be fully visible with a minimal movement.
  				 * If the row is already fully visible, no scrolling occurs. For example, if the row is above the
  				 * visible area, the behavior is identical to that specified by `TOP`. This is the default.
  				 */
  val NONE: scala.Double
  /**
  				 * The list view scrolls the row of interest to the top of the visible list view.
  				 */
  val TOP: scala.Double
}

object ListViewScrollPosition {
  @scala.inline
  def apply(
    BOTTOM: scala.Double,
    MIDDLE: scala.Double,
    NONE: scala.Double,
    TOP: scala.Double,
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): ListViewScrollPosition = {
    val __obj = js.Dynamic.literal(BOTTOM = BOTTOM, MIDDLE = MIDDLE, NONE = NONE, TOP = TOP, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[ListViewScrollPosition]
  }
}

