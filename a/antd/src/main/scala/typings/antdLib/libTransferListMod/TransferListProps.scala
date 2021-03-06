package typings
package antdLib.libTransferListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferListProps extends js.Object {
  var body: js.UndefOr[js.Function1[/* props */ TransferListProps, reactLib.reactMod.ReactNode]] = js.undefined
  var checkedKeys: js.Array[java.lang.String]
  var dataSource: js.Array[antdLib.libTransferMod.TransferItem]
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var filter: java.lang.String
  var filterOption: js.UndefOr[js.Function2[/* filterText */ js.Any, /* item */ js.Any, scala.Boolean]] = js.undefined
  var footer: js.UndefOr[js.Function1[/* props */ TransferListProps, reactLib.reactMod.ReactNode]] = js.undefined
  var itemUnit: java.lang.String
  var itemsUnit: java.lang.String
  var `lazy`: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  var notFoundContent: reactLib.reactMod.ReactNode
  var onScroll: js.Function
  var prefixCls: java.lang.String
  var render: js.UndefOr[js.Function1[/* item */ js.Any, _]] = js.undefined
  var searchPlaceholder: java.lang.String
  var showSearch: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var titleText: java.lang.String
  def handleClear(): scala.Unit
  def handleFilter(e: js.Any): scala.Unit
  def handleSelect(selectedItem: js.Any, checked: scala.Boolean): scala.Unit
  def handleSelectAll(dataSource: js.Array[_], checkAll: scala.Boolean): scala.Unit
}

object TransferListProps {
  @scala.inline
  def apply(
    checkedKeys: js.Array[java.lang.String],
    dataSource: js.Array[antdLib.libTransferMod.TransferItem],
    filter: java.lang.String,
    handleClear: () => scala.Unit,
    handleFilter: js.Any => scala.Unit,
    handleSelect: (js.Any, scala.Boolean) => scala.Unit,
    handleSelectAll: (js.Array[_], scala.Boolean) => scala.Unit,
    itemUnit: java.lang.String,
    itemsUnit: java.lang.String,
    notFoundContent: reactLib.reactMod.ReactNode,
    onScroll: js.Function,
    prefixCls: java.lang.String,
    searchPlaceholder: java.lang.String,
    titleText: java.lang.String,
    body: /* props */ TransferListProps => reactLib.reactMod.ReactNode = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    filterOption: (/* filterText */ js.Any, /* item */ js.Any) => scala.Boolean = null,
    footer: /* props */ TransferListProps => reactLib.reactMod.ReactNode = null,
    `lazy`: scala.Boolean | js.Object = null,
    render: /* item */ js.Any => _ = null,
    showSearch: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null
  ): TransferListProps = {
    val __obj = js.Dynamic.literal(checkedKeys = checkedKeys, dataSource = dataSource, filter = filter, handleClear = js.Any.fromFunction0(handleClear), handleFilter = js.Any.fromFunction1(handleFilter), handleSelect = js.Any.fromFunction2(handleSelect), handleSelectAll = js.Any.fromFunction2(handleSelectAll), itemUnit = itemUnit, itemsUnit = itemsUnit, notFoundContent = notFoundContent.asInstanceOf[js.Any], onScroll = onScroll, prefixCls = prefixCls, searchPlaceholder = searchPlaceholder, titleText = titleText)
    if (body != null) __obj.updateDynamic("body")(js.Any.fromFunction1(body))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (filterOption != null) __obj.updateDynamic("filterOption")(js.Any.fromFunction2(filterOption))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1(footer))
    if (`lazy` != null) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TransferListProps]
  }
}

