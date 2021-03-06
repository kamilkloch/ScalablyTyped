package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the CompositionStarted event. */
@JSGlobal("Windows.UI.Text.Core.CoreTextCompositionStartedEventArgs")
@js.native
abstract class CoreTextCompositionStartedEventArgs () extends js.Object {
  /** Gets a value that indicates whether the operation is canceled. */
  var isCanceled: scala.Boolean = js.native
  /**
    * Requests that the operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): winrtDashUwpLib.WindowsNs.FoundationNs.Deferral = js.native
}

