package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsGeneral extends js.Object {
  // Not listed in options--------------------
  /** Tabulator will automatically attempt to redraw the data contained in the table if the containing element for the table is resized. To disable this functionality, set the autoResize property to false */
  var autoResize: js.UndefOr[scala.Boolean] = js.undefined
  /** The dataEdited callback is triggered whenever the table data is changed by the user. Triggers for this include editing any cell in the table, adding a row and deleting a row. */
  var dataEdited: js.UndefOr[js.Function1[/* data */ js.Any, scala.Unit]] = js.undefined
  /** The dataLoaded callback is triggered when a new set of data is loaded into the table. */
  var dataLoaded: js.UndefOr[js.Function1[/* data */ js.Any, scala.Unit]] = js.undefined
  /** The dataLoading callback is triggered whenever new data is loaded into the table. */
  var dataLoading: js.UndefOr[js.Function1[/* data */ js.Any, scala.Unit]] = js.undefined
  /** The dataSorted callback is triggered after the table dataset is sorted. */
  var dataSorted: js.UndefOr[
    js.Function2[/* sorters */ js.Array[Sorter], /* rows */ js.Array[RowComponent], scala.Unit]
  ] = js.undefined
  /** The dataSorting callback is triggered whenever a sort event occurs, before sorting happens. */
  var dataSorting: js.UndefOr[js.Function1[/* sorters */ js.Array[Sorter], scala.Unit]] = js.undefined
  /** Footer  element to display for the table	 */
  var footerElement: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  /** Sets the height of the containing element, can be set to any valid height css value. If set to false (the default), the height of the table will resize to fit the table data.	 */
  var height: js.UndefOr[
    java.lang.String | scala.Double | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false`
  ] = js.undefined
  /** The htmlImported callback is triggered when Tabulator finishes importing data from an HTML table. */
  var htmlImported: js.UndefOr[EmptyCallback] = js.undefined
  /** The htmlImporting callback is triggered when Tabulator starts importing data from an HTML table. */
  var htmlImporting: js.UndefOr[EmptyCallback] = js.undefined
  /** Keybinding configuration object	 */
  var keybindings: js.UndefOr[tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false` | KeyBinding] = js.undefined
  /** Whenever a page has been loaded, the pageLoaded callback is called, passing the current page number as an argument. */
  var pageLoaded: js.UndefOr[js.Function1[/* pageno */ scala.Double, scala.Unit]] = js.undefined
  /** placeholder element to display on empty table	 */
  var placeholder: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  /** * The reactivity systems allow Tabulator to watch arrays and objects passed into the table for changes and then automatically update the table.
    This approach means you no longer need to worry about calling a number of different functions on the table to make changes, you simply update the array or object you originally passed into the table and Tabulator will take care of the rest.
    You can enable reactive data by setting the reactiveData option to true in the table constructor, and then passing your data array to the data option.
    Once the table is built any changes to the array will automatically be replicated to the table without needing to call any functions on the table itself*/
  var reactiveData: js.UndefOr[scala.Boolean] = js.undefined
  /** The renderComplete callback is triggered after the table has been rendered */
  var renderComplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** The renderStarted callback is triggered whenever all the rows in the table are about to be rendered. This can include:
    Data is loaded into the table when setData is called
    A page is loaded through any form of pagination
    Rows are added to the table during progressive rendering
    Columns are changed by setColumns
    The data is filtered
    The data is sorted
    The redraw function is called */
  var renderStarted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** When a the tabulator constructor is called, the tableBuilding callback will triggered */
  var tableBuilding: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** When a the tabulator constructor is called and the table has finished being rendered, the tableBuilt callback will triggered: */
  var tableBuilt: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** When to regenerate cell tooltip value	 */
  var tooltipGenerationMode: js.UndefOr[tabulatorDashTablesLib.tabulatorDashTablesLibStrings.load] = js.undefined
  /** Function to generate tooltips for cells	 */
  var tooltips: js.UndefOr[GlobalTooltipOption] = js.undefined
  /** Enable rendering using the Virtual DOM engine	 */
  var virtualDom: js.UndefOr[scala.Boolean] = js.undefined
  /** Manually set the size of the virtual DOM buffer	 */
  var virtualDomBuffer: js.UndefOr[scala.Boolean] = js.undefined
}

