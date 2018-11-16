package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object immutabilityDashHelperLib {
  type ArraySpec[T, C /* <: js.Any */] = Anon_Push[T] | Anon_Unshift[T] | Anon_Splice[T] | ScalablyTyped.runtime.StringDictionary[js.Any]
  type MapSpec[K, V] = (Anon_AddArray[K, V]) | Anon_RemoveArray[K]
  type ObjectSpec[T, C /* <: js.Any */] = Anon_Toggle[T] | Anon_Unset[T] | Anon_Merge[T] | (immutabilityDashHelperLib.immutabilityDashHelperLibStrings.ObjectSpec with js.Any)
  type SetSpec[T] = Anon_Add[T] | Anon_Remove[T]
}