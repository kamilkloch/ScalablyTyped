package typings
package passportDashNaverLib.passportDashNaverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-naver", "Strategy")
@js.native
class Strategy protected ()
  extends passportLib.passportMod.passportNs.Strategy {
  def this(options: StrategyOptionWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOption, verify: VerifyFunction) = this()
  def authenticate(req: expressLib.expressMod.eNs.Request): scala.Unit = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request, options: js.Any): scala.Unit = js.native
  def authorizationParams(options: js.Any): js.Any = js.native
  def userProfile(
    accessToken: java.lang.String,
    done: js.Function2[/* error */ js.Any, /* user */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
}
