package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ 
trait Response extends Body {
  val headers: Headers
  val ok: scala.Boolean
  val redirected: scala.Boolean
  val status: scala.Double
  val statusText: java.lang.String
  val `type`: `ResponseType_`
  val url: java.lang.String
}

@JSGlobal("Response")
@js.native
object Response
  extends ScalablyTyped.runtime.Instantiable0[Response]
     with ScalablyTyped.runtime.Instantiable1[/* body */ `BodyInit_`, Response]
     with ScalablyTyped.runtime.Instantiable2[/* body */ `BodyInit_`, /* init */ ResponseInit, Response] {
  var error: js.Function0[reactDashNativeLib.Response] = js.native
  var redirect: js.Function2[
    /* url */ java.lang.String, 
    /* status */ js.UndefOr[scala.Double], 
    reactDashNativeLib.Response
  ] = js.native
}
