package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "SpanFirstQuery")
@js.native
class SpanFirstQuery protected () extends Query {
  /*
    Matches spans near the beginning of a field.
    */
  def this(spanQry: Query, end: scala.Double) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): SpanFirstQuery = js.native
  /*
    Sets the maximum end position permitted in a match.
    */
  def end(position: stdLib.Number): SpanFirstQuery = js.native
  /*
    Sets the span query to match on.
    */
  def `match`(spanQuery: js.Object): SpanFirstQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

