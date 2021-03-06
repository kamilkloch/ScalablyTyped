package typings
package awsDashSdkLib.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListListenersRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the accelerator for which you want to list listener objects.
    */
  var AcceleratorArn: GenericString
  /**
    * The number of listener objects that you want to return with this call. The default value is 10.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}

object ListListenersRequest {
  @scala.inline
  def apply(
    AcceleratorArn: GenericString,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: GenericString = null
  ): ListListenersRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListListenersRequest]
  }
}

