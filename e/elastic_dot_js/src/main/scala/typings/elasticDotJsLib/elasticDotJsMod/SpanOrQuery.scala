package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "SpanOrQuery")
@js.native
class SpanOrQuery protected () extends Query {
  /*
    Matches the union of its span clauses.
    */
  def this(clauses: js.Object) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): SpanOrQuery = js.native
  /*
    Sets the clauses used.  If passed a single SpanQuery, it is added
    to the existing list of clauses.  If passed an array of
    SpanQueries, they replace any existing clauses.
    */
  def clauses(clauses: Query): SpanOrQuery = js.native
  def clauses(clauses: js.Array[Query]): SpanOrQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

