package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertDK[K, D] extends js.Object {
  def renderer(context: atOracleOraclejetLib.ojtreemapMod.ojTreemapNs.NodeContentContext[K, D]): Anon_Insert
}

object Anon_ContextRendererAnonInsertDK {
  @scala.inline
  def apply[K, D](renderer: atOracleOraclejetLib.ojtreemapMod.ojTreemapNs.NodeContentContext[K, D] => Anon_Insert): Anon_ContextRendererAnonInsertDK[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertDK[K, D]]
  }
}

