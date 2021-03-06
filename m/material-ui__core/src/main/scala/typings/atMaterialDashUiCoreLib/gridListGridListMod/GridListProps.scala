package typings
package atMaterialDashUiCoreLib.gridListGridListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<std.HTMLUListElement>, 'classes' | never> ]: react.react.HTMLAttributes<std.HTMLUListElement>[P]} */ trait GridListProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[GridListClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var cellHeight: js.UndefOr[scala.Double | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto] = js.undefined
  var cols: js.UndefOr[scala.Double] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactType[GridListProps]] = js.undefined
  var spacing: js.UndefOr[scala.Double] = js.undefined
}

object GridListProps {
  @scala.inline
  def apply(
    cellHeight: scala.Double | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[GridListClassKey]] = null,
    cols: scala.Int | scala.Double = null,
    component: reactLib.reactMod.ReactType[GridListProps] = null,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    spacing: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null
  ): GridListProps = {
    val __obj = js.Dynamic.literal()
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[GridListProps]
  }
}

