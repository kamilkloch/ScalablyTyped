package typings
package primereactLib.componentsPicklistPickListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickListProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var itemTemplate: js.UndefOr[
    js.Function1[/* item */ js.Any, js.UndefOr[reactLib.reactMod.Global.JSXNs.Element]]
  ] = js.undefined
  var metaKeySelection: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_EventSource, scala.Unit]] = js.undefined
  var onMoveAllToSource: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var onMoveAllToTarget: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var onMoveToSource: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var onMoveToTarget: js.UndefOr[js.Function1[/* e */ primereactLib.Anon_OriginalEventValue, scala.Unit]] = js.undefined
  var responsive: js.UndefOr[scala.Boolean] = js.undefined
  var showSourceControls: js.UndefOr[scala.Boolean] = js.undefined
  var showTargetControls: js.UndefOr[scala.Boolean] = js.undefined
  var source: js.UndefOr[js.Array[_]] = js.undefined
  var sourceHeader: js.UndefOr[js.Any] = js.undefined
  var sourceStyle: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var tabIndex: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[js.Array[_]] = js.undefined
  var targetHeader: js.UndefOr[js.Any] = js.undefined
  var targetStyle: js.UndefOr[js.Object] = js.undefined
}

object PickListProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    id: java.lang.String = null,
    itemTemplate: /* item */ js.Any => js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = null,
    metaKeySelection: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* e */ primereactLib.Anon_EventSource => scala.Unit = null,
    onMoveAllToSource: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    onMoveAllToTarget: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    onMoveToSource: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    onMoveToTarget: /* e */ primereactLib.Anon_OriginalEventValue => scala.Unit = null,
    responsive: js.UndefOr[scala.Boolean] = js.undefined,
    showSourceControls: js.UndefOr[scala.Boolean] = js.undefined,
    showTargetControls: js.UndefOr[scala.Boolean] = js.undefined,
    source: js.Array[_] = null,
    sourceHeader: js.Any = null,
    sourceStyle: js.Object = null,
    style: js.Object = null,
    tabIndex: java.lang.String = null,
    target: js.Array[_] = null,
    targetHeader: js.Any = null,
    targetStyle: js.Object = null
  ): PickListProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemTemplate != null) __obj.updateDynamic("itemTemplate")(js.Any.fromFunction1(itemTemplate))
    if (!js.isUndefined(metaKeySelection)) __obj.updateDynamic("metaKeySelection")(metaKeySelection)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onMoveAllToSource != null) __obj.updateDynamic("onMoveAllToSource")(js.Any.fromFunction1(onMoveAllToSource))
    if (onMoveAllToTarget != null) __obj.updateDynamic("onMoveAllToTarget")(js.Any.fromFunction1(onMoveAllToTarget))
    if (onMoveToSource != null) __obj.updateDynamic("onMoveToSource")(js.Any.fromFunction1(onMoveToSource))
    if (onMoveToTarget != null) __obj.updateDynamic("onMoveToTarget")(js.Any.fromFunction1(onMoveToTarget))
    if (!js.isUndefined(responsive)) __obj.updateDynamic("responsive")(responsive)
    if (!js.isUndefined(showSourceControls)) __obj.updateDynamic("showSourceControls")(showSourceControls)
    if (!js.isUndefined(showTargetControls)) __obj.updateDynamic("showTargetControls")(showTargetControls)
    if (source != null) __obj.updateDynamic("source")(source)
    if (sourceHeader != null) __obj.updateDynamic("sourceHeader")(sourceHeader)
    if (sourceStyle != null) __obj.updateDynamic("sourceStyle")(sourceStyle)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex)
    if (target != null) __obj.updateDynamic("target")(target)
    if (targetHeader != null) __obj.updateDynamic("targetHeader")(targetHeader)
    if (targetStyle != null) __obj.updateDynamic("targetStyle")(targetStyle)
    __obj.asInstanceOf[PickListProps]
  }
}

