package typings
package chromeDashAppsLib.chromeNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The scope of the ChromeSetting. One of
  * • regular: setting for the regular profile (which is inherited by the incognito profile if not overridden elsewhere),
  * • regular_only: setting for the regular profile only (not inherited by the incognito profile),
  * • incognito_persistent: setting for the incognito profile that survives browser restarts (overrides regular preferences),
  * • incognito_session_only: setting for the incognito profile that can only be set during an incognito session and is deleted
  *     when the incognito session ends (overrides regular and incognito_persistent preferences).
  */
/* Rewritten from type alias, can be one of: 
  - chromeDashAppsLib.chromeDashAppsLibStrings.regular
  - chromeDashAppsLib.chromeDashAppsLibStrings.regular_only
  - chromeDashAppsLib.chromeDashAppsLibStrings.incognito_persistent
  - chromeDashAppsLib.chromeDashAppsLibStrings.incognito_session_only
*/
trait ChromeSettingScope extends js.Object

