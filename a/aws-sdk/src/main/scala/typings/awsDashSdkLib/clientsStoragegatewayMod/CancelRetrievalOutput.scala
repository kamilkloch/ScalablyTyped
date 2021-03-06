package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelRetrievalOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the virtual tape for which retrieval was canceled.
    */
  var TapeARN: js.UndefOr[TapeARN] = js.undefined
}

object CancelRetrievalOutput {
  @scala.inline
  def apply(TapeARN: TapeARN = null): CancelRetrievalOutput = {
    val __obj = js.Dynamic.literal()
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN)
    __obj.asInstanceOf[CancelRetrievalOutput]
  }
}

