package typings
package fsDashPromiseLib.fsDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-promise", "read")
@js.native
object readNs extends js.Object {
  /**
           * @param fd A file descriptor.
           * @param buffer The buffer that the data will be written to.
           * @param offset The offset in the buffer at which to start writing.
           * @param length The number of bytes to read.
           * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
           */
  def `__promisify__`[TBuffer /* <: nodeLib.fsMod.BinaryData */](fd: scala.Double, buffer: TBuffer, offset: scala.Double, length: scala.Double): stdLib.Promise[nodeLib.Anon_Buffer[TBuffer]] = js.native
  /**
           * @param fd A file descriptor.
           * @param buffer The buffer that the data will be written to.
           * @param offset The offset in the buffer at which to start writing.
           * @param length The number of bytes to read.
           * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
           */
  def `__promisify__`[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): stdLib.Promise[nodeLib.Anon_Buffer[TBuffer]] = js.native
}
