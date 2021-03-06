package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    * The name of the file being compared, including its extension and subdirectory, if any.
    */
  var filePath: js.UndefOr[Path] = js.undefined
  /**
    * The position of a change within a compared file, in line number format.
    */
  var filePosition: js.UndefOr[Position] = js.undefined
  /**
    * In a comparison of commits or a pull request, whether the change is in the 'before' or 'after' of that comparison.
    */
  var relativeFileVersion: js.UndefOr[RelativeFileVersionEnum] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    filePath: Path = null,
    filePosition: js.UndefOr[Position] = js.undefined,
    relativeFileVersion: RelativeFileVersionEnum = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (filePath != null) __obj.updateDynamic("filePath")(filePath)
    if (!js.isUndefined(filePosition)) __obj.updateDynamic("filePosition")(filePosition)
    if (relativeFileVersion != null) __obj.updateDynamic("relativeFileVersion")(relativeFileVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

