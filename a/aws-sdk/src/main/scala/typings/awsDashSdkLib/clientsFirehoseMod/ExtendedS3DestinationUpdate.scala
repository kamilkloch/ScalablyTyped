package typings
package awsDashSdkLib.clientsFirehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedS3DestinationUpdate extends js.Object {
  /**
    * The ARN of the S3 bucket. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var BucketARN: js.UndefOr[BucketARN] = js.undefined
  /**
    * The buffering option.
    */
  var BufferingHints: js.UndefOr[BufferingHints] = js.undefined
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[CloudWatchLoggingOptions] = js.undefined
  /**
    * The compression format. If no value is specified, the default is UNCOMPRESSED. 
    */
  var CompressionFormat: js.UndefOr[CompressionFormat] = js.undefined
  /**
    * The serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format before writing it to Amazon S3.
    */
  var DataFormatConversionConfiguration: js.UndefOr[DataFormatConversionConfiguration] = js.undefined
  /**
    * The encryption configuration. If no value is specified, the default is no encryption.
    */
  var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  /**
    * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing them to S3. This prefix appears immediately following the bucket name.
    */
  var ErrorOutputPrefix: js.UndefOr[ErrorOutputPrefix] = js.undefined
  /**
    * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can specify an extra prefix to be added in front of the time format prefix. If the prefix ends with a slash, it appears as a folder in the S3 bucket. For more information, see Amazon S3 Object Name Format in the Amazon Kinesis Data Firehose Developer Guide.
    */
  var Prefix: js.UndefOr[Prefix] = js.undefined
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[ProcessingConfiguration] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var RoleARN: js.UndefOr[RoleARN] = js.undefined
  /**
    * Enables or disables Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[S3BackupMode] = js.undefined
  /**
    * The Amazon S3 destination for backup.
    */
  var S3BackupUpdate: js.UndefOr[S3DestinationUpdate] = js.undefined
}

object ExtendedS3DestinationUpdate {
  @scala.inline
  def apply(
    BucketARN: BucketARN = null,
    BufferingHints: BufferingHints = null,
    CloudWatchLoggingOptions: CloudWatchLoggingOptions = null,
    CompressionFormat: CompressionFormat = null,
    DataFormatConversionConfiguration: DataFormatConversionConfiguration = null,
    EncryptionConfiguration: EncryptionConfiguration = null,
    ErrorOutputPrefix: ErrorOutputPrefix = null,
    Prefix: Prefix = null,
    ProcessingConfiguration: ProcessingConfiguration = null,
    RoleARN: RoleARN = null,
    S3BackupMode: S3BackupMode = null,
    S3BackupUpdate: S3DestinationUpdate = null
  ): ExtendedS3DestinationUpdate = {
    val __obj = js.Dynamic.literal()
    if (BucketARN != null) __obj.updateDynamic("BucketARN")(BucketARN)
    if (BufferingHints != null) __obj.updateDynamic("BufferingHints")(BufferingHints)
    if (CloudWatchLoggingOptions != null) __obj.updateDynamic("CloudWatchLoggingOptions")(CloudWatchLoggingOptions)
    if (CompressionFormat != null) __obj.updateDynamic("CompressionFormat")(CompressionFormat.asInstanceOf[js.Any])
    if (DataFormatConversionConfiguration != null) __obj.updateDynamic("DataFormatConversionConfiguration")(DataFormatConversionConfiguration)
    if (EncryptionConfiguration != null) __obj.updateDynamic("EncryptionConfiguration")(EncryptionConfiguration)
    if (ErrorOutputPrefix != null) __obj.updateDynamic("ErrorOutputPrefix")(ErrorOutputPrefix)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (ProcessingConfiguration != null) __obj.updateDynamic("ProcessingConfiguration")(ProcessingConfiguration)
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN)
    if (S3BackupMode != null) __obj.updateDynamic("S3BackupMode")(S3BackupMode.asInstanceOf[js.Any])
    if (S3BackupUpdate != null) __obj.updateDynamic("S3BackupUpdate")(S3BackupUpdate)
    __obj.asInstanceOf[ExtendedS3DestinationUpdate]
  }
}

