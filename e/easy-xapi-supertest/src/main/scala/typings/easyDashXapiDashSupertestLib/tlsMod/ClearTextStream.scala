package typings
package easyDashXapiDashSupertestLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearTextStream
  extends easyDashXapiDashSupertestLib.streamMod.Duplex {
  var address: easyDashXapiDashSupertestLib.Anon_Address = js.native
  var authorizationError: stdLib.Error = js.native
  var authorized: scala.Boolean = js.native
  var getCipher: easyDashXapiDashSupertestLib.Anon_Name = js.native
  var remoteAddress: java.lang.String = js.native
  var remotePort: scala.Double = js.native
  def getPeerCertificate(): js.Any = js.native
}

