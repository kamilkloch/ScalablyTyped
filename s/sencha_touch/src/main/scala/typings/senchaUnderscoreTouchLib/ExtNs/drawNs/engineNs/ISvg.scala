package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.engineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISvg
  extends senchaUnderscoreTouchLib.ExtNs.drawNs.ISurface {
  /** [Method] Clears the current transformation state on the surface  */
  var clearTransform: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Creates a DOM element under the SVG namespace of the given type
  		* @param type String The type of the SVG DOM element.
  		* @returns * The created element.
  		*/
  var createSvgNode: js.UndefOr[js.Function1[/* type */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Destroys the Canvas element and prepares it for Garbage Collection
  		* @param path Object
  		* @param matrix Object
  		* @param band Object
  		*/
  @JSName("destroy")
  var destroy_ISvg: js.UndefOr[
    js.Function3[
      /* path */ js.UndefOr[js.Any], 
      /* matrix */ js.UndefOr[js.Any], 
      /* band */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Returns the value of highPrecision
  		* @returns Boolean
  		*/
  var getHighPrecision: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var highPrecision: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Remove a given sprite from the surface optionally destroying the sprite in the process
  		* @param sprite Object
  		* @param destroySprite Object
  		*/
  @JSName("remove")
  var remove_ISvg: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* destroySprite */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Renders a single sprite into the surface
  		* @param sprite Ext.draw.sprite.Sprite The Sprite to be rendered.
  		* @returns Boolean returns false to stop the rendering to continue.
  		*/
  var renderSprite: js.UndefOr[
    js.Function1[
      /* sprite */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] Sets the value of highPrecision
  		* @param highPrecision Boolean The new value.
  		*/
  var setHighPrecision: js.UndefOr[js.Function1[/* highPrecision */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
}

object ISvg {
  @scala.inline
  def apply(
    add: () => scala.Unit = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    addCls: (/* cls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    background: js.Any = null,
    baseCls: java.lang.String = null,
    border: js.Any = null,
    bottom: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    clear: () => scala.Unit = null,
    clearListeners: () => scala.Unit = null,
    clearTransform: () => scala.Unit = null,
    cls: js.Any = null,
    componentCls: java.lang.String = null,
    config: js.Any = null,
    contentEl: js.Any = null,
    createSvgNode: /* type */ js.UndefOr[java.lang.String] => _ = null,
    data: js.Any = null,
    destroy: (/* path */ js.UndefOr[js.Any], /* matrix */ js.UndefOr[js.Any], /* band */ js.UndefOr[js.Any]) => scala.Unit = null,
    devicePixelRatio: js.Any = null,
    dirty: js.UndefOr[scala.Boolean] = js.undefined,
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
    getBBox: (/* sprite */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite], /* isWithoutTransform */ js.UndefOr[scala.Boolean]) => _ = null,
    getBackground: () => _ = null,
    getBaseCls: () => java.lang.String = null,
    getBorder: () => _ = null,
    getBottom: () => _ = null,
    getBubbleEvents: () => _ = null,
    getCentered: () => scala.Boolean = null,
    getCls: () => _ = null,
    getContentEl: () => _ = null,
    getData: () => _ = null,
    getDirty: () => scala.Boolean = null,
    getDisabled: () => scala.Boolean = null,
    getDisabledCls: () => java.lang.String = null,
    getDocked: () => java.lang.String = null,
    getEl: () => senchaUnderscoreTouchLib.ExtNs.domNs.IElement = null,
    getEnterAnimation: () => _ = null,
    getExitAnimation: () => _ = null,
    getFlex: () => scala.Double = null,
    getFloatingCls: () => java.lang.String = null,
    getGroup: /* id */ js.UndefOr[java.lang.String] => senchaUnderscoreTouchLib.ExtNs.drawNs.IGroup = null,
    getGroups: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getHeight: () => _ = null,
    getHidden: () => scala.Boolean = null,
    getHiddenCls: () => java.lang.String = null,
    getHideAnimation: () => _ = null,
    getHighPrecision: () => scala.Boolean = null,
    getHtml: () => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getItemId: () => java.lang.String = null,
    getItems: () => senchaUnderscoreTouchLib.ExtNs.drawNs.IGroup = null,
    getLeft: () => _ = null,
    getListeners: () => _ = null,
    getMargin: () => _ = null,
    getMaxHeight: () => _ = null,
    getMaxWidth: () => _ = null,
    getMinHeight: () => _ = null,
    getMinWidth: () => _ = null,
    getPadding: () => _ = null,
    getParent: () => ISvg = null,
    getPlugins: () => _ = null,
    getRecord: () => senchaUnderscoreTouchLib.ExtNs.dataNs.IModel = null,
    getRegion: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getRenderTo: () => senchaUnderscoreTouchLib.ExtNs.IElement = null,
    getRight: () => _ = null,
    getShowAnimation: () => _ = null,
    getSize: () => _ = null,
    getStyle: () => _ = null,
    getStyleHtmlCls: () => java.lang.String = null,
    getStyleHtmlContent: () => scala.Boolean = null,
    getTop: () => _ = null,
    getTpl: () => _ = null,
    getTplWriteMode: () => java.lang.String = null,
    getUi: () => java.lang.String = null,
    getWidth: () => _ = null,
    getXTypes: () => java.lang.String = null,
    getZIndex: () => scala.Double = null,
    groups: senchaUnderscoreTouchLib.ExtNs.Array = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    hasParent: () => scala.Boolean = null,
    height: js.Any = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hiddenCls: java.lang.String = null,
    hide: /* animation */ js.UndefOr[js.Any] => ISvg = null,
    hideAnimation: js.Any = null,
    hideOnMaskTap: js.UndefOr[scala.Boolean] = js.undefined,
    highPrecision: js.UndefOr[scala.Boolean] = js.undefined,
    html: js.Any = null,
    id: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    initialize: () => scala.Unit = null,
    isDisabled: () => scala.Boolean = null,
    isHidden: () => scala.Boolean = null,
    isXType: (/* xtype */ js.UndefOr[java.lang.String], /* shallow */ js.UndefOr[scala.Boolean]) => scala.Boolean = null,
    itemId: java.lang.String = null,
    items: senchaUnderscoreTouchLib.ExtNs.drawNs.IGroup = null,
    layoutOnOrientationChange: js.UndefOr[scala.Boolean] = js.undefined,
    left: js.Any = null,
    listeners: js.Any = null,
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
    onAdd: /* sprite */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite] => scala.Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    padding: js.Any = null,
    platformConfig: js.Any = null,
    plugins: js.Any = null,
    record: senchaUnderscoreTouchLib.ExtNs.dataNs.IModel = null,
    region: senchaUnderscoreTouchLib.ExtNs.Array = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable = null,
    remove: (/* sprite */ js.UndefOr[js.Any], /* destroySprite */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeAll: () => scala.Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeCls: (/* cls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    renderFrame: () => scala.Unit = null,
    renderSprite: /* sprite */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite] => scala.Boolean = null,
    renderTo: senchaUnderscoreTouchLib.ExtNs.IElement = null,
    repaint: () => scala.Unit = null,
    replaceCls: (/* oldCls */ js.UndefOr[java.lang.String], /* newCls */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    resetFloating: () => scala.Unit = null,
    resetTransform: () => scala.Unit = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    right: js.Any = null,
    roundPixel: /* num */ js.UndefOr[scala.Double] => scala.Double = null,
    scroll: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setBackground: /* background */ js.UndefOr[js.Any] => scala.Unit = null,
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
    setGroups: /* groups */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => scala.Unit = null,
    setHeight: /* height */ js.UndefOr[js.Any] => scala.Unit = null,
    setHidden: /* hidden */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setHiddenCls: /* hiddenCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setHideAnimation: /* hideAnimation */ js.UndefOr[js.Any] => scala.Unit = null,
    setHighPrecision: /* highPrecision */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setHtml: /* html */ js.UndefOr[js.Any] => scala.Unit = null,
    setItemId: /* itemId */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setItems: /* items */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.IGroup] => scala.Unit = null,
    setLeft: /* left */ js.UndefOr[js.Any] => scala.Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => scala.Unit = null,
    setMargin: /* margin */ js.UndefOr[js.Any] => scala.Unit = null,
    setMaxHeight: /* maxHeight */ js.UndefOr[js.Any] => scala.Unit = null,
    setMaxWidth: /* maxWidth */ js.UndefOr[js.Any] => scala.Unit = null,
    setMinHeight: /* minHeight */ js.UndefOr[js.Any] => scala.Unit = null,
    setMinWidth: /* minWidth */ js.UndefOr[js.Any] => scala.Unit = null,
    setPadding: /* padding */ js.UndefOr[js.Any] => scala.Unit = null,
    setPlugins: /* plugins */ js.UndefOr[js.Any] => scala.Unit = null,
    setRecord: /* record */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.dataNs.IModel] => scala.Unit = null,
    setRegion: /* region */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => scala.Unit = null,
    setRenderTo: /* renderTo */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.IElement] => scala.Unit = null,
    setRight: /* right */ js.UndefOr[js.Any] => scala.Unit = null,
    setScrollable: () => scala.Unit = null,
    setShowAnimation: /* showAnimation */ js.UndefOr[js.Any] => scala.Unit = null,
    setSize: (/* width */ js.UndefOr[scala.Double], /* height */ js.UndefOr[scala.Double]) => scala.Unit = null,
    setStyle: /* style */ js.UndefOr[js.Any] => scala.Unit = null,
    setStyleHtmlCls: /* styleHtmlCls */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setStyleHtmlContent: /* styleHtmlContent */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setTop: /* top */ js.UndefOr[js.Any] => scala.Unit = null,
    setTpl: /* tpl */ js.UndefOr[js.Any] => scala.Unit = null,
    setTplWriteMode: /* tplWriteMode */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setUi: /* ui */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setWidth: /* width */ js.UndefOr[js.Any] => scala.Unit = null,
    setZIndex: /* zIndex */ js.UndefOr[scala.Double] => scala.Unit = null,
    show: /* animation */ js.UndefOr[js.Any] => ISvg = null,
    showAnimation: js.Any = null,
    showBy: (/* component */ js.UndefOr[ISvg], /* alignment */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
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
    waitFor: /* surface */ js.UndefOr[ISvg] => scala.Unit = null,
    width: js.Any = null,
    xtype: java.lang.String = null,
    zIndex: scala.Int | scala.Double = null
  ): ISvg = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction0(add))
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction3(addCls))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (background != null) __obj.updateDynamic("background")(background)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (border != null) __obj.updateDynamic("border")(border)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearTransform != null) __obj.updateDynamic("clearTransform")(js.Any.fromFunction0(clearTransform))
    if (cls != null) __obj.updateDynamic("cls")(cls)
    if (componentCls != null) __obj.updateDynamic("componentCls")(componentCls)
    if (config != null) __obj.updateDynamic("config")(config)
    if (contentEl != null) __obj.updateDynamic("contentEl")(contentEl)
    if (createSvgNode != null) __obj.updateDynamic("createSvgNode")(js.Any.fromFunction1(createSvgNode))
    if (data != null) __obj.updateDynamic("data")(data)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction3(destroy))
    if (devicePixelRatio != null) __obj.updateDynamic("devicePixelRatio")(devicePixelRatio)
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty)
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
    if (getBBox != null) __obj.updateDynamic("getBBox")(js.Any.fromFunction2(getBBox))
    if (getBackground != null) __obj.updateDynamic("getBackground")(js.Any.fromFunction0(getBackground))
    if (getBaseCls != null) __obj.updateDynamic("getBaseCls")(js.Any.fromFunction0(getBaseCls))
    if (getBorder != null) __obj.updateDynamic("getBorder")(js.Any.fromFunction0(getBorder))
    if (getBottom != null) __obj.updateDynamic("getBottom")(js.Any.fromFunction0(getBottom))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getCentered != null) __obj.updateDynamic("getCentered")(js.Any.fromFunction0(getCentered))
    if (getCls != null) __obj.updateDynamic("getCls")(js.Any.fromFunction0(getCls))
    if (getContentEl != null) __obj.updateDynamic("getContentEl")(js.Any.fromFunction0(getContentEl))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction0(getData))
    if (getDirty != null) __obj.updateDynamic("getDirty")(js.Any.fromFunction0(getDirty))
    if (getDisabled != null) __obj.updateDynamic("getDisabled")(js.Any.fromFunction0(getDisabled))
    if (getDisabledCls != null) __obj.updateDynamic("getDisabledCls")(js.Any.fromFunction0(getDisabledCls))
    if (getDocked != null) __obj.updateDynamic("getDocked")(js.Any.fromFunction0(getDocked))
    if (getEl != null) __obj.updateDynamic("getEl")(js.Any.fromFunction0(getEl))
    if (getEnterAnimation != null) __obj.updateDynamic("getEnterAnimation")(js.Any.fromFunction0(getEnterAnimation))
    if (getExitAnimation != null) __obj.updateDynamic("getExitAnimation")(js.Any.fromFunction0(getExitAnimation))
    if (getFlex != null) __obj.updateDynamic("getFlex")(js.Any.fromFunction0(getFlex))
    if (getFloatingCls != null) __obj.updateDynamic("getFloatingCls")(js.Any.fromFunction0(getFloatingCls))
    if (getGroup != null) __obj.updateDynamic("getGroup")(js.Any.fromFunction1(getGroup))
    if (getGroups != null) __obj.updateDynamic("getGroups")(js.Any.fromFunction0(getGroups))
    if (getHeight != null) __obj.updateDynamic("getHeight")(js.Any.fromFunction0(getHeight))
    if (getHidden != null) __obj.updateDynamic("getHidden")(js.Any.fromFunction0(getHidden))
    if (getHiddenCls != null) __obj.updateDynamic("getHiddenCls")(js.Any.fromFunction0(getHiddenCls))
    if (getHideAnimation != null) __obj.updateDynamic("getHideAnimation")(js.Any.fromFunction0(getHideAnimation))
    if (getHighPrecision != null) __obj.updateDynamic("getHighPrecision")(js.Any.fromFunction0(getHighPrecision))
    if (getHtml != null) __obj.updateDynamic("getHtml")(js.Any.fromFunction0(getHtml))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getItemId != null) __obj.updateDynamic("getItemId")(js.Any.fromFunction0(getItemId))
    if (getItems != null) __obj.updateDynamic("getItems")(js.Any.fromFunction0(getItems))
    if (getLeft != null) __obj.updateDynamic("getLeft")(js.Any.fromFunction0(getLeft))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getMargin != null) __obj.updateDynamic("getMargin")(js.Any.fromFunction0(getMargin))
    if (getMaxHeight != null) __obj.updateDynamic("getMaxHeight")(js.Any.fromFunction0(getMaxHeight))
    if (getMaxWidth != null) __obj.updateDynamic("getMaxWidth")(js.Any.fromFunction0(getMaxWidth))
    if (getMinHeight != null) __obj.updateDynamic("getMinHeight")(js.Any.fromFunction0(getMinHeight))
    if (getMinWidth != null) __obj.updateDynamic("getMinWidth")(js.Any.fromFunction0(getMinWidth))
    if (getPadding != null) __obj.updateDynamic("getPadding")(js.Any.fromFunction0(getPadding))
    if (getParent != null) __obj.updateDynamic("getParent")(js.Any.fromFunction0(getParent))
    if (getPlugins != null) __obj.updateDynamic("getPlugins")(js.Any.fromFunction0(getPlugins))
    if (getRecord != null) __obj.updateDynamic("getRecord")(js.Any.fromFunction0(getRecord))
    if (getRegion != null) __obj.updateDynamic("getRegion")(js.Any.fromFunction0(getRegion))
    if (getRenderTo != null) __obj.updateDynamic("getRenderTo")(js.Any.fromFunction0(getRenderTo))
    if (getRight != null) __obj.updateDynamic("getRight")(js.Any.fromFunction0(getRight))
    if (getShowAnimation != null) __obj.updateDynamic("getShowAnimation")(js.Any.fromFunction0(getShowAnimation))
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction0(getSize))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction0(getStyle))
    if (getStyleHtmlCls != null) __obj.updateDynamic("getStyleHtmlCls")(js.Any.fromFunction0(getStyleHtmlCls))
    if (getStyleHtmlContent != null) __obj.updateDynamic("getStyleHtmlContent")(js.Any.fromFunction0(getStyleHtmlContent))
    if (getTop != null) __obj.updateDynamic("getTop")(js.Any.fromFunction0(getTop))
    if (getTpl != null) __obj.updateDynamic("getTpl")(js.Any.fromFunction0(getTpl))
    if (getTplWriteMode != null) __obj.updateDynamic("getTplWriteMode")(js.Any.fromFunction0(getTplWriteMode))
    if (getUi != null) __obj.updateDynamic("getUi")(js.Any.fromFunction0(getUi))
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction0(getWidth))
    if (getXTypes != null) __obj.updateDynamic("getXTypes")(js.Any.fromFunction0(getXTypes))
    if (getZIndex != null) __obj.updateDynamic("getZIndex")(js.Any.fromFunction0(getZIndex))
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasParent != null) __obj.updateDynamic("hasParent")(js.Any.fromFunction0(hasParent))
    if (height != null) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hiddenCls != null) __obj.updateDynamic("hiddenCls")(hiddenCls)
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1(hide))
    if (hideAnimation != null) __obj.updateDynamic("hideAnimation")(hideAnimation)
    if (!js.isUndefined(hideOnMaskTap)) __obj.updateDynamic("hideOnMaskTap")(hideOnMaskTap)
    if (!js.isUndefined(highPrecision)) __obj.updateDynamic("highPrecision")(highPrecision)
    if (html != null) __obj.updateDynamic("html")(html)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction0(initialize))
    if (isDisabled != null) __obj.updateDynamic("isDisabled")(js.Any.fromFunction0(isDisabled))
    if (isHidden != null) __obj.updateDynamic("isHidden")(js.Any.fromFunction0(isHidden))
    if (isXType != null) __obj.updateDynamic("isXType")(js.Any.fromFunction2(isXType))
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (items != null) __obj.updateDynamic("items")(items)
    if (!js.isUndefined(layoutOnOrientationChange)) __obj.updateDynamic("layoutOnOrientationChange")(layoutOnOrientationChange)
    if (left != null) __obj.updateDynamic("left")(left)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
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
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction1(onAdd))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (record != null) __obj.updateDynamic("record")(record)
    if (region != null) __obj.updateDynamic("region")(region)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2(remove))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction0(removeAll))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction3(removeCls))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (renderFrame != null) __obj.updateDynamic("renderFrame")(js.Any.fromFunction0(renderFrame))
    if (renderSprite != null) __obj.updateDynamic("renderSprite")(js.Any.fromFunction1(renderSprite))
    if (renderTo != null) __obj.updateDynamic("renderTo")(renderTo)
    if (repaint != null) __obj.updateDynamic("repaint")(js.Any.fromFunction0(repaint))
    if (replaceCls != null) __obj.updateDynamic("replaceCls")(js.Any.fromFunction4(replaceCls))
    if (resetFloating != null) __obj.updateDynamic("resetFloating")(js.Any.fromFunction0(resetFloating))
    if (resetTransform != null) __obj.updateDynamic("resetTransform")(js.Any.fromFunction0(resetTransform))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (right != null) __obj.updateDynamic("right")(right)
    if (roundPixel != null) __obj.updateDynamic("roundPixel")(js.Any.fromFunction1(roundPixel))
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setBackground != null) __obj.updateDynamic("setBackground")(js.Any.fromFunction1(setBackground))
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
    if (setGroups != null) __obj.updateDynamic("setGroups")(js.Any.fromFunction1(setGroups))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setHidden != null) __obj.updateDynamic("setHidden")(js.Any.fromFunction1(setHidden))
    if (setHiddenCls != null) __obj.updateDynamic("setHiddenCls")(js.Any.fromFunction1(setHiddenCls))
    if (setHideAnimation != null) __obj.updateDynamic("setHideAnimation")(js.Any.fromFunction1(setHideAnimation))
    if (setHighPrecision != null) __obj.updateDynamic("setHighPrecision")(js.Any.fromFunction1(setHighPrecision))
    if (setHtml != null) __obj.updateDynamic("setHtml")(js.Any.fromFunction1(setHtml))
    if (setItemId != null) __obj.updateDynamic("setItemId")(js.Any.fromFunction1(setItemId))
    if (setItems != null) __obj.updateDynamic("setItems")(js.Any.fromFunction1(setItems))
    if (setLeft != null) __obj.updateDynamic("setLeft")(js.Any.fromFunction1(setLeft))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setMargin != null) __obj.updateDynamic("setMargin")(js.Any.fromFunction1(setMargin))
    if (setMaxHeight != null) __obj.updateDynamic("setMaxHeight")(js.Any.fromFunction1(setMaxHeight))
    if (setMaxWidth != null) __obj.updateDynamic("setMaxWidth")(js.Any.fromFunction1(setMaxWidth))
    if (setMinHeight != null) __obj.updateDynamic("setMinHeight")(js.Any.fromFunction1(setMinHeight))
    if (setMinWidth != null) __obj.updateDynamic("setMinWidth")(js.Any.fromFunction1(setMinWidth))
    if (setPadding != null) __obj.updateDynamic("setPadding")(js.Any.fromFunction1(setPadding))
    if (setPlugins != null) __obj.updateDynamic("setPlugins")(js.Any.fromFunction1(setPlugins))
    if (setRecord != null) __obj.updateDynamic("setRecord")(js.Any.fromFunction1(setRecord))
    if (setRegion != null) __obj.updateDynamic("setRegion")(js.Any.fromFunction1(setRegion))
    if (setRenderTo != null) __obj.updateDynamic("setRenderTo")(js.Any.fromFunction1(setRenderTo))
    if (setRight != null) __obj.updateDynamic("setRight")(js.Any.fromFunction1(setRight))
    if (setScrollable != null) __obj.updateDynamic("setScrollable")(js.Any.fromFunction0(setScrollable))
    if (setShowAnimation != null) __obj.updateDynamic("setShowAnimation")(js.Any.fromFunction1(setShowAnimation))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2(setSize))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction1(setStyle))
    if (setStyleHtmlCls != null) __obj.updateDynamic("setStyleHtmlCls")(js.Any.fromFunction1(setStyleHtmlCls))
    if (setStyleHtmlContent != null) __obj.updateDynamic("setStyleHtmlContent")(js.Any.fromFunction1(setStyleHtmlContent))
    if (setTop != null) __obj.updateDynamic("setTop")(js.Any.fromFunction1(setTop))
    if (setTpl != null) __obj.updateDynamic("setTpl")(js.Any.fromFunction1(setTpl))
    if (setTplWriteMode != null) __obj.updateDynamic("setTplWriteMode")(js.Any.fromFunction1(setTplWriteMode))
    if (setUi != null) __obj.updateDynamic("setUi")(js.Any.fromFunction1(setUi))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1(setWidth))
    if (setZIndex != null) __obj.updateDynamic("setZIndex")(js.Any.fromFunction1(setZIndex))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    if (showAnimation != null) __obj.updateDynamic("showAnimation")(showAnimation)
    if (showBy != null) __obj.updateDynamic("showBy")(js.Any.fromFunction2(showBy))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
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
    if (waitFor != null) __obj.updateDynamic("waitFor")(js.Any.fromFunction1(waitFor))
    if (width != null) __obj.updateDynamic("width")(width)
    if (xtype != null) __obj.updateDynamic("xtype")(xtype)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISvg]
  }
}

