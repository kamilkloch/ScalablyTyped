package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchGroupPatchBaselineMapping extends js.Object {
  /**
    * The patch baseline the patch group is registered with.
    */
  var BaselineIdentity: js.UndefOr[PatchBaselineIdentity] = js.undefined
  /**
    * The name of the patch group registered with the patch baseline.
    */
  var PatchGroup: js.UndefOr[PatchGroup] = js.undefined
}

object PatchGroupPatchBaselineMapping {
  @scala.inline
  def apply(BaselineIdentity: PatchBaselineIdentity = null, PatchGroup: PatchGroup = null): PatchGroupPatchBaselineMapping = {
    val __obj = js.Dynamic.literal()
    if (BaselineIdentity != null) __obj.updateDynamic("BaselineIdentity")(BaselineIdentity)
    if (PatchGroup != null) __obj.updateDynamic("PatchGroup")(PatchGroup)
    __obj.asInstanceOf[PatchGroupPatchBaselineMapping]
  }
}

