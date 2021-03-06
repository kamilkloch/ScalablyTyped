package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedsCustomBatchRequest extends js.Object {
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[DatafeedsCustomBatchRequestEntry]] = js.undefined
}

object DatafeedsCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[DatafeedsCustomBatchRequestEntry] = null): DatafeedsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    __obj.asInstanceOf[DatafeedsCustomBatchRequest]
  }
}

