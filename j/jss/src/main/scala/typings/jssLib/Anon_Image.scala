package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var image: js.UndefOr[
    csstypeLib.csstypeMod.ListStyleImageProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.ListStyleImageProperty]]
  ]
  var position: js.UndefOr[
    csstypeLib.csstypeMod.ListStylePositionProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.ListStylePositionProperty]]
  ]
  var `type`: js.UndefOr[
    csstypeLib.csstypeMod.ListStyleTypeProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.ListStyleTypeProperty]]
  ]
}

object Anon_Image {
  @scala.inline
  def apply(
    image: csstypeLib.csstypeMod.ListStyleImageProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.ListStyleImageProperty]] = null,
    position: csstypeLib.csstypeMod.ListStylePositionProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.ListStylePositionProperty]] = null,
    `type`: csstypeLib.csstypeMod.ListStyleTypeProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.ListStyleTypeProperty]] = null
  ): Anon_Image = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Image]
  }
}

