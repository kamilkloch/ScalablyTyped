package typings
package nodeLib.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs", "write")
@js.native
object writeNs extends js.Object {
  /**
           * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
           * @param fd A file descriptor.
           * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
           * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
           * @param encoding The expected string encoding.
           */
  def `__promisify__`(fd: scala.Double, string: js.Any): stdLib.Promise[nodeLib.Anon_BufferBytesWrittenString] = js.native
  /**
           * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
           * @param fd A file descriptor.
           * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
           * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
           * @param encoding The expected string encoding.
           */
  def `__promisify__`(fd: scala.Double, string: js.Any, position: scala.Double): stdLib.Promise[nodeLib.Anon_BufferBytesWrittenString] = js.native
  /**
           * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
           * @param fd A file descriptor.
           * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
           * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
           * @param encoding The expected string encoding.
           */
  def `__promisify__`(fd: scala.Double, string: js.Any, position: scala.Double, encoding: java.lang.String): stdLib.Promise[nodeLib.Anon_BufferBytesWrittenString] = js.native
  /**
           * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
           * @param fd A file descriptor.
           * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
           * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
           * @param encoding The expected string encoding.
           */
  def `__promisify__`(fd: scala.Double, string: js.Any, position: scala.Null, encoding: java.lang.String): stdLib.Promise[nodeLib.Anon_BufferBytesWrittenString] = js.native
  /**
           * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
           * @param fd A file descriptor.
           * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
           * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
           * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
           */
  def `__promisify__`[TBuffer /* <: nodeLib.fsMod.BinaryData */](fd: scala.Double): stdLib.Promise[nodeLib.Anon_BufferBytesWrittenTBuffer[TBuffer]] = js.native
  /**
           * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
           * @param fd A file descriptor.
           * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
           * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
           * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
           */
  def `__promisify__`[TBuffer /* <: nodeLib.fsMod.BinaryData */](fd: scala.Double, buffer: TBuffer): stdLib.Promise[nodeLib.Anon_BufferBytesWrittenTBuffer[TBuffer]] = js.native
  /**
           * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
           * @param fd A file descriptor.
           * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
           * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
           * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
           */
  def `__promisify__`[TBuffer /* <: nodeLib.fsMod.BinaryData */](fd: scala.Double, buffer: TBuffer, offset: scala.Double): stdLib.Promise[nodeLib.Anon_BufferBytesWrittenTBuffer[TBuffer]] = js.native
  /**
           * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
           * @param fd A file descriptor.
           * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
           * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
           * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
           */
  def `__promisify__`[TBuffer /* <: nodeLib.fsMod.BinaryData */](fd: scala.Double, buffer: TBuffer, offset: scala.Double, length: scala.Double): stdLib.Promise[nodeLib.Anon_BufferBytesWrittenTBuffer[TBuffer]] = js.native
  /**
           * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
           * @param fd A file descriptor.
           * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
           * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
           * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
           */
  def `__promisify__`[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): stdLib.Promise[nodeLib.Anon_BufferBytesWrittenTBuffer[TBuffer]] = js.native
}
