package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupWindowProperties extends js.Object {
  var dimension: js.UndefOr[Size] = js.undefined
  var offset: js.UndefOr[OffsetPosition] = js.undefined
  var positionType: js.UndefOr[java.lang.String] = js.undefined
  var showAddressBar: js.UndefOr[scala.Boolean] = js.undefined
  var showMenuBar: js.UndefOr[scala.Boolean] = js.undefined
  var showScrollBar: js.UndefOr[scala.Boolean] = js.undefined
  var showStatusBar: js.UndefOr[scala.Boolean] = js.undefined
  var showToolBar: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PopupWindowProperties {
  @scala.inline
  def apply(
    dimension: Size = null,
    offset: OffsetPosition = null,
    positionType: java.lang.String = null,
    showAddressBar: js.UndefOr[scala.Boolean] = js.undefined,
    showMenuBar: js.UndefOr[scala.Boolean] = js.undefined,
    showScrollBar: js.UndefOr[scala.Boolean] = js.undefined,
    showStatusBar: js.UndefOr[scala.Boolean] = js.undefined,
    showToolBar: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): PopupWindowProperties = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (positionType != null) __obj.updateDynamic("positionType")(positionType)
    if (!js.isUndefined(showAddressBar)) __obj.updateDynamic("showAddressBar")(showAddressBar)
    if (!js.isUndefined(showMenuBar)) __obj.updateDynamic("showMenuBar")(showMenuBar)
    if (!js.isUndefined(showScrollBar)) __obj.updateDynamic("showScrollBar")(showScrollBar)
    if (!js.isUndefined(showStatusBar)) __obj.updateDynamic("showStatusBar")(showStatusBar)
    if (!js.isUndefined(showToolBar)) __obj.updateDynamic("showToolBar")(showToolBar)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PopupWindowProperties]
  }
}

