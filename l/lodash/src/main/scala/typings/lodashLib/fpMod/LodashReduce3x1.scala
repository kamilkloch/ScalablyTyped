package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduce3x1[T, TResult] extends js.Object {
  def apply(accumulator: TResult): LodashReduce3x3[T, TResult] = js.native
  def apply(accumulator: TResult, collection: T): TResult = js.native
  def apply(accumulator: lodashLib.lodashMod.__): LodashReduce3x5[TResult] = js.native
  def apply(accumulator: lodashLib.lodashMod.__, collection: T): LodashReduce3x5[TResult] = js.native
}

