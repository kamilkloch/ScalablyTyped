package typings
package seleniumDashWebdriverLib.ieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/ie", "Driver")
@js.native
class Driver ()
  extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver {
  /**
    * This function is a no-op as file detectors are not supported by this
    * implementation.
    * @override
    */
  def setFileDetector(): scala.Unit = js.native
}

/* static members */
@JSImport("selenium-webdriver/ie", "Driver")
@js.native
object Driver extends js.Object {
  /**
    * Creates a new session for Microsoft's Internet Explorer.
    *
    * @param {(capabilities.Capabilities|Options)=} opt_config The configuration
    *     options.
    * @return {!Driver} A new driver instance.
    */
  def createSession(): seleniumDashWebdriverLib.ieMod.Driver = js.native
  def createSession(opt_config: seleniumDashWebdriverLib.ieMod.Options): seleniumDashWebdriverLib.ieMod.Driver = js.native
  def createSession(opt_config: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities): seleniumDashWebdriverLib.ieMod.Driver = js.native
}

