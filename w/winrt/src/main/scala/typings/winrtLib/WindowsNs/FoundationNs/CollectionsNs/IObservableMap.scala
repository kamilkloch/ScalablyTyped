package typings
package winrtLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableMap[K, V] extends IMap[K, V] {
  var onmapchanged: js.Any
}

object IObservableMap {
  @scala.inline
  def apply[K, V](
    clear: () => scala.Unit,
    first: () => IIterator[IKeyValuePair[K, V]],
    getView: () => IMapView[K, V],
    hasKey: K => scala.Boolean,
    insert: (K, V) => scala.Boolean,
    lookup: K => V,
    onmapchanged: js.Any,
    remove: K => scala.Unit,
    size: scala.Double
  ): IObservableMap[K, V] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), onmapchanged = onmapchanged, remove = js.Any.fromFunction1(remove), size = size)
  
    __obj.asInstanceOf[IObservableMap[K, V]]
  }
}

