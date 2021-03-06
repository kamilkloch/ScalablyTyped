package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramOptions extends js.Object {
  var add: js.UndefOr[js.Function1[/* e */ DiagramAddEvent, scala.Unit]] = js.undefined
  var autoBind: js.UndefOr[scala.Boolean] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* e */ DiagramCancelEvent, scala.Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ DiagramChangeEvent, scala.Unit]] = js.undefined
  var click: js.UndefOr[js.Function1[/* e */ DiagramClickEvent, scala.Unit]] = js.undefined
  var connectionDefaults: js.UndefOr[DiagramConnectionDefaults] = js.undefined
  var connections: js.UndefOr[js.Array[DiagramConnection]] = js.undefined
  var connectionsDataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ DiagramDataBoundEvent, scala.Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ DiagramDragEvent, scala.Unit]] = js.undefined
  var dragEnd: js.UndefOr[js.Function1[/* e */ DiagramDragEndEvent, scala.Unit]] = js.undefined
  var dragStart: js.UndefOr[js.Function1[/* e */ DiagramDragStartEvent, scala.Unit]] = js.undefined
  var edit: js.UndefOr[js.Function1[/* e */ DiagramEditEvent, scala.Unit]] = js.undefined
  var editable: js.UndefOr[scala.Boolean | DiagramEditable] = js.undefined
  var itemBoundsChange: js.UndefOr[js.Function1[/* e */ DiagramItemBoundsChangeEvent, scala.Unit]] = js.undefined
  var itemRotate: js.UndefOr[js.Function1[/* e */ DiagramItemRotateEvent, scala.Unit]] = js.undefined
  var layout: js.UndefOr[DiagramLayout] = js.undefined
  var mouseEnter: js.UndefOr[js.Function1[/* e */ DiagramMouseEnterEvent, scala.Unit]] = js.undefined
  var mouseLeave: js.UndefOr[js.Function1[/* e */ DiagramMouseLeaveEvent, scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pan: js.UndefOr[js.Function1[/* e */ DiagramPanEvent, scala.Unit]] = js.undefined
  var pannable: js.UndefOr[scala.Boolean | DiagramPannable] = js.undefined
  var pdf: js.UndefOr[DiagramPdf] = js.undefined
  var remove: js.UndefOr[js.Function1[/* e */ DiagramRemoveEvent, scala.Unit]] = js.undefined
  var save: js.UndefOr[js.Function1[/* e */ DiagramSaveEvent, scala.Unit]] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ DiagramSelectEvent, scala.Unit]] = js.undefined
  var selectable: js.UndefOr[scala.Boolean | DiagramSelectable] = js.undefined
  var shapeDefaults: js.UndefOr[DiagramShapeDefaults] = js.undefined
  var shapes: js.UndefOr[js.Array[DiagramShape]] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var toolBarClick: js.UndefOr[js.Function1[/* e */ DiagramToolBarClickEvent, scala.Unit]] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
  var zoomEnd: js.UndefOr[js.Function1[/* e */ DiagramZoomEndEvent, scala.Unit]] = js.undefined
  var zoomMax: js.UndefOr[scala.Double] = js.undefined
  var zoomMin: js.UndefOr[scala.Double] = js.undefined
  var zoomRate: js.UndefOr[scala.Double] = js.undefined
  var zoomStart: js.UndefOr[js.Function1[/* e */ DiagramZoomStartEvent, scala.Unit]] = js.undefined
}

