package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "RangeFilter")
@js.native
class RangeFilter protected () extends Filter {
  /*
    Filters documents with fields that have terms within a certain range.
    */
  def this(field: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Enable or disable caching of the filter
    */
  def cache(trueFalse: scala.Boolean): RangeFilter = js.native
  /*
    Sets the cache key.
    */
  def cacheKey(key: java.lang.String): RangeFilter = js.native
  /*
    The field to run the filter against.
    */
  def field(f: java.lang.String): RangeFilter = js.native
  /*
    The lower bound. Defaults to start from the first.
    */
  def from(f: js.Any): RangeFilter = js.native
  /*
    Greater than value.  Same as setting from to the value, and
    include_lower to false,
    */
  def gt(`val`: js.Any): RangeFilter = js.native
  /*
    Greater than or equal to value.  Same as setting from to the value,
    and include_lower to true.
    */
  def gte(`val`: js.Any): RangeFilter = js.native
  /*
    Should the first from (if set) be inclusive or not.
    Defaults to true
    */
  def includeLower(trueFalse: scala.Boolean): RangeFilter = js.native
  /*
    Should the last to (if set) be inclusive or not. Defaults to true.
    */
  def includeUpper(trueFalse: scala.Boolean): RangeFilter = js.native
  /*
    Less than value.  Same as setting to to the value, and include_upper
    to false.
    */
  def lt(`val`: js.Any): RangeFilter = js.native
  /*
    Less than or equal to value.  Same as setting to to the value,
    and include_upper to true.
    */
  def lte(`val`: js.Any): RangeFilter = js.native
  /*
    Sets the filter name.
    */
  def name(name: java.lang.String): RangeFilter = js.native
  /*
    The upper bound. Defaults to unbounded.
    */
  def to(t: js.Any): RangeFilter = js.native
  /*
    Returns the filter object.
    */
  def toJSON(): RangeFilter = js.native
}

