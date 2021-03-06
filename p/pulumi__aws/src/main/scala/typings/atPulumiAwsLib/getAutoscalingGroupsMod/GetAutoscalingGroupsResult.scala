package typings
package atPulumiAwsLib.getAutoscalingGroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAutoscalingGroupsResult extends js.Object {
  /**
    * A list of the Autoscaling Groups Arns in the current region.
    */
  val arns: js.Array[java.lang.String]
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * A list of the Autoscaling Groups in the current region.
    */
  val names: js.Array[java.lang.String]
}

object GetAutoscalingGroupsResult {
  @scala.inline
  def apply(
    arns: js.Array[java.lang.String],
    id: java.lang.String,
    names: js.Array[java.lang.String],
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null
  ): GetAutoscalingGroupsResult = {
    val __obj = js.Dynamic.literal(arns = arns, id = id, names = names)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetAutoscalingGroupsResult]
  }
}

