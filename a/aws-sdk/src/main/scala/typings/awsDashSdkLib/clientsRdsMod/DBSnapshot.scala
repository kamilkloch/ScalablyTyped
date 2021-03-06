package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBSnapshot extends js.Object {
  /**
    * Specifies the allocated storage size in gibibytes (GiB).
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.undefined
  /**
    * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * Specifies the DB instance identifier of the DB instance this DB snapshot was created from.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the DB snapshot.
    */
  var DBSnapshotArn: js.UndefOr[String] = js.undefined
  /**
    * Specifies the identifier for the DB snapshot.
    */
  var DBSnapshotIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
    */
  var DbiResourceId: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether the DB snapshot is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the name of the database engine.
    */
  var Engine: js.UndefOr[String] = js.undefined
  /**
    * Specifies the version of the database engine.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  /**
    * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false.
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the time when the snapshot was taken, in Universal Coordinated Time (UTC).
    */
  var InstanceCreateTime: js.UndefOr[TStamp] = js.undefined
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
    */
  var Iops: js.UndefOr[IntegerOptional] = js.undefined
  /**
    *  If Encrypted is true, the AWS KMS key identifier for the encrypted DB snapshot. 
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * License model information for the restored DB instance.
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  /**
    * Provides the master username for the DB snapshot.
    */
  var MasterUsername: js.UndefOr[String] = js.undefined
  /**
    * Provides the option group name for the DB snapshot.
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
  /**
    * The percentage of the estimated data that has been transferred.
    */
  var PercentProgress: js.UndefOr[Integer] = js.undefined
  /**
    * Specifies the port that the database engine was listening on at the time of the snapshot.
    */
  var Port: js.UndefOr[Integer] = js.undefined
  /**
    * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance when the DB snapshot was created.
    */
  var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.undefined
  /**
    * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
    */
  var SnapshotCreateTime: js.UndefOr[TStamp] = js.undefined
  /**
    * Provides the type of the DB snapshot.
    */
  var SnapshotType: js.UndefOr[String] = js.undefined
  /**
    * The DB snapshot Amazon Resource Name (ARN) that the DB snapshot was copied from. It only has value in case of cross-customer or cross-region copy.
    */
  var SourceDBSnapshotIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The AWS Region that the DB snapshot was created in or copied from.
    */
  var SourceRegion: js.UndefOr[String] = js.undefined
  /**
    * Specifies the status of this DB snapshot.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * Specifies the storage type associated with DB snapshot.
    */
  var StorageType: js.UndefOr[String] = js.undefined
  /**
    * The ARN from the key store with which to associate the instance for TDE encryption.
    */
  var TdeCredentialArn: js.UndefOr[String] = js.undefined
  /**
    * The time zone of the DB snapshot. In most cases, the Timezone element is empty. Timezone content appears only for snapshots taken from Microsoft SQL Server DB instances that were created with a time zone specified. 
    */
  var Timezone: js.UndefOr[String] = js.undefined
  /**
    * Provides the VPC ID associated with the DB snapshot.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object DBSnapshot {
  @scala.inline
  def apply(
    AllocatedStorage: js.UndefOr[Integer] = js.undefined,
    AvailabilityZone: String = null,
    DBInstanceIdentifier: String = null,
    DBSnapshotArn: String = null,
    DBSnapshotIdentifier: String = null,
    DbiResourceId: String = null,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
    Engine: String = null,
    EngineVersion: String = null,
    IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined,
    InstanceCreateTime: TStamp = null,
    Iops: js.UndefOr[IntegerOptional] = js.undefined,
    KmsKeyId: String = null,
    LicenseModel: String = null,
    MasterUsername: String = null,
    OptionGroupName: String = null,
    PercentProgress: js.UndefOr[Integer] = js.undefined,
    Port: js.UndefOr[Integer] = js.undefined,
    ProcessorFeatures: ProcessorFeatureList = null,
    SnapshotCreateTime: TStamp = null,
    SnapshotType: String = null,
    SourceDBSnapshotIdentifier: String = null,
    SourceRegion: String = null,
    Status: String = null,
    StorageType: String = null,
    TdeCredentialArn: String = null,
    Timezone: String = null,
    VpcId: String = null
  ): DBSnapshot = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllocatedStorage)) __obj.updateDynamic("AllocatedStorage")(AllocatedStorage)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (DBInstanceIdentifier != null) __obj.updateDynamic("DBInstanceIdentifier")(DBInstanceIdentifier)
    if (DBSnapshotArn != null) __obj.updateDynamic("DBSnapshotArn")(DBSnapshotArn)
    if (DBSnapshotIdentifier != null) __obj.updateDynamic("DBSnapshotIdentifier")(DBSnapshotIdentifier)
    if (DbiResourceId != null) __obj.updateDynamic("DbiResourceId")(DbiResourceId)
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted)
    if (Engine != null) __obj.updateDynamic("Engine")(Engine)
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (!js.isUndefined(IAMDatabaseAuthenticationEnabled)) __obj.updateDynamic("IAMDatabaseAuthenticationEnabled")(IAMDatabaseAuthenticationEnabled)
    if (InstanceCreateTime != null) __obj.updateDynamic("InstanceCreateTime")(InstanceCreateTime)
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel)
    if (MasterUsername != null) __obj.updateDynamic("MasterUsername")(MasterUsername)
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName)
    if (!js.isUndefined(PercentProgress)) __obj.updateDynamic("PercentProgress")(PercentProgress)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    if (ProcessorFeatures != null) __obj.updateDynamic("ProcessorFeatures")(ProcessorFeatures)
    if (SnapshotCreateTime != null) __obj.updateDynamic("SnapshotCreateTime")(SnapshotCreateTime)
    if (SnapshotType != null) __obj.updateDynamic("SnapshotType")(SnapshotType)
    if (SourceDBSnapshotIdentifier != null) __obj.updateDynamic("SourceDBSnapshotIdentifier")(SourceDBSnapshotIdentifier)
    if (SourceRegion != null) __obj.updateDynamic("SourceRegion")(SourceRegion)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType)
    if (TdeCredentialArn != null) __obj.updateDynamic("TdeCredentialArn")(TdeCredentialArn)
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[DBSnapshot]
  }
}

