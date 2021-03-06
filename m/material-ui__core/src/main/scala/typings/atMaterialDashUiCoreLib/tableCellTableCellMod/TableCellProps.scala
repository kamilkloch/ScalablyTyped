package typings
package atMaterialDashUiCoreLib.tableCellTableCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/TableCell/TableCell.TableCellBaseProps, 'classes' | 'align'> ]: @material-ui/core.@material-ui/core/TableCell/TableCell.TableCellBaseProps[P]} */ trait TableCellProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TableCellClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var align: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.left | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.center | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.right | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.justify
  ] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactType[TableCellBaseProps]] = js.undefined
  var numeric: js.UndefOr[scala.Boolean] = js.undefined
  var padding: js.UndefOr[Padding] = js.undefined
  var sortDirection: js.UndefOr[SortDirection] = js.undefined
  var variant: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.head | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.body | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.footer
  ] = js.undefined
}

object TableCellProps {
  @scala.inline
  def apply(
    align: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.inherit | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.left | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.center | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.right | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.justify = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[TableCellClassKey]] = null,
    component: reactLib.reactMod.ReactType[TableCellBaseProps] = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    numeric: js.UndefOr[scala.Boolean] = js.undefined,
    padding: Padding = null,
    sortDirection: SortDirection = null,
    style: reactLib.reactMod.CSSProperties = null,
    variant: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.head | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.body | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.footer = null
  ): TableCellProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection)
    if (style != null) __obj.updateDynamic("style")(style)
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellProps]
  }
}

