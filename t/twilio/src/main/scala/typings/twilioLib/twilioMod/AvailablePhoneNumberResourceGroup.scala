package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailablePhoneNumberResourceGroup extends ListableResource {
  @JSName("search")
  var search_Original: RestMethod = js.native
  def search(args: js.Any): qLib.qMod.Promise[_] = js.native
  def search(args: js.Any, callback: RequestCallback): qLib.qMod.Promise[_] = js.native
  def search(callback: RequestCallback): qLib.qMod.Promise[_] = js.native
}

