package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAxis
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Config Option] (Object) */
  var background: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Ext.chart.AbstractChart) */
  var chart: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart] = js.undefined
  /** [Config Option] (Array) */
  var fields: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Returns the value of background
  		* @returns Object
  		*/
  var getBackground: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of chart
  		* @returns Ext.chart.AbstractChart
  		*/
  var getChart: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart]] = js.undefined
  /** [Method] Mapping data value into coordinate
  		* @param value *
  		* @param field String
  		* @param idx Number
  		* @param items Ext.util.MixedCollection
  		* @returns Number
  		*/
  var getCoordFor: js.UndefOr[
    js.Function4[
      /* value */ js.UndefOr[js.Any], 
      /* field */ js.UndefOr[java.lang.String], 
      /* idx */ js.UndefOr[scala.Double], 
      /* items */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.utilNs.IMixedCollection], 
      scala.Double
    ]
  ] = js.undefined
  /** [Method] Returns the value of fields
  		* @returns Array
  		*/
  var getFields: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of grid
  		* @returns Object
  		*/
  var getGrid: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of hidden
  		* @returns Boolean
  		*/
  var getHidden: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of increment
  		* @returns Number
  		*/
  var getIncrement: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of label
  		* @returns Object
  		*/
  var getLabel: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of labelInSpan
  		* @returns Boolean
  		*/
  var getLabelInSpan: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of layout
  		* @returns Object|Ext.chart.axis.layout.Layout
  		*/
  var getLayout: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of majorTickSteps
  		* @returns Number
  		*/
  var getMajorTickSteps: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of maxZoom
  		* @returns Number
  		*/
  var getMaxZoom: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of maximum
  		* @returns Number
  		*/
  var getMaximum: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minZoom
  		* @returns Number
  		*/
  var getMinZoom: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minimum
  		* @returns Number
  		*/
  var getMinimum: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of minorTickSteps
  		* @returns Number
  		*/
  var getMinorTickSteps: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of needHighPrecision
  		* @returns Boolean
  		*/
  var getNeedHighPrecision: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of position
  		* @returns String
  		*/
  var getPosition: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Get the range derived from all the bound series
  		* @returns Array
  		*/
  var getRange: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of renderer
  		* @returns Function
  		*/
  var getRenderer: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of segmenter
  		* @returns Object|Ext.chart.axis.segmenter.Segmenter
  		*/
  var getSegmenter: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of style
  		* @returns Object
  		*/
  var getStyle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of title
  		* @returns String|Object
  		*/
  var getTitle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of titleMargin
  		* @returns Number
  		*/
  var getTitleMargin: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of visibleRange
  		* @returns Array
  		*/
  var getVisibleRange: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Config Option] (Object) */
  var grid: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var increment: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var labelInSpan: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object|Ext.chart.axis.layout.Layout) */
  var layout: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var majorTickSteps: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var maximum: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minimum: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minorTickSteps: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var needHighPrecision: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Invoked when data has changed  */
  var processData: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IAxis: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Method] Invokes renderFrame on this axis s surface s  */
  var renderFrame: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object|Ext.chart.axis.segmenter.Segmenter) */
  var segmenter: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of background
  		* @param background Object The new value.
  		*/
  var setBackground: js.UndefOr[js.Function1[/* background */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of chart
  		* @param chart Ext.chart.AbstractChart The new value.
  		*/
  var setChart: js.UndefOr[
    js.Function1[
      /* chart */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of fields
  		* @param fields Array The new value.
  		*/
  var setFields: js.UndefOr[
    js.Function1[/* fields */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of grid
  		* @param grid Object The new value.
  		*/
  var setGrid: js.UndefOr[js.Function1[/* grid */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of hidden
  		* @param hidden Boolean The new value.
  		*/
  var setHidden: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of increment
  		* @param increment Number The new value.
  		*/
  var setIncrement: js.UndefOr[js.Function1[/* increment */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of label
  		* @param label Object The new value.
  		*/
  var setLabel: js.UndefOr[js.Function1[/* label */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of labelInSpan
  		* @param labelInSpan Boolean The new value.
  		*/
  var setLabelInSpan: js.UndefOr[js.Function1[/* labelInSpan */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of layout
  		* @param layout Object|Ext.chart.axis.layout.Layout The new value.
  		*/
  var setLayout: js.UndefOr[js.Function1[/* layout */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of majorTickSteps
  		* @param majorTickSteps Number The new value.
  		*/
  var setMajorTickSteps: js.UndefOr[js.Function1[/* majorTickSteps */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maxZoom
  		* @param maxZoom Number The new value.
  		*/
  var setMaxZoom: js.UndefOr[js.Function1[/* maxZoom */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of maximum
  		* @param maximum Number The new value.
  		*/
  var setMaximum: js.UndefOr[js.Function1[/* maximum */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minZoom
  		* @param minZoom Number The new value.
  		*/
  var setMinZoom: js.UndefOr[js.Function1[/* minZoom */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minimum
  		* @param minimum Number The new value.
  		*/
  var setMinimum: js.UndefOr[js.Function1[/* minimum */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of minorTickSteps
  		* @param minorTickSteps Number The new value.
  		*/
  var setMinorTickSteps: js.UndefOr[js.Function1[/* minorTickSteps */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of needHighPrecision
  		* @param needHighPrecision Boolean The new value.
  		*/
  var setNeedHighPrecision: js.UndefOr[js.Function1[/* needHighPrecision */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of position
  		* @param position String The new value.
  		*/
  var setPosition: js.UndefOr[js.Function1[/* position */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of renderer
  		* @param renderer Function The new value.
  		* @returns String The label to display.
  		*/
  var setRenderer: js.UndefOr[js.Function1[/* renderer */ js.UndefOr[js.Any], java.lang.String]] = js.undefined
  /** [Method] Sets the value of segmenter
  		* @param segmenter Object|Ext.chart.axis.segmenter.Segmenter The new value.
  		*/
  var setSegmenter: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of style
  		* @param style Object The new value.
  		*/
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String|Object The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of titleMargin
  		* @param titleMargin Number The new value.
  		*/
  var setTitleMargin: js.UndefOr[js.Function1[/* titleMargin */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of visibleRange
  		* @param visibleRange Array The new value.
  		*/
  var setVisibleRange: js.UndefOr[
    js.Function1[/* visibleRange */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String|Object) */
  var title: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var titleMargin: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Array) */
  var visibleRange: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
}

object IAxis {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    background: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    chart: senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart = null,
    clearListeners: () => scala.Unit = null,
    config: js.Any = null,
    destroy: () => scala.Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => scala.Unit = null,
    extend: java.lang.String = null,
    fields: senchaUnderscoreTouchLib.ExtNs.Array = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => scala.Boolean = null,
    getBackground: () => _ = null,
    getBubbleEvents: () => _ = null,
    getChart: () => senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart = null,
    getCoordFor: (/* value */ js.UndefOr[js.Any], /* field */ js.UndefOr[java.lang.String], /* idx */ js.UndefOr[scala.Double], /* items */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.utilNs.IMixedCollection]) => scala.Double = null,
    getFields: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getGrid: () => _ = null,
    getHidden: () => scala.Boolean = null,
    getId: () => _ = null,
    getIncrement: () => scala.Double = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getLabel: () => _ = null,
    getLabelInSpan: () => scala.Boolean = null,
    getLayout: () => _ = null,
    getListeners: () => _ = null,
    getMajorTickSteps: () => scala.Double = null,
    getMaxZoom: () => scala.Double = null,
    getMaximum: () => scala.Double = null,
    getMinZoom: () => scala.Double = null,
    getMinimum: () => scala.Double = null,
    getMinorTickSteps: () => scala.Double = null,
    getNeedHighPrecision: () => scala.Boolean = null,
    getPosition: () => java.lang.String = null,
    getRange: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getRenderer: () => _ = null,
    getSegmenter: () => _ = null,
    getStyle: () => _ = null,
    getTitle: () => _ = null,
    getTitleMargin: () => scala.Double = null,
    getVisibleRange: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    grid: js.Any = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    increment: scala.Int | scala.Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    label: js.Any = null,
    labelInSpan: js.UndefOr[scala.Boolean] = js.undefined,
    layout: js.Any = null,
    listeners: js.Any = null,
    majorTickSteps: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    maximum: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    minimum: scala.Int | scala.Double = null,
    minorTickSteps: scala.Int | scala.Double = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    needHighPrecision: js.UndefOr[scala.Boolean] = js.undefined,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    platformConfig: js.Any = null,
    position: java.lang.String = null,
    processData: () => scala.Unit = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    renderFrame: () => scala.Unit = null,
    renderer: js.Any = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    segmenter: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setBackground: /* background */ js.UndefOr[js.Any] => scala.Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => scala.Unit = null,
    setChart: /* chart */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.IAbstractChart] => scala.Unit = null,
    setFields: /* fields */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => scala.Unit = null,
    setGrid: /* grid */ js.UndefOr[js.Any] => scala.Unit = null,
    setHidden: /* hidden */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setIncrement: /* increment */ js.UndefOr[scala.Double] => scala.Unit = null,
    setLabel: /* label */ js.UndefOr[js.Any] => scala.Unit = null,
    setLabelInSpan: /* labelInSpan */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setLayout: /* layout */ js.UndefOr[js.Any] => scala.Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => scala.Unit = null,
    setMajorTickSteps: /* majorTickSteps */ js.UndefOr[scala.Double] => scala.Unit = null,
    setMaxZoom: /* maxZoom */ js.UndefOr[scala.Double] => scala.Unit = null,
    setMaximum: /* maximum */ js.UndefOr[scala.Double] => scala.Unit = null,
    setMinZoom: /* minZoom */ js.UndefOr[scala.Double] => scala.Unit = null,
    setMinimum: /* minimum */ js.UndefOr[scala.Double] => scala.Unit = null,
    setMinorTickSteps: /* minorTickSteps */ js.UndefOr[scala.Double] => scala.Unit = null,
    setNeedHighPrecision: /* needHighPrecision */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setPosition: /* position */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setRenderer: /* renderer */ js.UndefOr[js.Any] => java.lang.String = null,
    setSegmenter: /* segmenter */ js.UndefOr[js.Any] => scala.Unit = null,
    setStyle: /* style */ js.UndefOr[js.Any] => scala.Unit = null,
    setTitle: /* title */ js.UndefOr[js.Any] => scala.Unit = null,
    setTitleMargin: /* titleMargin */ js.UndefOr[scala.Double] => scala.Unit = null,
    setVisibleRange: /* visibleRange */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    style: js.Any = null,
    suspendEvents: () => scala.Unit = null,
    title: js.Any = null,
    titleMargin: scala.Int | scala.Double = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    visibleRange: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IAxis = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (background != null) __obj.updateDynamic("background")(background)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (chart != null) __obj.updateDynamic("chart")(chart)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getBackground != null) __obj.updateDynamic("getBackground")(js.Any.fromFunction0(getBackground))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getChart != null) __obj.updateDynamic("getChart")(js.Any.fromFunction0(getChart))
    if (getCoordFor != null) __obj.updateDynamic("getCoordFor")(js.Any.fromFunction4(getCoordFor))
    if (getFields != null) __obj.updateDynamic("getFields")(js.Any.fromFunction0(getFields))
    if (getGrid != null) __obj.updateDynamic("getGrid")(js.Any.fromFunction0(getGrid))
    if (getHidden != null) __obj.updateDynamic("getHidden")(js.Any.fromFunction0(getHidden))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getIncrement != null) __obj.updateDynamic("getIncrement")(js.Any.fromFunction0(getIncrement))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLabel != null) __obj.updateDynamic("getLabel")(js.Any.fromFunction0(getLabel))
    if (getLabelInSpan != null) __obj.updateDynamic("getLabelInSpan")(js.Any.fromFunction0(getLabelInSpan))
    if (getLayout != null) __obj.updateDynamic("getLayout")(js.Any.fromFunction0(getLayout))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getMajorTickSteps != null) __obj.updateDynamic("getMajorTickSteps")(js.Any.fromFunction0(getMajorTickSteps))
    if (getMaxZoom != null) __obj.updateDynamic("getMaxZoom")(js.Any.fromFunction0(getMaxZoom))
    if (getMaximum != null) __obj.updateDynamic("getMaximum")(js.Any.fromFunction0(getMaximum))
    if (getMinZoom != null) __obj.updateDynamic("getMinZoom")(js.Any.fromFunction0(getMinZoom))
    if (getMinimum != null) __obj.updateDynamic("getMinimum")(js.Any.fromFunction0(getMinimum))
    if (getMinorTickSteps != null) __obj.updateDynamic("getMinorTickSteps")(js.Any.fromFunction0(getMinorTickSteps))
    if (getNeedHighPrecision != null) __obj.updateDynamic("getNeedHighPrecision")(js.Any.fromFunction0(getNeedHighPrecision))
    if (getPosition != null) __obj.updateDynamic("getPosition")(js.Any.fromFunction0(getPosition))
    if (getRange != null) __obj.updateDynamic("getRange")(js.Any.fromFunction0(getRange))
    if (getRenderer != null) __obj.updateDynamic("getRenderer")(js.Any.fromFunction0(getRenderer))
    if (getSegmenter != null) __obj.updateDynamic("getSegmenter")(js.Any.fromFunction0(getSegmenter))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction0(getStyle))
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (getTitleMargin != null) __obj.updateDynamic("getTitleMargin")(js.Any.fromFunction0(getTitleMargin))
    if (getVisibleRange != null) __obj.updateDynamic("getVisibleRange")(js.Any.fromFunction0(getVisibleRange))
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(labelInSpan)) __obj.updateDynamic("labelInSpan")(labelInSpan)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (majorTickSteps != null) __obj.updateDynamic("majorTickSteps")(majorTickSteps.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (minorTickSteps != null) __obj.updateDynamic("minorTickSteps")(minorTickSteps.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (!js.isUndefined(needHighPrecision)) __obj.updateDynamic("needHighPrecision")(needHighPrecision)
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (position != null) __obj.updateDynamic("position")(position)
    if (processData != null) __obj.updateDynamic("processData")(js.Any.fromFunction0(processData))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (renderFrame != null) __obj.updateDynamic("renderFrame")(js.Any.fromFunction0(renderFrame))
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (segmenter != null) __obj.updateDynamic("segmenter")(segmenter)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setBackground != null) __obj.updateDynamic("setBackground")(js.Any.fromFunction1(setBackground))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setChart != null) __obj.updateDynamic("setChart")(js.Any.fromFunction1(setChart))
    if (setFields != null) __obj.updateDynamic("setFields")(js.Any.fromFunction1(setFields))
    if (setGrid != null) __obj.updateDynamic("setGrid")(js.Any.fromFunction1(setGrid))
    if (setHidden != null) __obj.updateDynamic("setHidden")(js.Any.fromFunction1(setHidden))
    if (setIncrement != null) __obj.updateDynamic("setIncrement")(js.Any.fromFunction1(setIncrement))
    if (setLabel != null) __obj.updateDynamic("setLabel")(js.Any.fromFunction1(setLabel))
    if (setLabelInSpan != null) __obj.updateDynamic("setLabelInSpan")(js.Any.fromFunction1(setLabelInSpan))
    if (setLayout != null) __obj.updateDynamic("setLayout")(js.Any.fromFunction1(setLayout))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setMajorTickSteps != null) __obj.updateDynamic("setMajorTickSteps")(js.Any.fromFunction1(setMajorTickSteps))
    if (setMaxZoom != null) __obj.updateDynamic("setMaxZoom")(js.Any.fromFunction1(setMaxZoom))
    if (setMaximum != null) __obj.updateDynamic("setMaximum")(js.Any.fromFunction1(setMaximum))
    if (setMinZoom != null) __obj.updateDynamic("setMinZoom")(js.Any.fromFunction1(setMinZoom))
    if (setMinimum != null) __obj.updateDynamic("setMinimum")(js.Any.fromFunction1(setMinimum))
    if (setMinorTickSteps != null) __obj.updateDynamic("setMinorTickSteps")(js.Any.fromFunction1(setMinorTickSteps))
    if (setNeedHighPrecision != null) __obj.updateDynamic("setNeedHighPrecision")(js.Any.fromFunction1(setNeedHighPrecision))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction1(setPosition))
    if (setRenderer != null) __obj.updateDynamic("setRenderer")(js.Any.fromFunction1(setRenderer))
    if (setSegmenter != null) __obj.updateDynamic("setSegmenter")(js.Any.fromFunction1(setSegmenter))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction1(setStyle))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setTitleMargin != null) __obj.updateDynamic("setTitleMargin")(js.Any.fromFunction1(setTitleMargin))
    if (setVisibleRange != null) __obj.updateDynamic("setVisibleRange")(js.Any.fromFunction1(setVisibleRange))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (style != null) __obj.updateDynamic("style")(style)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleMargin != null) __obj.updateDynamic("titleMargin")(titleMargin.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (visibleRange != null) __obj.updateDynamic("visibleRange")(visibleRange)
    __obj.asInstanceOf[IAxis]
  }
}

