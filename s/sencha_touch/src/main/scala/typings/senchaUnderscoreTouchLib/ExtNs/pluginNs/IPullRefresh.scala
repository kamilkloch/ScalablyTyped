package typings
package senchaUnderscoreTouchLib.ExtNs.pluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPullRefresh
  extends senchaUnderscoreTouchLib.ExtNs.IComponent {
  /** [Config Option] (Boolean) */
  var autoSnapBack: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of autoSnapBack
  		* @returns Boolean
  		*/
  var getAutoSnapBack: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of lastUpdatedDateFormat
  		* @returns String
  		*/
  var getLastUpdatedDateFormat: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of lastUpdatedText
  		* @returns String
  		*/
  var getLastUpdatedText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of list
  		* @returns Ext.dataview.List
  		*/
  var getList: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.dataviewNs.IList]] = js.undefined
  /** [Method] Returns the value of loadedText
  		* @returns String
  		*/
  var getLoadedText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of loadingText
  		* @returns String
  		*/
  var getLoadingText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of overpullSnapBackDuration
  		* @returns Number
  		*/
  var getOverpullSnapBackDuration: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of pullText
  		* @returns String
  		*/
  var getPullText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of pullTpl
  		* @returns Ext.XTemplate/String/Array
  		*/
  var getPullTpl: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of releaseText
  		* @returns String
  		*/
  var getReleaseText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of scrollerAutoRefresh
  		* @returns Boolean
  		*/
  var getScrollerAutoRefresh: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of snappingAnimationDuration
  		* @returns Number
  		*/
  var getSnappingAnimationDuration: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of translatable
  		* @returns Boolean
  		*/
  var getTranslatable: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (String) */
  var lastUpdatedDateFormat: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var lastUpdatedText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.dataview.List) */
  var list: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataviewNs.IList] = js.undefined
  /** [Config Option] (String) */
  var loadedText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var loadingText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var overpullSnapBackDuration: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var pullRefreshText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var pullReleaseText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var pullText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.XTemplate/String/Array) */
  var pullTpl: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var releaseText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var scrollerAutoRefresh: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the value of autoSnapBack
  		* @param autoSnapBack Boolean The new value.
  		*/
  var setAutoSnapBack: js.UndefOr[js.Function1[/* autoSnapBack */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of lastUpdatedDateFormat
  		* @param lastUpdatedDateFormat String The new value.
  		*/
  var setLastUpdatedDateFormat: js.UndefOr[
    js.Function1[/* lastUpdatedDateFormat */ js.UndefOr[java.lang.String], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of lastUpdatedText
  		* @param lastUpdatedText String The new value.
  		*/
  var setLastUpdatedText: js.UndefOr[js.Function1[/* lastUpdatedText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of list
  		* @param list Ext.dataview.List The new value.
  		*/
  var setList: js.UndefOr[
    js.Function1[/* list */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataviewNs.IList], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of loadedText
  		* @param loadedText String The new value.
  		*/
  var setLoadedText: js.UndefOr[js.Function1[/* loadedText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of loadingText
  		* @param loadingText String The new value.
  		*/
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of overpullSnapBackDuration
  		* @param overpullSnapBackDuration Number The new value.
  		*/
  var setOverpullSnapBackDuration: js.UndefOr[
    js.Function1[/* overpullSnapBackDuration */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  /** [Method] Updates the PullRefreshText
  		* @param text String
  		*/
  var setPullRefreshText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pullText
  		* @param pullText String The new value.
  		*/
  var setPullText: js.UndefOr[js.Function1[/* pullText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of pullTpl
  		* @param pullTpl Ext.XTemplate/String/Array The new value.
  		*/
  var setPullTpl: js.UndefOr[js.Function1[/* pullTpl */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Updates the ReleaseRefreshText
  		* @param text String
  		*/
  var setReleaseRefreshText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of releaseText
  		* @param releaseText String The new value.
  		*/
  var setReleaseText: js.UndefOr[js.Function1[/* releaseText */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of scrollerAutoRefresh
  		* @param scrollerAutoRefresh Boolean The new value.
  		*/
  var setScrollerAutoRefresh: js.UndefOr[js.Function1[/* scrollerAutoRefresh */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of snappingAnimationDuration
  		* @param snappingAnimationDuration Number The new value.
  		*/
  var setSnappingAnimationDuration: js.UndefOr[
    js.Function1[/* snappingAnimationDuration */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of translatable
  		* @param translatable Boolean The new value.
  		*/
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Snaps the List back to the top after a pullrefresh is complete
  		* @param force Boolean Force the snapback to occur regardless of state {optional}
  		*/
  var snapBack: js.UndefOr[js.Function1[/* force */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var snappingAnimationDuration: js.UndefOr[scala.Double] = js.undefined
}

object IPullRefresh {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    addCls: (/* cls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    autoSnapBack: js.UndefOr[scala.Boolean] = js.undefined,
    baseCls: java.lang.String = null,
    border: js.Any = null,
    bottom: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    clearListeners: () => scala.Unit = null,
    cls: js.Any = null,
    componentCls: java.lang.String = null,
    config: js.Any = null,
    contentEl: js.Any = null,
    data: js.Any = null,
    destroy: () => scala.Unit = null,
    disable: () => scala.Unit = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledCls: java.lang.String = null,
    dock: java.lang.String = null,
    docked: java.lang.String = null,
    enable: () => scala.Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => scala.Unit = null,
    enterAnimation: js.Any = null,
    exitAnimation: js.Any = null,
    extend: java.lang.String = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => scala.Boolean = null,
    flex: scala.Int | scala.Double = null,
    floating: js.UndefOr[scala.Boolean] = js.undefined,
    floatingCls: java.lang.String = null,
    fullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    getAlignmentInfo: (/* component */ js.UndefOr[js.Any], /* alignment */ js.UndefOr[js.Any]) => scala.Unit = null,
    getAutoSnapBack: () => scala.Boolean = null,
    getBaseCls: () => java.lang.String = null,
    getBorder: () => _ = null,
    getBottom: () => _ = null,
    getBubbleEvents: () => _ = null,
    getCentered: () => scala.Boolean = null,
    getCls: () => _ = null,
    getContentEl: () => _ = null,
    getData: () => _ = null,
    getDisabled: () => scala.Boolean = null,
    getDisabledCls: () => java.lang.String = null,
    getDocked: () => java.lang.String = null,
    getEl: () => senchaUnderscoreTouchLib.ExtNs.domNs.IElement = null,
    getEnterAnimation: () => _ = null,
    getExitAnimation: () => _ = null,
    getFlex: () => scala.Double = null,
    getFloatingCls: () => java.lang.String = null,
    getHeight: () => _ = null,
    getHidden: () => scala.Boolean = null,
    getHiddenCls: () => java.lang.String = null,
    getHideAnimation: () => _ = null,
    getHtml: () => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getItemId: () => java.lang.String = null,
    getLastUpdatedDateFormat: () => java.lang.String = null,
    getLastUpdatedText: () => java.lang.String = null,
    getLeft: () => _ = null,
    getList: () => senchaUnderscoreTouchLib.ExtNs.dataviewNs.IList = null,
    getListeners: () => _ = null,
    getLoadedText: () => java.lang.String = null,
    getLoadingText: () => java.lang.String = null,
    getMargin: () => _ = null,
    getMaxHeight: () => _ = null,
    getMaxWidth: () => _ = null,
    getMinHeight: () => _ = null,
    getMinWidth: () => _ = null,
    getOverpullSnapBackDuration: () => scala.Double = null,
    getPadding: () => _ = null,
    getParent: () => IPullRefresh = null,
    getPlugins: () => _ = null,
    getPullText: () => java.lang.String = null,
    getPullTpl: () => _ = null,
    getRecord: () => senchaUnderscoreTouchLib.ExtNs.dataNs.IModel = null,
    getReleaseText: () => java.lang.String = null,
    getRenderTo: () => senchaUnderscoreTouchLib.ExtNs.IElement = null,
    getRight: () => _ = null,
    getScrollerAutoRefresh: () => scala.Boolean = null,
    getShowAnimation: () => _ = null,
    getSize: () => _ = null,
    getSnappingAnimationDuration: () => scala.Double = null,
    getStyle: () => _ = null,
    getStyleHtmlCls: () => java.lang.String = null,
    getStyleHtmlContent: () => scala.Boolean = null,
    getTop: () => _ = null,
    getTpl: () => _ = null,
    getTplWriteMode: () => java.lang.String = null,
    getTranslatable: () => scala.Boolean = null,
    getUi: () => java.lang.String = null,
    getWidth: () => _ = null,
    getXTypes: () => java.lang.String = null,
    getZIndex: () => scala.Double = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    hasParent: () => scala.Boolean = null,
    height: js.Any = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hiddenCls: java.lang.String = null,
    hide: /* animation */ js.UndefOr[js.Any] => IPullRefresh = null,
    hideAnimation: js.Any = null,
    hideOnMaskTap: js.UndefOr[scala.Boolean] = js.undefined,
    html: js.Any = null,
    id: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    initialize: () => scala.Unit = null,
    isDisabled: () => scala.Boolean = null,
    isHidden: () => scala.Boolean = null,
    isXType: (/* xtype */ js.UndefOr[java.lang.String], /* shallow */ js.UndefOr[scala.Boolean]) => scala.Boolean = null,
    itemId: java.lang.String = null,
    lastUpdatedDateFormat: java.lang.String = null,
    lastUpdatedText: java.lang.String = null,
    layoutOnOrientationChange: js.UndefOr[scala.Boolean] = js.undefined,
    left: js.Any = null,
    list: senchaUnderscoreTouchLib.ExtNs.dataviewNs.IList = null,
    listeners: js.Any = null,
    loadedText: java.lang.String = null,
    loadingText: java.lang.String = null,
    margin: js.Any = null,
    maxHeight: js.Any = null,
    maxWidth: js.Any = null,
    minHeight: js.Any = null,
    minWidth: js.Any = null,
    mixins: js.Any = null,
    modal: js.UndefOr[scala.Boolean] = js.undefined,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    monitorOrientation: js.UndefOr[scala.Boolean] = js.undefined,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    overpullSnapBackDuration: scala.Int | scala.Double = null,
    padding: js.Any = null,
    platformConfig: js.Any = null,
    plugins: js.Any = null,
    pullRefreshText: java.lang.String = null,
    pullReleaseText: java.lang.String = null,
    pullText: java.lang.String = null,
    pullTpl: js.Any = null,
    record: senchaUnderscoreTouchLib.ExtNs.dataNs.IModel = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable = null,
    releaseText: java.lang.String = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeCls: (/* cls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    renderTo: senchaUnderscoreTouchLib.ExtNs.IElement = null,
    replaceCls: (/* oldCls */ js.UndefOr[java.lang.String], /* newCls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    resetFloating: () => scala.Unit = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    right: js.Any = null,
    scroll: js.Any = null,
    scrollerAutoRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAutoSnapBack: /* autoSnapBack */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setBaseCls: /* baseCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setBorder: /* border */ js.UndefOr[js.Any] => scala.Unit = null,
    setBottom: /* bottom */ js.UndefOr[js.Any] => scala.Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => scala.Unit = null,
    setCentered: /* centered */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setCls: /* cls */ js.UndefOr[js.Any] => scala.Unit = null,
    setContentEl: /* contentEl */ js.UndefOr[js.Any] => scala.Unit = null,
    setData: /* data */ js.UndefOr[js.Any] => scala.Unit = null,
    setDisabled: /* disabled */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setDisabledCls: /* disabledCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setDocked: /* docked */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setDraggable: /* draggable */ js.UndefOr[js.Any] => scala.Unit = null,
    setEnterAnimation: /* enterAnimation */ js.UndefOr[js.Any] => scala.Unit = null,
    setExitAnimation: /* exitAnimation */ js.UndefOr[js.Any] => scala.Unit = null,
    setFlex: /* flex */ js.UndefOr[scala.Double] => scala.Unit = null,
    setFloating: /* floating */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setFloatingCls: /* floatingCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setHeight: /* height */ js.UndefOr[js.Any] => scala.Unit = null,
    setHidden: /* hidden */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setHiddenCls: /* hiddenCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setHideAnimation: /* hideAnimation */ js.UndefOr[js.Any] => scala.Unit = null,
    setHtml: /* html */ js.UndefOr[js.Any] => scala.Unit = null,
    setItemId: /* itemId */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setLastUpdatedDateFormat: /* lastUpdatedDateFormat */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setLastUpdatedText: /* lastUpdatedText */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setLeft: /* left */ js.UndefOr[js.Any] => scala.Unit = null,
    setList: /* list */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataviewNs.IList] => scala.Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => scala.Unit = null,
    setLoadedText: /* loadedText */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setLoadingText: /* loadingText */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setMargin: /* margin */ js.UndefOr[js.Any] => scala.Unit = null,
    setMaxHeight: /* maxHeight */ js.UndefOr[js.Any] => scala.Unit = null,
    setMaxWidth: /* maxWidth */ js.UndefOr[js.Any] => scala.Unit = null,
    setMinHeight: /* minHeight */ js.UndefOr[js.Any] => scala.Unit = null,
    setMinWidth: /* minWidth */ js.UndefOr[js.Any] => scala.Unit = null,
    setOverpullSnapBackDuration: /* overpullSnapBackDuration */ js.UndefOr[scala.Double] => scala.Unit = null,
    setPadding: /* padding */ js.UndefOr[js.Any] => scala.Unit = null,
    setPlugins: /* plugins */ js.UndefOr[js.Any] => scala.Unit = null,
    setPullRefreshText: /* text */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setPullText: /* pullText */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setPullTpl: /* pullTpl */ js.UndefOr[js.Any] => scala.Unit = null,
    setRecord: /* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel] => scala.Unit = null,
    setReleaseRefreshText: /* text */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setReleaseText: /* releaseText */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setRenderTo: /* renderTo */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IElement] => scala.Unit = null,
    setRight: /* right */ js.UndefOr[js.Any] => scala.Unit = null,
    setScrollable: () => scala.Unit = null,
    setScrollerAutoRefresh: /* scrollerAutoRefresh */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setShowAnimation: /* showAnimation */ js.UndefOr[js.Any] => scala.Unit = null,
    setSize: (/* width */ js.UndefOr[scala.Double], /* height */ js.UndefOr[scala.Double]) => scala.Unit = null,
    setSnappingAnimationDuration: /* snappingAnimationDuration */ js.UndefOr[scala.Double] => scala.Unit = null,
    setStyle: /* style */ js.UndefOr[js.Any] => scala.Unit = null,
    setStyleHtmlCls: /* styleHtmlCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setStyleHtmlContent: /* styleHtmlContent */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setTop: /* top */ js.UndefOr[js.Any] => scala.Unit = null,
    setTpl: /* tpl */ js.UndefOr[js.Any] => scala.Unit = null,
    setTplWriteMode: /* tplWriteMode */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setTranslatable: /* translatable */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setUi: /* ui */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setWidth: /* width */ js.UndefOr[js.Any] => scala.Unit = null,
    setZIndex: /* zIndex */ js.UndefOr[scala.Double] => scala.Unit = null,
    show: /* animation */ js.UndefOr[js.Any] => IPullRefresh = null,
    showAnimation: js.Any = null,
    showBy: (/* component */ js.UndefOr[IPullRefresh], /* alignment */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    snapBack: /* force */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    snappingAnimationDuration: scala.Int | scala.Double = null,
    statics: js.Any = null,
    stopMaskTapEvent: js.UndefOr[scala.Boolean] = js.undefined,
    style: js.Any = null,
    styleHtmlCls: java.lang.String = null,
    styleHtmlContent: js.UndefOr[scala.Boolean] = js.undefined,
    suspendEvents: () => scala.Unit = null,
    top: js.Any = null,
    tpl: js.Any = null,
    tplWriteMode: java.lang.String = null,
    ui: java.lang.String = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    up: /* selector */ js.UndefOr[java.lang.String] => senchaUnderscoreTouchLib.ExtNs.IContainer = null,
    update: () => scala.Unit = null,
    updateStyleHtmlCls: (/* newHtmlCls */ js.UndefOr[js.Any], /* oldHtmlCls */ js.UndefOr[js.Any]) => scala.Unit = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    width: js.Any = null,
    xtype: java.lang.String = null,
    zIndex: scala.Int | scala.Double = null
  ): IPullRefresh = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction3(addCls))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (!js.isUndefined(autoSnapBack)) __obj.updateDynamic("autoSnapBack")(autoSnapBack)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (border != null) __obj.updateDynamic("border")(border)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (componentCls != null) __obj.updateDynamic("componentCls")(componentCls)
    if (config != null) __obj.updateDynamic("config")(config)
    if (contentEl != null) __obj.updateDynamic("contentEl")(contentEl)
    if (data != null) __obj.updateDynamic("data")(data)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction0(disable))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledCls != null) __obj.updateDynamic("disabledCls")(disabledCls)
    if (dock != null) __obj.updateDynamic("dock")(dock)
    if (docked != null) __obj.updateDynamic("docked")(docked)
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction0(enable))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (enterAnimation != null) __obj.updateDynamic("enterAnimation")(enterAnimation)
    if (exitAnimation != null) __obj.updateDynamic("exitAnimation")(exitAnimation)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (floatingCls != null) __obj.updateDynamic("floatingCls")(floatingCls)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (getAlignmentInfo != null) __obj.updateDynamic("getAlignmentInfo")(js.Any.fromFunction2(getAlignmentInfo))
    if (getAutoSnapBack != null) __obj.updateDynamic("getAutoSnapBack")(js.Any.fromFunction0(getAutoSnapBack))
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getBorder != null) __obj.updateDynamic("getBorder")(js.Any.fromFunction0(getBorder))
    if (getBottom != null) __obj.updateDynamic("getBottom")(js.Any.fromFunction0(getBottom))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getCentered != null) __obj.updateDynamic("getCentered")(js.Any.fromFunction0(getCentered))
    if (getCls != null) __obj.updateDynamic("getCls")(js.Any.fromFunction0(getCls))
    if (getContentEl != null) __obj.updateDynamic("getContentEl")(js.Any.fromFunction0(getContentEl))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction0(getData))
    if (getDisabled != null) __obj.updateDynamic("getDisabled")(js.Any.fromFunction0(getDisabled))
    if (getDisabledCls != null) __obj.updateDynamic("getDisabledCls")(js.Any.fromFunction0(getDisabledCls))
    if (getDocked != null) __obj.updateDynamic("getDocked")(js.Any.fromFunction0(getDocked))
    if (getEl != null) __obj.updateDynamic("getEl")(js.Any.fromFunction0(getEl))
    if (getEnterAnimation != null) __obj.updateDynamic("getEnterAnimation")(js.Any.fromFunction0(getEnterAnimation))
    if (getExitAnimation != null) __obj.updateDynamic("getExitAnimation")(js.Any.fromFunction0(getExitAnimation))
    if (getFlex != null) __obj.updateDynamic("getFlex")(js.Any.fromFunction0(getFlex))
    if (getFloatingCls != null) __obj.updateDynamic("getFloatingCls")(js.Any.fromFunction0(getFloatingCls))
    if (getHeight != null) __obj.updateDynamic("getHeight")(js.Any.fromFunction0(getHeight))
    if (getHidden != null) __obj.updateDynamic("getHidden")(js.Any.fromFunction0(getHidden))
    if (getHiddenCls != null) __obj.updateDynamic("getHiddenCls")(js.Any.fromFunction0(getHiddenCls))
    if (getHideAnimation != null) __obj.updateDynamic("getHideAnimation")(js.Any.fromFunction0(getHideAnimation))
    if (getHtml != null) __obj.updateDynamic("getHtml")(js.Any.fromFunction0(getHtml))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getItemId != null) __obj.updateDynamic("getItemId")(js.Any.fromFunction0(getItemId))
    if (getLastUpdatedDateFormat != null) __obj.updateDynamic("getLastUpdatedDateFormat")(js.Any.fromFunction0(getLastUpdatedDateFormat))
    if (getLastUpdatedText != null) __obj.updateDynamic("getLastUpdatedText")(js.Any.fromFunction0(getLastUpdatedText))
    if (getLeft != null) __obj.updateDynamic("getLeft")(js.Any.fromFunction0(getLeft))
    if (getList != null) __obj.updateDynamic("getList")(js.Any.fromFunction0(getList))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getLoadedText != null) __obj.updateDynamic("getLoadedText")(js.Any.fromFunction0(getLoadedText))
    if (getLoadingText != null) __obj.updateDynamic("getLoadingText")(js.Any.fromFunction0(getLoadingText))
    if (getMargin != null) __obj.updateDynamic("getMargin")(js.Any.fromFunction0(getMargin))
    if (getMaxHeight != null) __obj.updateDynamic("getMaxHeight")(js.Any.fromFunction0(getMaxHeight))
    if (getMaxWidth != null) __obj.updateDynamic("getMaxWidth")(js.Any.fromFunction0(getMaxWidth))
    if (getMinHeight != null) __obj.updateDynamic("getMinHeight")(js.Any.fromFunction0(getMinHeight))
    if (getMinWidth != null) __obj.updateDynamic("getMinWidth")(js.Any.fromFunction0(getMinWidth))
    if (getOverpullSnapBackDuration != null) __obj.updateDynamic("getOverpullSnapBackDuration")(js.Any.fromFunction0(getOverpullSnapBackDuration))
    if (getPadding != null) __obj.updateDynamic("getPadding")(js.Any.fromFunction0(getPadding))
    if (getParent != null) __obj.updateDynamic("getParent")(js.Any.fromFunction0(getParent))
    if (getPlugins != null) __obj.updateDynamic("getPlugins")(js.Any.fromFunction0(getPlugins))
    if (getPullText != null) __obj.updateDynamic("getPullText")(js.Any.fromFunction0(getPullText))
    if (getPullTpl != null) __obj.updateDynamic("getPullTpl")(js.Any.fromFunction0(getPullTpl))
    if (getRecord != null) __obj.updateDynamic("getRecord")(js.Any.fromFunction0(getRecord))
    if (getReleaseText != null) __obj.updateDynamic("getReleaseText")(js.Any.fromFunction0(getReleaseText))
    if (getRenderTo != null) __obj.updateDynamic("getRenderTo")(js.Any.fromFunction0(getRenderTo))
    if (getRight != null) __obj.updateDynamic("getRight")(js.Any.fromFunction0(getRight))
    if (getScrollerAutoRefresh != null) __obj.updateDynamic("getScrollerAutoRefresh")(js.Any.fromFunction0(getScrollerAutoRefresh))
    if (getShowAnimation != null) __obj.updateDynamic("getShowAnimation")(js.Any.fromFunction0(getShowAnimation))
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction0(getSize))
    if (getSnappingAnimationDuration != null) __obj.updateDynamic("getSnappingAnimationDuration")(js.Any.fromFunction0(getSnappingAnimationDuration))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction0(getStyle))
    if (getStyleHtmlCls != null) __obj.updateDynamic("getStyleHtmlCls")(js.Any.fromFunction0(getStyleHtmlCls))
    if (getStyleHtmlContent != null) __obj.updateDynamic("getStyleHtmlContent")(js.Any.fromFunction0(getStyleHtmlContent))
    if (getTop != null) __obj.updateDynamic("getTop")(js.Any.fromFunction0(getTop))
    if (getTpl != null) __obj.updateDynamic("getTpl")(js.Any.fromFunction0(getTpl))
    if (getTplWriteMode != null) __obj.updateDynamic("getTplWriteMode")(js.Any.fromFunction0(getTplWriteMode))
    if (getTranslatable != null) __obj.updateDynamic("getTranslatable")(js.Any.fromFunction0(getTranslatable))
    if (getUi != null) __obj.updateDynamic("getUi")(js.Any.fromFunction0(getUi))
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction0(getWidth))
    if (getXTypes != null) __obj.updateDynamic("getXTypes")(js.Any.fromFunction0(getXTypes))
    if (getZIndex != null) __obj.updateDynamic("getZIndex")(js.Any.fromFunction0(getZIndex))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasParent != null) __obj.updateDynamic("hasParent")(js.Any.fromFunction0(hasParent))
    if (height != null) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hiddenCls != null) __obj.updateDynamic("hiddenCls")(hiddenCls)
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1(hide))
    if (hideAnimation != null) __obj.updateDynamic("hideAnimation")(hideAnimation)
    if (!js.isUndefined(hideOnMaskTap)) __obj.updateDynamic("hideOnMaskTap")(hideOnMaskTap)
    if (html != null) __obj.updateDynamic("html")(html)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction0(initialize))
    if (isDisabled != null) __obj.updateDynamic("isDisabled")(js.Any.fromFunction0(isDisabled))
    if (isHidden != null) __obj.updateDynamic("isHidden")(js.Any.fromFunction0(isHidden))
    if (isXType != null) __obj.updateDynamic("isXType")(js.Any.fromFunction2(isXType))
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (lastUpdatedDateFormat != null) __obj.updateDynamic("lastUpdatedDateFormat")(lastUpdatedDateFormat)
    if (lastUpdatedText != null) __obj.updateDynamic("lastUpdatedText")(lastUpdatedText)
    if (!js.isUndefined(layoutOnOrientationChange)) __obj.updateDynamic("layoutOnOrientationChange")(layoutOnOrientationChange)
    if (left != null) __obj.updateDynamic("left")(left)
    if (list != null) __obj.updateDynamic("list")(list)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (loadedText != null) __obj.updateDynamic("loadedText")(loadedText)
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth)
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (!js.isUndefined(monitorOrientation)) __obj.updateDynamic("monitorOrientation")(monitorOrientation)
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (overpullSnapBackDuration != null) __obj.updateDynamic("overpullSnapBackDuration")(overpullSnapBackDuration.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (pullRefreshText != null) __obj.updateDynamic("pullRefreshText")(pullRefreshText)
    if (pullReleaseText != null) __obj.updateDynamic("pullReleaseText")(pullReleaseText)
    if (pullText != null) __obj.updateDynamic("pullText")(pullText)
    if (pullTpl != null) __obj.updateDynamic("pullTpl")(pullTpl)
    if (record != null) __obj.updateDynamic("record")(record)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (releaseText != null) __obj.updateDynamic("releaseText")(releaseText)
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction3(removeCls))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (renderTo != null) __obj.updateDynamic("renderTo")(renderTo)
    if (replaceCls != null) __obj.updateDynamic("replaceCls")(js.Any.fromFunction4(replaceCls))
    if (resetFloating != null) __obj.updateDynamic("resetFloating")(js.Any.fromFunction0(resetFloating))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (right != null) __obj.updateDynamic("right")(right)
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    if (!js.isUndefined(scrollerAutoRefresh)) __obj.updateDynamic("scrollerAutoRefresh")(scrollerAutoRefresh)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAutoSnapBack != null) __obj.updateDynamic("setAutoSnapBack")(js.Any.fromFunction1(setAutoSnapBack))
    if (setBaseCls != null) __obj.updateDynamic("setBaseCls")(js.Any.fromFunction1(setBaseCls))
    if (setBorder != null) __obj.updateDynamic("setBorder")(js.Any.fromFunction1(setBorder))
    if (setBottom != null) __obj.updateDynamic("setBottom")(js.Any.fromFunction1(setBottom))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setCentered != null) __obj.updateDynamic("setCentered")(js.Any.fromFunction1(setCentered))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1(setCls))
    if (setContentEl != null) __obj.updateDynamic("setContentEl")(js.Any.fromFunction1(setContentEl))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1(setData))
    if (setDisabled != null) __obj.updateDynamic("setDisabled")(js.Any.fromFunction1(setDisabled))
    if (setDisabledCls != null) __obj.updateDynamic("setDisabledCls")(js.Any.fromFunction1(setDisabledCls))
    if (setDocked != null) __obj.updateDynamic("setDocked")(js.Any.fromFunction1(setDocked))
    if (setDraggable != null) __obj.updateDynamic("setDraggable")(js.Any.fromFunction1(setDraggable))
    if (setEnterAnimation != null) __obj.updateDynamic("setEnterAnimation")(js.Any.fromFunction1(setEnterAnimation))
    if (setExitAnimation != null) __obj.updateDynamic("setExitAnimation")(js.Any.fromFunction1(setExitAnimation))
    if (setFlex != null) __obj.updateDynamic("setFlex")(js.Any.fromFunction1(setFlex))
    if (setFloating != null) __obj.updateDynamic("setFloating")(js.Any.fromFunction1(setFloating))
    if (setFloatingCls != null) __obj.updateDynamic("setFloatingCls")(js.Any.fromFunction1(setFloatingCls))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setHidden != null) __obj.updateDynamic("setHidden")(js.Any.fromFunction1(setHidden))
    if (setHiddenCls != null) __obj.updateDynamic("setHiddenCls")(js.Any.fromFunction1(setHiddenCls))
    if (setHideAnimation != null) __obj.updateDynamic("setHideAnimation")(js.Any.fromFunction1(setHideAnimation))
    if (setHtml != null) __obj.updateDynamic("setHtml")(js.Any.fromFunction1(setHtml))
    if (setItemId != null) __obj.updateDynamic("setItemId")(js.Any.fromFunction1(setItemId))
    if (setLastUpdatedDateFormat != null) __obj.updateDynamic("setLastUpdatedDateFormat")(js.Any.fromFunction1(setLastUpdatedDateFormat))
    if (setLastUpdatedText != null) __obj.updateDynamic("setLastUpdatedText")(js.Any.fromFunction1(setLastUpdatedText))
    if (setLeft != null) __obj.updateDynamic("setLeft")(js.Any.fromFunction1(setLeft))
    if (setList != null) __obj.updateDynamic("setList")(js.Any.fromFunction1(setList))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setLoadedText != null) __obj.updateDynamic("setLoadedText")(js.Any.fromFunction1(setLoadedText))
    if (setLoadingText != null) __obj.updateDynamic("setLoadingText")(js.Any.fromFunction1(setLoadingText))
    if (setMargin != null) __obj.updateDynamic("setMargin")(js.Any.fromFunction1(setMargin))
    if (setMaxHeight != null) __obj.updateDynamic("setMaxHeight")(js.Any.fromFunction1(setMaxHeight))
    if (setMaxWidth != null) __obj.updateDynamic("setMaxWidth")(js.Any.fromFunction1(setMaxWidth))
    if (setMinHeight != null) __obj.updateDynamic("setMinHeight")(js.Any.fromFunction1(setMinHeight))
    if (setMinWidth != null) __obj.updateDynamic("setMinWidth")(js.Any.fromFunction1(setMinWidth))
    if (setOverpullSnapBackDuration != null) __obj.updateDynamic("setOverpullSnapBackDuration")(js.Any.fromFunction1(setOverpullSnapBackDuration))
    if (setPadding != null) __obj.updateDynamic("setPadding")(js.Any.fromFunction1(setPadding))
    if (setPlugins != null) __obj.updateDynamic("setPlugins")(js.Any.fromFunction1(setPlugins))
    if (setPullRefreshText != null) __obj.updateDynamic("setPullRefreshText")(js.Any.fromFunction1(setPullRefreshText))
    if (setPullText != null) __obj.updateDynamic("setPullText")(js.Any.fromFunction1(setPullText))
    if (setPullTpl != null) __obj.updateDynamic("setPullTpl")(js.Any.fromFunction1(setPullTpl))
    if (setRecord != null) __obj.updateDynamic("setRecord")(js.Any.fromFunction1(setRecord))
    if (setReleaseRefreshText != null) __obj.updateDynamic("setReleaseRefreshText")(js.Any.fromFunction1(setReleaseRefreshText))
    if (setReleaseText != null) __obj.updateDynamic("setReleaseText")(js.Any.fromFunction1(setReleaseText))
    if (setRenderTo != null) __obj.updateDynamic("setRenderTo")(js.Any.fromFunction1(setRenderTo))
    if (setRight != null) __obj.updateDynamic("setRight")(js.Any.fromFunction1(setRight))
    if (setScrollable != null) __obj.updateDynamic("setScrollable")(js.Any.fromFunction0(setScrollable))
    if (setScrollerAutoRefresh != null) __obj.updateDynamic("setScrollerAutoRefresh")(js.Any.fromFunction1(setScrollerAutoRefresh))
    if (setShowAnimation != null) __obj.updateDynamic("setShowAnimation")(js.Any.fromFunction1(setShowAnimation))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2(setSize))
    if (setSnappingAnimationDuration != null) __obj.updateDynamic("setSnappingAnimationDuration")(js.Any.fromFunction1(setSnappingAnimationDuration))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction1(setStyle))
    if (setStyleHtmlCls != null) __obj.updateDynamic("setStyleHtmlCls")(js.Any.fromFunction1(setStyleHtmlCls))
    if (setStyleHtmlContent != null) __obj.updateDynamic("setStyleHtmlContent")(js.Any.fromFunction1(setStyleHtmlContent))
    if (setTop != null) __obj.updateDynamic("setTop")(js.Any.fromFunction1(setTop))
    if (setTpl != null) __obj.updateDynamic("setTpl")(js.Any.fromFunction1(setTpl))
    if (setTplWriteMode != null) __obj.updateDynamic("setTplWriteMode")(js.Any.fromFunction1(setTplWriteMode))
    if (setTranslatable != null) __obj.updateDynamic("setTranslatable")(js.Any.fromFunction1(setTranslatable))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1(setWidth))
    if (setZIndex != null) __obj.updateDynamic("setZIndex")(js.Any.fromFunction1(setZIndex))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    if (showAnimation != null) __obj.updateDynamic("showAnimation")(showAnimation)
    if (showBy != null) __obj.updateDynamic("showBy")(js.Any.fromFunction2(showBy))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (snapBack != null) __obj.updateDynamic("snapBack")(js.Any.fromFunction1(snapBack))
    if (snappingAnimationDuration != null) __obj.updateDynamic("snappingAnimationDuration")(snappingAnimationDuration.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (!js.isUndefined(stopMaskTapEvent)) __obj.updateDynamic("stopMaskTapEvent")(stopMaskTapEvent)
    if (style != null) __obj.updateDynamic("style")(style)
    if (styleHtmlCls != null) __obj.updateDynamic("styleHtmlCls")(styleHtmlCls)
    if (!js.isUndefined(styleHtmlContent)) __obj.updateDynamic("styleHtmlContent")(styleHtmlContent)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (top != null) __obj.updateDynamic("top")(top)
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    if (tplWriteMode != null) __obj.updateDynamic("tplWriteMode")(tplWriteMode)
    if (ui != null) __obj.updateDynamic("ui")(ui)
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (up != null) __obj.updateDynamic("up")(js.Any.fromFunction1(up))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction0(update))
    if (updateStyleHtmlCls != null) __obj.updateDynamic("updateStyleHtmlCls")(js.Any.fromFunction2(updateStyleHtmlCls))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (width != null) __obj.updateDynamic("width")(width)
    if (xtype != null) __obj.updateDynamic("xtype")(xtype)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPullRefresh]
  }
}

