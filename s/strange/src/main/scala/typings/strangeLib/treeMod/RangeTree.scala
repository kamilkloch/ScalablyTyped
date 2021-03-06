package typings
package strangeLib.treeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create an interval tree node.
  *
  * For creating a binary search tree out of an array of ranges, you might want
  * to use [`RangeTree.from`](#RangeTree.from).
  *
  * @example
  * var RangeTree = require("strange/tree")
  * var left = new RangeTree([new Range(-5, 0)])
  * var right = new RangeTree([new Range(5, 10)])
  * var root = new RangeTree([new Range(0, 5), new Range(0, 10)], left, right)
  * root.search(7) // => [new Range(0, 10), new Range(5, 10)]
  */
@js.native
trait RangeTree[T /* <: stdLib.Date | scala.Double | java.lang.String */] extends js.Object {
  /**
    * Ranges of current tree node.
    */
  var keys: js.Array[strangeLib.strangeMod.Range[T]] = js.native
  var left: RangeTree[T] | scala.Null = js.native
  var right: RangeTree[T] | scala.Null = js.native
  /**
    * Search for ranges that include the given value or, given a range, intersect
    * with it.
    * Returns an array of matches or an empty one if no range contained or
    * intersected with the given value.
    *
    * @example
    * var tree = RangeTree.from([new Range(40, 50)])
    * tree.search(42) // => [new Range(40, 50)]
    * tree.search(13) // => []
    * tree.search(new Range(30, 42)) // => [new Range(40, 50)]
    */
  def search(): js.Array[strangeLib.strangeMod.Range[T]] = js.native
  def search(valueOrRange: T): js.Array[strangeLib.strangeMod.Range[T]] = js.native
  def search(valueOrRange: strangeLib.strangeMod.Range[T]): js.Array[strangeLib.strangeMod.Range[T]] = js.native
}

