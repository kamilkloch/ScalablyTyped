package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object threadUniqueLockMod {
  /**
    * @hidden
    */
  type Closure = js.Function0[scala.Unit | js.Promise[scala.Unit]]
  /**
    * @hidden
    */
  type IMutex = tstlLib.threadILockableMod.ILockable with stdLib.Partial[tstlLib.threadITimedLockableMod.ITimedLockable]
}
