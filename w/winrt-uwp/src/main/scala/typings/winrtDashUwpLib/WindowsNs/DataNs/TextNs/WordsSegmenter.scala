package typings
package winrtDashUwpLib.WindowsNs.DataNs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A segmenter class that is able to segment provided text into words. */
@JSGlobal("Windows.Data.Text.WordsSegmenter")
@js.native
class WordsSegmenter protected () extends js.Object {
  /**
                   * Creates a WordsSegmenter object. See the introduction in WordsSegmenter for a description of how the language supplied to this constructor is used.
                   * @param language A BCP-47 language tag.
                   */
  def this(language: java.lang.String) = this()
  /** Gets the language of the rules used by this WordsSegmenter object. */
  var resolvedLanguage: java.lang.String = js.native
  /**
                   * Determines and returns the word which contains or follows a specified index into the provided text.
                   * @param text Provided text from which the word is to be returned.
                   * @param startIndex A zero-based index into text. It must be less than the length of text.
                   * @return A WordSegment that represents the word.
                   */
  def getTokenAt(text: java.lang.String, startIndex: scala.Double): WordSegment = js.native
  /**
                   * Determines and returns all of the words in the provided text.
                   * @param text Provided text containing words to be returned.
                   * @return A collection of WordSegment objects that represent the words.
                   */
  def getTokens(text: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[WordSegment] = js.native
  /**
                   * Calls the provided handler with two iterators that iterate through the words prior to and following a given index into the provided text.
                   * @param text Provided text containing words to be returned.
                   * @param startIndex A zero-based index into text. It must be less than the length of text.
                   * @param handler The function that receives the iterators.
                   */
  def tokenize(text: java.lang.String, startIndex: scala.Double, handler: WordSegmentsTokenizingHandler): scala.Unit = js.native
}
