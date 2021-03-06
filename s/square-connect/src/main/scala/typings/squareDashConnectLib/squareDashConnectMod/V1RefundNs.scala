package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Refund")
@js.native
object V1RefundNs extends js.Object {
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait FULL
      extends squareDashConnectLib.squareDashConnectMod.V1RefundNs.TypeEnum
    
    @js.native
    sealed trait PARTIAL
      extends squareDashConnectLib.squareDashConnectMod.V1RefundNs.TypeEnum
    
    /* "FULL" */ val FULL: FULL with java.lang.String = js.native
    /* "PARTIAL" */ val PARTIAL: PARTIAL with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1RefundNs.TypeEnum with java.lang.String
      ] = js.native
  }
  
}

