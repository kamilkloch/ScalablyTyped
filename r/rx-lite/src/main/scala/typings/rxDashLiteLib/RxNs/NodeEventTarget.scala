package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeEventTarget extends js.Object {
  def addListener(name: java.lang.String, cb: js.Function1[/* e */ js.Any, _]): scala.Unit
}

object NodeEventTarget {
  @scala.inline
  def apply(addListener: (java.lang.String, js.Function1[/* e */ js.Any, _]) => scala.Unit): NodeEventTarget = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener))
  
    __obj.asInstanceOf[NodeEventTarget]
  }
}

