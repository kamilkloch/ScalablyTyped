package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReceiptFilterRequest extends js.Object {
  /**
    * A data structure that describes the IP address filter to create, which consists of a name, an IP address range, and whether to allow or block mail from it.
    */
  var Filter: ReceiptFilter
}

object CreateReceiptFilterRequest {
  @scala.inline
  def apply(Filter: ReceiptFilter): CreateReceiptFilterRequest = {
    val __obj = js.Dynamic.literal(Filter = Filter)
  
    __obj.asInstanceOf[CreateReceiptFilterRequest]
  }
}

