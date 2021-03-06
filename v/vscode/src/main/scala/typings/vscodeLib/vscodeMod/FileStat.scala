package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileStat extends js.Object {
  /**
  		 * The creation timestamp in milliseconds elapsed since January 1, 1970 00:00:00 UTC.
  		 */
  var ctime: scala.Double
  /**
  		 * The modification timestamp in milliseconds elapsed since January 1, 1970 00:00:00 UTC.
  		 */
  var mtime: scala.Double
  /**
  		 * The size in bytes.
  		 */
  var size: scala.Double
  /**
  		 * The type of the file, e.g. is a regular file, a directory, or symbolic link
  		 * to a file.
  		 */
  var `type`: FileType
}

object FileStat {
  @scala.inline
  def apply(ctime: scala.Double, mtime: scala.Double, size: scala.Double, `type`: FileType): FileStat = {
    val __obj = js.Dynamic.literal(ctime = ctime, mtime = mtime, size = size)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FileStat]
  }
}

