package typings
package fsDashPromiseLib.fsDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-promise", "writeFile")
@js.native
object writeFileNs extends js.Object {
  /**
           * Asynchronously writes data to a file, replacing the file if it already exists.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * URL support is _experimental_.
           * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
           * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
           * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
           * If `encoding` is not supplied, the default of `'utf8'` is used.
           * If `mode` is not supplied, the default of `0o666` is used.
           * If `mode` is a string, it is parsed as an octal integer.
           * If `flag` is not supplied, the default of `'w'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, data: js.Any): stdLib.Promise[scala.Unit] = js.native
  /**
           * Asynchronously writes data to a file, replacing the file if it already exists.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * URL support is _experimental_.
           * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
           * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
           * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
           * If `encoding` is not supplied, the default of `'utf8'` is used.
           * If `mode` is not supplied, the default of `0o666` is used.
           * If `mode` is a string, it is parsed as an octal integer.
           * If `flag` is not supplied, the default of `'w'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, data: js.Any, options: nodeLib.fsMod.WriteFileOptions): stdLib.Promise[scala.Unit] = js.native
  /**
           * Asynchronously writes data to a file, replacing the file if it already exists.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * URL support is _experimental_.
           * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
           * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
           * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
           * If `encoding` is not supplied, the default of `'utf8'` is used.
           * If `mode` is not supplied, the default of `0o666` is used.
           * If `mode` is a string, it is parsed as an octal integer.
           * If `flag` is not supplied, the default of `'w'` is used.
           */
  def `__promisify__`(path: scala.Double, data: js.Any): stdLib.Promise[scala.Unit] = js.native
  /**
           * Asynchronously writes data to a file, replacing the file if it already exists.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * URL support is _experimental_.
           * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
           * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
           * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
           * If `encoding` is not supplied, the default of `'utf8'` is used.
           * If `mode` is not supplied, the default of `0o666` is used.
           * If `mode` is a string, it is parsed as an octal integer.
           * If `flag` is not supplied, the default of `'w'` is used.
           */
  def `__promisify__`(path: scala.Double, data: js.Any, options: nodeLib.fsMod.WriteFileOptions): stdLib.Promise[scala.Unit] = js.native
}
