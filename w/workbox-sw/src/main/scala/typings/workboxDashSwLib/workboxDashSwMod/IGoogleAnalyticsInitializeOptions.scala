package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * ===== GoogleAnalyticsNamespace =====
 */


trait IGoogleAnalyticsInitializeOptions extends js.Object {
  /**
  	 * The cache name to store and retrieve analytics.js. Defaults to the cache names provided by workbox-core.
  	 */
  var cacheName: java.lang.String
  /**
  	 * Measurement Protocol parameters, expressed as key/value pairs, to be added to replayed Google Analytics requests.
  	 * This can be used to, e.g., set a custom dimension indicating that the request was replayed.
  	 */
  var parameterOverrides: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  /**
  	 * A function that allows you to modify the hit parameters prior to replaying the hit. The function is invoked with the original hit's URLSearchParams object as its only argument.
  	 * @param {URLSearchParams} params
  	 */
  def hitFilter(params: stdLib.URLSearchParams): scala.Unit
}
