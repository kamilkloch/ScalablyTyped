package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "DirectGenerator")
@js.native
class DirectGenerator ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.DirectGenerator {
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Sets the accuracy.  How similar the suggested terms at least
       need to be compared to the original suggest text.
       */
  /* CompleteClass */
  override def accuracy(a: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DirectGenerator = js.native
  /*
       Sets the field used to generate suggestions from.
       */
  /* CompleteClass */
  override def field(field: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DirectGenerator = js.native
  /*
       Sets the maximum edit distance candidate suggestions can have
       in order to be considered as a suggestion.
       */
  /* CompleteClass */
  override def maxEdits(max: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DirectGenerator = js.native
  /*
       The factor that is used to multiply with the size in order
       to inspect more candidate suggestions.
       */
  /* CompleteClass */
  override def maxInspections(max: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DirectGenerator = js.native
  /*
       Sets a maximum threshold in number of documents a suggest text
       token can exist in order to be corrected.
       */
  /* CompleteClass */
  override def maxTermFreq(max: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DirectGenerator = js.native
  /*
       Sets a minimal threshold of the number of documents a suggested
       term should appear in.
       */
  /* CompleteClass */
  override def minDocFreq(min: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DirectGenerator = js.native
  /*
       Sets the minimum length a suggest text term must have in order
       to be corrected.
       */
  /* CompleteClass */
  override def minWordLen(len: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DirectGenerator = js.native
  /*
       Sets an analyzer that is applied to each of the generated tokens
       before they are passed to the actual phrase scorer.
       */
  /* CompleteClass */
  override def postFilter(analyzer: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DirectGenerator = js.native
  /*
       Sets an analyzer that is applied to each of the tokens passed to
       this generator.  The analyzer is applied to the original tokens,
       not the generated tokens.
       */
  /* CompleteClass */
  override def preFilter(analyzer: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DirectGenerator = js.native
  /*
       Sets the number of suggestions returned for each token.
       */
  /* CompleteClass */
  override def size(s: scala.Double): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DirectGenerator = js.native
  /*
       Sets the sort mode.  Valid values are:
  
  
       score - Sort by score first, then document frequency, and then the term itself
       frequency - Sort by document frequency first, then simlarity score and then the term itself
  
       */
  /* CompleteClass */
  override def sort(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DirectGenerator = js.native
  /*
       Sets what string distance implementation to use for comparing
       how similar suggested terms are.  Valid values are:
  
  
       internal - based on damerau_levenshtein but but highly optimized for comparing string distance for terms inside the index
       damerau_levenshtein - String distance algorithm based on Damerau-Levenshtein algorithm
       levenstein - String distance algorithm based on Levenstein edit distance algorithm
       jarowinkler - String distance algorithm based on Jaro-Winkler algorithm
       ngram - String distance algorithm based on character n-grams
  
       */
  /* CompleteClass */
  override def stringDistance(s: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DirectGenerator = js.native
  /*
       Sets the suggest mode.  Valid values are:
  
  
       missing - Only suggest terms in the suggest text that aren't in the index
       popular - Only suggest suggestions that occur in more docs then the original suggest text term
       always - Suggest any matching suggestions based on terms in the suggest text
  
       */
  /* CompleteClass */
  override def suggestMode(m: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.DirectGenerator = js.native
  /*
       Retrieves the internal generator object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}
