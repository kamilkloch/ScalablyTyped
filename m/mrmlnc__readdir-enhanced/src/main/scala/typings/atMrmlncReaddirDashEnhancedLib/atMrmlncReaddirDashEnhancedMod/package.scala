package typings
package atMrmlncReaddirDashEnhancedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atMrmlncReaddirDashEnhancedMod {
  type Callback[T] = js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* result */ T, scala.Unit]
  type CallbackEntry = Callback[js.Array[Entry]]
  type CallbackString = Callback[js.Array[java.lang.String]]
  type FilterFunction = js.Function1[/* stat */ Entry, scala.Boolean]
}
