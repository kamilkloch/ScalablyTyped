package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionStatus extends js.Object {
  /**
    * Timestamp which tells the creation date for the entity.
    */
  var CreationDate: UpdateTimestamp
  /**
    * Indicates whether the Elasticsearch domain is being deleted.
    */
  var PendingDeletion: js.UndefOr[Boolean] = js.undefined
  /**
    * Provides the OptionState for the Elasticsearch domain.
    */
  var State: OptionState
  /**
    * Timestamp which tells the last updated time for the entity.
    */
  var UpdateDate: UpdateTimestamp
  /**
    * Specifies the latest version for the entity.
    */
  var UpdateVersion: js.UndefOr[UIntValue] = js.undefined
}

object OptionStatus {
  @scala.inline
  def apply(
    CreationDate: UpdateTimestamp,
    State: OptionState,
    UpdateDate: UpdateTimestamp,
    PendingDeletion: js.UndefOr[Boolean] = js.undefined,
    UpdateVersion: js.UndefOr[UIntValue] = js.undefined
  ): OptionStatus = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate, State = State.asInstanceOf[js.Any], UpdateDate = UpdateDate)
    if (!js.isUndefined(PendingDeletion)) __obj.updateDynamic("PendingDeletion")(PendingDeletion)
    if (!js.isUndefined(UpdateVersion)) __obj.updateDynamic("UpdateVersion")(UpdateVersion)
    __obj.asInstanceOf[OptionStatus]
  }
}

