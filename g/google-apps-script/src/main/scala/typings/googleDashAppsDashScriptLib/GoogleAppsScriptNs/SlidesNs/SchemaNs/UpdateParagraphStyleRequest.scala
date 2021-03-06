package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateParagraphStyleRequest extends js.Object {
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  var fields: js.UndefOr[java.lang.String] = js.undefined
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[ParagraphStyle] = js.undefined
  var textRange: js.UndefOr[Range] = js.undefined
}

object UpdateParagraphStyleRequest {
  @scala.inline
  def apply(
    cellLocation: TableCellLocation = null,
    fields: java.lang.String = null,
    objectId: java.lang.String = null,
    style: ParagraphStyle = null,
    textRange: Range = null
  ): UpdateParagraphStyleRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (style != null) __obj.updateDynamic("style")(style)
    if (textRange != null) __obj.updateDynamic("textRange")(textRange)
    __obj.asInstanceOf[UpdateParagraphStyleRequest]
  }
}

