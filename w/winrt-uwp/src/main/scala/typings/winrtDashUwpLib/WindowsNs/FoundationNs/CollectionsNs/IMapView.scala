package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an immutable view into a map. */
trait IMapView[K, V]
  extends IIterable[IKeyValuePair[js.Any, js.Any]] {
  /** Gets the number of elements in the map. */
  var size: scala.Double
  /**
    * Determines whether the map view contains the specified key.
    * @param key The key to locate in the map view.
    * @return True if the key is found; otherwise, false.
    */
  def hasKey(key: K): scala.Boolean
  /**
    * Returns the item at the specified key in the map view.
    * @param key The key to locate in the map view.
    * @return The item associated with the specified key.
    */
  def lookup(key: K): V
  /**
    * Splits the map view into two views.
    */
  def split(): winrtDashUwpLib.Anon_First[K, V]
}

object IMapView {
  @scala.inline
  def apply[K, V](
    first: () => IIterator[IKeyValuePair[js.Any, js.Any]],
    hasKey: K => scala.Boolean,
    lookup: K => V,
    size: scala.Double,
    split: () => winrtDashUwpLib.Anon_First[K, V]
  ): IMapView[K, V] = {
    val __obj = js.Dynamic.literal(first = js.Any.fromFunction0(first), hasKey = js.Any.fromFunction1(hasKey), lookup = js.Any.fromFunction1(lookup), size = size, split = js.Any.fromFunction0(split))
  
    __obj.asInstanceOf[IMapView[K, V]]
  }
}

