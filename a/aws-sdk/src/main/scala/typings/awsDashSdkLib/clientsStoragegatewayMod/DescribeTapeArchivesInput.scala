package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTapeArchivesInput extends js.Object {
  /**
    * Specifies that the number of virtual tapes descried be limited to the specified number.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.undefined
  /**
    * An opaque string that indicates the position at which to begin describing virtual tapes.
    */
  var Marker: js.UndefOr[Marker] = js.undefined
  /**
    * Specifies one or more unique Amazon Resource Names (ARNs) that represent the virtual tapes you want to describe.
    */
  var TapeARNs: js.UndefOr[TapeARNs] = js.undefined
}

object DescribeTapeArchivesInput {
  @scala.inline
  def apply(
    Limit: js.UndefOr[PositiveIntObject] = js.undefined,
    Marker: Marker = null,
    TapeARNs: TapeARNs = null
  ): DescribeTapeArchivesInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (TapeARNs != null) __obj.updateDynamic("TapeARNs")(TapeARNs)
    __obj.asInstanceOf[DescribeTapeArchivesInput]
  }
}

