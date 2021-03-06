package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IStyleManager extends js.Object {
  var columnHeaderStyleCollection: sharepointLib.Anon_AllSelected
  var defaultCellStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell
  var gridPaneStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.GridPane
  var groupingStyles: js.Array[_]
  var readOnlyCellStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell
  var readOnlyFocusedCellStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell
  var rowHeaderStyleCollection: sharepointLib.Anon_AllSelected
  var splitterStyleCollection: sharepointLib.Anon_Dra
  var timescaleTierStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.TimescaleTier
  var widgetDockHoverStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Widget
  var widgetDockPressedStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Widget
  var widgetDockStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Widget
  def GetCellStyle(styleId: java.lang.String): sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell
  def RegisterCellStyle(styleId: java.lang.String, cellStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell): scala.Unit
  def UpdateDefaultCellStyleFromCss(styleObject: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell, cssClass: java.lang.String): scala.Unit
  def UpdateGridPaneStyleFromCss(styleObject: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.GridPane, gridStyleNameCollection: js.Any): scala.Unit
  def UpdateGroupStylesFromCss(styleObject: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell, prefix: java.lang.String): scala.Unit
  def UpdateHeaderStyleFromCss(styleObject: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Header, headerStyleNameCol: js.Any): scala.Unit
  def UpdateSplitterStyleFromCss(
    styleObject: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Splitter,
    splitterStyleNameCollection: js.Any
  ): scala.Unit
}

object IStyleManager {
  @scala.inline
  def apply(
    GetCellStyle: java.lang.String => sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell,
    RegisterCellStyle: (java.lang.String, sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell) => scala.Unit,
    UpdateDefaultCellStyleFromCss: (sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell, java.lang.String) => scala.Unit,
    UpdateGridPaneStyleFromCss: (sharepointLib.SPNs.JsGridNs.IStyleTypeNs.GridPane, js.Any) => scala.Unit,
    UpdateGroupStylesFromCss: (sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell, java.lang.String) => scala.Unit,
    UpdateHeaderStyleFromCss: (sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Header, js.Any) => scala.Unit,
    UpdateSplitterStyleFromCss: (sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Splitter, js.Any) => scala.Unit,
    columnHeaderStyleCollection: sharepointLib.Anon_AllSelected,
    defaultCellStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell,
    gridPaneStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.GridPane,
    groupingStyles: js.Array[_],
    readOnlyCellStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell,
    readOnlyFocusedCellStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Cell,
    rowHeaderStyleCollection: sharepointLib.Anon_AllSelected,
    splitterStyleCollection: sharepointLib.Anon_Dra,
    timescaleTierStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.TimescaleTier,
    widgetDockHoverStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Widget,
    widgetDockPressedStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Widget,
    widgetDockStyle: sharepointLib.SPNs.JsGridNs.IStyleTypeNs.Widget
  ): IStyleManager = {
    val __obj = js.Dynamic.literal(GetCellStyle = js.Any.fromFunction1(GetCellStyle), RegisterCellStyle = js.Any.fromFunction2(RegisterCellStyle), UpdateDefaultCellStyleFromCss = js.Any.fromFunction2(UpdateDefaultCellStyleFromCss), UpdateGridPaneStyleFromCss = js.Any.fromFunction2(UpdateGridPaneStyleFromCss), UpdateGroupStylesFromCss = js.Any.fromFunction2(UpdateGroupStylesFromCss), UpdateHeaderStyleFromCss = js.Any.fromFunction2(UpdateHeaderStyleFromCss), UpdateSplitterStyleFromCss = js.Any.fromFunction2(UpdateSplitterStyleFromCss), columnHeaderStyleCollection = columnHeaderStyleCollection, defaultCellStyle = defaultCellStyle, gridPaneStyle = gridPaneStyle, groupingStyles = groupingStyles, readOnlyCellStyle = readOnlyCellStyle, readOnlyFocusedCellStyle = readOnlyFocusedCellStyle, rowHeaderStyleCollection = rowHeaderStyleCollection, splitterStyleCollection = splitterStyleCollection, timescaleTierStyle = timescaleTierStyle, widgetDockHoverStyle = widgetDockHoverStyle, widgetDockPressedStyle = widgetDockPressedStyle, widgetDockStyle = widgetDockStyle)
  
    __obj.asInstanceOf[IStyleManager]
  }
}

