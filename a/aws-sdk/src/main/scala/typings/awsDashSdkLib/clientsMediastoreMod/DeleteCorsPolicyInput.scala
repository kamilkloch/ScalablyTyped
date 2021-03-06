package typings
package awsDashSdkLib.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCorsPolicyInput extends js.Object {
  /**
    * The name of the container to remove the policy from.
    */
  var ContainerName: awsDashSdkLib.clientsMediastoreMod.ContainerName
}

object DeleteCorsPolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName): DeleteCorsPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName)
  
    __obj.asInstanceOf[DeleteCorsPolicyInput]
  }
}

