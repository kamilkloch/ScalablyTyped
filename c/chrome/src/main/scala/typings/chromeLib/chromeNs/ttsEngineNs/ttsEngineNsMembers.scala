package typings
package chromeLib.chromeNs.ttsEngineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.ttsEngine")
@js.native
object ttsEngineNsMembers extends js.Object {
  var onPause: chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]] = js.native
  var onResume: chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]] = js.native
  var onSpeak: TtsEngineSpeakEvent = js.native
  var onStop: chromeLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]] = js.native
}
