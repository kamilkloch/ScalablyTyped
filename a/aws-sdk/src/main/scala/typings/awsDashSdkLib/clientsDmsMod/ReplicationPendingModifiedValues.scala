package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationPendingModifiedValues extends js.Object {
  /**
    * The amount of storage (in gigabytes) that is allocated for the replication instance.
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The engine version number of the replication instance.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    *  Specifies if the replication instance is a Multi-AZ deployment. You cannot set the AvailabilityZone parameter if the Multi-AZ parameter is set to true. 
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The compute and memory capacity of the replication instance.  Valid Values: dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge  
    */
  var ReplicationInstanceClass: js.UndefOr[String] = js.undefined
}

object ReplicationPendingModifiedValues {
  @scala.inline
  def apply(
    AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
    EngineVersion: String = null,
    MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
    ReplicationInstanceClass: String = null
  ): ReplicationPendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllocatedStorage)) __obj.updateDynamic("AllocatedStorage")(AllocatedStorage)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ)
    if (ReplicationInstanceClass != null) __obj.updateDynamic("ReplicationInstanceClass")(ReplicationInstanceClass)
    __obj.asInstanceOf[ReplicationPendingModifiedValues]
  }
}

