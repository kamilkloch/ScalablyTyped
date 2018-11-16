package typings
package winstonLib.libWinstonTransportsMod.winstonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpTransportInstance
  extends winstonDashTransportLib.winstonDashTransportMod.namespaced
     with ScalablyTyped.runtime.Instantiable0[HttpTransportInstance]
     with ScalablyTyped.runtime.Instantiable1[/* options */ HttpTransportOptions, HttpTransportInstance] {
  var agent: js.UndefOr[nodeLib.httpMod.Agent | scala.Null] = js.native
  var auth: js.UndefOr[winstonLib.Anon_Username] = js.native
  var host: java.lang.String = js.native
  var name: java.lang.String = js.native
  var path: java.lang.String = js.native
  var port: scala.Double = js.native
  var ssl: scala.Boolean = js.native
}
