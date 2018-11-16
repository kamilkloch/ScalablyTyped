package typings
package expectDashPuppeteerLib.expectDashPuppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpectPuppeteer extends js.Object {
  // These must all match the ExpectPuppeteer interface above.
  // We can't extend from it directly because some method names conflict in type-incompatible ways.
  def toClick(selector: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  // These must all match the ExpectPuppeteer interface above.
  // We can't extend from it directly because some method names conflict in type-incompatible ways.
  def toClick(selector: java.lang.String, options: ExpectToClickOptions): stdLib.Promise[scala.Unit] = js.native
  def toDisplayDialog(block: js.Function0[stdLib.Promise[scala.Unit]]): stdLib.Promise[puppeteerLib.puppeteerMod.Dialog] = js.native
  def toFill(selector: java.lang.String, value: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def toFill(selector: java.lang.String, value: java.lang.String, options: ExpectTimingActions): stdLib.Promise[scala.Unit] = js.native
  def toMatch(selector: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def toMatch(selector: java.lang.String, options: ExpectTimingActions): stdLib.Promise[scala.Unit] = js.native
  def toMatchElement(selector: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def toMatchElement(selector: java.lang.String, options: ExpectToClickOptions): stdLib.Promise[scala.Unit] = js.native
  def toSelect(selector: java.lang.String, valueOrText: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def toSelect(selector: java.lang.String, valueOrText: java.lang.String, options: ExpectTimingActions): stdLib.Promise[scala.Unit] = js.native
  def toUploadFile(selector: java.lang.String, filePath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def toUploadFile(selector: java.lang.String, filePath: java.lang.String, options: ExpectTimingActions): stdLib.Promise[scala.Unit] = js.native
}
