package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolicLink extends js.Object {
  /**
    * The fully-qualified path to the folder that contains the symbolic link.
    */
  var absolutePath: js.UndefOr[Path] = js.undefined
  /**
    * The blob ID that contains the information about the symbolic link.
    */
  var blobId: js.UndefOr[ObjectId] = js.undefined
  /**
    * The file mode permissions of the blob that cotains information about the symbolic link.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined
  /**
    * The relative path of the symbolic link from the folder where the query originated.
    */
  var relativePath: js.UndefOr[Path] = js.undefined
}

object SymbolicLink {
  @scala.inline
  def apply(
    absolutePath: Path = null,
    blobId: ObjectId = null,
    fileMode: FileModeTypeEnum = null,
    relativePath: Path = null
  ): SymbolicLink = {
    val __obj = js.Dynamic.literal()
    if (absolutePath != null) __obj.updateDynamic("absolutePath")(absolutePath)
    if (blobId != null) __obj.updateDynamic("blobId")(blobId)
    if (fileMode != null) __obj.updateDynamic("fileMode")(fileMode.asInstanceOf[js.Any])
    if (relativePath != null) __obj.updateDynamic("relativePath")(relativePath)
    __obj.asInstanceOf[SymbolicLink]
  }
}

