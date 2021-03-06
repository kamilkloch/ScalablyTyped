package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  def setAltText(altText: java.lang.String): Image
  def setAuthorizationAction(action: AuthorizationAction): Image
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): Image
  def setImageUrl(url: java.lang.String): Image
  def setOnClickAction(action: Action): Image
  def setOnClickOpenLinkAction(action: Action): Image
  def setOpenLink(openLink: OpenLink): Image
}

object Image {
  @scala.inline
  def apply(
    setAltText: java.lang.String => Image,
    setAuthorizationAction: AuthorizationAction => Image,
    setComposeAction: (Action, ComposedEmailType) => Image,
    setImageUrl: java.lang.String => Image,
    setOnClickAction: Action => Image,
    setOnClickOpenLinkAction: Action => Image,
    setOpenLink: OpenLink => Image
  ): Image = {
    val __obj = js.Dynamic.literal(setAltText = js.Any.fromFunction1(setAltText), setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setComposeAction = js.Any.fromFunction2(setComposeAction), setImageUrl = js.Any.fromFunction1(setImageUrl), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink))
  
    __obj.asInstanceOf[Image]
  }
}

