package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResultSet
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Config Option] (Number) */
  var count: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Returns the value of count
  		* @returns Number
  		*/
  var getCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of loaded
  		* @returns Boolean
  		*/
  var getLoaded: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of message
  		* @returns String
  		*/
  var getMessage: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of records
  		* @returns Ext.data.Model[]
  		*/
  var getRecords: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the value of success
  		* @returns Boolean
  		*/
  var getSuccess: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of total
  		* @returns Number
  		*/
  var getTotal: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Boolean) */
  var loaded: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.data.Model[]) */
  var records: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Sets the value of count
  		* @param count Number The new value.
  		*/
  var setCount: js.UndefOr[js.Function1[/* count */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of loaded
  		* @param loaded Boolean The new value.
  		*/
  var setLoaded: js.UndefOr[js.Function1[/* loaded */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of message
  		* @param message String The new value.
  		*/
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of records
  		* @param records Ext.data.Model[] The new value.
  		*/
  var setRecords: js.UndefOr[
    js.Function1[/* records */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of success
  		* @param success Boolean The new value.
  		*/
  var setSuccess: js.UndefOr[js.Function1[/* success */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of total
  		* @param total Number The new value.
  		*/
  var setTotal: js.UndefOr[js.Function1[/* total */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var success: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var total: js.UndefOr[scala.Double] = js.undefined
}

object IResultSet {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    count: scala.Int | scala.Double = null,
    destroy: () => scala.Unit = null,
    extend: java.lang.String = null,
    getCount: () => scala.Double = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getLoaded: () => scala.Boolean = null,
    getMessage: () => java.lang.String = null,
    getRecords: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getSuccess: () => scala.Boolean = null,
    getTotal: () => scala.Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    loaded: js.UndefOr[scala.Boolean] = js.undefined,
    message: java.lang.String = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    records: senchaUnderscoreTouchLib.ExtNs.Array = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setCount: /* count */ js.UndefOr[scala.Double] => scala.Unit = null,
    setLoaded: /* loaded */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setMessage: /* message */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setRecords: /* records */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => scala.Unit = null,
    setSuccess: /* success */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    setTotal: /* total */ js.UndefOr[scala.Double] => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    success: js.UndefOr[scala.Boolean] = js.undefined,
    total: scala.Int | scala.Double = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IResultSet = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLoaded != null) __obj.updateDynamic("getLoaded")(js.Any.fromFunction0(getLoaded))
    if (getMessage != null) __obj.updateDynamic("getMessage")(js.Any.fromFunction0(getMessage))
    if (getRecords != null) __obj.updateDynamic("getRecords")(js.Any.fromFunction0(getRecords))
    if (getSuccess != null) __obj.updateDynamic("getSuccess")(js.Any.fromFunction0(getSuccess))
    if (getTotal != null) __obj.updateDynamic("getTotal")(js.Any.fromFunction0(getTotal))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded)
    if (message != null) __obj.updateDynamic("message")(message)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (records != null) __obj.updateDynamic("records")(records)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setCount != null) __obj.updateDynamic("setCount")(js.Any.fromFunction1(setCount))
    if (setLoaded != null) __obj.updateDynamic("setLoaded")(js.Any.fromFunction1(setLoaded))
    if (setMessage != null) __obj.updateDynamic("setMessage")(js.Any.fromFunction1(setMessage))
    if (setRecords != null) __obj.updateDynamic("setRecords")(js.Any.fromFunction1(setRecords))
    if (setSuccess != null) __obj.updateDynamic("setSuccess")(js.Any.fromFunction1(setSuccess))
    if (setTotal != null) __obj.updateDynamic("setTotal")(js.Any.fromFunction1(setTotal))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IResultSet]
  }
}

