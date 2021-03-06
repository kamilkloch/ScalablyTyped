package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEndpointConfigInput extends js.Object {
  /**
    * The name of the endpoint configuration.
    */
  var EndpointConfigName: awsDashSdkLib.clientsSagemakerMod.EndpointConfigName
}

object DescribeEndpointConfigInput {
  @scala.inline
  def apply(EndpointConfigName: EndpointConfigName): DescribeEndpointConfigInput = {
    val __obj = js.Dynamic.literal(EndpointConfigName = EndpointConfigName)
  
    __obj.asInstanceOf[DescribeEndpointConfigInput]
  }
}

