package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchDestination extends js.Object {
  /**
    * An array of objects that define the dimensions to use when you send email events to Amazon CloudWatch.
    */
  var DimensionConfigurations: CloudWatchDimensionConfigurations
}

object CloudWatchDestination {
  @scala.inline
  def apply(DimensionConfigurations: CloudWatchDimensionConfigurations): CloudWatchDestination = {
    val __obj = js.Dynamic.literal(DimensionConfigurations = DimensionConfigurations)
  
    __obj.asInstanceOf[CloudWatchDestination]
  }
}

