package typings
package atMysticateaSpyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distMod {
  type Spy[T /* <: js.Function1[/* repeated */ js.Any, _] */] = T with atMysticateaSpyLib.distMod.SpyNs.CallInformation[T]
  type This[T] = js.UndefOr[scala.Nothing]
}
