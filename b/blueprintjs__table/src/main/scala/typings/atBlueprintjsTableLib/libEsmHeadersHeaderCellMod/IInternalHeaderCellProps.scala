package typings
package atBlueprintjsTableLib.libEsmHeadersHeaderCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInternalHeaderCellProps extends IHeaderCellProps {
  /**
    * Specifies if the cell is selected.
    */
  var isSelected: js.UndefOr[scala.Boolean] = js.undefined
}

object IInternalHeaderCellProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    isActive: js.UndefOr[scala.Boolean] = js.undefined,
    isSelected: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    menuRenderer: /* index */ js.UndefOr[scala.Double] => reactLib.reactMod.Global.JSXNs.Element = null,
    name: java.lang.String = null,
    reorderHandle: reactLib.reactMod.Global.JSXNs.Element = null,
    resizeHandle: atBlueprintjsTableLib.libEsmInteractionsResizeHandleMod.ResizeHandle = null,
    style: reactLib.reactMod.CSSProperties = null
  ): IInternalHeaderCellProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (menuRenderer != null) __obj.updateDynamic("menuRenderer")(js.Any.fromFunction1(menuRenderer))
    if (name != null) __obj.updateDynamic("name")(name)
    if (reorderHandle != null) __obj.updateDynamic("reorderHandle")(reorderHandle)
    if (resizeHandle != null) __obj.updateDynamic("resizeHandle")(resizeHandle)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[IInternalHeaderCellProps]
  }
}

