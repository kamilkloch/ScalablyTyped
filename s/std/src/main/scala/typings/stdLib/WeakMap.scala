package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WeakMap[K /* <: js.Object */, V] extends js.Object {
  @JSName(ScalablyTyped.runtime.Symbol.toStringTag)
  val toStringTag: stdLib.stdLibStrings.WeakMap
  def delete(key: K): scala.Boolean
  def get(key: K): js.UndefOr[V]
  def has(key: K): scala.Boolean
  def set(key: K, value: V): this.type
}
