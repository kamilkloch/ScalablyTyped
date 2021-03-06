package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotSortingEntity extends js.Object {
  /**
    * The category for sorting the snapshots.
    */
  var Attribute: SnapshotAttributeToSortBy
  /**
    * The order for listing the attributes.
    */
  var SortOrder: js.UndefOr[SortByOrder] = js.undefined
}

object SnapshotSortingEntity {
  @scala.inline
  def apply(Attribute: SnapshotAttributeToSortBy, SortOrder: SortByOrder = null): SnapshotSortingEntity = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotSortingEntity]
  }
}

