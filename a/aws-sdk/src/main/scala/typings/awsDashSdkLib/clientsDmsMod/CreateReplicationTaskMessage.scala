package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReplicationTaskMessage extends js.Object {
  /**
    * Indicates when you want a change data capture (CDC) operation to start. Use either CdcStartPosition or CdcStartTime to specify when you want a CDC operation to start. Specifying both values results in an error.  The value can be in date, checkpoint, or LSN/SCN format. Date Example: --cdc-start-position “2018-03-08T12:12:12” Checkpoint Example: --cdc-start-position "checkpoint:V1#27#mysql-bin-changelog.157832:1975:-1:2002:677883278264080:mysql-bin-changelog.157832:1876#0#0#*#0#93" LSN Example: --cdc-start-position “mysql-bin-changelog.000024:373”
    */
  var CdcStartPosition: js.UndefOr[String] = js.undefined
  /**
    * Indicates the start time for a change data capture (CDC) operation. Use either CdcStartTime or CdcStartPosition to specify when you want a CDC operation to start. Specifying both values results in an error. Timestamp Example: --cdc-start-time “2018-03-08T12:12:12”
    */
  var CdcStartTime: js.UndefOr[TStamp] = js.undefined
  /**
    * Indicates when you want a change data capture (CDC) operation to stop. The value can be either server time or commit time. Server time example: --cdc-stop-position “server_time:3018-02-09T12:12:12” Commit time example: --cdc-stop-position “commit_time: 3018-02-09T12:12:12 “
    */
  var CdcStopPosition: js.UndefOr[String] = js.undefined
  /**
    * The migration type.
    */
  var MigrationType: MigrationTypeValue
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: String
  /**
    * The replication task identifier. Constraints:   Must contain from 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ReplicationTaskIdentifier: String
  /**
    * Settings for the task, such as target metadata settings. For a complete list of task settings, see Task Settings for AWS Database Migration Service Tasks in the AWS Database Migration User Guide. 
    */
  var ReplicationTaskSettings: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var SourceEndpointArn: String
  /**
    * When using the AWS CLI or boto3, provide the path of the JSON file that contains the table mappings. Precede the path with "file://". When working with the DMS API, provide the JSON as the parameter value. For example, --table-mappings file://mappingfile.json
    */
  var TableMappings: String
  /**
    * Tags to be added to the replication instance.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var TargetEndpointArn: String
}

object CreateReplicationTaskMessage {
  @scala.inline
  def apply(
    MigrationType: MigrationTypeValue,
    ReplicationInstanceArn: String,
    ReplicationTaskIdentifier: String,
    SourceEndpointArn: String,
    TableMappings: String,
    TargetEndpointArn: String,
    CdcStartPosition: String = null,
    CdcStartTime: TStamp = null,
    CdcStopPosition: String = null,
    ReplicationTaskSettings: String = null,
    Tags: TagList = null
  ): CreateReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(MigrationType = MigrationType.asInstanceOf[js.Any], ReplicationInstanceArn = ReplicationInstanceArn, ReplicationTaskIdentifier = ReplicationTaskIdentifier, SourceEndpointArn = SourceEndpointArn, TableMappings = TableMappings, TargetEndpointArn = TargetEndpointArn)
    if (CdcStartPosition != null) __obj.updateDynamic("CdcStartPosition")(CdcStartPosition)
    if (CdcStartTime != null) __obj.updateDynamic("CdcStartTime")(CdcStartTime)
    if (CdcStopPosition != null) __obj.updateDynamic("CdcStopPosition")(CdcStopPosition)
    if (ReplicationTaskSettings != null) __obj.updateDynamic("ReplicationTaskSettings")(ReplicationTaskSettings)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateReplicationTaskMessage]
  }
}

