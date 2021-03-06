package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashTransform1x1[T, TResult] extends js.Object {
  def apply(accumulator: js.Array[TResult]): LodashTransform1x3[T, TResult] = js.native
  def apply(accumulator: js.Array[TResult], `object`: js.Array[T]): js.Array[TResult] = js.native
  def apply(accumulator: js.Array[TResult], `object`: lodashLib.lodashMod.Dictionary[T]): js.Array[TResult] = js.native
  def apply(accumulator: lodashLib.lodashMod.__, `object`: js.Array[T]): LodashTransform1x5[TResult] = js.native
  def apply(accumulator: lodashLib.lodashMod.__, `object`: lodashLib.lodashMod.Dictionary[T]): LodashTransform4x5[TResult] = js.native
}

