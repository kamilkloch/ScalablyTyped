package typings
package protractorLib.builtPtorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/ptor", "Ptor")
@js.native
class Ptor () extends js.Object {
  var Actions: org.scalablytyped.runtime.Instantiable1[
    /* executor */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.Executor, 
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.Actions
  ] = js.native
  var Browser: seleniumDashWebdriverLib.seleniumDashWebdriverMod.IBrowser = js.native
  var Builder: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.Builder] = js.native
  var Button: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof webdriver.Button */ js.Any = js.native
  var By: protractorLib.builtLocatorsMod.ProtractorBy = js.native
  var Capabilities: protractorLib.Anon_Android = js.native
  var Capability: seleniumDashWebdriverLib.seleniumDashWebdriverMod.ICapability = js.native
  var Command: org.scalablytyped.runtime.Instantiable1[/* name */ java.lang.String, seleniumDashWebdriverLib.libCommandMod.Command] = js.native
  var CommandName: seleniumDashWebdriverLib.libCommandMod.ICommandName = js.native
  var ElementArrayFinder: js.Any = js.native
  var ElementFinder: js.Any = js.native
  var EventEmitter: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.EventEmitter] = js.native
  var ExpectedConditions: protractorLib.builtExpectedConditionsMod.ProtractorExpectedConditions = js.native
  var FileDetector: org.scalablytyped.runtime.Instantiable0[seleniumDashWebdriverLib.seleniumDashWebdriverMod.FileDetector] = js.native
  var Key: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_./selenium-webdriver/lib/input.IKey */ js.Any = js.native
  var ProtractorBrowser: js.Any = js.native
  var ProtractorBy: js.Any = js.native
  var ProtractorExpectedConditions: js.Any = js.native
  var Session: org.scalablytyped.runtime.Instantiable2[
    /* id */ java.lang.String, 
    /* capabilities */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities, 
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.Session
  ] = js.native
  var WebDriver: protractorLib.Anon_CreateSession = js.native
  var WebElement: protractorLib.Anon_A = js.native
  var WebElementPromise: org.scalablytyped.runtime.Instantiable2[
    /* driver */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, 
    /* el */ js.Promise[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement], 
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementPromise
  ] = js.native
  var browser: protractorLib.builtBrowserMod.ProtractorBrowser = js.native
  var by: protractorLib.builtLocatorsMod.ProtractorBy = js.native
  @JSName("element")
  var element_Original: protractorLib.builtBrowserMod.ElementHelper = js.native
  var error: protractorLib.Anon_CheckLegacyResponse = js.native
  var logging: protractorLib.Anon_AddConsoleHandler = js.native
  var promise: protractorLib.Anon_Arr = js.native
  var until: protractorLib.Anon_AbleToSwitchToFrame = js.native
  var utils: protractorLib.Anon_Chrome = js.native
  @JSName("$")
  def $(search: java.lang.String): protractorLib.builtElementMod.ElementFinder = js.native
  @JSName("$$")
  def $$(search: java.lang.String): protractorLib.builtElementMod.ElementArrayFinder = js.native
  def element(locator: protractorLib.builtLocatorsMod.Locator): protractorLib.builtElementMod.ElementFinder = js.native
  def wrapDriver(webdriver: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver): protractorLib.builtBrowserMod.ProtractorBrowser = js.native
  def wrapDriver(webdriver: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, baseUrl: java.lang.String): protractorLib.builtBrowserMod.ProtractorBrowser = js.native
  def wrapDriver(
    webdriver: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver,
    baseUrl: java.lang.String,
    rootElement: java.lang.String
  ): protractorLib.builtBrowserMod.ProtractorBrowser = js.native
  def wrapDriver(
    webdriver: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver,
    baseUrl: java.lang.String,
    rootElement: java.lang.String,
    untrackOutstandingTimeouts: scala.Boolean
  ): protractorLib.builtBrowserMod.ProtractorBrowser = js.native
}

