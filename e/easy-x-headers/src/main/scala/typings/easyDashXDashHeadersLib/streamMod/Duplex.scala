package typings
package easyDashXDashHeadersLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(easyDashXDashHeadersLib.NodeJSNs.ReadWriteStream because Would inherit conflicting mutable fields List(readable))*/
@JSImport("stream", "Duplex")
@js.native
class Duplex () extends Readable {
  def this(opts: DuplexOptions) = this()
  var writable: scala.Boolean = js.native
  def _write(data: easyDashXDashHeadersLib.Buffer, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
  def _write(data: java.lang.String, encoding: java.lang.String, callback: js.Function): scala.Unit = js.native
  def end(): scala.Unit = js.native
  def end(buffer: easyDashXDashHeadersLib.Buffer): scala.Unit = js.native
  def end(buffer: easyDashXDashHeadersLib.Buffer, cb: js.Function): scala.Unit = js.native
  def end(str: java.lang.String): scala.Unit = js.native
  def end(str: java.lang.String, cb: js.Function): scala.Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String, cb: js.Function): scala.Unit = js.native
  def write(buffer: easyDashXDashHeadersLib.Buffer): scala.Boolean = js.native
  def write(buffer: easyDashXDashHeadersLib.Buffer, cb: js.Function): scala.Boolean = js.native
  def write(str: java.lang.String): scala.Boolean = js.native
  def write(str: java.lang.String, cb: js.Function): scala.Boolean = js.native
  def write(str: java.lang.String, encoding: java.lang.String): scala.Boolean = js.native
  def write(str: java.lang.String, encoding: java.lang.String, cb: js.Function): scala.Boolean = js.native
}
