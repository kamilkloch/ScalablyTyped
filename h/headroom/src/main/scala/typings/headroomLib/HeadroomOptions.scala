package typings
package headroomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadroomOptions extends js.Object {
  var classes: js.UndefOr[Anon_Initial] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var onBottom: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onNotBottom: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onNotTop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPin: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onTop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onUnpin: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var scroller: js.UndefOr[stdLib.Element] = js.undefined
  var tolerance: js.UndefOr[js.Any] = js.undefined
}

object HeadroomOptions {
  @scala.inline
  def apply(
    classes: Anon_Initial = null,
    offset: scala.Int | scala.Double = null,
    onBottom: () => scala.Unit = null,
    onNotBottom: () => scala.Unit = null,
    onNotTop: () => scala.Unit = null,
    onPin: () => scala.Unit = null,
    onTop: () => scala.Unit = null,
    onUnpin: () => scala.Unit = null,
    scroller: stdLib.Element = null,
    tolerance: js.Any = null
  ): HeadroomOptions = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onBottom != null) __obj.updateDynamic("onBottom")(js.Any.fromFunction0(onBottom))
    if (onNotBottom != null) __obj.updateDynamic("onNotBottom")(js.Any.fromFunction0(onNotBottom))
    if (onNotTop != null) __obj.updateDynamic("onNotTop")(js.Any.fromFunction0(onNotTop))
    if (onPin != null) __obj.updateDynamic("onPin")(js.Any.fromFunction0(onPin))
    if (onTop != null) __obj.updateDynamic("onTop")(js.Any.fromFunction0(onTop))
    if (onUnpin != null) __obj.updateDynamic("onUnpin")(js.Any.fromFunction0(onUnpin))
    if (scroller != null) __obj.updateDynamic("scroller")(scroller)
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance)
    __obj.asInstanceOf[HeadroomOptions]
  }
}

