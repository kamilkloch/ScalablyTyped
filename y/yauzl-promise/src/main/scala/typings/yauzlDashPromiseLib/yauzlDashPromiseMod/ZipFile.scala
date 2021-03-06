package typings
package yauzlDashPromiseLib.yauzlDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yauzl-promise", "ZipFile")
@js.native
class ZipFile protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(reader: yauzlLib.yauzlMod.RandomAccessReader, centralDirectoryOffset: scala.Double, fileSize: scala.Double, entryCount: scala.Double, comment: java.lang.String, autoClose: scala.Boolean, lazyEntries: scala.Boolean, decodeStrings: scala.Boolean, validateEntrySizes: scala.Boolean) = this()
  // This chunk taken directly from @types/yauzl
  var autoClose: scala.Boolean = js.native
  var comment: java.lang.String = js.native
  var decodeStrings: scala.Boolean = js.native
  var emittedError: scala.Boolean = js.native
  var entriesRead: scala.Double = js.native
  var entryCount: scala.Double = js.native
  var fileSize: scala.Double = js.native
  var isOpen: scala.Boolean = js.native
  var lazyEntries: scala.Boolean = js.native
  var readEntryCursor: scala.Boolean = js.native
  var validateEntrySizes: scala.Boolean = js.native
  // These funcitons are custom to yauzl-promise
  def close(): js.Promise[scala.Unit] = js.native
  def openReadStream(entry: Entry): js.Promise[nodeLib.streamMod.Readable] = js.native
  def openReadStream(entry: Entry, options: yauzlLib.yauzlMod.ZipFileOptions): js.Promise[nodeLib.streamMod.Readable] = js.native
  def readEntries(): js.Promise[js.Array[Entry]] = js.native
  def readEntries(numEntries: scala.Double): js.Promise[js.Array[Entry]] = js.native
  def readEntry(): js.Promise[Entry] = js.native
  def walkEntries(callback: js.Function1[/* entry */ Entry, js.Promise[scala.Unit] | scala.Unit]): js.Promise[scala.Unit] = js.native
  def walkEntries(
    callback: js.Function1[/* entry */ Entry, js.Promise[scala.Unit] | scala.Unit],
    numEntries: scala.Double
  ): js.Promise[scala.Unit] = js.native
}

