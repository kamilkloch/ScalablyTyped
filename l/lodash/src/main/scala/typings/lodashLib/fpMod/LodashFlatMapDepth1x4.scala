package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFlatMapDepth1x4[T] extends js.Object {
  def apply(iteratee: lodashLib.lodashMod.__, depth: scala.Double): LodashFlatMapDepth1x6[T] = js.native
  def apply[TResult](
    iteratee: js.Function1[
      /* value */ T, 
      lodashLib.lodashMod.ListOfRecursiveArraysOrValues[TResult] | TResult
    ]
  ): LodashFlatMapDepth1x5[TResult] = js.native
  def apply[TResult](
    iteratee: js.Function1[
      /* value */ T, 
      lodashLib.lodashMod.ListOfRecursiveArraysOrValues[TResult] | TResult
    ],
    depth: scala.Double
  ): js.Array[TResult] = js.native
}

