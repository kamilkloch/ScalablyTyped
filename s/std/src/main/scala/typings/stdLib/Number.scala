package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Number extends js.Object {
  /**
        * Returns a string containing a number represented in exponential notation.
        * @param fractionDigits Number of digits after the decimal point. Must be in the range 0 - 20, inclusive.
        */
  def toExponential(): java.lang.String = js.native
  /**
        * Returns a string containing a number represented in exponential notation.
        * @param fractionDigits Number of digits after the decimal point. Must be in the range 0 - 20, inclusive.
        */
  def toExponential(fractionDigits: scala.Double): java.lang.String = js.native
  /**
        * Returns a string representing a number in fixed-point notation.
        * @param fractionDigits Number of digits after the decimal point. Must be in the range 0 - 20, inclusive.
        */
  def toFixed(): java.lang.String = js.native
  /**
        * Returns a string representing a number in fixed-point notation.
        * @param fractionDigits Number of digits after the decimal point. Must be in the range 0 - 20, inclusive.
        */
  def toFixed(fractionDigits: scala.Double): java.lang.String = js.native
  /**
        * Converts a number to a string by using the current or specified locale.
        * @param locales A locale string or array of locale strings that contain one or more language or locale tags. If you include more than one locale string, list them in descending order of priority so that the first entry is the preferred locale. If you omit this parameter, the default locale of the JavaScript runtime is used.
        * @param options An object that contains one or more properties that specify comparison options.
        */
  def toLocaleString(locales: java.lang.String): java.lang.String = js.native
  /**
        * Converts a number to a string by using the current or specified locale.
        * @param locales A locale string or array of locale strings that contain one or more language or locale tags. If you include more than one locale string, list them in descending order of priority so that the first entry is the preferred locale. If you omit this parameter, the default locale of the JavaScript runtime is used.
        * @param options An object that contains one or more properties that specify comparison options.
        */
  def toLocaleString(locales: java.lang.String, options: stdLib.IntlNs.NumberFormatOptions): java.lang.String = js.native
  /**
        * Converts a number to a string by using the current or specified locale.
        * @param locales A locale string or array of locale strings that contain one or more language or locale tags. If you include more than one locale string, list them in descending order of priority so that the first entry is the preferred locale. If you omit this parameter, the default locale of the JavaScript runtime is used.
        * @param options An object that contains one or more properties that specify comparison options.
        */
  def toLocaleString(locales: js.Array[java.lang.String]): java.lang.String = js.native
  /**
        * Converts a number to a string by using the current or specified locale.
        * @param locales A locale string or array of locale strings that contain one or more language or locale tags. If you include more than one locale string, list them in descending order of priority so that the first entry is the preferred locale. If you omit this parameter, the default locale of the JavaScript runtime is used.
        * @param options An object that contains one or more properties that specify comparison options.
        */
  def toLocaleString(locales: js.Array[java.lang.String], options: stdLib.IntlNs.NumberFormatOptions): java.lang.String = js.native
  /**
        * Returns a string containing a number represented either in exponential or fixed-point notation with a specified number of digits.
        * @param precision Number of significant digits. Must be in the range 1 - 21, inclusive.
        */
  def toPrecision(): java.lang.String = js.native
  /**
        * Returns a string containing a number represented either in exponential or fixed-point notation with a specified number of digits.
        * @param precision Number of significant digits. Must be in the range 1 - 21, inclusive.
        */
  def toPrecision(precision: scala.Double): java.lang.String = js.native
  /**
        * Returns a string representation of an object.
        * @param radix Specifies a radix for converting numeric values to strings. This value is only used for numbers.
        */
  def toString(radix: scala.Double): java.lang.String = js.native
}
