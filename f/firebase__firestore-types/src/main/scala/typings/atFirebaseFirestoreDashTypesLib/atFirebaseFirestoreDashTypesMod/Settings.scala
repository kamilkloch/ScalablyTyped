package typings
package atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * An approximate cache size threshold for the on-disk data. If the cache grows beyond this
    * size, Firestore will start removing data that hasn't been recently used. The size is not a
    * guarantee that the cache will stay below that size, only that if the cache exceeds the given
    * size, cleanup will be attempted.
    *
    * The default value is 40 MB. The threshold must be set to at least 1 MB, and can be set to
    * CACHE_SIZE_UNLIMITED to disable garbage collection.
    */
  var cacheSizeBytes: js.UndefOr[scala.Double] = js.undefined
  /**
    * Forces the SDK’s underlying network transport (WebChannel) to use
    * long-polling. Each response from the backend will be closed immediately
    * after the backend sends data (by default responses are kept open in case
    * the backend has more data to send). This avoids incompatibility issues
    * with certain proxies, antivirus software, etc. that incorrectly buffer
    * traffic indefinitely. Use of this option will cause some performance
    * degradation though.
    *
    * This setting may be removed in a future release. If you find yourself
    * using it to work around a specific network reliability issue, please tell
    * us about it in https://github.com/firebase/firebase-js-sdk/issues/1674.
    *
    * @webonly
    */
  var experimentalForceLongPolling: js.UndefOr[scala.Boolean] = js.undefined
  /** The hostname to connect to. */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to use SSL when connecting. */
  var ssl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies whether to use `Timestamp` objects for timestamp fields in
    * `DocumentSnapshot`s. This is enabled by default and should not be
    * disabled.
    *
    * Previously, Firestore returned timestamp fields as `Date` but `Date` only
    * supports millisecond precision, which leads to truncation and causes
    * unexpected behavior when using a timestamp from a snapshot as a part of a
    * subsequent query.
    *
    * So now Firestore returns `Timestamp` values instead of `Date`, avoiding
    * this kind of problem.
    *
    * To opt into the old behavior of returning `Date` objects, you can
    * temporarily set `timestampsInSnapshots` to false.
    *
    * @deprecated This setting will be removed in a future release. You should
    * update your code to expect `Timestamp` objects and stop using the
    * `timestampsInSnapshots` setting.
    */
  var timestampsInSnapshots: js.UndefOr[scala.Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    cacheSizeBytes: scala.Int | scala.Double = null,
    experimentalForceLongPolling: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    ssl: js.UndefOr[scala.Boolean] = js.undefined,
    timestampsInSnapshots: js.UndefOr[scala.Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (cacheSizeBytes != null) __obj.updateDynamic("cacheSizeBytes")(cacheSizeBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(experimentalForceLongPolling)) __obj.updateDynamic("experimentalForceLongPolling")(experimentalForceLongPolling)
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (!js.isUndefined(timestampsInSnapshots)) __obj.updateDynamic("timestampsInSnapshots")(timestampsInSnapshots)
    __obj.asInstanceOf[Settings]
  }
}

