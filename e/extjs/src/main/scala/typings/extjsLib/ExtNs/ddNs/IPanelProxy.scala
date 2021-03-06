package typings
package extjsLib.ExtNs.ddNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelProxy
  extends extjsLib.ExtNs.IBase {
  /** [Method] Gets the proxy s element
  		* @returns Ext.Element The proxy's element
  		*/
  var getEl: js.UndefOr[js.Function0[extjsLib.ExtNs.IElement]] = js.undefined
  /** [Method] Gets the proxy s ghost Panel
  		* @returns Ext.panel.Panel The proxy's ghost Panel
  		*/
  var getGhost: js.UndefOr[js.Function0[extjsLib.ExtNs.panelNs.IPanel]] = js.undefined
  /** [Method] Gets the proxy element
  		* @returns Ext.Element The proxy's element
  		*/
  var getProxy: js.UndefOr[js.Function0[extjsLib.ExtNs.IElement]] = js.undefined
  /** [Method] Hides the proxy */
  var hide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var insertProxy: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var moveOnDrag: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Moves the proxy to a different position in the DOM
  		* @param parentNode HTMLElement The proxy's parent DOM node
  		* @param before HTMLElement The sibling node before which the proxy should be inserted. Defaults to the parent's last child if not specified.
  		*/
  var moveProxy: js.UndefOr[
    js.Function2[
      /* parentNode */ js.UndefOr[stdLib.HTMLElement], 
      /* before */ js.UndefOr[stdLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (Ext.panel.Panel) */
  var panel: js.UndefOr[extjsLib.ExtNs.panelNs.IPanel] = js.undefined
  /** [Method] Shows the proxy */
  var show: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IPanelProxy {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    getEl: () => extjsLib.ExtNs.IElement = null,
    getGhost: () => extjsLib.ExtNs.panelNs.IPanel = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getProxy: () => extjsLib.ExtNs.IElement = null,
    hide: () => scala.Unit = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IPanelProxy = null,
    insertProxy: js.UndefOr[scala.Boolean] = js.undefined,
    mixins: js.Any = null,
    moveOnDrag: js.UndefOr[scala.Boolean] = js.undefined,
    moveProxy: (/* parentNode */ js.UndefOr[stdLib.HTMLElement], /* before */ js.UndefOr[stdLib.HTMLElement]) => scala.Unit = null,
    panel: extjsLib.ExtNs.panelNs.IPanel = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    show: () => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): IPanelProxy = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getEl != null) __obj.updateDynamic("getEl")(js.Any.fromFunction0(getEl))
    if (getGhost != null) __obj.updateDynamic("getGhost")(js.Any.fromFunction0(getGhost))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getProxy != null) __obj.updateDynamic("getProxy")(js.Any.fromFunction0(getProxy))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(insertProxy)) __obj.updateDynamic("insertProxy")(insertProxy)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (!js.isUndefined(moveOnDrag)) __obj.updateDynamic("moveOnDrag")(moveOnDrag)
    if (moveProxy != null) __obj.updateDynamic("moveProxy")(js.Any.fromFunction2(moveProxy))
    if (panel != null) __obj.updateDynamic("panel")(panel)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IPanelProxy]
  }
}

