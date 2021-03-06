package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionBeforeEvent[T] extends js.Object {
  var item: T
  def preventDefault(): scala.Unit
}

object CollectionBeforeEvent {
  @scala.inline
  def apply[T](item: T, preventDefault: () => scala.Unit): CollectionBeforeEvent[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault))
  
    __obj.asInstanceOf[CollectionBeforeEvent[T]]
  }
}

