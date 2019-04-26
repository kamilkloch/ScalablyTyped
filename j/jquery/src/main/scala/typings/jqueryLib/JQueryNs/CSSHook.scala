package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// region CSS hooks
// #region CSS hooks
// Workaround for TypeScript 2.3 which does not have support for weak types handling.
/* Inlined std.Partial<jquery.JQuery._CSSHook<TElement>> & std.Pick<jquery.JQuery._CSSHook<TElement>, 'get'> | std.Pick<jquery.JQuery._CSSHook<TElement>, 'set'> */
trait CSSHook[TElement] extends js.Object {
  var get: js.UndefOr[js.Any] = js.undefined
  var set: js.UndefOr[js.Any] = js.undefined
}

object CSSHook {
  @scala.inline
  def apply[TElement](get: js.Any = null, set: js.Any = null): CSSHook[TElement] = {
    val __obj = js.Dynamic.literal()
    if (get != null) __obj.updateDynamic("get")(get)
    if (set != null) __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[CSSHook[TElement]]
  }
}

