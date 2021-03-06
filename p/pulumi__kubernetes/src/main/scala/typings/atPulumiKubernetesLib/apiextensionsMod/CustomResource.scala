package typings
package atPulumiKubernetesLib.apiextensionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/apiextensions", "CustomResource")
@js.native
class CustomResource protected ()
  extends atPulumiKubernetesLib.apiextensionsCustomResourceMod.CustomResource {
  /**
    * Create a CustomResource resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiKubernetesLib.apiextensionsCustomResourceMod.CustomResourceArgs) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.apiextensionsCustomResourceMod.CustomResourceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/apiextensions", "CustomResource")
@js.native
object CustomResource extends js.Object {
  /**
    * Get the state of an existing `CustomResource`, as identified by `id`.
    * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
    * Kubernetes convention) the ID becomes default/<name>.
    *
    * Pulumi will keep track of this resource using `name` as the Pulumi ID.
    *
    * @param name _Unique_ name used to register this resource with Pulumi.
    * @param opts Uniquely specifies a CustomResource to select.
    */
  def get(
    name: java.lang.String,
    opts: atPulumiKubernetesLib.apiextensionsCustomResourceMod.CustomResourceGetOptions
  ): atPulumiKubernetesLib.apiextensionsCustomResourceMod.CustomResource = js.native
}

