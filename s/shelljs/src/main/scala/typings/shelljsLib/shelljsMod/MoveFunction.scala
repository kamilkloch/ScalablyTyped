package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveFunction extends js.Object {
  /**
  	 * Moves files. The wildcard `*` is accepted.
  	 *
  	 * @param options Available options:
  	 *        - `-f`: force (default behavior)
  	 *        - `-n`: no-clobber
  	 * @param source The source.
  	 * @param dest   The destination.
  	 * @return       Object with shell exit code, stderr and stdout.
  	 */
  def apply(options: java.lang.String, source: java.lang.String, dest: java.lang.String): ShellString = js.native
  def apply(options: java.lang.String, source: js.Array[java.lang.String], dest: java.lang.String): ShellString = js.native
  /**
  	 * Moves files. The wildcard `*` is accepted.
  	 *
  	 * @param source The source.
  	 * @param dest   The destination.
  	 * @return       Object with shell exit code, stderr and stdout.
  	 */
  def apply(source: java.lang.String, dest: java.lang.String): ShellString = js.native
  def apply(source: js.Array[java.lang.String], dest: java.lang.String): ShellString = js.native
}

