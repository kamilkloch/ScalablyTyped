package typings
package ssh2DashSftpDashClientLib.ssh2DashSftpDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait sftp extends js.Object {
  def connect(options: ssh2Lib.ssh2Mod.ConnectConfig): stdLib.Promise[scala.Unit] = js.native
  def delete(remoteFilePath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def end(): stdLib.Promise[scala.Unit] = js.native
  def fastGet(remoteFilePath: java.lang.String, localPath: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def fastGet(
    remoteFilePath: java.lang.String,
    localPath: java.lang.String,
    options: ssh2DashStreamsLib.ssh2DashStreamsMod.TransferOptions
  ): stdLib.Promise[java.lang.String] = js.native
  def fastPut(localPath: java.lang.String, emoteFilePath: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def fastPut(
    localPath: java.lang.String,
    emoteFilePath: java.lang.String,
    options: ssh2DashStreamsLib.ssh2DashStreamsMod.TransferOptions
  ): stdLib.Promise[java.lang.String] = js.native
  def get(remoteFilePath: java.lang.String): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def get(remoteFilePath: java.lang.String, useCompression: scala.Boolean): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def get(remoteFilePath: java.lang.String, useCompression: scala.Boolean, encoding: java.lang.String): stdLib.Promise[nodeLib.NodeJSNs.ReadableStream] = js.native
  def list(remoteFilePath: java.lang.String): stdLib.Promise[js.Array[ssh2DashSftpDashClientLib.ssh2DashSftpDashClientMod.sftpNs.FileInfo]] = js.native
  def mkdir(remoteFilePath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def mkdir(remoteFilePath: java.lang.String, recursive: scala.Boolean): stdLib.Promise[scala.Unit] = js.native
  def on(event: java.lang.String, callback: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Unit = js.native
  def put(input: java.lang.String, remoteFilePath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def put(input: java.lang.String, remoteFilePath: java.lang.String, useCompression: scala.Boolean): stdLib.Promise[scala.Unit] = js.native
  def put(
    input: java.lang.String,
    remoteFilePath: java.lang.String,
    useCompression: scala.Boolean,
    encoding: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def put(input: nodeLib.Buffer, remoteFilePath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def put(input: nodeLib.Buffer, remoteFilePath: java.lang.String, useCompression: scala.Boolean): stdLib.Promise[scala.Unit] = js.native
  def put(
    input: nodeLib.Buffer,
    remoteFilePath: java.lang.String,
    useCompression: scala.Boolean,
    encoding: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def put(input: nodeLib.NodeJSNs.ReadableStream, remoteFilePath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def put(
    input: nodeLib.NodeJSNs.ReadableStream,
    remoteFilePath: java.lang.String,
    useCompression: scala.Boolean
  ): stdLib.Promise[scala.Unit] = js.native
  def put(
    input: nodeLib.NodeJSNs.ReadableStream,
    remoteFilePath: java.lang.String,
    useCompression: scala.Boolean,
    encoding: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def rename(remoteSourcePath: java.lang.String, remoteDestPath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def rmdir(remoteFilePath: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def rmdir(remoteFilePath: java.lang.String, recursive: scala.Boolean): stdLib.Promise[scala.Unit] = js.native
}
