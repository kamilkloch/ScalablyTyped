package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reads a Japanese string that is a combination of Kanji characters and Hiragana characters, and returns a collection of proper readings from the string with word breaks. */
@JSGlobal("Windows.Globalization.JapanesePhoneticAnalyzer")
@js.native
abstract class JapanesePhoneticAnalyzer () extends js.Object

/* static members */
@JSGlobal("Windows.Globalization.JapanesePhoneticAnalyzer")
@js.native
object JapanesePhoneticAnalyzer extends js.Object {
  /**
    * Reads a Japanese string that is a combination of Kanji characters and Hiragana characters, and returns a collection of proper readings from the string with word breaks.
    * @param input A Japanese string that is a combination of Kanji characters and Hiragana characters.
    * @return A collection of JapanesePhoneme objects that represent proper readings from the string with word breaks.
    */
  def getWords(input: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.GlobalizationNs.JapanesePhoneme] = js.native
  /**
    * Reads a Japanese string that is a combination of Kanji characters and Hiragana characters, and returns a collection of proper readings from the string with word breaks. Optionally uses the "Mono Ruby" strategy in breaking multi-Kanji words into multiple Kanji words.
    * @param input A Japanese string that is a combination of Kanji characters and Hiragana characters.
    * @param monoRuby Specifies the use of the word-breaking strategy "Mono Ruby".
    * @return A collection of JapanesePhoneme objects that represent proper readings from the string with word breaks.
    */
  def getWords(input: java.lang.String, monoRuby: scala.Boolean): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.GlobalizationNs.JapanesePhoneme] = js.native
}

