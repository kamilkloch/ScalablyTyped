package typings
package fsDashPlusLib.fsDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-plus", "lchmod")
@js.native
object lchmodNs extends js.Object {
  /**
           * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, mode: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
           * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, mode: scala.Double): stdLib.Promise[scala.Unit] = js.native
}
