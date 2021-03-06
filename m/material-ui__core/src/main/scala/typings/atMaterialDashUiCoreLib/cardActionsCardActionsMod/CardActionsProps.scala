package typings
package atMaterialDashUiCoreLib.cardActionsCardActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<std.HTMLDivElement>, 'classes' | never> ]: react.react.HTMLAttributes<std.HTMLDivElement>[P]} */ trait CardActionsProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[CardActionsClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var disableActionSpacing: js.UndefOr[scala.Boolean] = js.undefined
}

object CardActionsProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[CardActionsClassKey]] = null,
    disableActionSpacing: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    style: reactLib.reactMod.CSSProperties = null
  ): CardActionsProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disableActionSpacing)) __obj.updateDynamic("disableActionSpacing")(disableActionSpacing)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CardActionsProps]
  }
}

