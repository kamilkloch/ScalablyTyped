package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SyncManager extends js.Object {
  def getTags(): Promise[js.Array[java.lang.String]]
  def register(tag: java.lang.String): Promise[scala.Unit]
}

@JSGlobal("SyncManager")
@js.native
object SyncManager
  extends ScalablyTyped.runtime.Instantiable0[SyncManager]
