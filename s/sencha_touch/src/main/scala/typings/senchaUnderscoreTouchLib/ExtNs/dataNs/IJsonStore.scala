package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonStore extends IStore

object IJsonStore {
  @scala.inline
  def apply(
    add: /* model */ js.UndefOr[js.Any] => senchaUnderscoreTouchLib.ExtNs.Array = null,
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    addData: /* data */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => scala.Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    applyData: /* data */ js.UndefOr[js.Any] => scala.Unit = null,
    autoLoad: js.Any = null,
    autoSync: js.UndefOr[scala.Boolean] = js.undefined,
    average: /* field */ js.UndefOr[java.lang.String] => scala.Double = null,
    bubbleEvents: js.Any = null,
    buffered: js.UndefOr[scala.Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearFilter: /* suppressEvent */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    clearListeners: () => scala.Unit = null,
    clearOnPageLoad: js.UndefOr[scala.Boolean] = js.undefined,
    config: js.Any = null,
    currentPage: scala.Int | scala.Double = null,
    data: js.Any = null,
    destroy: () => scala.Unit = null,
    destroyRemovedRecords: js.UndefOr[scala.Boolean] = js.undefined,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => scala.Unit = null,
    extend: java.lang.String = null,
    fields: js.Any = null,
    filter: (/* filters */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String], /* anyMatch */ js.UndefOr[scala.Boolean], /* caseSensitive */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    filterBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    filters: senchaUnderscoreTouchLib.ExtNs.Array = null,
    find: (/* fieldName */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[scala.Double], /* anyMatch */ js.UndefOr[scala.Boolean], /* caseSensitive */ js.UndefOr[scala.Boolean], /* exactMatch */ js.UndefOr[scala.Boolean]) => scala.Double = null,
    findBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[scala.Double]) => scala.Double = null,
    findExact: (/* fieldName */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[scala.Double]) => scala.Double = null,
    findRecord: (/* fieldName */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[scala.Double], /* anyMatch */ js.UndefOr[scala.Boolean], /* caseSensitive */ js.UndefOr[scala.Boolean], /* exactMatch */ js.UndefOr[scala.Boolean]) => IModel = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => scala.Boolean = null,
    first: () => _ = null,
    getAllCount: () => scala.Double = null,
    getAt: /* index */ js.UndefOr[scala.Double] => _ = null,
    getAutoLoad: () => _ = null,
    getAutoSync: () => scala.Boolean = null,
    getBubbleEvents: () => _ = null,
    getBuffered: () => scala.Boolean = null,
    getById: /* id */ js.UndefOr[java.lang.String] => _ = null,
    getClearOnPageLoad: () => scala.Boolean = null,
    getCount: () => scala.Double = null,
    getData: () => _ = null,
    getDestroyRemovedRecords: () => scala.Boolean = null,
    getFields: () => _ = null,
    getGetGroupString: () => _ = null,
    getGroupDir: () => java.lang.String = null,
    getGroupField: () => java.lang.String = null,
    getGroupString: js.Any = null,
    getGrouper: () => _ = null,
    getGroups: /* groupName */ js.UndefOr[java.lang.String] => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getListeners: () => _ = null,
    getModel: () => java.lang.String = null,
    getModelDefaults: () => _ = null,
    getNewRecords: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getPageSize: () => scala.Double = null,
    getParams: () => _ = null,
    getPlugins: () => _ = null,
    getProxy: () => _ = null,
    getRange: (/* startIndex */ js.UndefOr[scala.Double], /* endIndex */ js.UndefOr[scala.Double]) => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getRemoteFilter: () => scala.Boolean = null,
    getRemoteGroup: () => scala.Boolean = null,
    getRemoteSort: () => scala.Boolean = null,
    getRemovedRecords: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getStoreId: () => java.lang.String = null,
    getSyncRemovedRecords: () => scala.Boolean = null,
    getTotalCount: () => scala.Double = null,
    getUpdatedRecords: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    groupDir: java.lang.String = null,
    groupField: java.lang.String = null,
    grouper: js.Any = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    indexOf: /* record */ js.UndefOr[IModel] => scala.Double = null,
    indexOfId: /* id */ js.UndefOr[java.lang.String] => scala.Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    insert: (/* index */ js.UndefOr[scala.Double], /* records */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array]) => _ = null,
    isAutoLoading: () => scala.Boolean = null,
    isFiltered: () => scala.Boolean = null,
    isGrouped: () => scala.Boolean = null,
    isLoaded: () => scala.Boolean = null,
    isLoading: () => scala.Boolean = null,
    isSorted: () => scala.Boolean = null,
    last: () => _ = null,
    listeners: js.Any = null,
    load: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    loadData: (/* data */ js.UndefOr[js.Any], /* append */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    loadPage: (/* page */ js.UndefOr[scala.Double], /* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    loadRecords: /* model */ js.UndefOr[js.Any] => senchaUnderscoreTouchLib.ExtNs.Array = null,
    max: /* field */ js.UndefOr[java.lang.String] => _ = null,
    min: /* field */ js.UndefOr[java.lang.String] => _ = null,
    mixins: js.Any = null,
    model: java.lang.String = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    nextPage: /* options */ js.UndefOr[js.Any] => scala.Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    pageSize: scala.Int | scala.Double = null,
    params: js.Any = null,
    platformConfig: js.Any = null,
    plugins: js.Any = null,
    previousPage: /* options */ js.UndefOr[js.Any] => scala.Unit = null,
    proxy: js.Any = null,
    queryBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => senchaUnderscoreTouchLib.ExtNs.utilNs.IMixedCollection = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable = null,
    remoteFilter: js.UndefOr[scala.Boolean] = js.undefined,
    remoteGroup: js.UndefOr[scala.Boolean] = js.undefined,
    remoteSort: js.UndefOr[scala.Boolean] = js.undefined,
    remove: /* records */ js.UndefOr[js.Any] => scala.Unit = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeAll: /* silent */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    removeAt: /* index */ js.UndefOr[scala.Double] => scala.Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAutoLoad: /* autoLoad */ js.UndefOr[js.Any] => scala.Unit = null,
    setAutoSync: /* autoSync */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => scala.Unit = null,
    setBuffered: /* buffered */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setClearOnPageLoad: /* clearOnPageLoad */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setData: /* data */ js.UndefOr[js.Any] => scala.Unit = null,
    setDestroyRemovedRecords: /* destroyRemovedRecords */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setFields: /* fields */ js.UndefOr[js.Any] => _ = null,
    setFilters: /* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => scala.Unit = null,
    setGetGroupString: /* getGroupString */ js.UndefOr[js.Any] => scala.Unit = null,
    setGroupDir: /* groupDir */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setGroupField: /* groupField */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setGrouper: /* grouper */ js.UndefOr[js.Any] => scala.Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => scala.Unit = null,
    setModel: /* model */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setModelDefaults: /* modelDefaults */ js.UndefOr[js.Any] => scala.Unit = null,
    setPageSize: /* pageSize */ js.UndefOr[scala.Double] => scala.Unit = null,
    setParams: /* params */ js.UndefOr[js.Any] => scala.Unit = null,
    setPlugins: /* plugins */ js.UndefOr[js.Any] => scala.Unit = null,
    setProxy: /* proxy */ js.UndefOr[js.Any] => scala.Unit = null,
    setRemoteFilter: /* remoteFilter */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setRemoteGroup: /* remoteGroup */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setRemoteSort: /* remoteSort */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setSorters: /* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => scala.Unit = null,
    setStoreId: /* storeId */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setSyncRemovedRecords: /* syncRemovedRecords */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setTotalCount: /* totalCount */ js.UndefOr[scala.Double] => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sort: (/* sorters */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[java.lang.String], /* where */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    sorters: senchaUnderscoreTouchLib.ExtNs.Array = null,
    statics: js.Any = null,
    storeId: java.lang.String = null,
    sum: /* field */ js.UndefOr[java.lang.String] => scala.Double = null,
    suspendEvents: () => scala.Unit = null,
    sync: /* options */ js.UndefOr[js.Any] => _ = null,
    syncRemovedRecords: js.UndefOr[scala.Boolean] = js.undefined,
    totalCount: scala.Int | scala.Double = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => scala.Unit = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IJsonStore = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1(add))
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addData != null) __obj.updateDynamic("addData")(js.Any.fromFunction1(addData))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (applyData != null) __obj.updateDynamic("applyData")(js.Any.fromFunction1(applyData))
    if (autoLoad != null) __obj.updateDynamic("autoLoad")(autoLoad)
    if (!js.isUndefined(autoSync)) __obj.updateDynamic("autoSync")(autoSync)
    if (average != null) __obj.updateDynamic("average")(js.Any.fromFunction1(average))
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (!js.isUndefined(buffered)) __obj.updateDynamic("buffered")(buffered)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearFilter != null) __obj.updateDynamic("clearFilter")(js.Any.fromFunction1(clearFilter))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (!js.isUndefined(clearOnPageLoad)) __obj.updateDynamic("clearOnPageLoad")(clearOnPageLoad)
    if (config != null) __obj.updateDynamic("config")(config)
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(destroyRemovedRecords)) __obj.updateDynamic("destroyRemovedRecords")(destroyRemovedRecords)
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2(each))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction4(filter))
    if (filterBy != null) __obj.updateDynamic("filterBy")(js.Any.fromFunction2(filterBy))
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (find != null) __obj.updateDynamic("find")(js.Any.fromFunction6(find))
    if (findBy != null) __obj.updateDynamic("findBy")(js.Any.fromFunction3(findBy))
    if (findExact != null) __obj.updateDynamic("findExact")(js.Any.fromFunction3(findExact))
    if (findRecord != null) __obj.updateDynamic("findRecord")(js.Any.fromFunction6(findRecord))
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction0(first))
    if (getAllCount != null) __obj.updateDynamic("getAllCount")(js.Any.fromFunction0(getAllCount))
    if (getAt != null) __obj.updateDynamic("getAt")(js.Any.fromFunction1(getAt))
    if (getAutoLoad != null) __obj.updateDynamic("getAutoLoad")(js.Any.fromFunction0(getAutoLoad))
    if (getAutoSync != null) __obj.updateDynamic("getAutoSync")(js.Any.fromFunction0(getAutoSync))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getBuffered != null) __obj.updateDynamic("getBuffered")(js.Any.fromFunction0(getBuffered))
    if (getById != null) __obj.updateDynamic("getById")(js.Any.fromFunction1(getById))
    if (getClearOnPageLoad != null) __obj.updateDynamic("getClearOnPageLoad")(js.Any.fromFunction0(getClearOnPageLoad))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getData != null) __obj.updateDynamic("getData")(js.Any.fromFunction0(getData))
    if (getDestroyRemovedRecords != null) __obj.updateDynamic("getDestroyRemovedRecords")(js.Any.fromFunction0(getDestroyRemovedRecords))
    if (getFields != null) __obj.updateDynamic("getFields")(js.Any.fromFunction0(getFields))
    if (getGetGroupString != null) __obj.updateDynamic("getGetGroupString")(js.Any.fromFunction0(getGetGroupString))
    if (getGroupDir != null) __obj.updateDynamic("getGroupDir")(js.Any.fromFunction0(getGroupDir))
    if (getGroupField != null) __obj.updateDynamic("getGroupField")(js.Any.fromFunction0(getGroupField))
    if (getGroupString != null) __obj.updateDynamic("getGroupString")(getGroupString)
    if (getGrouper != null) __obj.updateDynamic("getGrouper")(js.Any.fromFunction0(getGrouper))
    if (getGroups != null) __obj.updateDynamic("getGroups")(js.Any.fromFunction1(getGroups))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getModel != null) __obj.updateDynamic("getModel")(js.Any.fromFunction0(getModel))
    if (getModelDefaults != null) __obj.updateDynamic("getModelDefaults")(js.Any.fromFunction0(getModelDefaults))
    if (getNewRecords != null) __obj.updateDynamic("getNewRecords")(js.Any.fromFunction0(getNewRecords))
    if (getPageSize != null) __obj.updateDynamic("getPageSize")(js.Any.fromFunction0(getPageSize))
    if (getParams != null) __obj.updateDynamic("getParams")(js.Any.fromFunction0(getParams))
    if (getPlugins != null) __obj.updateDynamic("getPlugins")(js.Any.fromFunction0(getPlugins))
    if (getProxy != null) __obj.updateDynamic("getProxy")(js.Any.fromFunction0(getProxy))
    if (getRange != null) __obj.updateDynamic("getRange")(js.Any.fromFunction2(getRange))
    if (getRemoteFilter != null) __obj.updateDynamic("getRemoteFilter")(js.Any.fromFunction0(getRemoteFilter))
    if (getRemoteGroup != null) __obj.updateDynamic("getRemoteGroup")(js.Any.fromFunction0(getRemoteGroup))
    if (getRemoteSort != null) __obj.updateDynamic("getRemoteSort")(js.Any.fromFunction0(getRemoteSort))
    if (getRemovedRecords != null) __obj.updateDynamic("getRemovedRecords")(js.Any.fromFunction0(getRemovedRecords))
    if (getStoreId != null) __obj.updateDynamic("getStoreId")(js.Any.fromFunction0(getStoreId))
    if (getSyncRemovedRecords != null) __obj.updateDynamic("getSyncRemovedRecords")(js.Any.fromFunction0(getSyncRemovedRecords))
    if (getTotalCount != null) __obj.updateDynamic("getTotalCount")(js.Any.fromFunction0(getTotalCount))
    if (getUpdatedRecords != null) __obj.updateDynamic("getUpdatedRecords")(js.Any.fromFunction0(getUpdatedRecords))
    if (groupDir != null) __obj.updateDynamic("groupDir")(groupDir)
    if (groupField != null) __obj.updateDynamic("groupField")(groupField)
    if (grouper != null) __obj.updateDynamic("grouper")(grouper)
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1(indexOf))
    if (indexOfId != null) __obj.updateDynamic("indexOfId")(js.Any.fromFunction1(indexOfId))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction2(insert))
    if (isAutoLoading != null) __obj.updateDynamic("isAutoLoading")(js.Any.fromFunction0(isAutoLoading))
    if (isFiltered != null) __obj.updateDynamic("isFiltered")(js.Any.fromFunction0(isFiltered))
    if (isGrouped != null) __obj.updateDynamic("isGrouped")(js.Any.fromFunction0(isGrouped))
    if (isLoaded != null) __obj.updateDynamic("isLoaded")(js.Any.fromFunction0(isLoaded))
    if (isLoading != null) __obj.updateDynamic("isLoading")(js.Any.fromFunction0(isLoading))
    if (isSorted != null) __obj.updateDynamic("isSorted")(js.Any.fromFunction0(isSorted))
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction0(last))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction2(load))
    if (loadData != null) __obj.updateDynamic("loadData")(js.Any.fromFunction2(loadData))
    if (loadPage != null) __obj.updateDynamic("loadPage")(js.Any.fromFunction3(loadPage))
    if (loadRecords != null) __obj.updateDynamic("loadRecords")(js.Any.fromFunction1(loadRecords))
    if (max != null) __obj.updateDynamic("max")(js.Any.fromFunction1(max))
    if (min != null) __obj.updateDynamic("min")(js.Any.fromFunction1(min))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (model != null) __obj.updateDynamic("model")(model)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (nextPage != null) __obj.updateDynamic("nextPage")(js.Any.fromFunction1(nextPage))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (previousPage != null) __obj.updateDynamic("previousPage")(js.Any.fromFunction1(previousPage))
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (queryBy != null) __obj.updateDynamic("queryBy")(js.Any.fromFunction2(queryBy))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (!js.isUndefined(remoteFilter)) __obj.updateDynamic("remoteFilter")(remoteFilter)
    if (!js.isUndefined(remoteGroup)) __obj.updateDynamic("remoteGroup")(remoteGroup)
    if (!js.isUndefined(remoteSort)) __obj.updateDynamic("remoteSort")(remoteSort)
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1(removeAll))
    if (removeAt != null) __obj.updateDynamic("removeAt")(js.Any.fromFunction1(removeAt))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAutoLoad != null) __obj.updateDynamic("setAutoLoad")(js.Any.fromFunction1(setAutoLoad))
    if (setAutoSync != null) __obj.updateDynamic("setAutoSync")(js.Any.fromFunction1(setAutoSync))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setBuffered != null) __obj.updateDynamic("setBuffered")(js.Any.fromFunction1(setBuffered))
    if (setClearOnPageLoad != null) __obj.updateDynamic("setClearOnPageLoad")(js.Any.fromFunction1(setClearOnPageLoad))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction1(setData))
    if (setDestroyRemovedRecords != null) __obj.updateDynamic("setDestroyRemovedRecords")(js.Any.fromFunction1(setDestroyRemovedRecords))
    if (setFields != null) __obj.updateDynamic("setFields")(js.Any.fromFunction1(setFields))
    if (setFilters != null) __obj.updateDynamic("setFilters")(js.Any.fromFunction1(setFilters))
    if (setGetGroupString != null) __obj.updateDynamic("setGetGroupString")(js.Any.fromFunction1(setGetGroupString))
    if (setGroupDir != null) __obj.updateDynamic("setGroupDir")(js.Any.fromFunction1(setGroupDir))
    if (setGroupField != null) __obj.updateDynamic("setGroupField")(js.Any.fromFunction1(setGroupField))
    if (setGrouper != null) __obj.updateDynamic("setGrouper")(js.Any.fromFunction1(setGrouper))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setModel != null) __obj.updateDynamic("setModel")(js.Any.fromFunction1(setModel))
    if (setModelDefaults != null) __obj.updateDynamic("setModelDefaults")(js.Any.fromFunction1(setModelDefaults))
    if (setPageSize != null) __obj.updateDynamic("setPageSize")(js.Any.fromFunction1(setPageSize))
    if (setParams != null) __obj.updateDynamic("setParams")(js.Any.fromFunction1(setParams))
    if (setPlugins != null) __obj.updateDynamic("setPlugins")(js.Any.fromFunction1(setPlugins))
    if (setProxy != null) __obj.updateDynamic("setProxy")(js.Any.fromFunction1(setProxy))
    if (setRemoteFilter != null) __obj.updateDynamic("setRemoteFilter")(js.Any.fromFunction1(setRemoteFilter))
    if (setRemoteGroup != null) __obj.updateDynamic("setRemoteGroup")(js.Any.fromFunction1(setRemoteGroup))
    if (setRemoteSort != null) __obj.updateDynamic("setRemoteSort")(js.Any.fromFunction1(setRemoteSort))
    if (setSorters != null) __obj.updateDynamic("setSorters")(js.Any.fromFunction1(setSorters))
    if (setStoreId != null) __obj.updateDynamic("setStoreId")(js.Any.fromFunction1(setStoreId))
    if (setSyncRemovedRecords != null) __obj.updateDynamic("setSyncRemovedRecords")(js.Any.fromFunction1(setSyncRemovedRecords))
    if (setTotalCount != null) __obj.updateDynamic("setTotalCount")(js.Any.fromFunction1(setTotalCount))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction3(sort))
    if (sorters != null) __obj.updateDynamic("sorters")(sorters)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (storeId != null) __obj.updateDynamic("storeId")(storeId)
    if (sum != null) __obj.updateDynamic("sum")(js.Any.fromFunction1(sum))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (sync != null) __obj.updateDynamic("sync")(js.Any.fromFunction1(sync))
    if (!js.isUndefined(syncRemovedRecords)) __obj.updateDynamic("syncRemovedRecords")(syncRemovedRecords)
    if (totalCount != null) __obj.updateDynamic("totalCount")(totalCount.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IJsonStore]
  }
}

