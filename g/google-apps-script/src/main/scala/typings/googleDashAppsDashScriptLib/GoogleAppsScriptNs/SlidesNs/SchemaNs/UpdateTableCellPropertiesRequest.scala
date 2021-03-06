package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTableCellPropertiesRequest extends js.Object {
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var tableCellProperties: js.UndefOr[TableCellProperties] = js.undefined
  var tableRange: js.UndefOr[TableRange] = js.undefined
}

object UpdateTableCellPropertiesRequest {
  @scala.inline
  def apply(
    fields: java.lang.String = null,
    objectId: java.lang.String = null,
    tableCellProperties: TableCellProperties = null,
    tableRange: TableRange = null
  ): UpdateTableCellPropertiesRequest = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (tableCellProperties != null) __obj.updateDynamic("tableCellProperties")(tableCellProperties)
    if (tableRange != null) __obj.updateDynamic("tableRange")(tableRange)
    __obj.asInstanceOf[UpdateTableCellPropertiesRequest]
  }
}

