package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardAction extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): CardAction
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): CardAction
  def setOnClickAction(action: Action): CardAction
  def setOnClickOpenLinkAction(action: Action): CardAction
  def setOpenLink(openLink: OpenLink): CardAction
  def setText(text: java.lang.String): CardAction
}

object CardAction {
  @scala.inline
  def apply(
    setAuthorizationAction: AuthorizationAction => CardAction,
    setComposeAction: (Action, ComposedEmailType) => CardAction,
    setOnClickAction: Action => CardAction,
    setOnClickOpenLinkAction: Action => CardAction,
    setOpenLink: OpenLink => CardAction,
    setText: java.lang.String => CardAction
  ): CardAction = {
    val __obj = js.Dynamic.literal(setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setComposeAction = js.Any.fromFunction2(setComposeAction), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink), setText = js.Any.fromFunction1(setText))
  
    __obj.asInstanceOf[CardAction]
  }
}

