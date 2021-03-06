package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map[K, V] extends js.Object {
  /** Returns an iterable of entries in the map. */
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[js.Tuple2[K, V]]] = js.native
  val size: scala.Double = js.native
  @JSName(scala.scalajs.js.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
  def clear(): scala.Unit = js.native
  def delete(key: K): scala.Boolean = js.native
  /**
    * Returns an iterable of key, value pairs for every entry in the map.
    */
  def entries(): IterableIterator[js.Tuple2[K, V]] = js.native
  def forEach(callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ Map[K, V], scala.Unit]): scala.Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ Map[K, V], scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
  def get(key: K): js.UndefOr[V] = js.native
  def has(key: K): scala.Boolean = js.native
  /**
    * Returns an iterable of keys in the map
    */
  def keys(): IterableIterator[K] = js.native
  def set(key: K, value: V): this.type = js.native
  /**
    * Returns an iterable of values in the map
    */
  def values(): IterableIterator[V] = js.native
}

@JSGlobal("Map")
@js.native
class MapCls[K, V] () extends Map[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
}

