package typings
package atPulumiPulumiLib.assetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/asset", "Archive")
@js.native
abstract class Archive ()
  extends atPulumiPulumiLib.assetArchiveMod.Archive

@JSImport("@pulumi/pulumi/asset", "Archive")
@js.native
object Archive extends js.Object {
  /**
       * Returns true if the given object is an instance of an Archive.  This is designed to work even when
       * multiple copies of the Pulumi SDK have been loaded into the same process.
       */
  def isInstance(obj: js.Any): /* is Archive */scala.Boolean = js.native
}
