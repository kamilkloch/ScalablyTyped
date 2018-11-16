package typings
package fsDashExtraDashPromiseLib.fsDashExtraDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-extra-promise", "rmdir")
@js.native
object rmdirNs extends js.Object {
  /**
           * Asynchronous rmdir(2) - delete a directory.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike): stdLib.Promise[scala.Unit] = js.native
}
