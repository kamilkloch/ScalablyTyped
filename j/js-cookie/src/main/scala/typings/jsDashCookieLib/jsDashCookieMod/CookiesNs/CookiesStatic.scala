package typings
package jsDashCookieLib.jsDashCookieMod.CookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookiesStatic extends js.Object {
  /**
           * Allows default cookie attributes to be accessed, changed, or reset
           */
  var defaults: CookieAttributes = js.native
  /**
           * Read all available cookies
           */
  def get(): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
           * Read cookie
           */
  def get(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  /**
           * Returns the parsed representation of
           * all cookies according to JSON.parse
           */
  def getJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
           * Returns the parsed representation of the string
           * stored in the cookie according to JSON.parse
           */
  def getJSON(name: java.lang.String): js.Any = js.native
  /**
           * If there is any danger of a conflict with the namespace Cookies,
           * the noConflict method will allow you to define a new namespace
           * and preserve the original one. This is especially useful when
           * running the script on third party sites e.g. as part of a widget
           * or SDK. Note: The noConflict method is not necessary when using
           * AMD or CommonJS, thus it is not exposed in those environments.
           */
  def noConflict(): CookiesStatic = js.native
  /**
           * Delete cookie
           */
  def remove(name: java.lang.String): scala.Unit = js.native
  /**
           * Delete cookie
           */
  def remove(name: java.lang.String, options: CookieAttributes): scala.Unit = js.native
  /**
           * Create a cookie
           */
  def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
           * Create a cookie
           */
  def set(name: java.lang.String, value: java.lang.String, options: CookieAttributes): scala.Unit = js.native
  /**
           * Create a cookie
           */
  def set(name: java.lang.String, value: js.Object): scala.Unit = js.native
  /**
           * Create a cookie
           */
  def set(name: java.lang.String, value: js.Object, options: CookieAttributes): scala.Unit = js.native
  /**
           * Create a new instance of the api that overrides the default
           * decoding implementation. All methods that rely in a proper
           * decoding to work, such as Cookies.remove() and Cookies.get(),
           * will run the converter first for each cookie. The returned
           * string will be used as the cookie value.
           */
  def withConverter(converter: jsDashCookieLib.Anon_Write): CookiesStatic = js.native
  /**
           * Create a new instance of the api that overrides the default
           * decoding implementation. All methods that rely in a proper
           * decoding to work, such as Cookies.remove() and Cookies.get(),
           * will run the converter first for each cookie. The returned
           * string will be used as the cookie value.
           */
  def withConverter(converter: CookieConverter): CookiesStatic = js.native
}
