package typings
package reactDashToolboxLib.libTableTableHeadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeadProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * If true, a checkbox will be displayed to select every row. In case the table is not multi-selectable, it will be disabled though.
    * @default true
    */
  var displaySelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the header and each row will display a checkbox to allow the user to select multiple rows.
    * @default true
    */
  var multiSelectable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Handle the select state change of the checkbox in the header row.
    */
  var onSelect: js.UndefOr[js.Function] = js.undefined
  /**
    * If true, each row will display a checkbox to allow the user to select that one row.
    * @default true
    */
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If selectable, controls the selected state of the checkbox in the header row.
    */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[TableHeadTheme] = js.undefined
}

object TableHeadProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    displaySelect: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.Key = null,
    multiSelectable: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: js.Function = null,
    onContextMenu: js.Function = null,
    onDoubleClick: js.Function = null,
    onDrag: js.Function = null,
    onDragEnd: js.Function = null,
    onDragEnter: js.Function = null,
    onDragExit: js.Function = null,
    onDragLeave: js.Function = null,
    onDragOver: js.Function = null,
    onDragStart: js.Function = null,
    onDrop: js.Function = null,
    onMouseDown: js.Function = null,
    onMouseEnter: js.Function = null,
    onMouseLeave: js.Function = null,
    onMouseMove: js.Function = null,
    onMouseOut: js.Function = null,
    onMouseOver: js.Function = null,
    onMouseUp: js.Function = null,
    onSelect: js.Function = null,
    onTouchCancel: js.Function = null,
    onTouchEnd: js.Function = null,
    onTouchMove: js.Function = null,
    onTouchStart: js.Function = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null,
    theme: TableHeadTheme = null
  ): TableHeadProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(displaySelect)) __obj.updateDynamic("displaySelect")(displaySelect)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelectable)) __obj.updateDynamic("multiSelectable")(multiSelectable)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu)
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[TableHeadProps]
  }
}

