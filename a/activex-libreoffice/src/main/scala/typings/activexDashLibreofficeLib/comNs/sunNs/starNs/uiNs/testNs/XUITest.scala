package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.testNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XUITest extends js.Object {
  val TopFocusWindow: XUIObject
  def executeCommand(command: java.lang.String): scala.Unit
  def getTopFocusWindow(): XUIObject
}

object XUITest {
  @scala.inline
  def apply(
    TopFocusWindow: XUIObject,
    executeCommand: java.lang.String => scala.Unit,
    getTopFocusWindow: () => XUIObject
  ): XUITest = {
    val __obj = js.Dynamic.literal(TopFocusWindow = TopFocusWindow, executeCommand = js.Any.fromFunction1(executeCommand), getTopFocusWindow = js.Any.fromFunction0(getTopFocusWindow))
  
    __obj.asInstanceOf[XUITest]
  }
}

