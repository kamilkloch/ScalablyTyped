package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "GeoShapeQuery")
@js.native
class GeoShapeQuery ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoShapeQuery {
  /*
       The type of ejs object.  For internal use only.
       */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
       Sets the boost value for documents matching the Query.
       */
  /* CompleteClass */
  override def boost(boost: stdLib.Number): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoShapeQuery = js.native
  /*
       Sets the field to query against.
       */
  /* CompleteClass */
  override def field(f: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoShapeQuery = js.native
  /*
       Sets the indexed shape.  Use this if you already have shape definitions
       already indexed.
       */
  /* CompleteClass */
  override def indexedShape(indexedShape: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoShapeQuery = js.native
  /*
       Sets the shape relation type.  A relationship between a Query Shape
       and indexed Shapes that will be used to determine if a Document
       should be matched or not.  Valid values are:  intersects, disjoint,
       and within.
       */
  /* CompleteClass */
  override def relation(indexedShape: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoShapeQuery = js.native
  /*
       Sets the shape
       */
  /* CompleteClass */
  override def shape(shape: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoShapeQuery = js.native
  /*
       Sets the spatial strategy.
       Valid values are:
  
  
       recursive - default, recursively traverse nodes in
       the spatial prefix tree.  This strategy has support for
       searching non-point shapes.
       term - uses a large TermsFilter on each node
       in the spatial prefix tree.  It only supports the search of
       indexed Point shapes.
  
  
       This is an advanced setting, use with care.
       */
  /* CompleteClass */
  override def strategy(strategy: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.GeoShapeQuery = js.native
  /*
       Retrieves the internal query object. This is typically used by
       internal API functions so use with caution.
       */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}
