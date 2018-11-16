package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServerStateCookieOptions extends js.Object {
  /**
       * if present and the cookie was not received from the client or explicitly set by the route handler, the
       * cookie is automatically added to the response with the provided value. The value can be
       * a function with signature async function(request) where:
       */
  var autoValue: js.UndefOr[js.Function1[/* request */ Request, scala.Unit]] = js.undefined
  /** if true, automatically instruct the client to remove invalid cookies. Defaults to false. */
  var clearInvalid: js.UndefOr[scala.Boolean] = js.undefined
  /** the domain scope. Defaults to null (no domain). */
  var domain: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * encoding performs on the provided value before serialization. Options are:
       *  * 'none' - no encoding. When used, the cookie value must be a string. This is the default value.
       *  * 'base64' - string value is encoded using Base64.
       *  * 'base64json' - object value is JSON-stringified then encoded using Base64.
       *  * 'form' - object value is encoded using the x-www-form-urlencoded method.
       *  * 'iron' - Encrypts and sign the value using iron.
       */
  var encoding: js.UndefOr[
    hapiLib.hapiLibStrings.none | hapiLib.hapiLibStrings.base64 | hapiLib.hapiLibStrings.base64json | hapiLib.hapiLibStrings.form | hapiLib.hapiLibStrings.iron
  ] = js.undefined
  /** if true, errors are ignored and treated as missing cookies. */
  var ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined
  /** options for 'iron' encoding. Defaults to require('iron').defaults. */
  var iron: js.UndefOr[ironLib.ironMod.SealOptions] = js.undefined
  /** sets the 'HttpOnly' flag. Defaults to true. */
  var isHttpOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * sets the 'SameSite' flag. The value must be one of:
       *  * false - no flag.
       *  * 'Strict' - sets the value to 'Strict' (this is the default value).
       *  * 'Lax' - sets the value to 'Lax'.
       */
  var isSameSite: js.UndefOr[
    hapiLib.hapiLibNumbers.`false` | hapiLib.hapiLibStrings.Strict | hapiLib.hapiLibStrings.Lax
  ] = js.undefined
  /** sets the 'Secure' flag. Defaults to true. */
  var isSecure: js.UndefOr[scala.Boolean] = js.undefined
  /** used by proxy plugins (e.g. h2o2). */
  var passThrough: js.UndefOr[js.Any] = js.undefined
  /** password used for 'iron' encoding (must be at least 32 characters long). */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** the path scope. Defaults to null (no path). */
  var path: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
       * an object used to calculate an HMAC for cookie integrity validation. This does not provide privacy, only a mean
       * to verify that the cookie value was generated by the server. Redundant when 'iron' encoding is used. Options are:
       *  * integrity - algorithm options. Defaults to require('iron').defaults.integrity.
       *  * password - password used for HMAC key generation (must be at least 32 characters long).
       */
  var sign: js.UndefOr[hapiLib.Anon_Password] = js.undefined
  /** if false, allows any cookie value including values in violation of RFC 6265. Defaults to true. */
  var strictHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** time-to-live in milliseconds. Defaults to null (session time-life - cookies are deleted when the browser is closed). */
  var ttl: js.UndefOr[scala.Double | scala.Null] = js.undefined
}
