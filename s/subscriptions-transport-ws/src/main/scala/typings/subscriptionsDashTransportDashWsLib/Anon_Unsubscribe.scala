package typings
package subscriptionsDashTransportDashWsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Unsubscribe extends js.Object {
  def unsubscribe(): scala.Unit
}

object Anon_Unsubscribe {
  @scala.inline
  def apply(unsubscribe: () => scala.Unit): Anon_Unsubscribe = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[Anon_Unsubscribe]
  }
}

