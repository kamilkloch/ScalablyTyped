package typings
package oclazyloadLib.oclazyloadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IProviderConfig extends js.Object {
  /**
       * If true, all errors will be logged to the console, in addition to rejecting a promise. Defaults to false.
       */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true, an event will be broadcast whenever a module, component or file is loaded. Events that can be broadcast are: ocLazyLoad.moduleLoaded,
       * ocLazyLoad.moduleReloaded, ocLazyLoad.componentLoaded, ocLazyLoad.fileLoaded. Defaults to false.
       */
  var events: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Predefines a set of module configurations for later use. A name must be provided for each module so that it can be retrieved later.
       */
  var modules: js.UndefOr[js.Array[IModuleConfig]] = js.undefined
}
