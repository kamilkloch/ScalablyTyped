package typings
package fsDashPromiseLib.fsDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-promise", JSImport.Namespace)
@js.native
object fsDashPromiseModMembers extends js.Object {
  def access(path: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def access(
    path: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def access(path: java.lang.String, mode: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def access(
    path: java.lang.String,
    mode: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def access(
    path: nodeLib.Buffer,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def access(
    path: nodeLib.Buffer,
    mode: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously tests a user's permissions for the file specified by path.
       * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def access(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously tests a user's permissions for the file specified by path.
       * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def access(
    path: nodeLib.fsMod.PathLike,
    mode: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously tests a user's permissions for the file specified by path.
       * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def access(
    path: nodeLib.fsMod.PathLike,
    mode: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronously tests a user's permissions for the file specified by path.
       * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def accessSync(path: nodeLib.fsMod.PathLike): scala.Unit = js.native
  /**
       * Synchronously tests a user's permissions for the file specified by path.
       * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def accessSync(path: nodeLib.fsMod.PathLike, mode: scala.Double): scala.Unit = js.native
  def appendFile(
    file: java.lang.String | scala.Double | nodeLib.Buffer,
    data: java.lang.String | nodeLib.Buffer,
    options: js.UndefOr[mzLib.Anon_Encoding | java.lang.String | scala.Null],
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def appendFile(file: java.lang.String, data: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def appendFile(
    file: java.lang.String,
    data: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def appendFile(file: java.lang.String, data: java.lang.String, options: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def appendFile(file: java.lang.String, data: java.lang.String, options: mzLib.Anon_EncodingMode): stdLib.Promise[scala.Unit] = js.native
  def appendFile(file: java.lang.String, data: nodeLib.Buffer): stdLib.Promise[scala.Unit] = js.native
  def appendFile(
    file: java.lang.String,
    data: nodeLib.Buffer,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def appendFile(file: java.lang.String, data: nodeLib.Buffer, options: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def appendFile(file: java.lang.String, data: nodeLib.Buffer, options: mzLib.Anon_EncodingMode): stdLib.Promise[scala.Unit] = js.native
  def appendFile(file: nodeLib.Buffer, data: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def appendFile(
    file: nodeLib.Buffer,
    data: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def appendFile(file: nodeLib.Buffer, data: java.lang.String, options: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def appendFile(file: nodeLib.Buffer, data: java.lang.String, options: mzLib.Anon_EncodingMode): stdLib.Promise[scala.Unit] = js.native
  def appendFile(file: nodeLib.Buffer, data: nodeLib.Buffer): stdLib.Promise[scala.Unit] = js.native
  def appendFile(
    file: nodeLib.Buffer,
    data: nodeLib.Buffer,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def appendFile(file: nodeLib.Buffer, data: nodeLib.Buffer, options: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def appendFile(file: nodeLib.Buffer, data: nodeLib.Buffer, options: mzLib.Anon_EncodingMode): stdLib.Promise[scala.Unit] = js.native
  /**
       * Asynchronously append data to a file, creating the file if it does not exist.
       * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       */
  def appendFile(
    file: nodeLib.fsMod.PathLike,
    data: js.Any,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously append data to a file, creating the file if it does not exist.
       * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `mode` is not supplied, the default of `0o666` is used.
       * If `mode` is a string, it is parsed as an octal integer.
       * If `flag` is not supplied, the default of `'a'` is used.
       */
  def appendFile(
    file: nodeLib.fsMod.PathLike,
    data: js.Any,
    options: nodeLib.fsMod.WriteFileOptions,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def appendFile(file: scala.Double, data: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def appendFile(
    file: scala.Double,
    data: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def appendFile(file: scala.Double, data: java.lang.String, options: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def appendFile(file: scala.Double, data: java.lang.String, options: mzLib.Anon_EncodingMode): stdLib.Promise[scala.Unit] = js.native
  /**
       * Asynchronously append data to a file, creating the file if it does not exist.
       * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       */
  def appendFile(
    file: scala.Double,
    data: js.Any,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously append data to a file, creating the file if it does not exist.
       * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `mode` is not supplied, the default of `0o666` is used.
       * If `mode` is a string, it is parsed as an octal integer.
       * If `flag` is not supplied, the default of `'a'` is used.
       */
  def appendFile(
    file: scala.Double,
    data: js.Any,
    options: nodeLib.fsMod.WriteFileOptions,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def appendFile(file: scala.Double, data: nodeLib.Buffer): stdLib.Promise[scala.Unit] = js.native
  def appendFile(
    file: scala.Double,
    data: nodeLib.Buffer,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def appendFile(file: scala.Double, data: nodeLib.Buffer, options: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def appendFile(file: scala.Double, data: nodeLib.Buffer, options: mzLib.Anon_EncodingMode): stdLib.Promise[scala.Unit] = js.native
  /**
       * Synchronously append data to a file, creating the file if it does not exist.
       * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `mode` is not supplied, the default of `0o666` is used.
       * If `mode` is a string, it is parsed as an octal integer.
       * If `flag` is not supplied, the default of `'a'` is used.
       */
  def appendFileSync(file: nodeLib.fsMod.PathLike, data: js.Any): scala.Unit = js.native
  /**
       * Synchronously append data to a file, creating the file if it does not exist.
       * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `mode` is not supplied, the default of `0o666` is used.
       * If `mode` is a string, it is parsed as an octal integer.
       * If `flag` is not supplied, the default of `'a'` is used.
       */
  def appendFileSync(file: nodeLib.fsMod.PathLike, data: js.Any, options: nodeLib.fsMod.WriteFileOptions): scala.Unit = js.native
  /**
       * Synchronously append data to a file, creating the file if it does not exist.
       * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `mode` is not supplied, the default of `0o666` is used.
       * If `mode` is a string, it is parsed as an octal integer.
       * If `flag` is not supplied, the default of `'a'` is used.
       */
  def appendFileSync(file: scala.Double, data: js.Any): scala.Unit = js.native
  /**
       * Synchronously append data to a file, creating the file if it does not exist.
       * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `mode` is not supplied, the default of `0o666` is used.
       * If `mode` is a string, it is parsed as an octal integer.
       * If `flag` is not supplied, the default of `'a'` is used.
       */
  def appendFileSync(file: scala.Double, data: js.Any, options: nodeLib.fsMod.WriteFileOptions): scala.Unit = js.native
  def chmod(path: java.lang.String, mode: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def chmod(
    path: java.lang.String,
    mode: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def chmod(path: java.lang.String, mode: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def chmod(
    path: java.lang.String,
    mode: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def chmod(path: nodeLib.Buffer, mode: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def chmod(
    path: nodeLib.Buffer,
    mode: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def chmod(path: nodeLib.Buffer, mode: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def chmod(
    path: nodeLib.Buffer,
    mode: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous chmod(2) - Change permissions of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def chmod(
    path: nodeLib.fsMod.PathLike,
    mode: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous chmod(2) - Change permissions of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def chmod(
    path: nodeLib.fsMod.PathLike,
    mode: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous chmod(2) - Change permissions of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def chmodSync(path: nodeLib.fsMod.PathLike, mode: java.lang.String): scala.Unit = js.native
  /**
       * Synchronous chmod(2) - Change permissions of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def chmodSync(path: nodeLib.fsMod.PathLike, mode: scala.Double): scala.Unit = js.native
  def chown(path: java.lang.String, uid: scala.Double, gid: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def chown(
    path: java.lang.String,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def chown(path: nodeLib.Buffer, uid: scala.Double, gid: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def chown(
    path: nodeLib.Buffer,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous chown(2) - Change ownership of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def chown(
    path: nodeLib.fsMod.PathLike,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous chown(2) - Change ownership of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def chownSync(path: nodeLib.fsMod.PathLike, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def close(fd: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
       * Asynchronous close(2) - close a file descriptor.
       * @param fd A file descriptor.
       */
  def close(
    fd: scala.Double,
    callback: js.Function1[
      (/* err */ nodeLib.NodeJSNs.ErrnoException) | (/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException]), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Synchronous close(2) - close a file descriptor.
       * @param fd A file descriptor.
       */
  def closeSync(fd: scala.Double): scala.Unit = js.native
  def copy(src: java.lang.String, dst: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
       * Asynchronously copies src to dest. By default, dest is overwritten if it already exists.
       * No arguments other than a possible exception are given to the callback function.
       * Node.js makes no guarantees about the atomicity of the copy operation.
       * If an error occurs after the destination file has been opened for writing, Node.js will attempt
       * to remove the destination.
       * @param src A path to the source file.
       * @param dest A path to the destination file.
       */
  def copyFile(
    src: nodeLib.fsMod.PathLike,
    dest: nodeLib.fsMod.PathLike,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously copies src to dest. By default, dest is overwritten if it already exists.
       * No arguments other than a possible exception are given to the callback function.
       * Node.js makes no guarantees about the atomicity of the copy operation.
       * If an error occurs after the destination file has been opened for writing, Node.js will attempt
       * to remove the destination.
       * @param src A path to the source file.
       * @param dest A path to the destination file.
       * @param flags An integer that specifies the behavior of the copy operation. The only supported flag is fs.constants.COPYFILE_EXCL, which causes the copy operation to fail if dest already exists.
       */
  def copyFile(
    src: nodeLib.fsMod.PathLike,
    dest: nodeLib.fsMod.PathLike,
    flags: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronously copies src to dest. By default, dest is overwritten if it already exists.
       * Node.js makes no guarantees about the atomicity of the copy operation.
       * If an error occurs after the destination file has been opened for writing, Node.js will attempt
       * to remove the destination.
       * @param src A path to the source file.
       * @param dest A path to the destination file.
       * @param flags An optional integer that specifies the behavior of the copy operation.
       * The only supported flag is fs.constants.COPYFILE_EXCL, which causes the copy operation to fail if dest already exists.
       */
  def copyFileSync(src: nodeLib.fsMod.PathLike, dest: nodeLib.fsMod.PathLike): scala.Unit = js.native
  /**
       * Synchronously copies src to dest. By default, dest is overwritten if it already exists.
       * Node.js makes no guarantees about the atomicity of the copy operation.
       * If an error occurs after the destination file has been opened for writing, Node.js will attempt
       * to remove the destination.
       * @param src A path to the source file.
       * @param dest A path to the destination file.
       * @param flags An optional integer that specifies the behavior of the copy operation.
       * The only supported flag is fs.constants.COPYFILE_EXCL, which causes the copy operation to fail if dest already exists.
       */
  def copyFileSync(src: nodeLib.fsMod.PathLike, dest: nodeLib.fsMod.PathLike, flags: scala.Double): scala.Unit = js.native
  def createFile(file: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def createLink(srcpath: java.lang.String, dstpath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
       * Returns a new `ReadStream` object.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def createReadStream(path: nodeLib.fsMod.PathLike): nodeLib.fsMod.ReadStream = js.native
  /**
       * Returns a new `ReadStream` object.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def createReadStream(path: nodeLib.fsMod.PathLike, options: java.lang.String): nodeLib.fsMod.ReadStream = js.native
  /**
       * Returns a new `ReadStream` object.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def createReadStream(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_AutoClose): nodeLib.fsMod.ReadStream = js.native
  def createSymlink(srcpath: java.lang.String, dstpath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  @JSName("createSymlink")
  def createSymlink_dir(
    srcpath: java.lang.String,
    dstpath: java.lang.String,
    `type`: fsDashPromiseLib.fsDashPromiseLibStrings.dir
  ): stdLib.Promise[scala.Unit] = js.native
  @JSName("createSymlink")
  def createSymlink_file(
    srcpath: java.lang.String,
    dstpath: java.lang.String,
    `type`: fsDashPromiseLib.fsDashPromiseLibStrings.file
  ): stdLib.Promise[scala.Unit] = js.native
  @JSName("createSymlink")
  def createSymlink_junction(
    srcpath: java.lang.String,
    dstpath: java.lang.String,
    `type`: fsDashPromiseLib.fsDashPromiseLibStrings.junction
  ): stdLib.Promise[scala.Unit] = js.native
  /**
       * Returns a new `WriteStream` object.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def createWriteStream(path: nodeLib.fsMod.PathLike): nodeLib.fsMod.WriteStream = js.native
  /**
       * Returns a new `WriteStream` object.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def createWriteStream(path: nodeLib.fsMod.PathLike, options: java.lang.String): nodeLib.fsMod.WriteStream = js.native
  /**
       * Returns a new `WriteStream` object.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def createWriteStream(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_AutoCloseFlags): nodeLib.fsMod.WriteStream = js.native
  def emptyDir(dir: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def emptydir(dir: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def ensureDir(dir: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def ensureFile(file: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def ensureLink(srcpath: java.lang.String, dstpath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def ensureSymlink(srcpath: java.lang.String, dstpath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  @JSName("ensureSymlink")
  def ensureSymlink_dir(
    srcpath: java.lang.String,
    dstpath: java.lang.String,
    `type`: fsDashPromiseLib.fsDashPromiseLibStrings.dir
  ): stdLib.Promise[scala.Unit] = js.native
  @JSName("ensureSymlink")
  def ensureSymlink_file(
    srcpath: java.lang.String,
    dstpath: java.lang.String,
    `type`: fsDashPromiseLib.fsDashPromiseLibStrings.file
  ): stdLib.Promise[scala.Unit] = js.native
  @JSName("ensureSymlink")
  def ensureSymlink_junction(
    srcpath: java.lang.String,
    dstpath: java.lang.String,
    `type`: fsDashPromiseLib.fsDashPromiseLibStrings.junction
  ): stdLib.Promise[scala.Unit] = js.native
  def exists(path: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def exists(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* exists */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def exists(
    path: nodeLib.Buffer,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* exists */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously tests whether or not the given path exists by checking with the file system.
       * @deprecated
       * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def exists(path: nodeLib.fsMod.PathLike, callback: js.Function1[/* exists */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
       * Synchronously tests whether or not the given path exists by checking with the file system.
       * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def existsSync(path: nodeLib.fsMod.PathLike): scala.Boolean = js.native
  def fchmod(fd: scala.Double, mode: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
       * Asynchronous fchmod(2) - Change permissions of a file.
       * @param fd A file descriptor.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def fchmod(
    fd: scala.Double,
    mode: java.lang.String,
    callback: js.Function1[
      (/* err */ nodeLib.NodeJSNs.ErrnoException) | (/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException]), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def fchmod(fd: scala.Double, mode: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
       * Asynchronous fchmod(2) - Change permissions of a file.
       * @param fd A file descriptor.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def fchmod(
    fd: scala.Double,
    mode: scala.Double,
    callback: js.Function1[
      (/* err */ nodeLib.NodeJSNs.ErrnoException) | (/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException]), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Synchronous fchmod(2) - Change permissions of a file.
       * @param fd A file descriptor.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def fchmodSync(fd: scala.Double, mode: java.lang.String): scala.Unit = js.native
  /**
       * Synchronous fchmod(2) - Change permissions of a file.
       * @param fd A file descriptor.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def fchmodSync(fd: scala.Double, mode: scala.Double): scala.Unit = js.native
  def fchown(fd: scala.Double, uid: scala.Double, gid: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
       * Asynchronous fchown(2) - Change ownership of a file.
       * @param fd A file descriptor.
       */
  def fchown(
    fd: scala.Double,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[
      (/* err */ nodeLib.NodeJSNs.ErrnoException) | (/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException]), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Synchronous fchown(2) - Change ownership of a file.
       * @param fd A file descriptor.
       */
  def fchownSync(fd: scala.Double, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  /**
       * Asynchronous fdatasync(2) - synchronize a file's in-core state with storage device.
       * @param fd A file descriptor.
       */
  def fdatasync(fd: scala.Double, callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]): scala.Unit = js.native
  /**
       * Synchronous fdatasync(2) - synchronize a file's in-core state with storage device.
       * @param fd A file descriptor.
       */
  def fdatasyncSync(fd: scala.Double): scala.Unit = js.native
  def fstat(fd: scala.Double): stdLib.Promise[nodeLib.fsMod.Stats] = js.native
  /**
       * Asynchronous fstat(2) - Get file status.
       * @param fd A file descriptor.
       */
  def fstat(
    fd: scala.Double,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* stats */ nodeLib.fsMod.Stats, 
      _ | scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Synchronous fstat(2) - Get file status.
       * @param fd A file descriptor.
       */
  def fstatSync(fd: scala.Double): nodeLib.fsMod.Stats = js.native
  def fsync(fd: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
       * Asynchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
       * @param fd A file descriptor.
       */
  def fsync(
    fd: scala.Double,
    callback: js.Function1[
      (/* err */ nodeLib.NodeJSNs.ErrnoException) | (/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException]), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Synchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
       * @param fd A file descriptor.
       */
  def fsyncSync(fd: scala.Double): scala.Unit = js.native
  def ftruncate(fd: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
       * Asynchronous ftruncate(2) - Truncate a file to a specified length.
       * @param fd A file descriptor.
       */
  def ftruncate(
    fd: scala.Double,
    callback: js.Function1[
      (/* err */ nodeLib.NodeJSNs.ErrnoException) | (/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException]), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous ftruncate(2) - Truncate a file to a specified length.
       * @param fd A file descriptor.
       * @param len If not specified, defaults to `0`.
       */
  def ftruncate(
    fd: scala.Double,
    len: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def ftruncate(fd: scala.Double, len: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
       * Asynchronous ftruncate(2) - Truncate a file to a specified length.
       * @param fd A file descriptor.
       * @param len If not specified, defaults to `0`.
       */
  def ftruncate(
    fd: scala.Double,
    len: scala.Double,
    callback: js.Function1[
      (/* err */ nodeLib.NodeJSNs.ErrnoException) | (/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException]), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous ftruncate(2) - Truncate a file to a specified length.
       * @param fd A file descriptor.
       * @param len If not specified, defaults to `0`.
       */
  def ftruncate(
    fd: scala.Double,
    len: scala.Null,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous ftruncate(2) - Truncate a file to a specified length.
       * @param fd A file descriptor.
       * @param len If not specified, defaults to `0`.
       */
  def ftruncateSync(fd: scala.Double): scala.Unit = js.native
  /**
       * Synchronous ftruncate(2) - Truncate a file to a specified length.
       * @param fd A file descriptor.
       * @param len If not specified, defaults to `0`.
       */
  def ftruncateSync(fd: scala.Double, len: scala.Double): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimes(
    fd: scala.Double,
    atime: java.lang.String,
    mtime: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimes(
    fd: scala.Double,
    atime: java.lang.String,
    mtime: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimes(
    fd: scala.Double,
    atime: java.lang.String,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimes(
    fd: scala.Double,
    atime: scala.Double,
    mtime: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def futimes(fd: scala.Double, atime: scala.Double, mtime: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimes(
    fd: scala.Double,
    atime: scala.Double,
    mtime: scala.Double,
    callback: js.Function1[
      (/* err */ nodeLib.NodeJSNs.ErrnoException) | (/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException]), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def futimes(fd: scala.Double, atime: scala.Double, mtime: stdLib.Date): stdLib.Promise[scala.Unit] = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimes(
    fd: scala.Double,
    atime: scala.Double,
    mtime: stdLib.Date,
    callback: js.Function1[
      (/* err */ nodeLib.NodeJSNs.ErrnoException) | (/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException]), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimes(
    fd: scala.Double,
    atime: stdLib.Date,
    mtime: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def futimes(fd: scala.Double, atime: stdLib.Date, mtime: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimes(
    fd: scala.Double,
    atime: stdLib.Date,
    mtime: scala.Double,
    callback: js.Function1[
      (/* err */ nodeLib.NodeJSNs.ErrnoException) | (/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException]), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def futimes(fd: scala.Double, atime: stdLib.Date, mtime: stdLib.Date): stdLib.Promise[scala.Unit] = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimes(
    fd: scala.Double,
    atime: stdLib.Date,
    mtime: stdLib.Date,
    callback: js.Function1[
      (/* err */ nodeLib.NodeJSNs.ErrnoException) | (/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException]), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: java.lang.String): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: scala.Double): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimesSync(fd: scala.Double, atime: java.lang.String, mtime: stdLib.Date): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: java.lang.String): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimesSync(fd: scala.Double, atime: scala.Double, mtime: stdLib.Date): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimesSync(fd: scala.Double, atime: stdLib.Date, mtime: java.lang.String): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimesSync(fd: scala.Double, atime: stdLib.Date, mtime: scala.Double): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def futimesSync(fd: scala.Double, atime: stdLib.Date, mtime: stdLib.Date): scala.Unit = js.native
  def lchmod(path: java.lang.String, mode: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def lchmod(
    path: java.lang.String,
    mode: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def lchmod(path: java.lang.String, mode: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def lchmod(
    path: java.lang.String,
    mode: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def lchmod(path: nodeLib.Buffer, mode: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def lchmod(
    path: nodeLib.Buffer,
    mode: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def lchmod(path: nodeLib.Buffer, mode: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def lchmod(
    path: nodeLib.Buffer,
    mode: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def lchmod(
    path: nodeLib.fsMod.PathLike,
    mode: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def lchmod(
    path: nodeLib.fsMod.PathLike,
    mode: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def lchmodSync(path: nodeLib.fsMod.PathLike, mode: java.lang.String): scala.Unit = js.native
  /**
       * Synchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
       */
  def lchmodSync(path: nodeLib.fsMod.PathLike, mode: scala.Double): scala.Unit = js.native
  def lchown(path: java.lang.String, uid: scala.Double, gid: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def lchown(
    path: java.lang.String,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def lchown(path: nodeLib.Buffer, uid: scala.Double, gid: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def lchown(
    path: nodeLib.Buffer,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def lchown(
    path: nodeLib.fsMod.PathLike,
    uid: scala.Double,
    gid: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def lchownSync(path: nodeLib.fsMod.PathLike, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  /**
       * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
       * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def link(
    existingPath: nodeLib.fsMod.PathLike,
    newPath: nodeLib.fsMod.PathLike,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def link(srcpath: java.lang.String, dstpath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def link(
    srcpath: java.lang.String,
    dstpath: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def link(srcpath: java.lang.String, dstpath: nodeLib.Buffer): stdLib.Promise[scala.Unit] = js.native
  def link(
    srcpath: java.lang.String,
    dstpath: nodeLib.Buffer,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def link(srcpath: nodeLib.Buffer, dstpath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def link(
    srcpath: nodeLib.Buffer,
    dstpath: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def link(srcpath: nodeLib.Buffer, dstpath: nodeLib.Buffer): stdLib.Promise[scala.Unit] = js.native
  def link(
    srcpath: nodeLib.Buffer,
    dstpath: nodeLib.Buffer,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous link(2) - Create a new link (also known as a hard link) to an existing file.
       * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def linkSync(existingPath: nodeLib.fsMod.PathLike, newPath: nodeLib.fsMod.PathLike): scala.Unit = js.native
  def lstat(path: java.lang.String): stdLib.Promise[nodeLib.fsMod.Stats] = js.native
  def lstat(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* stats */ nodeLib.fsMod.Stats, _]
  ): scala.Unit = js.native
  def lstat(path: nodeLib.Buffer): stdLib.Promise[nodeLib.fsMod.Stats] = js.native
  def lstat(
    path: nodeLib.Buffer,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* stats */ nodeLib.fsMod.Stats, _]
  ): scala.Unit = js.native
  /**
       * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def lstat(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* stats */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Synchronous lstat(2) - Get file status. Does not dereference symbolic links.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def lstatSync(path: nodeLib.fsMod.PathLike): nodeLib.fsMod.Stats = js.native
  def mkdir(path: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def mkdir(
    path: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def mkdir(path: java.lang.String, mode: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def mkdir(
    path: java.lang.String,
    mode: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def mkdir(path: java.lang.String, mode: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def mkdir(
    path: java.lang.String,
    mode: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def mkdir(path: nodeLib.Buffer): stdLib.Promise[scala.Unit] = js.native
  def mkdir(
    path: nodeLib.Buffer,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def mkdir(path: nodeLib.Buffer, mode: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def mkdir(
    path: nodeLib.Buffer,
    mode: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def mkdir(path: nodeLib.Buffer, mode: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def mkdir(
    path: nodeLib.Buffer,
    mode: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous mkdir(2) - create a directory with a mode of `0o777`.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def mkdir(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous mkdir(2) - create a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
       * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
       */
  def mkdir(
    path: nodeLib.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous mkdir(2) - create a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
       * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
       */
  def mkdir(
    path: nodeLib.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous mkdir(2) - create a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
       * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
       */
  def mkdir(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.fsMod.MakeDirectoryOptions,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous mkdir(2) - create a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
       * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
       */
  def mkdir(
    path: nodeLib.fsMod.PathLike,
    options: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous mkdir(2) - create a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
       * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
       */
  def mkdir(
    path: nodeLib.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous mkdir(2) - create a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
       * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
       */
  def mkdirSync(path: nodeLib.fsMod.PathLike): scala.Unit = js.native
  /**
       * Synchronous mkdir(2) - create a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
       * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
       */
  def mkdirSync(path: nodeLib.fsMod.PathLike, options: java.lang.String): scala.Unit = js.native
  /**
       * Synchronous mkdir(2) - create a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
       * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
       */
  def mkdirSync(path: nodeLib.fsMod.PathLike, options: nodeLib.fsMod.MakeDirectoryOptions): scala.Unit = js.native
  /**
       * Synchronous mkdir(2) - create a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
       * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
       */
  def mkdirSync(path: nodeLib.fsMod.PathLike, options: scala.Double): scala.Unit = js.native
  def mkdirp(dir: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def mkdirs(dir: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
       * Asynchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       */
  def mkdtemp(
    prefix: java.lang.String,
    callback: js.Function2[
      (/* err */ nodeLib.NodeJSNs.ErrnoException) | (/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException]), 
      /* folder */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtemp(
    prefix: java.lang.String,
    options: nodeLib.BufferEncoding | js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def mkdtemp(prefix: java.lang.String, options: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  /**
       * Asynchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtemp(
    prefix: java.lang.String,
    options: java.lang.String,
    callback: js.Function2[
      (/* err */ nodeLib.NodeJSNs.ErrnoException) | (/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException]), 
      java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def mkdtemp(prefix: java.lang.String, options: mzLib.Anon_EncodingString): stdLib.Promise[java.lang.String] = js.native
  def mkdtemp(
    prefix: java.lang.String,
    options: mzLib.Anon_EncodingString,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], 
      /* folder */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtemp(
    prefix: java.lang.String,
    options: nodeLib.Anon_EncodingBufferEncodingNull,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* folder */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtemp(
    prefix: java.lang.String,
    options: nodeLib.Anon_EncodingBuffer_1560675869,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* folder */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtemp(
    prefix: java.lang.String,
    options: nodeLib.Anon_EncodingStringNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* folder */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtemp(
    prefix: java.lang.String,
    options: scala.Null,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Synchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtempSync(prefix: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtempSync(prefix: java.lang.String, options: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtempSync(prefix: java.lang.String, options: nodeLib.Anon_EncodingBufferEncodingNull): java.lang.String = js.native
  /**
       * Synchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtempSync(prefix: java.lang.String, options: nodeLib.Anon_EncodingBuffer_1560675869): nodeLib.Buffer = js.native
  /**
       * Synchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtempSync(prefix: java.lang.String, options: nodeLib.Anon_EncodingStringNull): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def mkdtempSync(prefix: java.lang.String, options: nodeLib.BufferEncoding): java.lang.String = js.native
  /**
       * Synchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("mkdtempSync")
  def mkdtempSync_String(prefix: java.lang.String): java.lang.String = js.native
  /**
       * Synchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("mkdtempSync")
  def mkdtempSync_buffer(prefix: java.lang.String, options: fsDashPromiseLib.fsDashPromiseLibStrings.buffer): nodeLib.Buffer = js.native
  /**
       * Asynchronously creates a unique temporary directory.
       * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("mkdtemp")
  def mkdtemp_buffer(
    prefix: java.lang.String,
    options: fsDashPromiseLib.fsDashPromiseLibStrings.buffer,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* folder */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def move(src: java.lang.String, dst: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def open(path: java.lang.String, flags: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def open(
    path: java.lang.String,
    flags: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def open(path: java.lang.String, flags: java.lang.String, mode: scala.Double): stdLib.Promise[scala.Double] = js.native
  def open(
    path: java.lang.String,
    flags: java.lang.String,
    mode: scala.Double,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def open(path: java.lang.String, flags: scala.Double): stdLib.Promise[scala.Double] = js.native
  def open(
    path: java.lang.String,
    flags: scala.Double,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def open(path: java.lang.String, flags: scala.Double, mode: scala.Double): stdLib.Promise[scala.Double] = js.native
  def open(
    path: java.lang.String,
    flags: scala.Double,
    mode: scala.Double,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def open(path: nodeLib.Buffer, flags: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def open(
    path: nodeLib.Buffer,
    flags: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def open(path: nodeLib.Buffer, flags: java.lang.String, mode: scala.Double): stdLib.Promise[scala.Double] = js.native
  def open(
    path: nodeLib.Buffer,
    flags: java.lang.String,
    mode: scala.Double,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def open(path: nodeLib.Buffer, flags: scala.Double): stdLib.Promise[scala.Double] = js.native
  def open(
    path: nodeLib.Buffer,
    flags: scala.Double,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def open(path: nodeLib.Buffer, flags: scala.Double, mode: scala.Double): stdLib.Promise[scala.Double] = js.native
  def open(
    path: nodeLib.Buffer,
    flags: scala.Double,
    mode: scala.Double,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file. If the file is created, its mode will be `0o666`.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def open(
    path: nodeLib.fsMod.PathLike,
    flags: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def open(
    path: nodeLib.fsMod.PathLike,
    flags: java.lang.String,
    mode: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def open(
    path: nodeLib.fsMod.PathLike,
    flags: java.lang.String,
    mode: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def open(
    path: nodeLib.fsMod.PathLike,
    flags: java.lang.String,
    mode: scala.Double,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def open(
    path: nodeLib.fsMod.PathLike,
    flags: java.lang.String,
    mode: scala.Null,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file. If the file is created, its mode will be `0o666`.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def open(
    path: nodeLib.fsMod.PathLike,
    flags: scala.Double,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def open(
    path: nodeLib.fsMod.PathLike,
    flags: scala.Double,
    mode: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def open(
    path: nodeLib.fsMod.PathLike,
    flags: scala.Double,
    mode: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def open(
    path: nodeLib.fsMod.PathLike,
    flags: scala.Double,
    mode: scala.Double,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous open(2) - open and possibly create a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def open(
    path: nodeLib.fsMod.PathLike,
    flags: scala.Double,
    mode: scala.Null,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* fd */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous open(2) - open and possibly create a file, returning a file descriptor..
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def openSync(path: nodeLib.fsMod.PathLike, flags: java.lang.String): scala.Double = js.native
  /**
       * Synchronous open(2) - open and possibly create a file, returning a file descriptor..
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def openSync(path: nodeLib.fsMod.PathLike, flags: java.lang.String, mode: java.lang.String): scala.Double = js.native
  /**
       * Synchronous open(2) - open and possibly create a file, returning a file descriptor..
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def openSync(path: nodeLib.fsMod.PathLike, flags: java.lang.String, mode: scala.Double): scala.Double = js.native
  /**
       * Synchronous open(2) - open and possibly create a file, returning a file descriptor..
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def openSync(path: nodeLib.fsMod.PathLike, flags: scala.Double): scala.Double = js.native
  /**
       * Synchronous open(2) - open and possibly create a file, returning a file descriptor..
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def openSync(path: nodeLib.fsMod.PathLike, flags: scala.Double, mode: java.lang.String): scala.Double = js.native
  /**
       * Synchronous open(2) - open and possibly create a file, returning a file descriptor..
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
       */
  def openSync(path: nodeLib.fsMod.PathLike, flags: scala.Double, mode: scala.Double): scala.Double = js.native
  def outputFile(file: java.lang.String, data: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def outputFile(file: java.lang.String, data: java.lang.String, options: WriteOptions): stdLib.Promise[scala.Unit] = js.native
  def outputFile(file: java.lang.String, data: nodeLib.Buffer): stdLib.Promise[scala.Unit] = js.native
  def outputFile(file: java.lang.String, data: nodeLib.Buffer, options: WriteOptions): stdLib.Promise[scala.Unit] = js.native
  def outputJSON(file: java.lang.String, data: js.Any): stdLib.Promise[scala.Unit] = js.native
  def outputJSON(file: java.lang.String, data: js.Any, options: WriteJsonOptions): stdLib.Promise[scala.Unit] = js.native
  def outputJson(file: java.lang.String, data: js.Any): stdLib.Promise[scala.Unit] = js.native
  def outputJson(file: java.lang.String, data: js.Any, options: WriteJsonOptions): stdLib.Promise[scala.Unit] = js.native
  def read(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): stdLib.Promise[js.Tuple2[scala.Double, nodeLib.Buffer]] = js.native
  def read(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads data from the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param buffer The buffer that the data will be written to.
       * @param offset The offset in the buffer at which to start writing.
       * @param length The number of bytes to read.
       * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
       */
  def read[TBuffer /* <: nodeLib.fsMod.BinaryData */](fd: scala.Double, buffer: TBuffer, offset: scala.Double, length: scala.Double): scala.Unit = js.native
  /**
       * Asynchronously reads data from the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param buffer The buffer that the data will be written to.
       * @param offset The offset in the buffer at which to start writing.
       * @param length The number of bytes to read.
       * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
       */
  def read[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Unit = js.native
  /**
       * Asynchronously reads data from the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param buffer The buffer that the data will be written to.
       * @param offset The offset in the buffer at which to start writing.
       * @param length The number of bytes to read.
       * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
       */
  def read[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads data from the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param buffer The buffer that the data will be written to.
       * @param offset The offset in the buffer at which to start writing.
       * @param length The number of bytes to read.
       * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
       */
  def read[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Null,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* bytesRead */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(file: java.lang.String): stdLib.Promise[nodeLib.Buffer] = js.native
  def readFile(
    file: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def readFile(file: java.lang.String, options: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def readFile(
    file: java.lang.String,
    options: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def readFile(
    file: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def readFile(file: java.lang.String, options: mzLib.Anon_EncodingBuffer): stdLib.Promise[nodeLib.Buffer] = js.native
  def readFile(
    file: java.lang.String,
    options: mzLib.Anon_EncodingBuffer,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def readFile(file: java.lang.String, options: mzLib.Anon_EncodingFlag): stdLib.Promise[java.lang.String] = js.native
  def readFile(
    file: java.lang.String,
    options: mzLib.Anon_EncodingFlag,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def readFile(
    file: java.lang.String,
    options: scala.Null,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def readFile(file: nodeLib.Buffer): stdLib.Promise[nodeLib.Buffer] = js.native
  def readFile(
    file: nodeLib.Buffer,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def readFile(file: nodeLib.Buffer, options: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def readFile(
    file: nodeLib.Buffer,
    options: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def readFile(
    file: nodeLib.Buffer,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def readFile(file: nodeLib.Buffer, options: mzLib.Anon_EncodingBuffer): stdLib.Promise[nodeLib.Buffer] = js.native
  def readFile(
    file: nodeLib.Buffer,
    options: mzLib.Anon_EncodingBuffer,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def readFile(file: nodeLib.Buffer, options: mzLib.Anon_EncodingFlag): stdLib.Promise[java.lang.String] = js.native
  def readFile(
    file: nodeLib.Buffer,
    options: mzLib.Anon_EncodingFlag,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def readFile(
    file: nodeLib.Buffer,
    options: scala.Null,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def readFile(file: scala.Double): stdLib.Promise[nodeLib.Buffer] = js.native
  def readFile(file: scala.Double, options: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def readFile(file: scala.Double, options: mzLib.Anon_EncodingBuffer): stdLib.Promise[nodeLib.Buffer] = js.native
  def readFile(
    file: scala.Double,
    options: mzLib.Anon_EncodingBuffer,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def readFile(file: scala.Double, options: mzLib.Anon_EncodingFlag): stdLib.Promise[java.lang.String] = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       */
  def readFile(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: nodeLib.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: nodeLib.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingFlagStringNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* data */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingFlagString,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingFlag,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: nodeLib.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       */
  def readFile(
    path: scala.Double,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: scala.Double,
    options: mzLib.Anon_EncodingFlag | nodeLib.Anon_EncodingFlag | js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: scala.Double,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: scala.Double,
    options: nodeLib.Anon_EncodingFlagStringNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* data */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: scala.Double,
    options: nodeLib.Anon_EncodingFlagString,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  /**
       * Asynchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFile(
    path: scala.Double,
    options: scala.Null,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: nodeLib.fsMod.PathLike): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: nodeLib.fsMod.PathLike, options: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag. If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFlag): nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFlagString): java.lang.String = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFlagStringNull): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: scala.Double): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: scala.Double, options: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag. If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: scala.Double, options: nodeLib.Anon_EncodingFlag): nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: scala.Double, options: nodeLib.Anon_EncodingFlagString): java.lang.String = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  def readFileSync(path: scala.Double, options: nodeLib.Anon_EncodingFlagStringNull): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag. If a flag is not provided, it defaults to `'r'`.
       */
  @JSName("readFileSync")
  def readFileSync_Buffer(path: nodeLib.fsMod.PathLike): nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options An object that may contain an optional flag. If a flag is not provided, it defaults to `'r'`.
       */
  @JSName("readFileSync")
  def readFileSync_Buffer(path: scala.Double): nodeLib.Buffer = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  @JSName("readFileSync")
  def readFileSync_String(path: nodeLib.fsMod.PathLike, options: java.lang.String): java.lang.String = js.native
  /**
       * Synchronously reads the entire contents of a file.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
       * If a flag is not provided, it defaults to `'r'`.
       */
  @JSName("readFileSync")
  def readFileSync_String(path: scala.Double, options: java.lang.String): java.lang.String = js.native
  @JSName("readFile")
  def readFile_buffer(file: java.lang.String, options: fsDashPromiseLib.fsDashPromiseLibStrings.buffer): stdLib.Promise[nodeLib.Buffer] = js.native
  @JSName("readFile")
  def readFile_buffer(
    file: java.lang.String,
    options: fsDashPromiseLib.fsDashPromiseLibStrings.buffer,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  @JSName("readFile")
  def readFile_buffer(file: nodeLib.Buffer, options: fsDashPromiseLib.fsDashPromiseLibStrings.buffer): stdLib.Promise[nodeLib.Buffer] = js.native
  @JSName("readFile")
  def readFile_buffer(
    file: nodeLib.Buffer,
    options: fsDashPromiseLib.fsDashPromiseLibStrings.buffer,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  @JSName("readFile")
  def readFile_buffer(file: scala.Double, options: fsDashPromiseLib.fsDashPromiseLibStrings.buffer): stdLib.Promise[nodeLib.Buffer] = js.native
  @JSName("readFile")
  def readFile_buffer(
    file: scala.Double,
    options: fsDashPromiseLib.fsDashPromiseLibStrings.buffer,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def readJSON(file: java.lang.String): stdLib.Promise[_] = js.native
  def readJSON(file: java.lang.String, options: ReadJsonOptions): stdLib.Promise[_] = js.native
  def readJson(file: java.lang.String): stdLib.Promise[_] = js.native
  def readJson(file: java.lang.String, options: ReadJsonOptions): stdLib.Promise[_] = js.native
  /**
       * Synchronously reads data from the file referenced by the supplied file descriptor, returning the number of bytes read.
       * @param fd A file descriptor.
       * @param buffer The buffer that the data will be written to.
       * @param offset The offset in the buffer at which to start writing.
       * @param length The number of bytes to read.
       * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
       */
  def readSync(fd: scala.Double, buffer: nodeLib.fsMod.BinaryData, offset: scala.Double, length: scala.Double): scala.Double = js.native
  /**
       * Synchronously reads data from the file referenced by the supplied file descriptor, returning the number of bytes read.
       * @param fd A file descriptor.
       * @param buffer The buffer that the data will be written to.
       * @param offset The offset in the buffer at which to start writing.
       * @param length The number of bytes to read.
       * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
       */
  def readSync(
    fd: scala.Double,
    buffer: nodeLib.fsMod.BinaryData,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = js.native
  def readdir(path: java.lang.String): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def readdir(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readdir(path: nodeLib.Buffer): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def readdir(
    path: nodeLib.Buffer,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def readdir(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdir(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.BufferEncoding | js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      js.Array[java.lang.String] | js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdir(
    path: nodeLib.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String] | js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdir(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_WithFileTypesFalseEncoding,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String] | js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdir(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_WithFileTypesFalse,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
       */
  def readdir(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_WithFileTypesTrue,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[nodeLib.fsMod.Dirent], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdir(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_WithFileTypes,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdir(
    path: nodeLib.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      js.Array[java.lang.String] | js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Synchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdirSync(path: nodeLib.fsMod.PathLike): js.Array[java.lang.String] = js.native
  /**
       * Synchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdirSync(path: nodeLib.fsMod.PathLike, options: java.lang.String): js.Array[java.lang.String] | js.Array[nodeLib.Buffer] = js.native
  /**
       * Synchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdirSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_WithFileTypes): js.Array[java.lang.String] = js.native
  /**
       * Synchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdirSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_WithFileTypesFalse): js.Array[nodeLib.Buffer] = js.native
  /**
       * Synchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdirSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_WithFileTypesFalseEncoding): js.Array[java.lang.String] | js.Array[nodeLib.Buffer] = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
       */
  def readdirSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_WithFileTypesTrue): js.Array[nodeLib.fsMod.Dirent] = js.native
  /**
       * Synchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readdirSync(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): js.Array[java.lang.String] = js.native
  /**
       * Synchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("readdirSync")
  def `readdirSync_<union>`(path: nodeLib.fsMod.PathLike): js.Array[java.lang.String] | js.Array[nodeLib.Buffer] = js.native
  /**
       * Synchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("readdirSync")
  def readdirSync_buffer(path: nodeLib.fsMod.PathLike, options: fsDashPromiseLib.fsDashPromiseLibStrings.buffer): js.Array[nodeLib.Buffer] = js.native
  /**
       * Asynchronous readdir(3) - read a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("readdir")
  def readdir_buffer(
    path: nodeLib.fsMod.PathLike,
    options: fsDashPromiseLib.fsDashPromiseLibStrings.buffer,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* files */ js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readlink(path: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def readlink(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* linkString */ java.lang.String, _]
  ): scala.Unit = js.native
  def readlink(path: nodeLib.Buffer): stdLib.Promise[java.lang.String] = js.native
  def readlink(
    path: nodeLib.Buffer,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* linkString */ java.lang.String, _]
  ): scala.Unit = js.native
  /**
       * Asynchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def readlink(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* linkString */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlink(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.BufferEncoding | js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlink(
    path: nodeLib.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* linkString */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlink(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingBufferEncodingNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* linkString */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlink(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingBuffer_1560675869,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* linkString */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlink(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingStringNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* linkString */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlink(
    path: nodeLib.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Synchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlinkSync(path: nodeLib.fsMod.PathLike): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlinkSync(path: nodeLib.fsMod.PathLike, options: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlinkSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingBufferEncodingNull): java.lang.String = js.native
  /**
       * Synchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlinkSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingBuffer_1560675869): nodeLib.Buffer = js.native
  /**
       * Synchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlinkSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingStringNull): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def readlinkSync(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): java.lang.String = js.native
  /**
       * Synchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("readlinkSync")
  def readlinkSync_String(path: nodeLib.fsMod.PathLike): java.lang.String = js.native
  /**
       * Synchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("readlinkSync")
  def readlinkSync_buffer(path: nodeLib.fsMod.PathLike, options: fsDashPromiseLib.fsDashPromiseLibStrings.buffer): nodeLib.Buffer = js.native
  /**
       * Asynchronous readlink(2) - read value of a symbolic link.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("readlink")
  def readlink_buffer(
    path: nodeLib.fsMod.PathLike,
    options: fsDashPromiseLib.fsDashPromiseLibStrings.buffer,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* linkString */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def realpath(path: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def realpath(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* resolvedPath */ java.lang.String, _]
  ): scala.Unit = js.native
  def realpath(path: nodeLib.Buffer): stdLib.Promise[java.lang.String] = js.native
  def realpath(
    path: nodeLib.Buffer,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* resolvedPath */ java.lang.String, _]
  ): scala.Unit = js.native
  /**
       * Asynchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def realpath(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpath(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.BufferEncoding | js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpath(
    path: nodeLib.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpath(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingBufferEncodingNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpath(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingBuffer_1560675869,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpath(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingStringNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpath(
    path: nodeLib.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Synchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpathSync(path: nodeLib.fsMod.PathLike): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpathSync(path: nodeLib.fsMod.PathLike, options: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpathSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingBufferEncodingNull): java.lang.String = js.native
  /**
       * Synchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpathSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingBuffer_1560675869): nodeLib.Buffer = js.native
  /**
       * Synchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpathSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingStringNull): java.lang.String | nodeLib.Buffer = js.native
  /**
       * Synchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  def realpathSync(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): java.lang.String = js.native
  /**
       * Synchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("realpathSync")
  def realpathSync_String(path: nodeLib.fsMod.PathLike): java.lang.String = js.native
  /**
       * Synchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("realpathSync")
  def realpathSync_buffer(path: nodeLib.fsMod.PathLike, options: fsDashPromiseLib.fsDashPromiseLibStrings.buffer): nodeLib.Buffer = js.native
  /**
       * Asynchronous realpath(3) - return the canonicalized absolute pathname.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
       */
  @JSName("realpath")
  def realpath_buffer(
    path: nodeLib.fsMod.PathLike,
    options: fsDashPromiseLib.fsDashPromiseLibStrings.buffer,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def remove(path: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def rename(oldPath: java.lang.String, newPath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def rename(
    oldPath: java.lang.String,
    newPath: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous rename(2) - Change the name or location of a file or directory.
       * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def rename(
    oldPath: nodeLib.fsMod.PathLike,
    newPath: nodeLib.fsMod.PathLike,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous rename(2) - Change the name or location of a file or directory.
       * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def renameSync(oldPath: nodeLib.fsMod.PathLike, newPath: nodeLib.fsMod.PathLike): scala.Unit = js.native
  def rmdir(path: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def rmdir(
    path: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def rmdir(path: nodeLib.Buffer): stdLib.Promise[scala.Unit] = js.native
  def rmdir(
    path: nodeLib.Buffer,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous rmdir(2) - delete a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def rmdir(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous rmdir(2) - delete a directory.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def rmdirSync(path: nodeLib.fsMod.PathLike): scala.Unit = js.native
  def stat(path: java.lang.String): stdLib.Promise[nodeLib.fsMod.Stats] = js.native
  def stat(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* stats */ nodeLib.fsMod.Stats, _]
  ): scala.Unit = js.native
  def stat(path: nodeLib.Buffer): stdLib.Promise[nodeLib.fsMod.Stats] = js.native
  def stat(
    path: nodeLib.Buffer,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* stats */ nodeLib.fsMod.Stats, _]
  ): scala.Unit = js.native
  /**
       * Asynchronous stat(2) - Get file status.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def stat(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* stats */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Synchronous stat(2) - Get file status.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def statSync(path: nodeLib.fsMod.PathLike): nodeLib.fsMod.Stats = js.native
  def symlink(srcpath: java.lang.String, dstpath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def symlink(
    srcpath: java.lang.String,
    dstpath: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def symlink(srcpath: java.lang.String, dstpath: java.lang.String, `type`: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def symlink(
    srcpath: java.lang.String,
    dstpath: java.lang.String,
    `type`: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def symlink(srcpath: java.lang.String, dstpath: nodeLib.Buffer): stdLib.Promise[scala.Unit] = js.native
  def symlink(
    srcpath: java.lang.String,
    dstpath: nodeLib.Buffer,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def symlink(srcpath: java.lang.String, dstpath: nodeLib.Buffer, `type`: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def symlink(
    srcpath: java.lang.String,
    dstpath: nodeLib.Buffer,
    `type`: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def symlink(srcpath: nodeLib.Buffer, dstpath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def symlink(
    srcpath: nodeLib.Buffer,
    dstpath: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def symlink(srcpath: nodeLib.Buffer, dstpath: java.lang.String, `type`: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def symlink(
    srcpath: nodeLib.Buffer,
    dstpath: java.lang.String,
    `type`: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def symlink(srcpath: nodeLib.Buffer, dstpath: nodeLib.Buffer): stdLib.Promise[scala.Unit] = js.native
  def symlink(
    srcpath: nodeLib.Buffer,
    dstpath: nodeLib.Buffer,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def symlink(srcpath: nodeLib.Buffer, dstpath: nodeLib.Buffer, `type`: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def symlink(
    srcpath: nodeLib.Buffer,
    dstpath: nodeLib.Buffer,
    `type`: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
       * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
       * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
       */
  def symlink(
    target: nodeLib.fsMod.PathLike,
    path: nodeLib.fsMod.PathLike,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
       * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
       * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
       * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
       * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
       */
  def symlink(
    target: nodeLib.fsMod.PathLike,
    path: nodeLib.fsMod.PathLike,
    `type`: nodeLib.fsMod.symlinkNs.Type | js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
       * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
       * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
       * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
       * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
       */
  def symlink(
    target: nodeLib.fsMod.PathLike,
    path: nodeLib.fsMod.PathLike,
    `type`: scala.Null,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous symlink(2) - Create a new symbolic link to an existing file.
       * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
       * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
       * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
       * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
       */
  def symlinkSync(target: nodeLib.fsMod.PathLike, path: nodeLib.fsMod.PathLike): scala.Unit = js.native
  /**
       * Synchronous symlink(2) - Create a new symbolic link to an existing file.
       * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
       * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
       * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
       * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
       */
  def symlinkSync(target: nodeLib.fsMod.PathLike, path: nodeLib.fsMod.PathLike, `type`: nodeLib.fsMod.symlinkNs.Type): scala.Unit = js.native
  def truncate(path: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def truncate(
    path: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def truncate(path: java.lang.String, len: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def truncate(
    path: java.lang.String,
    len: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def truncate(path: nodeLib.Buffer): stdLib.Promise[scala.Unit] = js.native
  def truncate(
    path: nodeLib.Buffer,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def truncate(path: nodeLib.Buffer, len: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def truncate(
    path: nodeLib.Buffer,
    len: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous truncate(2) - Truncate a file to a specified length.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def truncate(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous truncate(2) - Truncate a file to a specified length.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param len If not specified, defaults to `0`.
       */
  def truncate(
    path: nodeLib.fsMod.PathLike,
    len: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous truncate(2) - Truncate a file to a specified length.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param len If not specified, defaults to `0`.
       */
  def truncate(
    path: nodeLib.fsMod.PathLike,
    len: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous truncate(2) - Truncate a file to a specified length.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param len If not specified, defaults to `0`.
       */
  def truncate(
    path: nodeLib.fsMod.PathLike,
    len: scala.Null,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous truncate(2) - Truncate a file to a specified length.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param len If not specified, defaults to `0`.
       */
  def truncateSync(path: nodeLib.fsMod.PathLike): scala.Unit = js.native
  /**
       * Synchronous truncate(2) - Truncate a file to a specified length.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param len If not specified, defaults to `0`.
       */
  def truncateSync(path: nodeLib.fsMod.PathLike, len: scala.Double): scala.Unit = js.native
  def unlink(path: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def unlink(
    path: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def unlink(path: nodeLib.Buffer): stdLib.Promise[scala.Unit] = js.native
  def unlink(
    path: nodeLib.Buffer,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def unlink(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronous unlink(2) - delete a name and possibly the file it refers to.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       */
  def unlinkSync(path: nodeLib.fsMod.PathLike): scala.Unit = js.native
  /**
       * Stop watching for changes on `filename`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def unwatchFile(filename: nodeLib.fsMod.PathLike): scala.Unit = js.native
  /**
       * Stop watching for changes on `filename`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def unwatchFile(
    filename: nodeLib.fsMod.PathLike,
    listener: js.Function2[/* curr */ nodeLib.fsMod.Stats, /* prev */ nodeLib.fsMod.Stats, scala.Unit]
  ): scala.Unit = js.native
  def utimes(path: java.lang.String, atime: scala.Double, mtime: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def utimes(
    path: java.lang.String,
    atime: scala.Double,
    mtime: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def utimes(path: java.lang.String, atime: scala.Double, mtime: stdLib.Date): stdLib.Promise[scala.Unit] = js.native
  def utimes(
    path: java.lang.String,
    atime: scala.Double,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def utimes(path: java.lang.String, atime: stdLib.Date, mtime: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def utimes(
    path: java.lang.String,
    atime: stdLib.Date,
    mtime: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def utimes(path: java.lang.String, atime: stdLib.Date, mtime: stdLib.Date): stdLib.Promise[scala.Unit] = js.native
  def utimes(
    path: java.lang.String,
    atime: stdLib.Date,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def utimes(path: nodeLib.Buffer, atime: scala.Double, mtime: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def utimes(
    path: nodeLib.Buffer,
    atime: scala.Double,
    mtime: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def utimes(path: nodeLib.Buffer, atime: scala.Double, mtime: stdLib.Date): stdLib.Promise[scala.Unit] = js.native
  def utimes(
    path: nodeLib.Buffer,
    atime: scala.Double,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def utimes(path: nodeLib.Buffer, atime: stdLib.Date, mtime: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def utimes(
    path: nodeLib.Buffer,
    atime: stdLib.Date,
    mtime: scala.Double,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  def utimes(path: nodeLib.Buffer, atime: stdLib.Date, mtime: stdLib.Date): stdLib.Promise[scala.Unit] = js.native
  def utimes(
    path: nodeLib.Buffer,
    atime: stdLib.Date,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException], scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimes(
    path: nodeLib.fsMod.PathLike,
    atime: java.lang.String,
    mtime: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimes(
    path: nodeLib.fsMod.PathLike,
    atime: java.lang.String,
    mtime: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimes(
    path: nodeLib.fsMod.PathLike,
    atime: java.lang.String,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimes(
    path: nodeLib.fsMod.PathLike,
    atime: scala.Double,
    mtime: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimes(
    path: nodeLib.fsMod.PathLike,
    atime: scala.Double,
    mtime: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimes(
    path: nodeLib.fsMod.PathLike,
    atime: scala.Double,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimes(
    path: nodeLib.fsMod.PathLike,
    atime: stdLib.Date,
    mtime: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimes(
    path: nodeLib.fsMod.PathLike,
    atime: stdLib.Date,
    mtime: scala.Double,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimes(
    path: nodeLib.fsMod.PathLike,
    atime: stdLib.Date,
    mtime: stdLib.Date,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimesSync(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: java.lang.String): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimesSync(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: scala.Double): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimesSync(path: nodeLib.fsMod.PathLike, atime: java.lang.String, mtime: stdLib.Date): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimesSync(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: java.lang.String): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimesSync(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: scala.Double): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimesSync(path: nodeLib.fsMod.PathLike, atime: scala.Double, mtime: stdLib.Date): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimesSync(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: java.lang.String): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimesSync(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: scala.Double): scala.Unit = js.native
  /**
       * Synchronously change file timestamps of the file referenced by the supplied path.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * @param atime The last access time. If a string is provided, it will be coerced to number.
       * @param mtime The last modified time. If a string is provided, it will be coerced to number.
       */
  def utimesSync(path: nodeLib.fsMod.PathLike, atime: stdLib.Date, mtime: stdLib.Date): scala.Unit = js.native
  def walk(dir: java.lang.String): stdLib.Promise[js.Array[java.lang.String]] = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(filename: nodeLib.fsMod.PathLike): nodeLib.fsMod.FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def watch(
    filename: nodeLib.fsMod.PathLike,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, _]
  ): nodeLib.fsMod.FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(
    filename: nodeLib.fsMod.PathLike,
    options: nodeLib.BufferEncoding | js.UndefOr[scala.Nothing],
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, scala.Unit]
  ): nodeLib.fsMod.FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(filename: nodeLib.fsMod.PathLike, options: java.lang.String): nodeLib.fsMod.FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(
    filename: nodeLib.fsMod.PathLike,
    options: java.lang.String,
    listener: js.Function2[
      /* event */ java.lang.String, 
      /* filename */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.fsMod.FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(filename: nodeLib.fsMod.PathLike, options: nodeLib.Anon_Recursive): nodeLib.fsMod.FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(filename: nodeLib.fsMod.PathLike, options: nodeLib.Anon_RecursivePersistent): nodeLib.fsMod.FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(filename: nodeLib.fsMod.PathLike, options: nodeLib.Anon_RecursivePersistentEncoding): nodeLib.fsMod.FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(
    filename: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_RecursivePersistentEncoding,
    listener: js.Function2[
      /* event */ java.lang.String, 
      /* filename */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.fsMod.FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(
    filename: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_RecursivePersistent,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ nodeLib.Buffer, scala.Unit]
  ): nodeLib.fsMod.FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(
    filename: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_Recursive,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ java.lang.String, scala.Unit]
  ): nodeLib.fsMod.FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(filename: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): nodeLib.fsMod.FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  def watch(
    filename: nodeLib.fsMod.PathLike,
    options: scala.Null,
    listener: js.Function2[/* event */ java.lang.String, java.lang.String | nodeLib.Buffer, scala.Unit]
  ): nodeLib.fsMod.FSWatcher = js.native
  /**
       * Watch for changes on `filename`. The callback `listener` will be called each time the file is accessed.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       */
  def watchFile(
    filename: nodeLib.fsMod.PathLike,
    listener: js.Function2[/* curr */ nodeLib.fsMod.Stats, /* prev */ nodeLib.fsMod.Stats, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Watch for changes on `filename`. The callback `listener` will be called each time the file is accessed.
       */
  def watchFile(
    filename: nodeLib.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    listener: js.Function2[/* curr */ nodeLib.fsMod.Stats, /* prev */ nodeLib.fsMod.Stats, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Watch for changes on `filename`. The callback `listener` will be called each time the file is accessed.
       */
  def watchFile(
    filename: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_Persistent,
    listener: js.Function2[/* curr */ nodeLib.fsMod.Stats, /* prev */ nodeLib.fsMod.Stats, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  @JSName("watch")
  def watch_buffer(filename: nodeLib.fsMod.PathLike, options: fsDashPromiseLib.fsDashPromiseLibStrings.buffer): nodeLib.fsMod.FSWatcher = js.native
  /**
       * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
       * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
       * If `encoding` is not supplied, the default of `'utf8'` is used.
       * If `persistent` is not supplied, the default of `true` is used.
       * If `recursive` is not supplied, the default of `false` is used.
       */
  @JSName("watch")
  def watch_buffer(
    filename: nodeLib.fsMod.PathLike,
    options: fsDashPromiseLib.fsDashPromiseLibStrings.buffer,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ nodeLib.Buffer, scala.Unit]
  ): nodeLib.fsMod.FSWatcher = js.native
  def write(fd: scala.Double, buffer: nodeLib.Buffer, offset: scala.Double, length: scala.Double): stdLib.Promise[js.Tuple2[scala.Double, nodeLib.Buffer]] = js.native
  def write(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def write(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): stdLib.Promise[js.Tuple2[scala.Double, nodeLib.Buffer]] = js.native
  def write(
    fd: scala.Double,
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def write(fd: scala.Double, data: java.lang.String): stdLib.Promise[js.Tuple2[scala.Double, java.lang.String]] = js.native
  def write(fd: scala.Double, data: java.lang.String, position: scala.Double): stdLib.Promise[js.Tuple2[scala.Double, java.lang.String]] = js.native
  def write(fd: scala.Double, data: java.lang.String, position: scala.Double, encoding: java.lang.String): stdLib.Promise[js.Tuple2[scala.Double, java.lang.String]] = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: js.UndefOr[scala.Nothing],
    encoding: java.lang.String,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: js.UndefOr[scala.Nothing],
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: js.UndefOr[scala.Nothing],
    encoding: scala.Null,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: scala.Double,
    encoding: java.lang.String,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: scala.Double,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: scala.Double,
    encoding: scala.Null,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: scala.Null,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: scala.Null,
    encoding: java.lang.String,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: scala.Null,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `string` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def write(
    fd: scala.Double,
    string: js.Any,
    position: scala.Null,
    encoding: scala.Null,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* str */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       */
  def write[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       */
  def write[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       */
  def write[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def write[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Double | scala.Null],
    length: js.UndefOr[scala.Double | scala.Null],
    position: js.UndefOr[scala.Double | scala.Null],
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       */
  def write[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       */
  def write[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: scala.Null,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       */
  def write[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       */
  def write[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Double,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       */
  def write[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Double,
    length: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       */
  def write[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Double,
    length: scala.Null,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       */
  def write[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Null,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       */
  def write[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Null,
    length: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       */
  def write[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Null,
    length: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes `buffer` to the file referenced by the supplied file descriptor.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       */
  def write[TBuffer /* <: nodeLib.fsMod.BinaryData */](
    fd: scala.Double,
    buffer: TBuffer,
    offset: scala.Null,
    length: scala.Null,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* written */ scala.Double, 
      /* buffer */ TBuffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def writeFile(file: java.lang.String, data: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def writeFile(file: java.lang.String, data: java.lang.String, options: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def writeFile(file: java.lang.String, data: java.lang.String, options: mzLib.Anon_Encoding): stdLib.Promise[scala.Unit] = js.native
  def writeFile(file: java.lang.String, data: nodeLib.Buffer): stdLib.Promise[scala.Unit] = js.native
  def writeFile(file: java.lang.String, data: nodeLib.Buffer, options: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def writeFile(file: java.lang.String, data: nodeLib.Buffer, options: mzLib.Anon_Encoding): stdLib.Promise[scala.Unit] = js.native
  def writeFile(
    filename: java.lang.String | scala.Double | nodeLib.Buffer,
    data: java.lang.String | nodeLib.Buffer,
    options: js.UndefOr[mzLib.Anon_Encoding | java.lang.String | scala.Null],
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def writeFile(
    filename: java.lang.String,
    data: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def writeFile(
    filename: java.lang.String,
    data: nodeLib.Buffer,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def writeFile(
    filename: nodeLib.Buffer,
    data: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def writeFile(
    filename: nodeLib.Buffer,
    data: nodeLib.Buffer,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def writeFile(
    filename: scala.Double,
    data: java.lang.String,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def writeFile(
    filename: scala.Double,
    data: nodeLib.Buffer,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  def writeFile(file: nodeLib.Buffer, data: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def writeFile(file: nodeLib.Buffer, data: java.lang.String, options: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def writeFile(file: nodeLib.Buffer, data: java.lang.String, options: mzLib.Anon_Encoding): stdLib.Promise[scala.Unit] = js.native
  def writeFile(file: nodeLib.Buffer, data: nodeLib.Buffer): stdLib.Promise[scala.Unit] = js.native
  def writeFile(file: nodeLib.Buffer, data: nodeLib.Buffer, options: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def writeFile(file: nodeLib.Buffer, data: nodeLib.Buffer, options: mzLib.Anon_Encoding): stdLib.Promise[scala.Unit] = js.native
  def writeFile(file: scala.Double, data: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def writeFile(file: scala.Double, data: java.lang.String, options: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def writeFile(file: scala.Double, data: java.lang.String, options: mzLib.Anon_Encoding): stdLib.Promise[scala.Unit] = js.native
  def writeFile(file: scala.Double, data: nodeLib.Buffer): stdLib.Promise[scala.Unit] = js.native
  def writeFile(file: scala.Double, data: nodeLib.Buffer, options: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def writeFile(file: scala.Double, data: nodeLib.Buffer, options: mzLib.Anon_Encoding): stdLib.Promise[scala.Unit] = js.native
  /**
       * Asynchronously writes data to a file, replacing the file if it already exists.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       */
  def writeFile(
    path: nodeLib.fsMod.PathLike,
    data: js.Any,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
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
  def writeFile(
    path: nodeLib.fsMod.PathLike,
    data: js.Any,
    options: nodeLib.fsMod.WriteFileOptions,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Asynchronously writes data to a file, replacing the file if it already exists.
       * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
       * URL support is _experimental_.
       * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
       * @param data The data to write. If something other than a Buffer or Uint8Array is provided, the value is coerced to a string.
       */
  def writeFile(
    path: scala.Double,
    data: js.Any,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
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
  def writeFile(
    path: scala.Double,
    data: js.Any,
    options: nodeLib.fsMod.WriteFileOptions,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Synchronously writes data to a file, replacing the file if it already exists.
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
  def writeFileSync(path: nodeLib.fsMod.PathLike, data: js.Any): scala.Unit = js.native
  /**
       * Synchronously writes data to a file, replacing the file if it already exists.
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
  def writeFileSync(path: nodeLib.fsMod.PathLike, data: js.Any, options: nodeLib.fsMod.WriteFileOptions): scala.Unit = js.native
  /**
       * Synchronously writes data to a file, replacing the file if it already exists.
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
  def writeFileSync(path: scala.Double, data: js.Any): scala.Unit = js.native
  /**
       * Synchronously writes data to a file, replacing the file if it already exists.
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
  def writeFileSync(path: scala.Double, data: js.Any, options: nodeLib.fsMod.WriteFileOptions): scala.Unit = js.native
  def writeJSON(file: java.lang.String, data: js.Any): stdLib.Promise[scala.Unit] = js.native
  def writeJSON(file: java.lang.String, data: js.Any, options: WriteJsonOptions): stdLib.Promise[scala.Unit] = js.native
  def writeJson(file: java.lang.String, data: js.Any): stdLib.Promise[scala.Unit] = js.native
  def writeJson(file: java.lang.String, data: js.Any, options: WriteJsonOptions): stdLib.Promise[scala.Unit] = js.native
  /**
       * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def writeSync(fd: scala.Double, buffer: nodeLib.fsMod.BinaryData): scala.Double = js.native
  /**
       * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def writeSync(fd: scala.Double, buffer: nodeLib.fsMod.BinaryData, offset: scala.Double): scala.Double = js.native
  /**
       * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def writeSync(fd: scala.Double, buffer: nodeLib.fsMod.BinaryData, offset: scala.Double, length: scala.Double): scala.Double = js.native
  /**
       * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def writeSync(
    fd: scala.Double,
    buffer: nodeLib.fsMod.BinaryData,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = js.native
  /**
       * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def writeSync(
    fd: scala.Double,
    buffer: nodeLib.fsMod.BinaryData,
    offset: scala.Double,
    length: scala.Null,
    position: scala.Double
  ): scala.Double = js.native
  /**
       * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def writeSync(fd: scala.Double, buffer: nodeLib.fsMod.BinaryData, offset: scala.Null, length: scala.Double): scala.Double = js.native
  /**
       * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def writeSync(
    fd: scala.Double,
    buffer: nodeLib.fsMod.BinaryData,
    offset: scala.Null,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = js.native
  /**
       * Synchronously writes `buffer` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
       * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       */
  def writeSync(
    fd: scala.Double,
    buffer: nodeLib.fsMod.BinaryData,
    offset: scala.Null,
    length: scala.Null,
    position: scala.Double
  ): scala.Double = js.native
  /**
       * Synchronously writes `string` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def writeSync(fd: scala.Double, string: js.Any): scala.Double = js.native
  /**
       * Synchronously writes `string` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def writeSync(fd: scala.Double, string: js.Any, position: scala.Double): scala.Double = js.native
  /**
       * Synchronously writes `string` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def writeSync(fd: scala.Double, string: js.Any, position: scala.Double, encoding: java.lang.String): scala.Double = js.native
  /**
       * Synchronously writes `string` to the file referenced by the supplied file descriptor, returning the number of bytes written.
       * @param fd A file descriptor.
       * @param string A string to write. If something other than a string is supplied it will be coerced to a string.
       * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
       * @param encoding The expected string encoding.
       */
  def writeSync(fd: scala.Double, string: js.Any, position: scala.Null, encoding: java.lang.String): scala.Double = js.native
}
