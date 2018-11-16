package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/AppInfo.html
	 */
@JSGlobal("AppInfo")
@js.native
class AppInfo () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppInfo.html#method_getAppDeveloper
  		 */
  def getAppDeveloper(): User = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppInfo.html#method_getAppId
  		 */
  def getAppId(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppInfo.html#method_getAppKey
  		 */
  def getAppKey(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppInfo.html#method_getAppManagers
  		 */
  def getAppManagers(): js.Array[User] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppInfo.html#method_getAppName
  		 */
  def getAppName(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppInfo.html#method_getAppUid
  		 */
  def getAppUid(): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppInfo.html#method_getAppVersion
  		 */
  def getAppVersion(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppInfo.html#method_getMaxPayoutKnuddelAmount
  		 */
  def getMaxPayoutKnuddelAmount(): KnuddelAmount = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppInfo.html#method_getRootAppUid
  		 */
  def getRootAppUid(): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppInfo.html#method_getTaxRate
  		 */
  def getTaxRate(): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppInfo.html#method_getTotalTaxKnuddelAmount
  		 */
  def getTotalTaxKnuddelAmount(): KnuddelAmount = js.native
}
