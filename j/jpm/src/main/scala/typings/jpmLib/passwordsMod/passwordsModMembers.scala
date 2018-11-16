package typings
package jpmLib.passwordsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sdk/passwords", JSImport.Namespace)
@js.native
object passwordsModMembers extends js.Object {
  def remove(options: Credential with jpmLib.Anon_OnError): scala.Unit = js.native
  def search(options: jpmLib.Anon_UsernameField): scala.Unit = js.native
  def store(options: Credential with jpmLib.Anon_OnError): scala.Unit = js.native
}
