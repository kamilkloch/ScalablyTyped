package typings
package reactDashSortableDashTreeLib.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactSortableTreeProps extends ThemeTreeProps {
  var canDrag: js.UndefOr[(js.Function1[/* data */ ExtendedNodeData, scala.Boolean]) | scala.Boolean] = js.undefined
  var canDrop: js.UndefOr[
    js.Function1[/* data */ OnDragPreviousAndNextLocation with NodeData, scala.Boolean]
  ] = js.undefined
  var canNodeHaveChildren: js.UndefOr[js.Function1[/* node */ TreeItem, scala.Boolean]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dndType: js.UndefOr[java.lang.String] = js.undefined
  var generateNodeProps: js.UndefOr[
    js.Function1[/* data */ ExtendedNodeData, org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  var getNodeKey: js.UndefOr[
    js.Function1[/* data */ TreeNode with TreeIndex, java.lang.String | scala.Double]
  ] = js.undefined
  var isVirtualized: js.UndefOr[scala.Boolean] = js.undefined
  var maxDepth: js.UndefOr[scala.Double] = js.undefined
  var onDragStateChanged: js.UndefOr[js.Function1[/* data */ OnDragStateChangedData, scala.Unit]] = js.undefined
  var onMoveNode: js.UndefOr[
    js.Function1[/* data */ NodeData with FullTree with OnMovePreviousAndNextLocation, scala.Unit]
  ] = js.undefined
  var onVisibilityToggle: js.UndefOr[js.Function1[/* data */ OnVisibilityToggleData, scala.Unit]] = js.undefined
  var onlyExpandSearchedNodes: js.UndefOr[scala.Boolean] = js.undefined
  var rowDirection: js.UndefOr[
    reactDashSortableDashTreeLib.reactDashSortableDashTreeLibStrings.ltr | reactDashSortableDashTreeLib.reactDashSortableDashTreeLibStrings.rtl
  ] = js.undefined
  var searchFinishCallback: js.UndefOr[js.Function1[/* matches */ js.Array[NodeData], scala.Unit]] = js.undefined
  var searchFocusOffset: js.UndefOr[scala.Double] = js.undefined
  var searchMethod: js.UndefOr[js.Function1[/* data */ SearchData, scala.Boolean]] = js.undefined
  var searchQuery: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var shouldCopyOnOutsideDrop: js.UndefOr[scala.Boolean | (js.Function1[/* data */ ShouldCopyData, scala.Boolean])] = js.undefined
  var theme: js.UndefOr[ThemeProps] = js.undefined
  var treeData: js.Array[TreeItem]
  def onChange(treeData: js.Array[TreeItem]): scala.Unit
}

object ReactSortableTreeProps {
  @scala.inline
  def apply(
    onChange: js.Array[TreeItem] => scala.Unit,
    treeData: js.Array[TreeItem],
    canDrag: (js.Function1[/* data */ ExtendedNodeData, scala.Boolean]) | scala.Boolean = null,
    canDrop: /* data */ OnDragPreviousAndNextLocation with NodeData => scala.Boolean = null,
    canNodeHaveChildren: /* node */ TreeItem => scala.Boolean = null,
    className: java.lang.String = null,
    dndType: java.lang.String = null,
    generateNodeProps: /* data */ ExtendedNodeData => org.scalablytyped.runtime.StringDictionary[_] = null,
    getNodeKey: /* data */ TreeNode with TreeIndex => java.lang.String | scala.Double = null,
    innerStyle: reactLib.reactMod.CSSProperties = null,
    isVirtualized: js.UndefOr[scala.Boolean] = js.undefined,
    maxDepth: scala.Int | scala.Double = null,
    nodeContentRenderer: NodeRenderer = null,
    onDragStateChanged: /* data */ OnDragStateChangedData => scala.Unit = null,
    onMoveNode: /* data */ NodeData with FullTree with OnMovePreviousAndNextLocation => scala.Unit = null,
    onVisibilityToggle: /* data */ OnVisibilityToggleData => scala.Unit = null,
    onlyExpandSearchedNodes: js.UndefOr[scala.Boolean] = js.undefined,
    placeholderRenderer: PlaceholderRenderer = null,
    reactVirtualizedListProps: stdLib.Partial[reactDashVirtualizedLib.distEsListMod.ListProps] = null,
    rowDirection: reactDashSortableDashTreeLib.reactDashSortableDashTreeLibStrings.ltr | reactDashSortableDashTreeLib.reactDashSortableDashTreeLibStrings.rtl = null,
    rowHeight: (js.Function1[/* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double]) | scala.Double = null,
    scaffoldBlockPxWidth: scala.Int | scala.Double = null,
    searchFinishCallback: /* matches */ js.Array[NodeData] => scala.Unit = null,
    searchFocusOffset: scala.Int | scala.Double = null,
    searchMethod: /* data */ SearchData => scala.Boolean = null,
    searchQuery: java.lang.String | js.Any = null,
    shouldCopyOnOutsideDrop: scala.Boolean | (js.Function1[/* data */ ShouldCopyData, scala.Boolean]) = null,
    slideRegionSize: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    theme: ThemeProps = null
  ): ReactSortableTreeProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), treeData = treeData)
    if (canDrag != null) __obj.updateDynamic("canDrag")(canDrag.asInstanceOf[js.Any])
    if (canDrop != null) __obj.updateDynamic("canDrop")(js.Any.fromFunction1(canDrop))
    if (canNodeHaveChildren != null) __obj.updateDynamic("canNodeHaveChildren")(js.Any.fromFunction1(canNodeHaveChildren))
    if (className != null) __obj.updateDynamic("className")(className)
    if (dndType != null) __obj.updateDynamic("dndType")(dndType)
    if (generateNodeProps != null) __obj.updateDynamic("generateNodeProps")(js.Any.fromFunction1(generateNodeProps))
    if (getNodeKey != null) __obj.updateDynamic("getNodeKey")(js.Any.fromFunction1(getNodeKey))
    if (innerStyle != null) __obj.updateDynamic("innerStyle")(innerStyle)
    if (!js.isUndefined(isVirtualized)) __obj.updateDynamic("isVirtualized")(isVirtualized)
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (nodeContentRenderer != null) __obj.updateDynamic("nodeContentRenderer")(nodeContentRenderer)
    if (onDragStateChanged != null) __obj.updateDynamic("onDragStateChanged")(js.Any.fromFunction1(onDragStateChanged))
    if (onMoveNode != null) __obj.updateDynamic("onMoveNode")(js.Any.fromFunction1(onMoveNode))
    if (onVisibilityToggle != null) __obj.updateDynamic("onVisibilityToggle")(js.Any.fromFunction1(onVisibilityToggle))
    if (!js.isUndefined(onlyExpandSearchedNodes)) __obj.updateDynamic("onlyExpandSearchedNodes")(onlyExpandSearchedNodes)
    if (placeholderRenderer != null) __obj.updateDynamic("placeholderRenderer")(placeholderRenderer)
    if (reactVirtualizedListProps != null) __obj.updateDynamic("reactVirtualizedListProps")(reactVirtualizedListProps)
    if (rowDirection != null) __obj.updateDynamic("rowDirection")(rowDirection.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (scaffoldBlockPxWidth != null) __obj.updateDynamic("scaffoldBlockPxWidth")(scaffoldBlockPxWidth.asInstanceOf[js.Any])
    if (searchFinishCallback != null) __obj.updateDynamic("searchFinishCallback")(js.Any.fromFunction1(searchFinishCallback))
    if (searchFocusOffset != null) __obj.updateDynamic("searchFocusOffset")(searchFocusOffset.asInstanceOf[js.Any])
    if (searchMethod != null) __obj.updateDynamic("searchMethod")(js.Any.fromFunction1(searchMethod))
    if (searchQuery != null) __obj.updateDynamic("searchQuery")(searchQuery.asInstanceOf[js.Any])
    if (shouldCopyOnOutsideDrop != null) __obj.updateDynamic("shouldCopyOnOutsideDrop")(shouldCopyOnOutsideDrop.asInstanceOf[js.Any])
    if (slideRegionSize != null) __obj.updateDynamic("slideRegionSize")(slideRegionSize.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ReactSortableTreeProps]
  }
}

