package typings
package meteorLib.DDPRateLimiterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DDPRateLimiter")
@js.native
object DDPRateLimiterNsMembers extends js.Object {
  def addRule(matcher: Matcher, numRequests: scala.Double, timeInterval: scala.Double): java.lang.String = js.native
  def removeRule(ruleId: java.lang.String): scala.Boolean = js.native
}
