package typings
package agDashGridLib.distLibRenderingRowCompMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/rendering/rowComp", "RowComp")
@js.native
class RowComp protected ()
  extends agDashGridLib.distLibWidgetsComponentMod.Component {
  def this(parentScope: js.Any, bodyContainerComp: agDashGridLib.distLibRenderingRowContainerComponentMod.RowContainerComponent, pinnedLeftContainerComp: agDashGridLib.distLibRenderingRowContainerComponentMod.RowContainerComponent, pinnedRightContainerComp: agDashGridLib.distLibRenderingRowContainerComponentMod.RowContainerComponent, fullWidthContainerComp: agDashGridLib.distLibRenderingRowContainerComponentMod.RowContainerComponent, rowNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode, beans: agDashGridLib.distLibRenderingBeansMod.Beans, animateIn: scala.Boolean, useAnimationFrameForCreate: scala.Boolean) = this()
  var active: js.Any = js.native
  var beans: js.Any = js.native
  var bodyContainerComp: js.Any = js.native
  var cellComps: js.Any = js.native
  var columnRefreshPending: js.Any = js.native
  var createSecondPassFuncs: js.Any = js.native
  var eAllRowContainers: js.Any = js.native
  var eBodyRow: js.Any = js.native
  var eFullWidthRow: js.Any = js.native
  var eFullWidthRowBody: js.Any = js.native
  var eFullWidthRowLeft: js.Any = js.native
  var eFullWidthRowRight: js.Any = js.native
  var ePinnedLeftRow: js.Any = js.native
  var ePinnedRightRow: js.Any = js.native
  var editingRow: js.Any = js.native
  var fadeRowIn: js.Any = js.native
  var fullWidthContainerComp: js.Any = js.native
  var fullWidthRow: js.Any = js.native
  var fullWidthRowComponent: js.Any = js.native
  var fullWidthRowComponentBody: js.Any = js.native
  var fullWidthRowComponentLeft: js.Any = js.native
  var fullWidthRowComponentRight: js.Any = js.native
  var fullWidthRowEmbedded: js.Any = js.native
  var initialised: js.Any = js.native
  var paginationPage: js.Any = js.native
  var parentScope: js.Any = js.native
  var pinnedLeftContainerComp: js.Any = js.native
  var pinnedRightContainerComp: js.Any = js.native
  var removeFirstPassFuncs: js.Any = js.native
  var removeSecondPassFuncs: js.Any = js.native
  var rowFocused: js.Any = js.native
  var rowIsEven: js.Any = js.native
  var rowNode: js.Any = js.native
  var scope: js.Any = js.native
  var slideRowIn: js.Any = js.native
  var useAnimationFrameForCreate: js.Any = js.native
  /* private */ def addDomData(eRowContainer: js.Any): js.Any = js.native
  /* private */ def addHoverFunctionality(eRow: js.Any): js.Any = js.native
  /* private */ def addListeners(): js.Any = js.native
  def afterFlush(): scala.Unit = js.native
  /* private */ def afterRowAttached(rowContainerComp: js.Any, eRow: js.Any): js.Any = js.native
  /* private */ def angular1Compile(element: js.Any): js.Any = js.native
  /* private */ def applyPaginationOffset(topPx: js.Any): js.Any = js.native
  /* private */ def applyPaginationOffset(topPx: js.Any, reverse: js.Any): js.Any = js.native
  /* private */ def callAfterRowAttachedOnCells(newCellComps: js.Any, eRow: js.Any): js.Any = js.native
  /* private */ def createCells(cols: js.Any): js.Any = js.native
  /* private */ def createChildScopeOrNull(data: js.Any): js.Any = js.native
  /* private */ def createFullWidthParams(eRow: js.Any, pinned: js.Any): js.Any = js.native
  /* private */ def createFullWidthRowContainer(
    rowContainerComp: js.Any,
    pinned: js.Any,
    extraCssClass: js.Any,
    cellRendererType: js.Any,
    cellRendererName: js.Any,
    eRowCallback: js.Any,
    cellRendererCallback: js.Any
  ): js.Any = js.native
  /* private */ def createFullWidthRows(`type`: js.Any, name: js.Any): js.Any = js.native
  /* private */ def createNewCell(col: js.Any, eContainer: js.Any, cellTemplates: js.Any, newCellComps: js.Any): js.Any = js.native
  /* private */ def createRowContainer(rowContainerComp: js.Any, cols: js.Any, callback: js.Any): js.Any = js.native
  /* private */ def createRowEvent(`type`: js.Any): js.Any = js.native
  /* private */ def createRowEvent(`type`: js.Any, domEvent: js.Any): js.Any = js.native
  /* private */ def createRowEventWithSource(`type`: js.Any, domEvent: js.Any): js.Any = js.native
  /* private */ def createTemplate(contents: js.Any): js.Any = js.native
  /* private */ def createTemplate(contents: js.Any, extraCssClass: js.Any): js.Any = js.native
  def destroy(animate: scala.Boolean): scala.Unit = js.native
  /* private */ def destroyContainingCells(): js.Any = js.native
  /* private */ def destroyFullWidthComponents(): js.Any = js.native
  /* private */ def ensureCellInCorrectContainer(cellComp: js.Any): js.Any = js.native
  def ensureDomOrder(): scala.Unit = js.native
  /* private */ def executeProcessRowPostCreateFunc(): js.Any = js.native
  def forEachCellComp(
    callback: js.Function1[/* renderedCell */ agDashGridLib.distLibRenderingCellCompMod.CellComp, scala.Unit]
  ): scala.Unit = js.native
  def getAndClearDelayedDestroyFunctions(): js.Array[js.Function] = js.native
  def getAndClearNextVMTurnFunctions(): js.Array[js.Function] = js.native
  def getBodyRowElement(): stdLib.HTMLElement = js.native
  def getCellForCol(column: agDashGridLib.distLibEntitiesColumnMod.Column): stdLib.HTMLElement = js.native
  /* private */ def getContainerForCell(pinnedType: js.Any): js.Any = js.native
  def getFullWidthRowElement(): stdLib.HTMLElement = js.native
  /* private */ def getInitialRowClasses(extraCssClass: js.Any): js.Any = js.native
  /* private */ def getInitialRowTopStyle(): js.Any = js.native
  def getPinnedLeftRowElement(): stdLib.HTMLElement = js.native
  def getPinnedRightRowElement(): stdLib.HTMLElement = js.native
  def getRenderedCellForColumn(column: agDashGridLib.distLibEntitiesColumnMod.Column): agDashGridLib.distLibRenderingCellCompMod.CellComp = js.native
  /* private */ def getRowBusinessKey(): js.Any = js.native
  def getRowNode(): agDashGridLib.distLibEntitiesRowNodeMod.RowNode = js.native
  @JSName("init")
  def init_MRowComp(): scala.Unit = js.native
  /* private */ def insertCellsIntoContainer(eRow: js.Any, cols: js.Any): js.Any = js.native
  /* private */ def isCellEligibleToBeRemoved(indexStr: js.Any): js.Any = js.native
  /* private */ def isCellInWrongRow(cellComp: js.Any): js.Any = js.native
  def isEditing(): scala.Boolean = js.native
  def isFullWidth(): scala.Boolean = js.native
  /* private */ def lazyCreateCells(cols: js.Any, eRow: js.Any): js.Any = js.native
  /* private */ def onCellFocusChanged(): js.Any = js.native
  /* private */ def onColumnResized(): js.Any = js.native
  /* private */ def onDisplayedColumnsChanged(): js.Any = js.native
  /* private */ def onExpandedChanged(): js.Any = js.native
  /* private */ def onGridColumnsChanged(): js.Any = js.native
  def onMouseEvent(eventName: java.lang.String, mouseEvent: stdLib.MouseEvent): scala.Unit = js.native
  /* private */ def onPaginationChanged(): js.Any = js.native
  def onRowClick(mouseEvent: stdLib.MouseEvent): scala.Unit = js.native
  /* private */ def onRowDblClick(mouseEvent: js.Any): js.Any = js.native
  /* private */ def onRowHeightChanged(): js.Any = js.native
  /* private */ def onRowIndexChanged(): js.Any = js.native
  /* private */ def onRowNodeCellChanged(event: js.Any): js.Any = js.native
  /* private */ def onRowNodeDataChanged(event: js.Any): js.Any = js.native
  /* private */ def onRowNodeDraggingChanged(): js.Any = js.native
  /* private */ def onRowSelected(): js.Any = js.native
  /* private */ def onTopChanged(): js.Any = js.native
  /* private */ def onVirtualColumnsChanged(): js.Any = js.native
  /* private */ def postProcessClassesFromGridOptions(): js.Any = js.native
  /* private */ def postProcessCss(): js.Any = js.native
  /* private */ def postProcessRowClassRules(): js.Any = js.native
  /* private */ def postProcessRowDragging(): js.Any = js.native
  /* private */ def postProcessStylesFromGridOptions(): js.Any = js.native
  /* private */ def preProcessRowClassRules(): js.Any = js.native
  /* private */ def preProcessStylesFromGridOptions(): js.Any = js.native
  /* private */ def processClassesFromGridOptions(): js.Any = js.native
  /* private */ def processRowClassRules(onApplicableClass: js.Any): js.Any = js.native
  /* private */ def processRowClassRules(onApplicableClass: js.Any, onNotApplicableClass: js.Any): js.Any = js.native
  /* private */ def processStylesFromGridOptions(): js.Any = js.native
  /* private */ def refreshCells(): js.Any = js.native
  /* private */ def refreshCellsInAnimationFrame(): js.Any = js.native
  /* private */ def removeRenderedCells(colIds: js.Any): js.Any = js.native
  /* private */ def roundRowTopToBounds(rowTop: js.Any): js.Any = js.native
  /* private */ def setAnimateFlags(animateIn: js.Any): js.Any = js.native
  /* private */ def setEditingRow(value: js.Any): js.Any = js.native
  /* private */ def setRowTop(pixels: js.Any): js.Any = js.native
  /* private */ def setupNormalRowContainers(): js.Any = js.native
  /* private */ def setupRowContainers(): js.Any = js.native
  def startRowEditing(): scala.Unit = js.native
  def startRowEditing(keyPress: scala.Double): scala.Unit = js.native
  def startRowEditing(keyPress: scala.Double, charPress: java.lang.String): scala.Unit = js.native
  def startRowEditing(
    keyPress: scala.Double,
    charPress: java.lang.String,
    sourceRenderedCell: agDashGridLib.distLibRenderingCellCompMod.CellComp
  ): scala.Unit = js.native
  def stopEditing(): scala.Unit = js.native
  def stopEditing(cancel: scala.Boolean): scala.Unit = js.native
  def stopRowEditing(cancel: scala.Boolean): scala.Unit = js.native
  /* private */ def updateRowIndexes(): js.Any = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/rendering/rowComp", "RowComp")
@js.native
object RowComp extends js.Object {
  var DETAIL_CELL_RENDERER: js.Any = js.native
  var DETAIL_CELL_RENDERER_COMP_NAME: js.Any = js.native
  var DOM_DATA_KEY_RENDERED_ROW: java.lang.String = js.native
  var FULL_WIDTH_CELL_RENDERER: js.Any = js.native
  var GROUP_ROW_RENDERER: js.Any = js.native
  var GROUP_ROW_RENDERER_COMP_NAME: js.Any = js.native
  var LOADING_CELL_RENDERER: js.Any = js.native
  var LOADING_CELL_RENDERER_COMP_NAME: js.Any = js.native
}

