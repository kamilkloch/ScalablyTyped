package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTapeOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the deleted virtual tape.
    */
  var TapeARN: js.UndefOr[TapeARN] = js.undefined
}

object DeleteTapeOutput {
  @scala.inline
  def apply(TapeARN: TapeARN = null): DeleteTapeOutput = {
    val __obj = js.Dynamic.literal()
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN)
    __obj.asInstanceOf[DeleteTapeOutput]
  }
}

