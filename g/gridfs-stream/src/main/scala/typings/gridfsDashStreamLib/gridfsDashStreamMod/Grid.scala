package typings
package gridfsDashStreamLib.gridfsDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gridfs-stream", "Grid")
@js.native
class Grid () extends js.Object {
  var curCol: java.lang.String = js.native
  var files: mongodbLib.mongodbMod.Collection[mongodbLib.Default] = js.native
  def collection(): mongodbLib.mongodbMod.Collection[mongodbLib.Default] = js.native
  def collection(name: java.lang.String): mongodbLib.mongodbMod.Collection[mongodbLib.Default] = js.native
  def createReadStream(): gridfsDashStreamLib.gridfsDashStreamMod.GridFSStreamNs.ReadStream = js.native
  def createReadStream(options: gridfsDashStreamLib.gridfsDashStreamMod.GridFSStreamNs.Options): gridfsDashStreamLib.gridfsDashStreamMod.GridFSStreamNs.ReadStream = js.native
  def createReadStream(options: java.lang.String): gridfsDashStreamLib.gridfsDashStreamMod.GridFSStreamNs.ReadStream = js.native
  def createWriteStream(): gridfsDashStreamLib.gridfsDashStreamMod.GridFSStreamNs.WriteStream = js.native
  def createWriteStream(options: gridfsDashStreamLib.gridfsDashStreamMod.GridFSStreamNs.Options): gridfsDashStreamLib.gridfsDashStreamMod.GridFSStreamNs.WriteStream = js.native
  def createWriteStream(options: java.lang.String): gridfsDashStreamLib.gridfsDashStreamMod.GridFSStreamNs.WriteStream = js.native
  def exist(
    options: gridfsDashStreamLib.gridfsDashStreamMod.GridFSStreamNs.Options,
    callback: js.Function2[/* err */ stdLib.Error, /* found */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def findOne(
    options: gridfsDashStreamLib.gridfsDashStreamMod.GridFSStreamNs.Options,
    callback: js.Function2[/* err */ stdLib.Error, /* record */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def remove(
    options: gridfsDashStreamLib.gridfsDashStreamMod.GridFSStreamNs.Options,
    callback: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
}

