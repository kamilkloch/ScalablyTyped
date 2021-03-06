package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptResponse extends js.Object {
  def getResponseText(): java.lang.String
  def getSelectedButton(): Button
}

object PromptResponse {
  @scala.inline
  def apply(getResponseText: () => java.lang.String, getSelectedButton: () => Button): PromptResponse = {
    val __obj = js.Dynamic.literal(getResponseText = js.Any.fromFunction0(getResponseText), getSelectedButton = js.Any.fromFunction0(getSelectedButton))
  
    __obj.asInstanceOf[PromptResponse]
  }
}

