package typings
package oauth2DashServerLib.oauth2DashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientCredentialsModel
  extends BaseModel
     with RequestAuthenticationModel {
  /**
    * Invoked to check if the requested scope is valid for a particular client/user combination.
    *
    */
  var validateScope: js.UndefOr[
    js.Function4[
      /* user */ User, 
      /* client */ Client, 
      /* scope */ java.lang.String | js.Array[java.lang.String], 
      /* callback */ js.UndefOr[Callback[java.lang.String | Falsey]], 
      js.Promise[java.lang.String | js.Array[java.lang.String] | Falsey]
    ]
  ] = js.native
  /**
    * Invoked to retrieve the user associated with the specified client.
    *
    */
  def getUserFromClient(client: Client): js.Promise[User | Falsey] = js.native
  def getUserFromClient(client: Client, callback: Callback[User | Falsey]): js.Promise[User | Falsey] = js.native
}

