package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInstancesHealthResult extends js.Object {
  /**
    * Detailed health information about each instance. The output differs slightly between Linux and Windows environments. There is a difference in the members that are supported under the &lt;CPUUtilization&gt; type.
    */
  var InstanceHealthList: js.UndefOr[InstanceHealthList] = js.undefined
  /**
    * Pagination token for the next page of results, if available.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The date and time that the health information was retrieved.
    */
  var RefreshedAt: js.UndefOr[RefreshedAt] = js.undefined
}

object DescribeInstancesHealthResult {
  @scala.inline
  def apply(
    InstanceHealthList: InstanceHealthList = null,
    NextToken: NextToken = null,
    RefreshedAt: RefreshedAt = null
  ): DescribeInstancesHealthResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceHealthList != null) __obj.updateDynamic("InstanceHealthList")(InstanceHealthList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (RefreshedAt != null) __obj.updateDynamic("RefreshedAt")(RefreshedAt)
    __obj.asInstanceOf[DescribeInstancesHealthResult]
  }
}

