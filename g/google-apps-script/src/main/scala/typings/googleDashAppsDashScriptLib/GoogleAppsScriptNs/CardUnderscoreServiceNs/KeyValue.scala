package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyValue extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): KeyValue
  def setBottomLabel(text: java.lang.String): KeyValue
  def setButton(button: Button): KeyValue
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): KeyValue
  def setContent(text: java.lang.String): KeyValue
  def setIcon(icon: Icon): KeyValue
  def setIconAltText(altText: java.lang.String): KeyValue
  def setIconUrl(url: java.lang.String): KeyValue
  def setMultiline(multiline: scala.Boolean): KeyValue
  def setOnClickAction(action: Action): KeyValue
  def setOnClickOpenLinkAction(action: Action): KeyValue
  def setOpenLink(openLink: OpenLink): KeyValue
  def setSwitch(switchToSet: Switch): KeyValue
  def setTopLabel(text: java.lang.String): KeyValue
}

object KeyValue {
  @scala.inline
  def apply(
    setAuthorizationAction: AuthorizationAction => KeyValue,
    setBottomLabel: java.lang.String => KeyValue,
    setButton: Button => KeyValue,
    setComposeAction: (Action, ComposedEmailType) => KeyValue,
    setContent: java.lang.String => KeyValue,
    setIcon: Icon => KeyValue,
    setIconAltText: java.lang.String => KeyValue,
    setIconUrl: java.lang.String => KeyValue,
    setMultiline: scala.Boolean => KeyValue,
    setOnClickAction: Action => KeyValue,
    setOnClickOpenLinkAction: Action => KeyValue,
    setOpenLink: OpenLink => KeyValue,
    setSwitch: Switch => KeyValue,
    setTopLabel: java.lang.String => KeyValue
  ): KeyValue = {
    val __obj = js.Dynamic.literal(setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setBottomLabel = js.Any.fromFunction1(setBottomLabel), setButton = js.Any.fromFunction1(setButton), setComposeAction = js.Any.fromFunction2(setComposeAction), setContent = js.Any.fromFunction1(setContent), setIcon = js.Any.fromFunction1(setIcon), setIconAltText = js.Any.fromFunction1(setIconAltText), setIconUrl = js.Any.fromFunction1(setIconUrl), setMultiline = js.Any.fromFunction1(setMultiline), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink), setSwitch = js.Any.fromFunction1(setSwitch), setTopLabel = js.Any.fromFunction1(setTopLabel))
  
    __obj.asInstanceOf[KeyValue]
  }
}

