package typings
package coreDashJsLib.webImmediateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/web/immediate", "WeakMap")
@js.native
class WeakMap[K /* <: js.Object */, V] ()
  extends stdLib.WeakMap[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
}