object DiagramOptions {
  @scala.inline
  def apply(
    add: /* e */ DiagramAddEvent => scala.Unit = null,
    autoBind: js.UndefOr[scala.Boolean] = js.undefined,
    cancel: /* e */ DiagramCancelEvent => scala.Unit = null,
    change: /* e */ DiagramChangeEvent => scala.Unit = null,
    click: /* e */ DiagramClickEvent => scala.Unit = null,
    connectionDefaults: DiagramConnectionDefaults = null,
    connections: js.Array[DiagramConnection] = null,
    connectionsDataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource = null,
    dataBound: /* e */ DiagramDataBoundEvent => scala.Unit = null,
    dataSource: js.Any | kendoDashUiLib.kendoNs.dataNs.DataSource = null,
    drag: /* e */ DiagramDragEvent => scala.Unit = null,
    dragEnd: /* e */ DiagramDragEndEvent => scala.Unit = null,
    dragStart: /* e */ DiagramDragStartEvent => scala.Unit = null,
    edit: /* e */ DiagramEditEvent => scala.Unit = null,
    editable: scala.Boolean | DiagramEditable = null,
    itemBoundsChange: /* e */ DiagramItemBoundsChangeEvent => scala.Unit = null,
    itemRotate: /* e */ DiagramItemRotateEvent => scala.Unit = null,
    layout: DiagramLayout = null,
    mouseEnter: /* e */ DiagramMouseEnterEvent => scala.Unit = null,
    mouseLeave: /* e */ DiagramMouseLeaveEvent => scala.Unit = null,
    name: java.lang.String = null,
    pan: /* e */ DiagramPanEvent => scala.Unit = null,
    pannable: scala.Boolean | DiagramPannable = null,
    pdf: DiagramPdf = null,
    remove: /* e */ DiagramRemoveEvent => scala.Unit = null,
    save: /* e */ DiagramSaveEvent => scala.Unit = null,
    select: /* e */ DiagramSelectEvent => scala.Unit = null,
    selectable: scala.Boolean | DiagramSelectable = null,
    shapeDefaults: DiagramShapeDefaults = null,
    shapes: js.Array[DiagramShape] = null,
    template: java.lang.String | js.Function = null,
    theme: java.lang.String = null,
    toolBarClick: /* e */ DiagramToolBarClickEvent => scala.Unit = null,
    zoom: scala.Int | scala.Double = null,
    zoomEnd: /* e */ DiagramZoomEndEvent => scala.Unit = null,
    zoomMax: scala.Int | scala.Double = null,
    zoomMin: scala.Int | scala.Double = null,
    zoomRate: scala.Int | scala.Double = null,
    zoomStart: /* e */ DiagramZoomStartEvent => scala.Unit = null
  ): DiagramOptions = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1(add))
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (connectionDefaults != null) __obj.updateDynamic("connectionDefaults")(connectionDefaults)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    if (connectionsDataSource != null) __obj.updateDynamic("connectionsDataSource")(connectionsDataSource.asInstanceOf[js.Any])
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(js.Any.fromFunction1(dragEnd))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction1(dragStart))
    if (edit != null) __obj.updateDynamic("edit")(js.Any.fromFunction1(edit))
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (itemBoundsChange != null) __obj.updateDynamic("itemBoundsChange")(js.Any.fromFunction1(itemBoundsChange))
    if (itemRotate != null) __obj.updateDynamic("itemRotate")(js.Any.fromFunction1(itemRotate))
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (mouseEnter != null) __obj.updateDynamic("mouseEnter")(js.Any.fromFunction1(mouseEnter))
    if (mouseLeave != null) __obj.updateDynamic("mouseLeave")(js.Any.fromFunction1(mouseLeave))
    if (name != null) __obj.updateDynamic("name")(name)
    if (pan != null) __obj.updateDynamic("pan")(js.Any.fromFunction1(pan))
    if (pannable != null) __obj.updateDynamic("pannable")(pannable.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf)
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction1(save))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (shapeDefaults != null) __obj.updateDynamic("shapeDefaults")(shapeDefaults)
    if (shapes != null) __obj.updateDynamic("shapes")(shapes)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (toolBarClick != null) __obj.updateDynamic("toolBarClick")(js.Any.fromFunction1(toolBarClick))
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (zoomEnd != null) __obj.updateDynamic("zoomEnd")(js.Any.fromFunction1(zoomEnd))
    if (zoomMax != null) __obj.updateDynamic("zoomMax")(zoomMax.asInstanceOf[js.Any])
    if (zoomMin != null) __obj.updateDynamic("zoomMin")(zoomMin.asInstanceOf[js.Any])
    if (zoomRate != null) __obj.updateDynamic("zoomRate")(zoomRate.asInstanceOf[js.Any])
    if (zoomStart != null) __obj.updateDynamic("zoomStart")(js.Any.fromFunction1(zoomStart))
    __obj.asInstanceOf[DiagramOptions]
  }
}

