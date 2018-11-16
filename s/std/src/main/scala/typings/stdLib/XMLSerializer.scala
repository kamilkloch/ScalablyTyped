package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait XMLSerializer extends js.Object {
  def serializeToString(root: Node): java.lang.String
}

@JSGlobal("XMLSerializer")
@js.native
object XMLSerializer
  extends ScalablyTyped.runtime.Instantiable0[XMLSerializer]
