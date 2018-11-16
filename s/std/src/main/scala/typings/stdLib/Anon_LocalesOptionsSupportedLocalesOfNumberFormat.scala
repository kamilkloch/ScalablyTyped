package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_LocalesOptionsSupportedLocalesOfNumberFormat
  extends ScalablyTyped.runtime.Instantiable1[
      (/* locales */ java.lang.String) | (/* locales */ js.Array[java.lang.String]), 
      stdLib.IntlNs.NumberFormat
    ]
     with ScalablyTyped.runtime.Instantiable2[
      (/* locales */ java.lang.String) | (/* locales */ js.Array[java.lang.String]), 
      /* options */ stdLib.IntlNs.NumberFormatOptions, 
      stdLib.IntlNs.NumberFormat
    ]
     with ScalablyTyped.runtime.Instantiable0[stdLib.IntlNs.NumberFormat] {
  def apply(): stdLib.IntlNs.NumberFormat = js.native
  def apply(locales: java.lang.String): stdLib.IntlNs.NumberFormat = js.native
  def apply(locales: java.lang.String, options: stdLib.IntlNs.NumberFormatOptions): stdLib.IntlNs.NumberFormat = js.native
  def apply(locales: js.Array[java.lang.String]): stdLib.IntlNs.NumberFormat = js.native
  def apply(locales: js.Array[java.lang.String], options: stdLib.IntlNs.NumberFormatOptions): stdLib.IntlNs.NumberFormat = js.native
  def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: java.lang.String, options: stdLib.IntlNs.NumberFormatOptions): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String], options: stdLib.IntlNs.NumberFormatOptions): js.Array[java.lang.String] = js.native
}
