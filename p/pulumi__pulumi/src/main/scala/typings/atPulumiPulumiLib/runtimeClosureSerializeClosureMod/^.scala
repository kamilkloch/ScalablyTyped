package typings
package atPulumiPulumiLib.runtimeClosureSerializeClosureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/closure/serializeClosure", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def serializeFunction(func: js.Function): js.Promise[SerializedFunction] = js.native
  def serializeFunction(func: js.Function, args: SerializeFunctionArgs): js.Promise[SerializedFunction] = js.native
  def serializeFunctionAsync(func: js.Function): js.Promise[java.lang.String] = js.native
  def serializeFunctionAsync(func: js.Function, serialize: js.Function1[/* o */ js.Any, scala.Boolean]): js.Promise[java.lang.String] = js.native
}

