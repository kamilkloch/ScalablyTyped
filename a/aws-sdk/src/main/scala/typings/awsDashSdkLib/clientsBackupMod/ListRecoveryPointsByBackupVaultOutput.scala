package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRecoveryPointsByBackupVaultOutput extends js.Object {
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of objects that contain detailed information about recovery points saved in a backup vault.
    */
  var RecoveryPoints: js.UndefOr[RecoveryPointByBackupVaultList] = js.undefined
}

object ListRecoveryPointsByBackupVaultOutput {
  @scala.inline
  def apply(NextToken: java.lang.String = null, RecoveryPoints: RecoveryPointByBackupVaultList = null): ListRecoveryPointsByBackupVaultOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (RecoveryPoints != null) __obj.updateDynamic("RecoveryPoints")(RecoveryPoints)
    __obj.asInstanceOf[ListRecoveryPointsByBackupVaultOutput]
  }
}

