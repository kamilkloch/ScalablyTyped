package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyDBSubnetGroupResult extends js.Object {
  var DBSubnetGroup: js.UndefOr[DBSubnetGroup] = js.undefined
}

object ModifyDBSubnetGroupResult {
  @scala.inline
  def apply(DBSubnetGroup: DBSubnetGroup = null): ModifyDBSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    if (DBSubnetGroup != null) __obj.updateDynamic("DBSubnetGroup")(DBSubnetGroup)
    __obj.asInstanceOf[ModifyDBSubnetGroupResult]
  }
}

