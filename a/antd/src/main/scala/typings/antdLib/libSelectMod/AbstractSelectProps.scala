package typings
package antdLib.libSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AbstractSelectProps extends js.Object {
  var allowClear: js.UndefOr[scala.Boolean] = js.undefined
  var autoClearSearchValue: js.UndefOr[scala.Boolean] = js.undefined
  var choiceTransitionName: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultActiveFirstOption: js.UndefOr[scala.Boolean] = js.undefined
  var defaultOpen: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dropdownClassName: js.UndefOr[java.lang.String] = js.undefined
  var dropdownMatchSelectWidth: js.UndefOr[scala.Boolean] = js.undefined
  var dropdownMenuStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var dropdownStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var filterOption: js.UndefOr[
    scala.Boolean | (js.Function2[
      /* inputValue */ java.lang.String, 
      /* option */ reactLib.reactMod.ReactNs.ReactElement[OptionProps], 
      _
    ])
  ] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ reactLib.Element, reactLib.HTMLElement]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var notFoundContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | scala.Null] = js.undefined
  var onDropdownVisibleChange: js.UndefOr[js.Function1[/* open */ scala.Boolean, scala.Unit]] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* value */ java.lang.String, _]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var placeholder: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var showArrow: js.UndefOr[scala.Boolean] = js.undefined
  var showSearch: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[
    antdLib.antdLibStrings.default | antdLib.antdLibStrings.large | antdLib.antdLibStrings.small
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
}
