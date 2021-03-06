package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractChart
  extends senchaUnderscoreTouchLib.ExtNs.drawNs.IComponent {
  /** [Config Option] (Boolean/Object) */
  var animate: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.chart.axis.Axis/Array/Object) */
  var axes: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var background: js.UndefOr[js.Any] = js.undefined
  /** [Method] Changes the data store bound to this chart and refreshes it
  		* @param store Ext.data.Store The store to bind to this chart.
  		*/
  var bindStore: js.UndefOr[
    js.Function1[/* store */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IStore], scala.Unit]
  ] = js.undefined
  /** [Method] Cancel a scheduled layout  */
  var cancelLayout: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean/Array) */
  var colors: js.UndefOr[js.Any] = js.undefined
  /** [Method] Flattens the given chart surfaces into a single image
  		* @param surfaces Array A list of chart's surfaces to flatten.
  		* @param format String If set to 'image', the method will return an Image object. Otherwise, the dataURL  of the flattened image will be returned.
  		* @returns String|Image An Image DOM element containing the flattened image or its dataURL.
  		*/
  var flatten: js.UndefOr[
    js.Function2[
      /* surfaces */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* format */ js.UndefOr[java.lang.String], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the value of axes
  		* @returns Ext.chart.axis.Axis/Array/Object
  		*/
  var getAxes: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of colors
  		* @returns Boolean/Array
  		*/
  var getColors: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of highlightItem
  		* @returns Object
  		*/
  var getHighlightItem: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of innerPadding
  		* @returns Object
  		*/
  var getInnerPadding: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of insetPadding
  		* @returns Object|Number
  		*/
  var getInsetPadding: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of interactions
  		* @returns Array
  		*/
  var getInteractions: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Given an x y point relative to the chart find and return the first series item that matches that point
  		* @param x Number
  		* @param y Number
  		* @returns Object An object with series and item properties, or false if no item found.
  		*/
  var getItemForPoint: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], _]
  ] = js.undefined
  /** [Method] Given an x y point relative to the chart find and return all series items that match that point
  		* @param x Number
  		* @param y Number
  		* @returns Array An array of objects with series and item properties.
  		*/
  var getItemsForPoint: js.UndefOr[
    js.Function2[
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Returns the value of legend
  		* @returns Ext.chart.Legend/Object
  		*/
  var getLegend: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Return the legend store that contains all the legend information
  		* @returns Ext.data.Store
  		*/
  var getLegendStore: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.dataNs.IStore]] = js.undefined
  /** [Method] Returns the value of series
  		* @returns Ext.chart.series.Series/Array
  		*/
  var getSeries: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of shadow
  		* @returns Boolean/Object
  		*/
  var getShadow: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of store
  		* @returns Ext.data.Store
  		*/
  var getStore: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.dataNs.IStore]] = js.undefined
  /** [Method] Get a surface by the given id or create one if it doesn t exist
  		* @param name Object
  		* @param type Object
  		* @returns Ext.draw.Surface
  		*/
  @JSName("getSurface")
  var getSurface_IAbstractChart: js.UndefOr[
    js.Function2[
      /* name */ js.UndefOr[js.Any], 
      /* type */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.drawNs.ISurface
    ]
  ] = js.undefined
  /** [Config Option] (Object) */
  var highlightItem: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var innerPadding: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object|Number) */
  var insetPadding: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Array) */
  var interactions: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Ext.chart.Legend/Object) */
  var legend: js.UndefOr[js.Any] = js.undefined
  /** [Method] Redraw the chart  */
  var redraw: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Resume the layout initialized by thickness change */
  var resumeThicknessChanged: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Schedule a layout at next frame  */
  var scheduleLayout: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Ext.chart.series.Series/Array) */
  var series: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of animate
  		* @param animate Boolean/Object The new value.
  		*/
  var setAnimate: js.UndefOr[js.Function1[/* animate */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of axes
  		* @param axes Ext.chart.axis.Axis/Array/Object The new value.
  		*/
  var setAxes: js.UndefOr[js.Function1[/* axes */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of colors
  		* @param colors Boolean/Array The new value.
  		*/
  var setColors: js.UndefOr[js.Function1[/* colors */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of highlightItem
  		* @param highlightItem Object The new value.
  		*/
  var setHighlightItem: js.UndefOr[js.Function1[/* highlightItem */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of innerPadding
  		* @param innerPadding Object The new value.
  		*/
  var setInnerPadding: js.UndefOr[js.Function1[/* innerPadding */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of insetPadding
  		* @param insetPadding Object|Number The new value.
  		*/
  var setInsetPadding: js.UndefOr[js.Function1[/* insetPadding */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of interactions
  		* @param interactions Array The new value.
  		*/
  var setInteractions: js.UndefOr[
    js.Function1[/* interactions */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of legend
  		* @param legend Ext.chart.Legend/Object The new value.
  		*/
  var setLegend: js.UndefOr[js.Function1[/* legend */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of series
  		* @param series Ext.chart.series.Series/Array The new value.
  		*/
  var setSeries: js.UndefOr[js.Function1[/* series */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of shadow
  		* @param shadow Boolean/Object The new value.
  		*/
  var setShadow: js.UndefOr[js.Function1[/* shadow */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of store
  		* @param store Ext.data.Store The new value.
  		*/
  var setStore: js.UndefOr[
    js.Function1[/* store */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IStore], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var shadow: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IStore] = js.undefined
  /** [Method] Suspend the layout initialized by thickness change */
  var suspendThicknessChanged: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (String) */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object IAbstractChart {
  @scala.inline
  def apply(
    IComponent: senchaUnderscoreTouchLib.ExtNs.drawNs.IComponent = null,
    animate: js.Any = null,
    axes: js.Any = null,
    background: js.Any = null,
    bindStore: /* store */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IStore] => scala.Unit = null,
    cancelLayout: () => scala.Unit = null,
    colors: js.Any = null,
    flatten: (/* surfaces */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], /* format */ js.UndefOr[java.lang.String]) => _ = null,
    getAxes: () => _ = null,
    getBackground: () => _ = null,
    getColors: () => _ = null,
    getHighlightItem: () => _ = null,
    getInnerPadding: () => _ = null,
    getInsetPadding: () => _ = null,
    getInteractions: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getItemForPoint: (/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double]) => _ = null,
    getItemsForPoint: (/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double]) => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getLegend: () => _ = null,
    getLegendStore: () => senchaUnderscoreTouchLib.ExtNs.dataNs.IStore = null,
    getSeries: () => _ = null,
    getShadow: () => _ = null,
    getStore: () => senchaUnderscoreTouchLib.ExtNs.dataNs.IStore = null,
    getSurface: (/* name */ js.UndefOr[js.Any], /* type */ js.UndefOr[js.Any]) => senchaUnderscoreTouchLib.ExtNs.drawNs.ISurface = null,
    highlightItem: js.Any = null,
    initialize: () => scala.Unit = null,
    innerPadding: js.Any = null,
    insetPadding: js.Any = null,
    interactions: senchaUnderscoreTouchLib.ExtNs.Array = null,
    legend: js.Any = null,
    redraw: () => scala.Unit = null,
    resumeThicknessChanged: () => scala.Unit = null,
    scheduleLayout: () => scala.Unit = null,
    series: js.Any = null,
    setAnimate: /* animate */ js.UndefOr[js.Any] => scala.Unit = null,
    setAxes: /* axes */ js.UndefOr[js.Any] => scala.Unit = null,
    setBackground: /* background */ js.UndefOr[js.Any] => scala.Unit = null,
    setColors: /* colors */ js.UndefOr[js.Any] => scala.Unit = null,
    setHighlightItem: /* highlightItem */ js.UndefOr[js.Any] => scala.Unit = null,
    setInnerPadding: /* innerPadding */ js.UndefOr[js.Any] => scala.Unit = null,
    setInsetPadding: /* insetPadding */ js.UndefOr[js.Any] => scala.Unit = null,
    setInteractions: /* interactions */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => scala.Unit = null,
    setLegend: /* legend */ js.UndefOr[js.Any] => scala.Unit = null,
    setSeries: /* series */ js.UndefOr[js.Any] => scala.Unit = null,
    setShadow: /* shadow */ js.UndefOr[js.Any] => scala.Unit = null,
    setStore: /* store */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IStore] => scala.Unit = null,
    shadow: js.Any = null,
    store: senchaUnderscoreTouchLib.ExtNs.dataNs.IStore = null,
    suspendThicknessChanged: () => scala.Unit = null,
    version: java.lang.String = null
  ): IAbstractChart = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (axes != null) __obj.updateDynamic("axes")(axes)
    if (background != null) __obj.updateDynamic("background")(background)
    if (bindStore != null) __obj.updateDynamic("bindStore")(js.Any.fromFunction1(bindStore))
    if (cancelLayout != null) __obj.updateDynamic("cancelLayout")(js.Any.fromFunction0(cancelLayout))
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (flatten != null) __obj.updateDynamic("flatten")(js.Any.fromFunction2(flatten))
    if (getAxes != null) __obj.updateDynamic("getAxes")(js.Any.fromFunction0(getAxes))
    if (getBackground != null) __obj.updateDynamic("getBackground")(js.Any.fromFunction0(getBackground))
    if (getColors != null) __obj.updateDynamic("getColors")(js.Any.fromFunction0(getColors))
    if (getHighlightItem != null) __obj.updateDynamic("getHighlightItem")(js.Any.fromFunction0(getHighlightItem))
    if (getInnerPadding != null) __obj.updateDynamic("getInnerPadding")(js.Any.fromFunction0(getInnerPadding))
    if (getInsetPadding != null) __obj.updateDynamic("getInsetPadding")(js.Any.fromFunction0(getInsetPadding))
    if (getInteractions != null) __obj.updateDynamic("getInteractions")(js.Any.fromFunction0(getInteractions))
    if (getItemForPoint != null) __obj.updateDynamic("getItemForPoint")(js.Any.fromFunction2(getItemForPoint))
    if (getItemsForPoint != null) __obj.updateDynamic("getItemsForPoint")(js.Any.fromFunction2(getItemsForPoint))
    if (getLegend != null) __obj.updateDynamic("getLegend")(js.Any.fromFunction0(getLegend))
    if (getLegendStore != null) __obj.updateDynamic("getLegendStore")(js.Any.fromFunction0(getLegendStore))
    if (getSeries != null) __obj.updateDynamic("getSeries")(js.Any.fromFunction0(getSeries))
    if (getShadow != null) __obj.updateDynamic("getShadow")(js.Any.fromFunction0(getShadow))
    if (getStore != null) __obj.updateDynamic("getStore")(js.Any.fromFunction0(getStore))
    if (getSurface != null) __obj.updateDynamic("getSurface")(js.Any.fromFunction2(getSurface))
    if (highlightItem != null) __obj.updateDynamic("highlightItem")(highlightItem)
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction0(initialize))
    if (innerPadding != null) __obj.updateDynamic("innerPadding")(innerPadding)
    if (insetPadding != null) __obj.updateDynamic("insetPadding")(insetPadding)
    if (interactions != null) __obj.updateDynamic("interactions")(interactions)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (redraw != null) __obj.updateDynamic("redraw")(js.Any.fromFunction0(redraw))
    if (resumeThicknessChanged != null) __obj.updateDynamic("resumeThicknessChanged")(js.Any.fromFunction0(resumeThicknessChanged))
    if (scheduleLayout != null) __obj.updateDynamic("scheduleLayout")(js.Any.fromFunction0(scheduleLayout))
    if (series != null) __obj.updateDynamic("series")(series)
    if (setAnimate != null) __obj.updateDynamic("setAnimate")(js.Any.fromFunction1(setAnimate))
    if (setAxes != null) __obj.updateDynamic("setAxes")(js.Any.fromFunction1(setAxes))
    if (setBackground != null) __obj.updateDynamic("setBackground")(js.Any.fromFunction1(setBackground))
    if (setColors != null) __obj.updateDynamic("setColors")(js.Any.fromFunction1(setColors))
    if (setHighlightItem != null) __obj.updateDynamic("setHighlightItem")(js.Any.fromFunction1(setHighlightItem))
    if (setInnerPadding != null) __obj.updateDynamic("setInnerPadding")(js.Any.fromFunction1(setInnerPadding))
    if (setInsetPadding != null) __obj.updateDynamic("setInsetPadding")(js.Any.fromFunction1(setInsetPadding))
    if (setInteractions != null) __obj.updateDynamic("setInteractions")(js.Any.fromFunction1(setInteractions))
    if (setLegend != null) __obj.updateDynamic("setLegend")(js.Any.fromFunction1(setLegend))
    if (setSeries != null) __obj.updateDynamic("setSeries")(js.Any.fromFunction1(setSeries))
    if (setShadow != null) __obj.updateDynamic("setShadow")(js.Any.fromFunction1(setShadow))
    if (setStore != null) __obj.updateDynamic("setStore")(js.Any.fromFunction1(setStore))
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    if (store != null) __obj.updateDynamic("store")(store)
    if (suspendThicknessChanged != null) __obj.updateDynamic("suspendThicknessChanged")(js.Any.fromFunction0(suspendThicknessChanged))
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[IAbstractChart]
  }
}

