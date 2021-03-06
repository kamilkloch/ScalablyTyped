package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorID extends js.Object {
  val appCodeName: java.lang.String
  val appName: java.lang.String
  val appVersion: java.lang.String
  val platform: java.lang.String
  val product: java.lang.String
  val productSub: java.lang.String
  val userAgent: java.lang.String
  val vendor: java.lang.String
  val vendorSub: java.lang.String
}

object NavigatorID {
  @scala.inline
  def apply(
    appCodeName: java.lang.String,
    appName: java.lang.String,
    appVersion: java.lang.String,
    platform: java.lang.String,
    product: java.lang.String,
    productSub: java.lang.String,
    userAgent: java.lang.String,
    vendor: java.lang.String,
    vendorSub: java.lang.String
  ): NavigatorID = {
    val __obj = js.Dynamic.literal(appCodeName = appCodeName, appName = appName, appVersion = appVersion, platform = platform, product = product, productSub = productSub, userAgent = userAgent, vendor = vendor, vendorSub = vendorSub)
  
    __obj.asInstanceOf[NavigatorID]
  }
}

