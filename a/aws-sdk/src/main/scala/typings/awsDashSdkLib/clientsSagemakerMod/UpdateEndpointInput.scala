package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEndpointInput extends js.Object {
  /**
    * The name of the new endpoint configuration.
    */
  var EndpointConfigName: awsDashSdkLib.clientsSagemakerMod.EndpointConfigName
  /**
    * The name of the endpoint whose configuration you want to update.
    */
  var EndpointName: awsDashSdkLib.clientsSagemakerMod.EndpointName
}

object UpdateEndpointInput {
  @scala.inline
  def apply(EndpointConfigName: EndpointConfigName, EndpointName: EndpointName): UpdateEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointConfigName = EndpointConfigName, EndpointName = EndpointName)
  
    __obj.asInstanceOf[UpdateEndpointInput]
  }
}

