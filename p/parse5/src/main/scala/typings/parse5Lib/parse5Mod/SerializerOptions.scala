package typings
package parse5Lib.parse5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializerOptions extends js.Object {
  /***
    * Specifies input tree format.
    *
    * **Default:** `treeAdapters.default`
    */
  var treeAdapter: js.UndefOr[TreeAdapter] = js.undefined
}

object SerializerOptions {
  @scala.inline
  def apply(treeAdapter: TreeAdapter = null): SerializerOptions = {
    val __obj = js.Dynamic.literal()
    if (treeAdapter != null) __obj.updateDynamic("treeAdapter")(treeAdapter)
    __obj.asInstanceOf[SerializerOptions]
  }
}

