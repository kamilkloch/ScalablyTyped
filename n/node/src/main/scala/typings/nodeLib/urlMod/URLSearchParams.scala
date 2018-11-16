package typings
package nodeLib.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url", "URLSearchParams")
@js.native
class URLSearchParams ()
  extends nodeLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]] {
  def this(init: ScalablyTyped.runtime.StringDictionary[js.UndefOr[java.lang.String | js.Array[java.lang.String]]]) = this()
  def this(init: java.lang.String) = this()
  def this(init: js.Array[js.Tuple2[java.lang.String, java.lang.String]]) = this()
  def this(init: nodeLib.Iterable[js.Tuple2[java.lang.String, java.lang.String]]) = this()
  def this(init: URLSearchParams) = this()
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  var iterator: js.Function0[nodeLib.IterableIterator[js.Tuple2[java.lang.String, java.lang.String]]] = js.native
  def append(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def delete(name: java.lang.String): scala.Unit = js.native
  def entries(): nodeLib.IterableIterator[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def forEach(
    callback: js.Function3[
      /* value */ java.lang.String, 
      /* name */ java.lang.String, 
      /* searchParams */ this.type, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def get(name: java.lang.String): java.lang.String | scala.Null = js.native
  def getAll(name: java.lang.String): js.Array[java.lang.String] = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def keys(): nodeLib.IterableIterator[java.lang.String] = js.native
  def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def sort(): scala.Unit = js.native
  def values(): nodeLib.IterableIterator[java.lang.String] = js.native
}
