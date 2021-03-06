package typings
package winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents accept language information used in the Accept-Language HTTP header on an HTTP request. */
@JSGlobal("Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue")
@js.native
class HttpLanguageRangeWithQualityHeaderValue protected () extends js.Object {
  /**
    * Initializes a new instance of the HttpLanguageRangeWithQualityHeaderValue class with language-range information.
    * @param languageRange The value of the language-range information used in the Accept-Language HTTP header.
    */
  def this(languageRange: java.lang.String) = this()
  /**
    * Initializes a new instance of the HttpLanguageRangeWithQualityHeaderValue class with language-range and quality information.
    * @param languageRange The value of the language-range information used in the Accept-Language HTTP header.
    * @param quality The value of the qvalue or quality factor used in the Accept-Language HTTP header.
    */
  def this(languageRange: java.lang.String, quality: scala.Double) = this()
  /** Gets the value of the language-range information from the HttpLanguageRangeWithQualityHeaderValue used in the Accept-Language HTTP header. */
  var languageRange: java.lang.String = js.native
  /** Gets the value of the qvalue or quality factor from the HttpLanguageRangeWithQualityHeaderValue used in the Accept-Language HTTP header. */
  var quality: scala.Double = js.native
}

/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue")
@js.native
object HttpLanguageRangeWithQualityHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpLanguageRangeWithQualityHeaderValue instance.
    * @param input A string that represents the language-range and quality factor information used in the Accept-Encoding HTTP header.
    * @return An HttpLanguageRangeWithQualityHeaderValue instance.
    */
  def parse(input: java.lang.String): winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpLanguageRangeWithQualityHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpLanguageRangeWithQualityHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: java.lang.String): winrtDashUwpLib.Anon_LanguageRangeWithQualityHeaderValue = js.native
}

