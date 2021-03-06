package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOptions[T /* <: SlickData */] extends js.Object {
  var addNewRowCssClass: js.UndefOr[java.lang.String] = js.undefined
  var alwaysAllowHorizontalScroll: js.UndefOr[scala.Boolean] = js.undefined
  var alwaysShowVerticalScroll: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* Delay after which cell editor is loaded. Ignored unless asyncEditorLoading is true.
  		**/
  var asyncEditorLoadDelay: js.UndefOr[scala.Double] = js.undefined
  /**
  		* Makes cell editors load asynchronously after a small delay. This greatly increases keyboard navigation speed.
  		**/
  var asyncEditorLoading: js.UndefOr[scala.Boolean] = js.undefined
  var asyncPostRenderCleanupDelay: js.UndefOr[scala.Double] = js.undefined
  /**
  		*
  		**/
  var asyncPostRenderDelay: js.UndefOr[scala.Double] = js.undefined
  /**
  		* Cell will not automatically go into edit mode when selected.
  		**/
  var autoEdit: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*
  		**/
  var autoHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* A CSS class to apply to flashing cells via flashCell().
  		**/
  var cellFlashingCssClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  		* A CSS class to apply to cells highlighted via setHighlightedCells().
  		**/
  var cellHighlightCssClass: js.UndefOr[java.lang.String] = js.undefined
  var createFooterRow: js.UndefOr[scala.Boolean] = js.undefined
  var createPreHeaderPanel: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*
  		**/
  var dataItemColumnValueExtractor: js.UndefOr[js.Function2[/* item */ js.Any, /* columnDef */ js.Any, _]] = js.undefined
  /**
  		*
  		**/
  var defaultColumnWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  		*
  		**/
  var defaultFormatter: js.UndefOr[Formatter[T]] = js.undefined
  var doPaging: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* Not listed as a default under options in slick.grid.js
  		**/
  var editCommandHandler: js.UndefOr[js.Any] = js.undefined
  /**
  		*
  		**/
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  var editorCellNavOnLRKeys: js.UndefOr[scala.Boolean] = js.undefined
   // queueAndExecuteCommand
  /**
  		* A factory object responsible to creating an editor for a given cell. Must implement getEditor(column).
  		**/
  var editorFactory: js.UndefOr[EditorFactory] = js.undefined
  /**
  		* A Slick.EditorLock instance to use for controlling concurrent data edits.
  		**/
  var editorLock: js.UndefOr[EditorLock[T]] = js.undefined
  var emulatePagingWhenScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* If true, a blank row will be displayed at the bottom - typing values in that row will add a new one. Must subscribe to onAddNewRow to save values.
  		**/
  var enableAddRow: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* If true, async post rendering will occur and asyncPostRender delegates on columns will be called.
  		**/
  var enableAsyncPostRender: js.UndefOr[scala.Boolean] = js.undefined
  var enableAsyncPostRenderCleanup: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* Appears to enable cell virtualisation for optimised speed with large datasets
  		**/
  var enableCellNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* *WARNING*: Not contained in SlickGrid 2.1, may be deprecated
  		**/
  var enableCellRangeSelection: js.UndefOr[js.Any] = js.undefined
  /**
  		*
  		**/
  var enableColumnReorder: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* *WARNING*: Not contained in SlickGrid 2.1, may be deprecated
  		**/
  var enableRowReordering: js.UndefOr[js.Any] = js.undefined
  /**
  		*
  		**/
  var enableTextSelectionOnCells: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* @see Example: Explicit Initialization
  		**/
  var explicitInitialization: js.UndefOr[scala.Boolean] = js.undefined
  var footerRowHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  		* Force column sizes to fit into the container (preventing horizontal scrolling). Effectively sets column width to be 1/Number of Columns which on small containers may not be desirable
  		**/
  var forceFitColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*
  		**/
  var forceSyncScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* A factory object responsible to creating a formatter for a given cell. Must implement getFormatter(column).
  		**/
  var formatterFactory: js.UndefOr[FormatterFactory[T]] = js.undefined
  var frozenBottom: js.UndefOr[scala.Boolean] = js.undefined
  var frozenColumn: js.UndefOr[scala.Double] = js.undefined
  var frozenRow: js.UndefOr[scala.Double] = js.undefined
  /**
  		* Will expand the table row divs to the full width of the container, table cell divs will remain aligned to the left
  		**/
  var fullWidthRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*
  		**/
  var headerRowHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  		*
  		**/
  var leaveSpaceForNewRows: js.UndefOr[scala.Boolean] = js.undefined
  var minRowBuffer: js.UndefOr[scala.Double] = js.undefined
  /**
  		* @see Example: Multi-Column Sort
  		**/
  var multiColumnSort: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*
  		**/
  var multiSelect: js.UndefOr[scala.Boolean] = js.undefined
  var numberedMultiColumnSort: js.UndefOr[scala.Boolean] = js.undefined
  var preHeaderPanelHeight: js.UndefOr[scala.Double] = js.undefined
  var preserveCopiedSelectionOnPaste: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*
  		**/
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  		*
  		**/
  var selectedCellCssClass: js.UndefOr[java.lang.String] = js.undefined
  var showCellSelection: js.UndefOr[scala.Boolean] = js.undefined
  var showFooterRow: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*
  		**/
  var showHeaderRow: js.UndefOr[scala.Boolean] = js.undefined
  var showPreHeaderPanel: js.UndefOr[scala.Boolean] = js.undefined
  var showTopPanel: js.UndefOr[scala.Boolean] = js.undefined
  var sortColNumberInSeparateSpan: js.UndefOr[scala.Boolean] = js.undefined
  var suppressActiveCellChangeOnEdit: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		* If true, the column being resized will change its width as the mouse is dragging the resize handle. If false, the column will resize after mouse drag ends.
  		**/
  var syncColumnCellResize: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		*
  		**/
  var topPanelHeight: js.UndefOr[scala.Double] = js.undefined
  var tristateMultiColumnSort: js.UndefOr[scala.Boolean] = js.undefined
  var viewportClass: js.UndefOr[java.lang.String] = js.undefined
}

