package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBatch
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Adds a new operation to this batch at the end of the operations array
  		* @param operation Object The Operation object
  		* @returns Ext.data.Batch this
  		*/
  var add: js.UndefOr[js.Function1[/* operation */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Number) */
  var current: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Ext.data.Operation[]) */
  var exceptions: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Property] (Boolean) */
  var hasException: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isComplete: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isRunning: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Ext.data.Operation[]) */
  var operations: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Method] Pauses execution of the batch but does not cancel the current operation
  		* @returns Ext.data.Batch this
  		*/
  var pause: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var pauseOnException: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Kicks off execution of the batch continuing from the current operation
  		* @returns Ext.data.Batch this
  		*/
  var retry: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Executes an operation by its numeric index in the operations array
  		* @param index Number The operation index to run
  		* @returns Ext.data.Batch this
  		*/
  var runOperation: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], this.type]] = js.undefined
  /** [Method] Kicks off execution of the batch continuing from the next operation if the previous operation encountered an excepti
  		* @param index Object
  		* @returns Ext.data.Batch this
  		*/
  var start: js.UndefOr[js.Function1[/* index */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Property] (Number) */
  var total: js.UndefOr[scala.Double] = js.undefined
}

object IBatch {
  @scala.inline
  def apply(
    add: /* operation */ js.UndefOr[js.Any] => IBatch = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    autoStart: js.UndefOr[scala.Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => scala.Unit = null,
    clearManagedListeners: () => scala.Unit = null,
    config: js.Any = null,
    current: scala.Int | scala.Double = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => scala.Unit = null,
    exceptions: extjsLib.ExtNs.Array = null,
    extend: java.lang.String = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => scala.Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[extjsLib.ExtNs.Array]) => scala.Boolean = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    hasException: js.UndefOr[scala.Boolean] = js.undefined,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    hasListeners: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IBatch = null,
    isComplete: js.UndefOr[scala.Boolean] = js.undefined,
    isObservable: js.UndefOr[scala.Boolean] = js.undefined,
    isRunning: js.UndefOr[scala.Boolean] = js.undefined,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    operations: extjsLib.ExtNs.Array = null,
    pause: () => IBatch = null,
    pauseOnException: js.UndefOr[scala.Boolean] = js.undefined,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[extjsLib.ExtNs.Array], /* prefix */ js.UndefOr[java.lang.String]) => _ = null,
    removeListener: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    requires: extjsLib.ExtNs.Array = null,
    resumeEvent: /* repeated */ js.Any => scala.Unit = null,
    resumeEvents: () => scala.Unit = null,
    retry: () => IBatch = null,
    runOperation: /* index */ js.UndefOr[scala.Double] => IBatch = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    start: /* index */ js.UndefOr[js.Any] => IBatch = null,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => scala.Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    total: scala.Int | scala.Double = null,
    un: (/* eventName */ js.UndefOr[java.lang.String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => scala.Unit = null,
    uses: extjsLib.ExtNs.Array = null
  ): IBatch = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1(add))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (exceptions != null) __obj.updateDynamic("exceptions")(exceptions)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (!js.isUndefined(hasException)) __obj.updateDynamic("hasException")(hasException)
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isComplete)) __obj.updateDynamic("isComplete")(isComplete)
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable)
    if (!js.isUndefined(isRunning)) __obj.updateDynamic("isRunning")(isRunning)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (operations != null) __obj.updateDynamic("operations")(operations)
    if (pause != null) __obj.updateDynamic("pause")(js.Any.fromFunction0(pause))
    if (!js.isUndefined(pauseOnException)) __obj.updateDynamic("pauseOnException")(pauseOnException)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (retry != null) __obj.updateDynamic("retry")(js.Any.fromFunction0(retry))
    if (runOperation != null) __obj.updateDynamic("runOperation")(js.Any.fromFunction1(runOperation))
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IBatch]
  }
}

