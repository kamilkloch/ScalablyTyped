package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerProxy
  extends extjsLib.ExtNs.dataNs.proxyNs.IProxy {
  /** [Method] Optional callback function which can be used to clean up after a request has been completed
  		* @param request Ext.data.Request The Request object
  		* @param success Boolean True if the request was successful
  		*/
  var afterRequest: js.UndefOr[
    js.Function2[
      /* request */ js.UndefOr[IRequest], 
      /* success */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Object) */
  var api: js.UndefOr[js.Any] = js.undefined
  /** [Method] Creates an Request object from Operation
  		* @param operation Ext.data.Operation The operation to execute
  		* @returns Ext.data.Request The request object
  		*/
  var buildRequest: js.UndefOr[js.Function1[/* operation */ js.UndefOr[IOperation], IRequest]] = js.undefined
  /** [Method] Generates a url based on a given Ext data Request object
  		* @param request Ext.data.Request The request object
  		* @returns String The url
  		*/
  var buildUrl: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], java.lang.String]] = js.undefined
  /** [Config Option] (String) */
  var cacheString: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] in a ServerProxy all four CRUD operations are executed in the same manner so we delegate to doRequest in each case */
  @JSName("create")
  var create_IServerProxy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Performs the given destroy operation  */
  @JSName("destroy")
  var destroy_IServerProxy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var directionParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] In ServerProxy subclasses the create read update and destroy methods all pass through to doRequest
  		* @param operation Ext.data.Operation The Ext.data.Operation object
  		* @param callback Function The callback function to call when the Operation has completed
  		* @param scope Object The scope in which to execute the callback
  		*/
  var doRequest: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Encodes the array of Ext util Filter objects into a string to be sent in the request url
  		* @param filters Ext.util.Filter[] The array of Filter objects
  		* @returns String The encoded filters
  		*/
  var encodeFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[extjsLib.ExtNs.Array], java.lang.String]] = js.undefined
  /** [Method] Encodes the array of Ext util Sorter objects into a string to be sent in the request url
  		* @param sorters Ext.util.Sorter[] The array of Sorter objects
  		* @returns String The encoded sorters
  		*/
  var encodeSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[extjsLib.ExtNs.Array], java.lang.String]] = js.undefined
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var filterParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var groupDirectionParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var groupParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var idParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var limitParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var noCache: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var pageParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Performs the given read operation  */
  @JSName("read")
  var read_IServerProxy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Sets a value in the underlying extraParams
  		* @param name String The key for the new value
  		* @param value Object The value
  		*/
  var setExtraParam: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var simpleGroupMode: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var simpleSortMode: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var sortParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var startParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Performs the given update operation  */
  @JSName("update")
  var update_IServerProxy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object IServerProxy {
  @scala.inline
  def apply(
    addEvents: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    afterRequest: (/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    api: js.Any = null,
    batch: /* options */ js.UndefOr[js.Any] => IBatch = null,
    batchActions: js.UndefOr[scala.Boolean] = js.undefined,
    batchOrder: java.lang.String = null,
    buildRequest: /* operation */ js.UndefOr[IOperation] => IRequest = null,
    buildUrl: /* request */ js.UndefOr[IRequest] => java.lang.String = null,
    cacheString: java.lang.String = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => scala.Unit = null,
    clearManagedListeners: () => scala.Unit = null,
    config: js.Any = null,
    create: () => scala.Unit = null,
    destroy: () => scala.Unit = null,
    directionParam: java.lang.String = null,
    doRequest: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    encodeFilters: /* filters */ js.UndefOr[extjsLib.ExtNs.Array] => java.lang.String = null,
    encodeSorters: /* sorters */ js.UndefOr[extjsLib.ExtNs.Array] => java.lang.String = null,
    extend: java.lang.String = null,
    extraParams: js.Any = null,
    filterParam: java.lang.String = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => scala.Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[extjsLib.ExtNs.Array]) => scala.Boolean = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getModel: () => IModel = null,
    getReader: () => extjsLib.ExtNs.dataNs.readerNs.IReader = null,
    getWriter: () => extjsLib.ExtNs.dataNs.writerNs.IWriter = null,
    groupDirectionParam: java.lang.String = null,
    groupParam: java.lang.String = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    hasListeners: js.Any = null,
    idParam: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IServerProxy = null,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    isProxy: js.UndefOr[scala.Boolean] = js.undefined,
    isSynchronous: js.UndefOr[scala.Boolean] = js.undefined,
    limitParam: java.lang.String = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    model: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    noCache: js.UndefOr[scala.Boolean] = js.undefined,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    pageParam: java.lang.String = null,
    read: () => scala.Unit = null,
    reader: js.Any = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[extjsLib.ExtNs.Array], /* prefix */ js.UndefOr[java.lang.String]) => _ = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    requires: extjsLib.ExtNs.Array = null,
    resumeEvent: /* repeated */ js.Any => scala.Unit = null,
    resumeEvents: () => scala.Unit = null,
    self: extjsLib.ExtNs.IClass = null,
    setExtraParam: (/* name */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any]) => scala.Unit = null,
    setModel: (/* model */ js.UndefOr[js.Any], /* setOnStore */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    setReader: /* reader */ js.UndefOr[js.Any] => extjsLib.ExtNs.dataNs.readerNs.IReader = null,
    setWriter: /* writer */ js.UndefOr[js.Any] => extjsLib.ExtNs.dataNs.writerNs.IWriter = null,
    simpleGroupMode: js.UndefOr[scala.Boolean] = js.undefined,
    simpleSortMode: js.UndefOr[scala.Boolean] = js.undefined,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sortParam: java.lang.String = null,
    startParam: java.lang.String = null,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => scala.Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    timeout: scala.Int | scala.Double = null,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    update: () => scala.Unit = null,
    url: java.lang.String = null,
    uses: extjsLib.ExtNs.Array = null,
    writer: js.Any = null
  ): IServerProxy = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (afterRequest != null) __obj.updateDynamic("afterRequest")(js.Any.fromFunction2(afterRequest))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (api != null) __obj.updateDynamic("api")(api)
    if (batch != null) __obj.updateDynamic("batch")(js.Any.fromFunction1(batch))
    if (!js.isUndefined(batchActions)) __obj.updateDynamic("batchActions")(batchActions)
    if (batchOrder != null) __obj.updateDynamic("batchOrder")(batchOrder)
    if (buildRequest != null) __obj.updateDynamic("buildRequest")(js.Any.fromFunction1(buildRequest))
    if (buildUrl != null) __obj.updateDynamic("buildUrl")(js.Any.fromFunction1(buildUrl))
    if (cacheString != null) __obj.updateDynamic("cacheString")(cacheString)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction0(create))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (directionParam != null) __obj.updateDynamic("directionParam")(directionParam)
    if (doRequest != null) __obj.updateDynamic("doRequest")(js.Any.fromFunction3(doRequest))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (encodeFilters != null) __obj.updateDynamic("encodeFilters")(js.Any.fromFunction1(encodeFilters))
    if (encodeSorters != null) __obj.updateDynamic("encodeSorters")(js.Any.fromFunction1(encodeSorters))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (extraParams != null) __obj.updateDynamic("extraParams")(extraParams)
    if (filterParam != null) __obj.updateDynamic("filterParam")(filterParam)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getModel != null) __obj.updateDynamic("getModel")(js.Any.fromFunction0(getModel))
    if (getReader != null) __obj.updateDynamic("getReader")(js.Any.fromFunction0(getReader))
    if (getWriter != null) __obj.updateDynamic("getWriter")(js.Any.fromFunction0(getWriter))
    if (groupDirectionParam != null) __obj.updateDynamic("groupDirectionParam")(groupDirectionParam)
    if (groupParam != null) __obj.updateDynamic("groupParam")(groupParam)
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (idParam != null) __obj.updateDynamic("idParam")(idParam)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (!js.isUndefined(isProxy)) __obj.updateDynamic("isProxy")(isProxy)
    if (!js.isUndefined(isSynchronous)) __obj.updateDynamic("isSynchronous")(isSynchronous)
    if (limitParam != null) __obj.updateDynamic("limitParam")(limitParam)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (model != null) __obj.updateDynamic("model")(model)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache)
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (pageParam != null) __obj.updateDynamic("pageParam")(pageParam)
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction0(read))
    if (reader != null) __obj.updateDynamic("reader")(reader)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setExtraParam != null) __obj.updateDynamic("setExtraParam")(js.Any.fromFunction2(setExtraParam))
    if (setModel != null) __obj.updateDynamic("setModel")(js.Any.fromFunction2(setModel))
    if (setReader != null) __obj.updateDynamic("setReader")(js.Any.fromFunction1(setReader))
    if (setWriter != null) __obj.updateDynamic("setWriter")(js.Any.fromFunction1(setWriter))
    if (!js.isUndefined(simpleGroupMode)) __obj.updateDynamic("simpleGroupMode")(simpleGroupMode)
    if (!js.isUndefined(simpleSortMode)) __obj.updateDynamic("simpleSortMode")(simpleSortMode)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sortParam != null) __obj.updateDynamic("sortParam")(sortParam)
    if (startParam != null) __obj.updateDynamic("startParam")(startParam)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction0(update))
    if (url != null) __obj.updateDynamic("url")(url)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (writer != null) __obj.updateDynamic("writer")(writer)
    __obj.asInstanceOf[IServerProxy]
  }
}