object GridOptions {
  @scala.inline
  def apply[T /* <: SlickData */](
    addNewRowCssClass: java.lang.String = null,
    alwaysAllowHorizontalScroll: js.UndefOr[scala.Boolean] = js.undefined,
    alwaysShowVerticalScroll: js.UndefOr[scala.Boolean] = js.undefined,
    asyncEditorLoadDelay: scala.Int | scala.Double = null,
    asyncEditorLoading: js.UndefOr[scala.Boolean] = js.undefined,
    asyncPostRenderCleanupDelay: scala.Int | scala.Double = null,
    asyncPostRenderDelay: scala.Int | scala.Double = null,
    autoEdit: js.UndefOr[scala.Boolean] = js.undefined,
    autoHeight: js.UndefOr[scala.Boolean] = js.undefined,
    cellFlashingCssClass: java.lang.String = null,
    cellHighlightCssClass: java.lang.String = null,
    createFooterRow: js.UndefOr[scala.Boolean] = js.undefined,
    createPreHeaderPanel: js.UndefOr[scala.Boolean] = js.undefined,
    dataItemColumnValueExtractor: (/* item */ js.Any, /* columnDef */ js.Any) => _ = null,
    defaultColumnWidth: scala.Int | scala.Double = null,
    defaultFormatter: Formatter[T] = null,
    doPaging: js.UndefOr[scala.Boolean] = js.undefined,
    editCommandHandler: js.Any = null,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    editorCellNavOnLRKeys: js.UndefOr[scala.Boolean] = js.undefined,
    editorFactory: EditorFactory = null,
    editorLock: EditorLock[T] = null,
    emulatePagingWhenScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    enableAddRow: js.UndefOr[scala.Boolean] = js.undefined,
    enableAsyncPostRender: js.UndefOr[scala.Boolean] = js.undefined,
    enableAsyncPostRenderCleanup: js.UndefOr[scala.Boolean] = js.undefined,
    enableCellNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    enableCellRangeSelection: js.Any = null,
    enableColumnReorder: js.UndefOr[scala.Boolean] = js.undefined,
    enableRowReordering: js.Any = null,
    enableTextSelectionOnCells: js.UndefOr[scala.Boolean] = js.undefined,
    explicitInitialization: js.UndefOr[scala.Boolean] = js.undefined,
    footerRowHeight: scala.Int | scala.Double = null,
    forceFitColumns: js.UndefOr[scala.Boolean] = js.undefined,
    forceSyncScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    formatterFactory: FormatterFactory[T] = null,
    frozenBottom: js.UndefOr[scala.Boolean] = js.undefined,
    frozenColumn: scala.Int | scala.Double = null,
    frozenRow: scala.Int | scala.Double = null,
    fullWidthRows: js.UndefOr[scala.Boolean] = js.undefined,
    headerRowHeight: scala.Int | scala.Double = null,
    leaveSpaceForNewRows: js.UndefOr[scala.Boolean] = js.undefined,
    minRowBuffer: scala.Int | scala.Double = null,
    multiColumnSort: js.UndefOr[scala.Boolean] = js.undefined,
    multiSelect: js.UndefOr[scala.Boolean] = js.undefined,
    numberedMultiColumnSort: js.UndefOr[scala.Boolean] = js.undefined,
    preHeaderPanelHeight: scala.Int | scala.Double = null,
    preserveCopiedSelectionOnPaste: js.UndefOr[scala.Boolean] = js.undefined,
    rowHeight: scala.Int | scala.Double = null,
    selectedCellCssClass: java.lang.String = null,
    showCellSelection: js.UndefOr[scala.Boolean] = js.undefined,
    showFooterRow: js.UndefOr[scala.Boolean] = js.undefined,
    showHeaderRow: js.UndefOr[scala.Boolean] = js.undefined,
    showPreHeaderPanel: js.UndefOr[scala.Boolean] = js.undefined,
    showTopPanel: js.UndefOr[scala.Boolean] = js.undefined,
    sortColNumberInSeparateSpan: js.UndefOr[scala.Boolean] = js.undefined,
    suppressActiveCellChangeOnEdit: js.UndefOr[scala.Boolean] = js.undefined,
    syncColumnCellResize: js.UndefOr[scala.Boolean] = js.undefined,
    topPanelHeight: scala.Int | scala.Double = null,
    tristateMultiColumnSort: js.UndefOr[scala.Boolean] = js.undefined,
    viewportClass: java.lang.String = null
  ): GridOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (addNewRowCssClass != null) __obj.updateDynamic("addNewRowCssClass")(addNewRowCssClass)
    if (!js.isUndefined(alwaysAllowHorizontalScroll)) __obj.updateDynamic("alwaysAllowHorizontalScroll")(alwaysAllowHorizontalScroll)
    if (!js.isUndefined(alwaysShowVerticalScroll)) __obj.updateDynamic("alwaysShowVerticalScroll")(alwaysShowVerticalScroll)
    if (asyncEditorLoadDelay != null) __obj.updateDynamic("asyncEditorLoadDelay")(asyncEditorLoadDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncEditorLoading)) __obj.updateDynamic("asyncEditorLoading")(asyncEditorLoading)
    if (asyncPostRenderCleanupDelay != null) __obj.updateDynamic("asyncPostRenderCleanupDelay")(asyncPostRenderCleanupDelay.asInstanceOf[js.Any])
    if (asyncPostRenderDelay != null) __obj.updateDynamic("asyncPostRenderDelay")(asyncPostRenderDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(autoEdit)) __obj.updateDynamic("autoEdit")(autoEdit)
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (cellFlashingCssClass != null) __obj.updateDynamic("cellFlashingCssClass")(cellFlashingCssClass)
    if (cellHighlightCssClass != null) __obj.updateDynamic("cellHighlightCssClass")(cellHighlightCssClass)
    if (!js.isUndefined(createFooterRow)) __obj.updateDynamic("createFooterRow")(createFooterRow)
    if (!js.isUndefined(createPreHeaderPanel)) __obj.updateDynamic("createPreHeaderPanel")(createPreHeaderPanel)
    if (dataItemColumnValueExtractor != null) __obj.updateDynamic("dataItemColumnValueExtractor")(js.Any.fromFunction2(dataItemColumnValueExtractor))
    if (defaultColumnWidth != null) __obj.updateDynamic("defaultColumnWidth")(defaultColumnWidth.asInstanceOf[js.Any])
    if (defaultFormatter != null) __obj.updateDynamic("defaultFormatter")(defaultFormatter)
    if (!js.isUndefined(doPaging)) __obj.updateDynamic("doPaging")(doPaging)
    if (editCommandHandler != null) __obj.updateDynamic("editCommandHandler")(editCommandHandler)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (!js.isUndefined(editorCellNavOnLRKeys)) __obj.updateDynamic("editorCellNavOnLRKeys")(editorCellNavOnLRKeys)
    if (editorFactory != null) __obj.updateDynamic("editorFactory")(editorFactory)
    if (editorLock != null) __obj.updateDynamic("editorLock")(editorLock)
    if (!js.isUndefined(emulatePagingWhenScrolling)) __obj.updateDynamic("emulatePagingWhenScrolling")(emulatePagingWhenScrolling)
    if (!js.isUndefined(enableAddRow)) __obj.updateDynamic("enableAddRow")(enableAddRow)
    if (!js.isUndefined(enableAsyncPostRender)) __obj.updateDynamic("enableAsyncPostRender")(enableAsyncPostRender)
    if (!js.isUndefined(enableAsyncPostRenderCleanup)) __obj.updateDynamic("enableAsyncPostRenderCleanup")(enableAsyncPostRenderCleanup)
    if (!js.isUndefined(enableCellNavigation)) __obj.updateDynamic("enableCellNavigation")(enableCellNavigation)
    if (enableCellRangeSelection != null) __obj.updateDynamic("enableCellRangeSelection")(enableCellRangeSelection)
    if (!js.isUndefined(enableColumnReorder)) __obj.updateDynamic("enableColumnReorder")(enableColumnReorder)
    if (enableRowReordering != null) __obj.updateDynamic("enableRowReordering")(enableRowReordering)
    if (!js.isUndefined(enableTextSelectionOnCells)) __obj.updateDynamic("enableTextSelectionOnCells")(enableTextSelectionOnCells)
    if (!js.isUndefined(explicitInitialization)) __obj.updateDynamic("explicitInitialization")(explicitInitialization)
    if (footerRowHeight != null) __obj.updateDynamic("footerRowHeight")(footerRowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFitColumns)) __obj.updateDynamic("forceFitColumns")(forceFitColumns)
    if (!js.isUndefined(forceSyncScrolling)) __obj.updateDynamic("forceSyncScrolling")(forceSyncScrolling)
    if (formatterFactory != null) __obj.updateDynamic("formatterFactory")(formatterFactory)
    if (!js.isUndefined(frozenBottom)) __obj.updateDynamic("frozenBottom")(frozenBottom)
    if (frozenColumn != null) __obj.updateDynamic("frozenColumn")(frozenColumn.asInstanceOf[js.Any])
    if (frozenRow != null) __obj.updateDynamic("frozenRow")(frozenRow.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidthRows)) __obj.updateDynamic("fullWidthRows")(fullWidthRows)
    if (headerRowHeight != null) __obj.updateDynamic("headerRowHeight")(headerRowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(leaveSpaceForNewRows)) __obj.updateDynamic("leaveSpaceForNewRows")(leaveSpaceForNewRows)
    if (minRowBuffer != null) __obj.updateDynamic("minRowBuffer")(minRowBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(multiColumnSort)) __obj.updateDynamic("multiColumnSort")(multiColumnSort)
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect)
    if (!js.isUndefined(numberedMultiColumnSort)) __obj.updateDynamic("numberedMultiColumnSort")(numberedMultiColumnSort)
    if (preHeaderPanelHeight != null) __obj.updateDynamic("preHeaderPanelHeight")(preHeaderPanelHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveCopiedSelectionOnPaste)) __obj.updateDynamic("preserveCopiedSelectionOnPaste")(preserveCopiedSelectionOnPaste)
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (selectedCellCssClass != null) __obj.updateDynamic("selectedCellCssClass")(selectedCellCssClass)
    if (!js.isUndefined(showCellSelection)) __obj.updateDynamic("showCellSelection")(showCellSelection)
    if (!js.isUndefined(showFooterRow)) __obj.updateDynamic("showFooterRow")(showFooterRow)
    if (!js.isUndefined(showHeaderRow)) __obj.updateDynamic("showHeaderRow")(showHeaderRow)
    if (!js.isUndefined(showPreHeaderPanel)) __obj.updateDynamic("showPreHeaderPanel")(showPreHeaderPanel)
    if (!js.isUndefined(showTopPanel)) __obj.updateDynamic("showTopPanel")(showTopPanel)
    if (!js.isUndefined(sortColNumberInSeparateSpan)) __obj.updateDynamic("sortColNumberInSeparateSpan")(sortColNumberInSeparateSpan)
    if (!js.isUndefined(suppressActiveCellChangeOnEdit)) __obj.updateDynamic("suppressActiveCellChangeOnEdit")(suppressActiveCellChangeOnEdit)
    if (!js.isUndefined(syncColumnCellResize)) __obj.updateDynamic("syncColumnCellResize")(syncColumnCellResize)
    if (topPanelHeight != null) __obj.updateDynamic("topPanelHeight")(topPanelHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(tristateMultiColumnSort)) __obj.updateDynamic("tristateMultiColumnSort")(tristateMultiColumnSort)
    if (viewportClass != null) __obj.updateDynamic("viewportClass")(viewportClass)
    __obj.asInstanceOf[GridOptions[T]]
  }
}

