package typings
package senchaUnderscoreTouchLib.ExtNs.chartNs.seriesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILine extends ICartesian {
  /** [Config Option] (Boolean) */
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of aggregator
  		* @returns Object
  		*/
  var getAggregator: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of fill
  		* @returns Boolean
  		*/
  var getFill: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of selectionTolerance
  		* @returns Number
  		*/
  var getSelectionTolerance: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of smooth
  		* @returns Boolean/Number
  		*/
  var getSmooth: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of step
  		* @returns Boolean
  		*/
  var getStep: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Number) */
  var selectionTolerance: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Sets the value of aggregator
  		* @param aggregator Object The new value.
  		*/
  var setAggregator: js.UndefOr[js.Function1[/* aggregator */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of fill
  		* @param fill Boolean The new value.
  		*/
  var setFill: js.UndefOr[js.Function1[/* fill */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of selectionTolerance
  		* @param selectionTolerance Number The new value.
  		*/
  var setSelectionTolerance: js.UndefOr[js.Function1[/* selectionTolerance */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of smooth
  		* @param smooth Boolean/Number The new value.
  		*/
  var setSmooth: js.UndefOr[js.Function1[/* smooth */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of step
  		* @param step Boolean The new value.
  		*/
  var setStep: js.UndefOr[js.Function1[/* step */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean/Number) */
  var smooth: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var step: js.UndefOr[scala.Boolean] = js.undefined
}

object ILine {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    animate: js.Any = null,
    background: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => scala.Unit = null,
    colors: senchaUnderscoreTouchLib.ExtNs.Array = null,
    config: js.Any = null,
    destroy: () => scala.Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => scala.Unit = null,
    extend: java.lang.String = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => scala.Boolean = null,
    getAggregator: () => _ = null,
    getAnimate: () => _ = null,
    getBackground: () => _ = null,
    getBubbleEvents: () => _ = null,
    getColors: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getFill: () => scala.Boolean = null,
    getHidden: () => _ = null,
    getHighlightCfg: () => _ = null,
    getHighlightItem: () => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getItemForPoint: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any]) => _ = null,
    getItemInstancing: () => _ = null,
    getLabel: () => _ = null,
    getLabelField: () => _ = null,
    getLabelOverflowPadding: () => scala.Double = null,
    getListeners: () => _ = null,
    getMarker: () => _ = null,
    getMarkerSubStyle: () => _ = null,
    getOverlaySurface: () => _ = null,
    getRenderer: () => _ = null,
    getSelectionTolerance: () => scala.Double = null,
    getShowInLegend: () => scala.Boolean = null,
    getSmooth: () => _ = null,
    getSprites: () => scala.Unit = null,
    getStep: () => scala.Boolean = null,
    getStyle: () => _ = null,
    getSubStyle: () => _ = null,
    getSurface: () => _ = null,
    getTitle: () => java.lang.String = null,
    getXAxis: () => senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis = null,
    getXField: () => java.lang.String = null,
    getYAxis: () => senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis = null,
    getYField: () => java.lang.String = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    hidden: js.Any = null,
    highlightCfg: js.Any = null,
    highlightItem: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    itemInstancing: js.Any = null,
    label: js.Any = null,
    labelField: js.Any = null,
    labelOverflowPadding: scala.Int | scala.Double = null,
    listeners: js.Any = null,
    marker: js.Any = null,
    markerSubStyle: js.Any = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    overlaySurface: js.Any = null,
    platformConfig: js.Any = null,
    provideLegendInfo: /* target */ js.UndefOr[js.Any] => scala.Unit = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    renderer: js.Any = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    selectionTolerance: scala.Int | scala.Double = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    seriesType: java.lang.String = null,
    setAggregator: /* aggregator */ js.UndefOr[js.Any] => scala.Unit = null,
    setAnimate: /* animate */ js.UndefOr[js.Any] => scala.Unit = null,
    setBackground: /* background */ js.UndefOr[js.Any] => scala.Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => scala.Unit = null,
    setColors: /* colors */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => scala.Unit = null,
    setFill: /* fill */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setHidden: /* hidden */ js.UndefOr[js.Any] => scala.Unit = null,
    setHiddenByIndex: (/* index */ js.UndefOr[scala.Double], /* value */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    setHighlightCfg: /* highlightCfg */ js.UndefOr[js.Any] => scala.Unit = null,
    setHighlightItem: /* highlightItem */ js.UndefOr[js.Any] => scala.Unit = null,
    setItemInstancing: /* itemInstancing */ js.UndefOr[js.Any] => scala.Unit = null,
    setLabel: /* label */ js.UndefOr[js.Any] => _ = null,
    setLabelField: /* labelField */ js.UndefOr[js.Any] => scala.Unit = null,
    setLabelOverflowPadding: /* labelOverflowPadding */ js.UndefOr[scala.Double] => scala.Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => scala.Unit = null,
    setMarker: /* marker */ js.UndefOr[js.Any] => scala.Unit = null,
    setMarkerSubStyle: /* markerSubStyle */ js.UndefOr[js.Any] => scala.Unit = null,
    setOverlaySurface: /* overlaySurface */ js.UndefOr[js.Any] => scala.Unit = null,
    setRenderer: /* renderer */ js.UndefOr[js.Any] => _ = null,
    setSelectionTolerance: /* selectionTolerance */ js.UndefOr[scala.Double] => scala.Unit = null,
    setShowInLegend: /* showInLegend */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setSmooth: /* smooth */ js.UndefOr[js.Any] => scala.Unit = null,
    setStep: /* step */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setStore: /* store */ js.UndefOr[js.Any] => scala.Unit = null,
    setStyle: /* style */ js.UndefOr[js.Any] => scala.Unit = null,
    setSubStyle: /* subStyle */ js.UndefOr[js.Any] => scala.Unit = null,
    setSurface: /* surface */ js.UndefOr[js.Any] => scala.Unit = null,
    setTitle: /* title */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setXAxis: /* xAxis */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis] => scala.Unit = null,
    setXField: /* xField */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setYAxis: /* yAxis */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis] => scala.Unit = null,
    setYField: /* yField */ js.UndefOr[java.lang.String] => scala.Unit = null,
    showInLegend: js.UndefOr[scala.Boolean] = js.undefined,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    smooth: js.Any = null,
    statics: js.Any = null,
    step: js.UndefOr[scala.Boolean] = js.undefined,
    store: js.Any = null,
    style: js.Any = null,
    subStyle: js.Any = null,
    surface: js.Any = null,
    suspendEvents: () => scala.Unit = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    xAxis: senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis = null,
    xField: java.lang.String = null,
    yAxis: senchaUnderscoreTouchLib.ExtNs.chartNs.axisNs.IAxis = null,
    yField: java.lang.String = null
  ): ILine = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (animate != null) __obj.updateDynamic("animate")(animate)
    if (background != null) __obj.updateDynamic("background")(background)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getAggregator != null) __obj.updateDynamic("getAggregator")(js.Any.fromFunction0(getAggregator))
    if (getAnimate != null) __obj.updateDynamic("getAnimate")(js.Any.fromFunction0(getAnimate))
    if (getBackground != null) __obj.updateDynamic("getBackground")(js.Any.fromFunction0(getBackground))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getColors != null) __obj.updateDynamic("getColors")(js.Any.fromFunction0(getColors))
    if (getFill != null) __obj.updateDynamic("getFill")(js.Any.fromFunction0(getFill))
    if (getHidden != null) __obj.updateDynamic("getHidden")(js.Any.fromFunction0(getHidden))
    if (getHighlightCfg != null) __obj.updateDynamic("getHighlightCfg")(js.Any.fromFunction0(getHighlightCfg))
    if (getHighlightItem != null) __obj.updateDynamic("getHighlightItem")(js.Any.fromFunction0(getHighlightItem))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getItemForPoint != null) __obj.updateDynamic("getItemForPoint")(js.Any.fromFunction2(getItemForPoint))
    if (getItemInstancing != null) __obj.updateDynamic("getItemInstancing")(js.Any.fromFunction0(getItemInstancing))
    if (getLabel != null) __obj.updateDynamic("getLabel")(js.Any.fromFunction0(getLabel))
    if (getLabelField != null) __obj.updateDynamic("getLabelField")(js.Any.fromFunction0(getLabelField))
    if (getLabelOverflowPadding != null) __obj.updateDynamic("getLabelOverflowPadding")(js.Any.fromFunction0(getLabelOverflowPadding))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getMarker != null) __obj.updateDynamic("getMarker")(js.Any.fromFunction0(getMarker))
    if (getMarkerSubStyle != null) __obj.updateDynamic("getMarkerSubStyle")(js.Any.fromFunction0(getMarkerSubStyle))
    if (getOverlaySurface != null) __obj.updateDynamic("getOverlaySurface")(js.Any.fromFunction0(getOverlaySurface))
    if (getRenderer != null) __obj.updateDynamic("getRenderer")(js.Any.fromFunction0(getRenderer))
    if (getSelectionTolerance != null) __obj.updateDynamic("getSelectionTolerance")(js.Any.fromFunction0(getSelectionTolerance))
    if (getShowInLegend != null) __obj.updateDynamic("getShowInLegend")(js.Any.fromFunction0(getShowInLegend))
    if (getSmooth != null) __obj.updateDynamic("getSmooth")(js.Any.fromFunction0(getSmooth))
    if (getSprites != null) __obj.updateDynamic("getSprites")(js.Any.fromFunction0(getSprites))
    if (getStep != null) __obj.updateDynamic("getStep")(js.Any.fromFunction0(getStep))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction0(getStyle))
    if (getSubStyle != null) __obj.updateDynamic("getSubStyle")(js.Any.fromFunction0(getSubStyle))
    if (getSurface != null) __obj.updateDynamic("getSurface")(js.Any.fromFunction0(getSurface))
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (getXAxis != null) __obj.updateDynamic("getXAxis")(js.Any.fromFunction0(getXAxis))
    if (getXField != null) __obj.updateDynamic("getXField")(js.Any.fromFunction0(getXField))
    if (getYAxis != null) __obj.updateDynamic("getYAxis")(js.Any.fromFunction0(getYAxis))
    if (getYField != null) __obj.updateDynamic("getYField")(js.Any.fromFunction0(getYField))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hidden != null) __obj.updateDynamic("hidden")(hidden)
    if (highlightCfg != null) __obj.updateDynamic("highlightCfg")(highlightCfg)
    if (highlightItem != null) __obj.updateDynamic("highlightItem")(highlightItem)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (itemInstancing != null) __obj.updateDynamic("itemInstancing")(itemInstancing)
    if (label != null) __obj.updateDynamic("label")(label)
    if (labelField != null) __obj.updateDynamic("labelField")(labelField)
    if (labelOverflowPadding != null) __obj.updateDynamic("labelOverflowPadding")(labelOverflowPadding.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (markerSubStyle != null) __obj.updateDynamic("markerSubStyle")(markerSubStyle)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (overlaySurface != null) __obj.updateDynamic("overlaySurface")(overlaySurface)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (provideLegendInfo != null) __obj.updateDynamic("provideLegendInfo")(js.Any.fromFunction1(provideLegendInfo))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (selectionTolerance != null) __obj.updateDynamic("selectionTolerance")(selectionTolerance.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self)
    if (seriesType != null) __obj.updateDynamic("seriesType")(seriesType)
    if (setAggregator != null) __obj.updateDynamic("setAggregator")(js.Any.fromFunction1(setAggregator))
    if (setAnimate != null) __obj.updateDynamic("setAnimate")(js.Any.fromFunction1(setAnimate))
    if (setBackground != null) __obj.updateDynamic("setBackground")(js.Any.fromFunction1(setBackground))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setColors != null) __obj.updateDynamic("setColors")(js.Any.fromFunction1(setColors))
    if (setFill != null) __obj.updateDynamic("setFill")(js.Any.fromFunction1(setFill))
    if (setHidden != null) __obj.updateDynamic("setHidden")(js.Any.fromFunction1(setHidden))
    if (setHiddenByIndex != null) __obj.updateDynamic("setHiddenByIndex")(js.Any.fromFunction2(setHiddenByIndex))
    if (setHighlightCfg != null) __obj.updateDynamic("setHighlightCfg")(js.Any.fromFunction1(setHighlightCfg))
    if (setHighlightItem != null) __obj.updateDynamic("setHighlightItem")(js.Any.fromFunction1(setHighlightItem))
    if (setItemInstancing != null) __obj.updateDynamic("setItemInstancing")(js.Any.fromFunction1(setItemInstancing))
    if (setLabel != null) __obj.updateDynamic("setLabel")(js.Any.fromFunction1(setLabel))
    if (setLabelField != null) __obj.updateDynamic("setLabelField")(js.Any.fromFunction1(setLabelField))
    if (setLabelOverflowPadding != null) __obj.updateDynamic("setLabelOverflowPadding")(js.Any.fromFunction1(setLabelOverflowPadding))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setMarker != null) __obj.updateDynamic("setMarker")(js.Any.fromFunction1(setMarker))
    if (setMarkerSubStyle != null) __obj.updateDynamic("setMarkerSubStyle")(js.Any.fromFunction1(setMarkerSubStyle))
    if (setOverlaySurface != null) __obj.updateDynamic("setOverlaySurface")(js.Any.fromFunction1(setOverlaySurface))
    if (setRenderer != null) __obj.updateDynamic("setRenderer")(js.Any.fromFunction1(setRenderer))
    if (setSelectionTolerance != null) __obj.updateDynamic("setSelectionTolerance")(js.Any.fromFunction1(setSelectionTolerance))
    if (setShowInLegend != null) __obj.updateDynamic("setShowInLegend")(js.Any.fromFunction1(setShowInLegend))
    if (setSmooth != null) __obj.updateDynamic("setSmooth")(js.Any.fromFunction1(setSmooth))
    if (setStep != null) __obj.updateDynamic("setStep")(js.Any.fromFunction1(setStep))
    if (setStore != null) __obj.updateDynamic("setStore")(js.Any.fromFunction1(setStore))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction1(setStyle))
    if (setSubStyle != null) __obj.updateDynamic("setSubStyle")(js.Any.fromFunction1(setSubStyle))
    if (setSurface != null) __obj.updateDynamic("setSurface")(js.Any.fromFunction1(setSurface))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setXAxis != null) __obj.updateDynamic("setXAxis")(js.Any.fromFunction1(setXAxis))
    if (setXField != null) __obj.updateDynamic("setXField")(js.Any.fromFunction1(setXField))
    if (setYAxis != null) __obj.updateDynamic("setYAxis")(js.Any.fromFunction1(setYAxis))
    if (setYField != null) __obj.updateDynamic("setYField")(js.Any.fromFunction1(setYField))
    if (!js.isUndefined(showInLegend)) __obj.updateDynamic("showInLegend")(showInLegend)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (smooth != null) __obj.updateDynamic("smooth")(smooth)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step)
    if (store != null) __obj.updateDynamic("store")(store)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subStyle != null) __obj.updateDynamic("subStyle")(subStyle)
    if (surface != null) __obj.updateDynamic("surface")(surface)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis)
    if (xField != null) __obj.updateDynamic("xField")(xField)
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis)
    if (yField != null) __obj.updateDynamic("yField")(yField)
    __obj.asInstanceOf[ILine]
  }
}

