package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBackupInput extends js.Object {
  /**
    * Specified name for the backup.
    */
  var BackupName: awsDashSdkLib.clientsDynamodbMod.BackupName
  /**
    * The name of the table.
    */
  var TableName: awsDashSdkLib.clientsDynamodbMod.TableName
}

object CreateBackupInput {
  @scala.inline
  def apply(BackupName: BackupName, TableName: TableName): CreateBackupInput = {
    val __obj = js.Dynamic.literal(BackupName = BackupName, TableName = TableName)
  
    __obj.asInstanceOf[CreateBackupInput]
  }
}

