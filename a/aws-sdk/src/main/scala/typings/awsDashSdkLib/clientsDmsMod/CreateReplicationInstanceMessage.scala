package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReplicationInstanceMessage extends js.Object {
  /**
    * The amount of storage (in gigabytes) to be initially allocated for the replication instance.
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * Indicates that minor engine upgrades will be applied automatically to the replication instance during the maintenance window. Default: true 
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The EC2 Availability Zone that the replication instance will be created in. Default: A random, system-chosen Availability Zone in the endpoint's region.  Example: us-east-1d 
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * A list of DNS name servers supported for the replication instance.
    */
  var DnsNameServers: js.UndefOr[String] = js.undefined
  /**
    * The engine version number of the replication instance.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * The AWS KMS key identifier that is used to encrypt the content on the replication instance. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    *  Specifies if the replication instance is a Multi-AZ deployment. You cannot set the AvailabilityZone parameter if the Multi-AZ parameter is set to true. 
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).  Format: ddd:hh24:mi-ddd:hh24:mi  Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a random day of the week. Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  /**
    *  Specifies the accessibility options for the replication instance. A value of true represents an instance with a public IP address. A value of false represents an instance with a private IP address. The default value is true. 
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The compute and memory capacity of the replication instance as specified by the replication instance class.  Valid Values: dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge  
    */
  var ReplicationInstanceClass: String
  /**
    * The replication instance identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: myrepinstance 
    */
  var ReplicationInstanceIdentifier: String
  /**
    * A subnet group to associate with the replication instance.
    */
  var ReplicationSubnetGroupIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Tags to be associated with the replication instance.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    *  Specifies the VPC security group to be used with the replication instance. The VPC security group must work with the VPC containing the replication instance. 
    */
  var VpcSecurityGroupIds: js.UndefOr[VpcSecurityGroupIdList] = js.undefined
}

object CreateReplicationInstanceMessage {
  @scala.inline
  def apply(
    ReplicationInstanceClass: String,
    ReplicationInstanceIdentifier: String,
    AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
    AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.undefined,
    AvailabilityZone: String = null,
    DnsNameServers: String = null,
    EngineVersion: String = null,
    KmsKeyId: String = null,
    MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
    PreferredMaintenanceWindow: String = null,
    PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined,
    ReplicationSubnetGroupIdentifier: String = null,
    Tags: TagList = null,
    VpcSecurityGroupIds: VpcSecurityGroupIdList = null
  ): CreateReplicationInstanceMessage = {
    val __obj = js.Dynamic.literal(ReplicationInstanceClass = ReplicationInstanceClass, ReplicationInstanceIdentifier = ReplicationInstanceIdentifier)
    if (!js.isUndefined(AllocatedStorage)) __obj.updateDynamic("AllocatedStorage")(AllocatedStorage)
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (DnsNameServers != null) __obj.updateDynamic("DnsNameServers")(DnsNameServers)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ)
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow)
    if (!js.isUndefined(PubliclyAccessible)) __obj.updateDynamic("PubliclyAccessible")(PubliclyAccessible)
    if (ReplicationSubnetGroupIdentifier != null) __obj.updateDynamic("ReplicationSubnetGroupIdentifier")(ReplicationSubnetGroupIdentifier)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VpcSecurityGroupIds != null) __obj.updateDynamic("VpcSecurityGroupIds")(VpcSecurityGroupIds)
    __obj.asInstanceOf[CreateReplicationInstanceMessage]
  }
}

