package typings
package passportDashOauth2Lib.passportDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object OAuth2StrategyNs {
  type Strategy = passportDashOauth2Lib.passportDashOauth2Mod.OAuth2Strategy
  type VerifyCallback = js.Function3[
    /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type VerifyFunction = (js.Function4[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ js.Any, 
    /* verified */ VerifyCallback, 
    scala.Unit
  ]) | (js.Function5[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* results */ js.Any, 
    /* profile */ js.Any, 
    /* verified */ VerifyCallback, 
    scala.Unit
  ])
  type VerifyFunctionWithRequest = (js.Function5[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ js.Any, 
    /* verified */ VerifyCallback, 
    scala.Unit
  ]) | (js.Function6[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* results */ js.Any, 
    /* profile */ js.Any, 
    /* verified */ VerifyCallback, 
    scala.Unit
  ])
}