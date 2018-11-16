package typings
package ironLib.ironMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iron", JSImport.Namespace)
@js.native
object ironModMembers extends js.Object {
  val algorithms: Algorithms = js.native
  val defaults: SealOptions = js.native
  val macFormatVersion: java.lang.String = js.native
  val macPrefix: java.lang.String = js.native
  def decrypt(password: java.lang.String, options: GenerateKeyOptions, data: java.lang.String): stdLib.Promise[nodeLib.Buffer] = js.native
  def encrypt(password: java.lang.String, options: GenerateKeyOptions, data: java.lang.String): stdLib.Promise[ironLib.Anon_Key] = js.native
  def generateKey(password: java.lang.String, options: GenerateKeyOptions): stdLib.Promise[Key] = js.native
  def hmacWithPassword(password: java.lang.String, options: GenerateKeyOptions, data: java.lang.String): stdLib.Promise[HMacResult] = js.native
  def seal(obj: js.Object, password: java.lang.String, options: SealOptions): stdLib.Promise[java.lang.String] = js.native
  def unseal(data: java.lang.String, password: java.lang.String, options: SealOptions): stdLib.Promise[js.Object] = js.native
}
