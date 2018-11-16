package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_LocalesOptionsSupportedLocalesOf
  extends ScalablyTyped.runtime.Instantiable1[
      (/* locales */ java.lang.String) | (/* locales */ js.Array[java.lang.String]), 
      stdLib.IntlNs.Collator
    ]
     with ScalablyTyped.runtime.Instantiable2[
      (/* locales */ java.lang.String) | (/* locales */ js.Array[java.lang.String]), 
      /* options */ stdLib.IntlNs.CollatorOptions, 
      stdLib.IntlNs.Collator
    ]
     with ScalablyTyped.runtime.Instantiable0[stdLib.IntlNs.Collator] {
  def apply(): stdLib.IntlNs.Collator = js.native
  def apply(locales: java.lang.String): stdLib.IntlNs.Collator = js.native
  def apply(locales: java.lang.String, options: stdLib.IntlNs.CollatorOptions): stdLib.IntlNs.Collator = js.native
  def apply(locales: js.Array[java.lang.String]): stdLib.IntlNs.Collator = js.native
  def apply(locales: js.Array[java.lang.String], options: stdLib.IntlNs.CollatorOptions): stdLib.IntlNs.Collator = js.native
  def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: java.lang.String, options: stdLib.IntlNs.CollatorOptions): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def supportedLocalesOf(locales: js.Array[java.lang.String], options: stdLib.IntlNs.CollatorOptions): js.Array[java.lang.String] = js.native
}
