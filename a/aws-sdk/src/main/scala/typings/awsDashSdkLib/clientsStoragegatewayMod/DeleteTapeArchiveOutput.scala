package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTapeArchiveOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the virtual tape that was deleted from the virtual tape shelf (VTS).
    */
  var TapeARN: js.UndefOr[TapeARN] = js.undefined
}

object DeleteTapeArchiveOutput {
  @scala.inline
  def apply(TapeARN: TapeARN = null): DeleteTapeArchiveOutput = {
    val __obj = js.Dynamic.literal()
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN)
    __obj.asInstanceOf[DeleteTapeArchiveOutput]
  }
}

