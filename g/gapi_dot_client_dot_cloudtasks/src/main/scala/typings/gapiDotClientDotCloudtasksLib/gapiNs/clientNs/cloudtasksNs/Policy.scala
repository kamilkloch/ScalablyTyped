package typings
package gapiDotClientDotCloudtasksLib.gapiNs.clientNs.cloudtasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Policy extends js.Object {
  /**
    * Associates a list of `members` to a `role`.
    * `bindings` with no members will result in an error.
    */
  var bindings: js.UndefOr[js.Array[Binding]] = js.undefined
  /**
    * `etag` is used for optimistic concurrency control as a way to help
    * prevent simultaneous updates of a policy from overwriting each other.
    * It is strongly suggested that systems make use of the `etag` in the
    * read-modify-write cycle to perform policy updates in order to avoid race
    * conditions: An `etag` is returned in the response to `getIamPolicy`, and
    * systems are expected to put that etag in the request to `setIamPolicy` to
    * ensure that their change will be applied to the same version of the policy.
    *
    * If no `etag` is provided in the call to `setIamPolicy`, then the existing
    * policy is overwritten blindly.
    */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Version of the `Policy`. The default version is 0. */
  var version: js.UndefOr[scala.Double] = js.undefined
}

object Policy {
  @scala.inline
  def apply(
    bindings: js.Array[Binding] = null,
    etag: java.lang.String = null,
    version: scala.Int | scala.Double = null
  ): Policy = {
    val __obj = js.Dynamic.literal()
    if (bindings != null) __obj.updateDynamic("bindings")(bindings)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
}

