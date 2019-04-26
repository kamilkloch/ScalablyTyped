package typings
package atMaterialDashUiCoreLib.menuMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped @material-ui/core.@material-ui/core/Popover/Popover.PopoverProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps> extends any ? std.Pick<@material-ui/core.@material-ui/core/Popover/Popover.PopoverProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, std.Exclude<keyof @material-ui/core.@material-ui/core/Popover/Popover.PopoverProps & std.Partial<@material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerProps>, 'classes' | never>> : never */ trait MenuProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[MenuClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var MenuListProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.menuListMenuListMod.MenuListProps]] = js.undefined
  var PaperProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.paperPaperMod.PaperProps]] = js.undefined
  var PopoverClasses: js.UndefOr[
    stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[atMaterialDashUiCoreLib.popoverPopoverMod.PopoverClassKey]
    ]
  ] = js.undefined
  var disableAutoFocusItem: js.UndefOr[scala.Boolean] = js.undefined
  var transitionDuration: js.UndefOr[
    (js.UndefOr[scala.Double | reactDashTransitionDashGroupLib.Anon_Enter]) | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto
  ] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    MenuListProps: stdLib.Partial[atMaterialDashUiCoreLib.menuListMenuListMod.MenuListProps] = null,
    PaperProps: stdLib.Partial[atMaterialDashUiCoreLib.paperPaperMod.PaperProps] = null,
    PopoverClasses: stdLib.Partial[
      atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[atMaterialDashUiCoreLib.popoverPopoverMod.PopoverClassKey]
    ] = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[MenuClassKey]] = null,
    disableAutoFocusItem: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    style: reactLib.reactMod.CSSProperties = null,
    transitionDuration: (js.UndefOr[scala.Double | reactDashTransitionDashGroupLib.Anon_Enter]) | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (MenuListProps != null) __obj.updateDynamic("MenuListProps")(MenuListProps)
    if (PaperProps != null) __obj.updateDynamic("PaperProps")(PaperProps)
    if (PopoverClasses != null) __obj.updateDynamic("PopoverClasses")(PopoverClasses)
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (!js.isUndefined(disableAutoFocusItem)) __obj.updateDynamic("disableAutoFocusItem")(disableAutoFocusItem)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

