package typings
package fsDashPromiseLib.fsDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-promise", "fchmod")
@js.native
object fchmodNs extends js.Object {
  /**
           * Asynchronous fchmod(2) - Change permissions of a file.
           * @param fd A file descriptor.
           * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
           */
  def `__promisify__`(fd: scala.Double, mode: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
           * Asynchronous fchmod(2) - Change permissions of a file.
           * @param fd A file descriptor.
           * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
           */
  def `__promisify__`(fd: scala.Double, mode: scala.Double): stdLib.Promise[scala.Unit] = js.native
}
