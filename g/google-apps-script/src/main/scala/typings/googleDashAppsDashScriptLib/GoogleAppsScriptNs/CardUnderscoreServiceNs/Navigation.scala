package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigation extends js.Object {
  def popCard(): Navigation
  def popToNamedCard(cardName: java.lang.String): Navigation
  def popToRoot(): Navigation
  def printJson(): java.lang.String
  def pushCard(card: Card): Navigation
  def updateCard(card: Card): Navigation
}

object Navigation {
  @scala.inline
  def apply(
    popCard: () => Navigation,
    popToNamedCard: java.lang.String => Navigation,
    popToRoot: () => Navigation,
    printJson: () => java.lang.String,
    pushCard: Card => Navigation,
    updateCard: Card => Navigation
  ): Navigation = {
    val __obj = js.Dynamic.literal(popCard = js.Any.fromFunction0(popCard), popToNamedCard = js.Any.fromFunction1(popToNamedCard), popToRoot = js.Any.fromFunction0(popToRoot), printJson = js.Any.fromFunction0(printJson), pushCard = js.Any.fromFunction1(pushCard), updateCard = js.Any.fromFunction1(updateCard))
  
    __obj.asInstanceOf[Navigation]
  }
}

