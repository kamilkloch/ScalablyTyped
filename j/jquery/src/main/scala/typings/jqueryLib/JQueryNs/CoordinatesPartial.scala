package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Workaround for TypeScript 2.3 which does not have support for weak types handling.
/* Inlined std.Pick<jquery.JQuery.Coordinates, 'left'> | std.Pick<jquery.JQuery.Coordinates, 'top'> | {[key: string] : never} */
trait CoordinatesPartial
  extends /* key */ org.scalablytyped.runtime.StringDictionary[scala.Nothing] {
  var left: js.UndefOr[scala.Double] = js.undefined
  var top: js.UndefOr[scala.Double] = js.undefined
}

object CoordinatesPartial {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[scala.Nothing] = null,
    left: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null
  ): CoordinatesPartial = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinatesPartial]
  }
}

