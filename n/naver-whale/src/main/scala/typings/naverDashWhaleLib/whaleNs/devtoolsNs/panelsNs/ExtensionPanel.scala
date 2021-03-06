package typings
package naverDashWhaleLib.whaleNs.devtoolsNs.panelsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionPanel extends js.Object {
  /** Fired when the user switches away from the panel. */
  var onHidden: chromeLib.chromeNs.devtoolsNs.panelsNs.PanelHiddenEvent
  /** Fired upon a search action (start of a new search, search result navigation, or search being canceled). */
  var onSearch: chromeLib.chromeNs.devtoolsNs.panelsNs.PanelSearchEvent
  /** Fired when the user switches to the panel. */
  var onShown: chromeLib.chromeNs.devtoolsNs.panelsNs.PanelShownEvent
  /**
    * Appends a button to the status bar of the panel.
    * @param iconPath Path to the icon of the button. The file should contain a 64x24-pixel image composed of two 32x24 icons. The left icon is used when the button is inactive; the right icon is displayed when the button is pressed.
    * @param tooltipText Text shown as a tooltip when user hovers the mouse over the button.
    * @param disabled Whether the button is disabled.
    */
  def createStatusBarButton(iconPath: java.lang.String, tooltipText: java.lang.String, disabled: scala.Boolean): chromeLib.chromeNs.devtoolsNs.panelsNs.Button
}

object ExtensionPanel {
  @scala.inline
  def apply(
    createStatusBarButton: (java.lang.String, java.lang.String, scala.Boolean) => chromeLib.chromeNs.devtoolsNs.panelsNs.Button,
    onHidden: chromeLib.chromeNs.devtoolsNs.panelsNs.PanelHiddenEvent,
    onSearch: chromeLib.chromeNs.devtoolsNs.panelsNs.PanelSearchEvent,
    onShown: chromeLib.chromeNs.devtoolsNs.panelsNs.PanelShownEvent
  ): ExtensionPanel = {
    val __obj = js.Dynamic.literal(createStatusBarButton = js.Any.fromFunction3(createStatusBarButton), onHidden = onHidden, onSearch = onSearch, onShown = onShown)
  
    __obj.asInstanceOf[ExtensionPanel]
  }
}

