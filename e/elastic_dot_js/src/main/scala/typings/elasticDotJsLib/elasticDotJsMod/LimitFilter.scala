package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "LimitFilter")
@js.native
class LimitFilter protected () extends Filter {
  /*
    Limits the number of documents to execute on.
    */
  def this(limit: scala.Double) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): LimitFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): LimitFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): LimitFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): LimitFilter = js.native
  /*
    Sets the limit value.
    */
  def value(`val`: scala.Double): LimitFilter = js.native
}

