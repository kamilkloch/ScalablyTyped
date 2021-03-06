package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawMethod[QM /* <: Model */, RM, RV] extends js.Object {
  def apply(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def apply(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def apply(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
}

