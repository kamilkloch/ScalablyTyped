package typings
package usernameLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("username", JSImport.Namespace)
@js.native
object usernameMod extends js.Object {
  def apply(): js.Promise[java.lang.String] = js.native
  /**
    * Tries to get the username from the LOGNAME, USER, LNAME or USERNAME environment variables. Falls back
    * to returning an empty string in the reare case none of the environment variables are set.
    *
    * @return The username or empty string if not found.
    */
  def sync(): java.lang.String = js.native
}

