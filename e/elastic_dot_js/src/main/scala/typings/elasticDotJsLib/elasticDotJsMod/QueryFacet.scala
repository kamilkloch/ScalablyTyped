package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "QueryFacet")
@js.native
class QueryFacet protected () extends Facet {
  /*
    A facet that return a count of the hits matching the given query.
    */
  def this(name: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Enables caching of the facetFilter
    */
  def cacheFilter(trueFalse: scala.Boolean): QueryFacet = js.native
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  def facetFilter(oFilter: js.Object): QueryFacet = js.native
  /*
    Computes values across the entire index
    */
  def global(trueFalse: scala.Boolean): QueryFacet = js.native
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  def mode(m: java.lang.String): QueryFacet = js.native
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  def nested(path: java.lang.String): QueryFacet = js.native
  /*
    Sets the query to be used for this facet.
    */
  def query(oQuery: js.Object): QueryFacet = js.native
  /*
    Computes values across the the specified scope
    */
  def scope(scope: java.lang.String): QueryFacet = js.native
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

