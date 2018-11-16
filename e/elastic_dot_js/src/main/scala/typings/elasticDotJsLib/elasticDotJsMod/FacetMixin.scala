package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "FacetMixin")
@js.native
class FacetMixin ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.FacetMixin {
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Enables caching of the facetFilter
       */
  /* CompleteClass */
  override def cacheFilter(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FacetMixin = js.native
  /*
       Allows you to reduce the documents used for computing facet results.
       */
  /* CompleteClass */
  override def facetFilter(oFilter: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FacetMixin = js.native
  /*
       Computes values across the entire index
       */
  /* CompleteClass */
  override def global(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FacetMixin = js.native
  /*
       Sets the mode the facet will use.
  
  
       collector
       post
  
       */
  /* CompleteClass */
  override def mode(m: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FacetMixin = js.native
  /*
       Sets the path to the nested document if faceting against a
       nested field.
       */
  /* CompleteClass */
  override def nested(path: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FacetMixin = js.native
  /*
       Computes values across the the specified scope
       */
  /* CompleteClass */
  override def scope(scope: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FacetMixin = js.native
  /*
       Retrieves the internal facet object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}
