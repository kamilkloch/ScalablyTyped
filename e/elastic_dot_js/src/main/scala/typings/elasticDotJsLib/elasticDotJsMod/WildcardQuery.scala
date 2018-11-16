package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "WildcardQuery")
@js.native
class WildcardQuery protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.WildcardQuery {
  /*
       A Query that matches documents containing a wildcard. This may be
       combined with other wildcards with a BooleanQuery.
       */
  def this(field: java.lang.String, value: java.lang.String) = this()
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Sets the boost value for documents matching the Query.
       */
  /* CompleteClass */
  override def boost(boost: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.WildcardQuery = js.native
  /*
       Sets the fields to query against.
       */
  /* CompleteClass */
  override def field(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.WildcardQuery = js.native
  /*
       Sets rewrite method.  Valid values are:
  
       constant_score_auto - tries to pick the best constant-score rewrite
       method based on term and document counts from the query
  
       scoring_boolean - translates each term into boolean should and
       keeps the scores as computed by the query
  
       constant_score_boolean - same as scoring_boolean, expect no scores
       are computed.
  
       constant_score_filter - first creates a private Filter, by visiting
       each term in sequence and marking all docs for that term
  
       top_terms_boost_N - first translates each term into boolean should
       and scores are only computed as the boost using the top N
       scoring terms.  Replace N with an integer value.
  
       top_terms_N -   first translates each term into boolean should
       and keeps the scores as computed by the query. Only the top N
       scoring terms are used.  Replace N with an integer value.
  
       Default is constant_score_auto.
  
       This is an advanced option, use with care.
       */
  /* CompleteClass */
  override def rewrite(m: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.WildcardQuery = js.native
  /*
       Retrieves the internal query object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
  /*
       Sets the wildcard query value.
       */
  /* CompleteClass */
  override def value(v: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.WildcardQuery = js.native
}
