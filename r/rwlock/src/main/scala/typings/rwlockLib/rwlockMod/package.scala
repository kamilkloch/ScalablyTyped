package typings
package rwlockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rwlockMod {
  type AsyncCallback = js.Function2[/* err */ stdLib.Error, /* release */ Release, scala.Unit]
  type Callback = js.Function1[/* release */ Release, scala.Unit]
  type Release = js.Function0[scala.Unit]
}
