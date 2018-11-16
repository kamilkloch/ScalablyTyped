package typings
package promiseDashDagLib.promiseDashDagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-dag", JSImport.Namespace)
@js.native
object promiseDashDagModMembers extends js.Object {
  val run: Run[stdLib.Promise[js.Any]] = js.native
  def implement[P /* <: stdLib.PromiseLike[_] */](implementation: PromiseImplementation[P]): Run[P] = js.native
}
