package typings
package knockoutDashPagingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(knockoutDashPagingLib.KnockoutComputedFunctions because Already inherited / * key * / ScalablyTyped.runtime.StringDictionary[knockoutDashPagingLib.KnockoutBindingHandler])*/
@js.native
trait KnockoutComputed[T] extends KnockoutObservable[T] {
  var fn: KnockoutComputedFunctions[_] = js.native
  def dispose(): scala.Unit = js.native
  def getDependenciesCount(): scala.Double = js.native
  def isActive(): scala.Boolean = js.native
}
