package typings
package slonikLib.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfigurationType extends js.Object {
  /** Dictates whether to capture stack trace before executing query. Middlewares access stack trace through query execution context. (Default: true) */
  var captureStackTrace: js.UndefOr[scala.Boolean] = js.undefined
  /** Timeout (in milliseconds) after which an error is raised if cannot cannot be established. (Default: 5000) */
  var connectionTimeout: js.UndefOr[scala.Double] = js.undefined
  /** Timeout (in milliseconds) after which idle clients are closed. (Default: 5000) */
  var idleTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * An array of [Slonik interceptors](https://github.com/gajus/slonik#slonik-interceptors)
    */
  var interceptors: js.UndefOr[js.Array[InterceptorType]] = js.undefined
  /** Do not allow more than this many connections. (Default: 10) */
  var maximumPoolSize: js.UndefOr[scala.Double] = js.undefined
  /** Add more server connections to pool if below this number. (Default: 1) */
  var minimumPoolSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * An array of [Slonik type parsers](https://github.com/gajus/slonik#slonik-type-parsers)
    */
  var typeParsers: js.UndefOr[js.Array[TypeParserType[_]]] = js.undefined
}

object ClientConfigurationType {
  @scala.inline
  def apply(
    captureStackTrace: js.UndefOr[scala.Boolean] = js.undefined,
    connectionTimeout: scala.Int | scala.Double = null,
    idleTimeout: scala.Int | scala.Double = null,
    interceptors: js.Array[InterceptorType] = null,
    maximumPoolSize: scala.Int | scala.Double = null,
    minimumPoolSize: scala.Int | scala.Double = null,
    typeParsers: js.Array[TypeParserType[_]] = null
  ): ClientConfigurationType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureStackTrace)) __obj.updateDynamic("captureStackTrace")(captureStackTrace)
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (idleTimeout != null) __obj.updateDynamic("idleTimeout")(idleTimeout.asInstanceOf[js.Any])
    if (interceptors != null) __obj.updateDynamic("interceptors")(interceptors)
    if (maximumPoolSize != null) __obj.updateDynamic("maximumPoolSize")(maximumPoolSize.asInstanceOf[js.Any])
    if (minimumPoolSize != null) __obj.updateDynamic("minimumPoolSize")(minimumPoolSize.asInstanceOf[js.Any])
    if (typeParsers != null) __obj.updateDynamic("typeParsers")(typeParsers)
    __obj.asInstanceOf[ClientConfigurationType]
  }
}

