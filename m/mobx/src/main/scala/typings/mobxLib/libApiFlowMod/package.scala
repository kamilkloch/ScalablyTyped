package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libApiFlowMod {
  type CancellablePromise[T] = stdLib.Promise[T] with mobxLib.Anon_Cancel
}