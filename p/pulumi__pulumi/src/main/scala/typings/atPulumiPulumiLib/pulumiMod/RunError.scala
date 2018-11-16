package typings
package atPulumiPulumiLib.pulumiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "RunError")
@js.native
class RunError protected ()
  extends atPulumiPulumiLib.errorsMod.RunError {
  def this(message: java.lang.String) = this()
}

@JSImport("@pulumi/pulumi", "RunError")
@js.native
object RunError extends js.Object {
  /**
       * Returns true if the given object is an instance of a RunError.  This is designed to work even when
       * multiple copies of the Pulumi SDK have been loaded into the same process.
       */
  def isInstance(obj: js.Any): /* is RunError */scala.Boolean = js.native
}