object OptionsGeneral {
  @scala.inline
  def apply(
    autoResize: js.UndefOr[scala.Boolean] = js.undefined,
    dataEdited: /* data */ js.Any => scala.Unit = null,
    dataLoaded: /* data */ js.Any => scala.Unit = null,
    dataLoading: /* data */ js.Any => scala.Unit = null,
    dataSorted: (/* sorters */ js.Array[Sorter], /* rows */ js.Array[RowComponent]) => scala.Unit = null,
    dataSorting: /* sorters */ js.Array[Sorter] => scala.Unit = null,
    footerElement: java.lang.String | stdLib.HTMLElement = null,
    height: java.lang.String | scala.Double | tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false` = null,
    htmlImported: EmptyCallback = null,
    htmlImporting: EmptyCallback = null,
    keybindings: tabulatorDashTablesLib.tabulatorDashTablesLibNumbers.`false` | KeyBinding = null,
    pageLoaded: /* pageno */ scala.Double => scala.Unit = null,
    placeholder: java.lang.String | stdLib.HTMLElement = null,
    reactiveData: js.UndefOr[scala.Boolean] = js.undefined,
    renderComplete: () => scala.Unit = null,
    renderStarted: () => scala.Unit = null,
    tableBuilding: () => scala.Unit = null,
    tableBuilt: () => scala.Unit = null,
    tooltipGenerationMode: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.load = null,
    tooltips: GlobalTooltipOption = null,
    virtualDom: js.UndefOr[scala.Boolean] = js.undefined,
    virtualDomBuffer: js.UndefOr[scala.Boolean] = js.undefined
  ): OptionsGeneral = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize)
    if (dataEdited != null) __obj.updateDynamic("dataEdited")(js.Any.fromFunction1(dataEdited))
    if (dataLoaded != null) __obj.updateDynamic("dataLoaded")(js.Any.fromFunction1(dataLoaded))
    if (dataLoading != null) __obj.updateDynamic("dataLoading")(js.Any.fromFunction1(dataLoading))
    if (dataSorted != null) __obj.updateDynamic("dataSorted")(js.Any.fromFunction2(dataSorted))
    if (dataSorting != null) __obj.updateDynamic("dataSorting")(js.Any.fromFunction1(dataSorting))
    if (footerElement != null) __obj.updateDynamic("footerElement")(footerElement.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlImported != null) __obj.updateDynamic("htmlImported")(htmlImported)
    if (htmlImporting != null) __obj.updateDynamic("htmlImporting")(htmlImporting)
    if (keybindings != null) __obj.updateDynamic("keybindings")(keybindings.asInstanceOf[js.Any])
    if (pageLoaded != null) __obj.updateDynamic("pageLoaded")(js.Any.fromFunction1(pageLoaded))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(reactiveData)) __obj.updateDynamic("reactiveData")(reactiveData)
    if (renderComplete != null) __obj.updateDynamic("renderComplete")(js.Any.fromFunction0(renderComplete))
    if (renderStarted != null) __obj.updateDynamic("renderStarted")(js.Any.fromFunction0(renderStarted))
    if (tableBuilding != null) __obj.updateDynamic("tableBuilding")(js.Any.fromFunction0(tableBuilding))
    if (tableBuilt != null) __obj.updateDynamic("tableBuilt")(js.Any.fromFunction0(tableBuilt))
    if (tooltipGenerationMode != null) __obj.updateDynamic("tooltipGenerationMode")(tooltipGenerationMode)
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualDom)) __obj.updateDynamic("virtualDom")(virtualDom)
    if (!js.isUndefined(virtualDomBuffer)) __obj.updateDynamic("virtualDomBuffer")(virtualDomBuffer)
    __obj.asInstanceOf[OptionsGeneral]
  }
}

