package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromoteReadReplicaMessage extends js.Object {
  /**
    * The number of days to retain automated backups. Setting this parameter to a positive number enables backups. Setting this parameter to 0 disables automated backups. Default: 1 Constraints:   Must be a value from 0 to 8  
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The DB instance identifier. This value is stored as a lowercase string. Constraints:   Must match the identifier of an existing Read Replica DB instance.   Example: mydbinstance 
    */
  var DBInstanceIdentifier: String
  /**
    *  The daily time range during which automated backups are created if automated backups are enabled, using the BackupRetentionPeriod parameter.   The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the time blocks available, see  Adjusting the Preferred Maintenance Window in the Amazon RDS User Guide.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.undefined
}

object PromoteReadReplicaMessage {
  @scala.inline
  def apply(
    DBInstanceIdentifier: String,
    BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
    PreferredBackupWindow: String = null
  ): PromoteReadReplicaMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier)
    if (!js.isUndefined(BackupRetentionPeriod)) __obj.updateDynamic("BackupRetentionPeriod")(BackupRetentionPeriod)
    if (PreferredBackupWindow != null) __obj.updateDynamic("PreferredBackupWindow")(PreferredBackupWindow)
    __obj.asInstanceOf[PromoteReadReplicaMessage]
  }
}

