package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormErrorEventUIParam extends js.Object {
  /**
  	 * Gets reference to the igValidator widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to the event target form.
  	 */
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object FormErrorEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, target: java.lang.String = null): FormErrorEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[FormErrorEventUIParam]
  }
}

