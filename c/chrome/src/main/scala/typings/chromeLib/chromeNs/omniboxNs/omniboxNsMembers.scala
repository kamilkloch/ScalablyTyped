package typings
package chromeLib.chromeNs.omniboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.omnibox")
@js.native
object omniboxNsMembers extends js.Object {
  var onInputCancelled: OmniboxInputCancelledEvent = js.native
  var onInputChanged: OmniboxInputChangedEvent = js.native
  var onInputEntered: OmniboxInputEnteredEvent = js.native
  var onInputStarted: OmniboxInputStartedEvent = js.native
  def setDefaultSuggestion(suggestion: Suggestion): scala.Unit = js.native
}
