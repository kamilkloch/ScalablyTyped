package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CompletionSuggester extends Suggest {
  /*
       The type of ejs object.  For internal use only.
       */
  def _type(): java.lang.String
  /*
       Sets analyzer used to analyze the suggest text.
       */
  def analyzer(analyzer: java.lang.String): CompletionSuggester
  /*
       Maximum edit distance (fuzziness), defaults to 1.  Automatically
       enables fuzzy suggestions when set to any value.
       */
  def editDistance(d: scala.Double): CompletionSuggester
  /*
       Sets the field used to generate suggestions from.
       */
  def field(field: java.lang.String): CompletionSuggester
  /*
       Enable fuzzy completions which means a can spell a word
       incorrectly and still get a suggestion.
       */
  def fuzzy(trueFalse: scala.Boolean): CompletionSuggester
  /*
       Minimum length of the input before fuzzy suggestions are returned, defaults
       to 3.  Automatically enables fuzzy suggestions when set to any value.
       */
  def minLength(m: scala.Double): CompletionSuggester
  /*
       Minimum length of the input, which is not checked for fuzzy alternatives, defaults
       to 1.  Automatically enables fuzzy suggestions when set to any value.
       */
  def prefixLength(l: scala.Double): CompletionSuggester
  /*
       Sets the maximum number of suggestions to be retrieved from
       each individual shard.
       */
  def shardSize(s: scala.Double): CompletionSuggester
  /*
       Sets the number of suggestions returned for each token.
       */
  def size(s: scala.Double): CompletionSuggester
  /*
       Sets the text to get suggestions for.  If not set, the global
       suggestion text will be used.
       */
  def text(txt: java.lang.String): CompletionSuggester
  /*
       Retrieves the internal suggest object. This is typically used by
       internal API functions so use with caution.
       */
  def toJSON(): js.Any
  /*
       Sets if transpositions should be counted as one or two changes, defaults
       to true when fuzzy is enabled.  Automatically enables fuzzy suggestions
       when set to any value.
       */
  def transpositions(trueFalse: scala.Boolean): CompletionSuggester
  /*
       Sets all are measurements (like edit distance, transpositions and lengths)
       in unicode code points (actual letters) instead of bytes.  Automatically
       enables fuzzy suggestions when set to any value.
       */
  def unicodeAware(trueFalse: scala.Boolean): CompletionSuggester
}
