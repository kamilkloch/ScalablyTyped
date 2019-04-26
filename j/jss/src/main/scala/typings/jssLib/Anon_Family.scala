package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Family extends js.Object {
  var family: js.UndefOr[
    csstypeLib.csstypeMod.FontFamilyProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FontFamilyProperty]]
  ]
  var size: js.UndefOr[
    csstypeLib.csstypeMod.FontSizeProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FontSizeProperty[jssLib.cssMod.Length]]]
  ]
  var stretch: js.UndefOr[
    csstypeLib.csstypeMod.FontStretchProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FontStretchProperty]]
  ]
  var style: js.UndefOr[
    csstypeLib.csstypeMod.FontStyleProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FontStyleProperty]]
  ]
  var variant: js.UndefOr[
    csstypeLib.csstypeMod.FontVariantProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FontVariantProperty]]
  ]
  var weight: js.UndefOr[
    csstypeLib.csstypeMod.FontWeightProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FontWeightProperty]]
  ]
}

object Anon_Family {
  @scala.inline
  def apply(
    family: csstypeLib.csstypeMod.FontFamilyProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FontFamilyProperty]] = null,
    size: csstypeLib.csstypeMod.FontSizeProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FontSizeProperty[jssLib.cssMod.Length]]] = null,
    stretch: csstypeLib.csstypeMod.FontStretchProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FontStretchProperty]] = null,
    style: csstypeLib.csstypeMod.FontStyleProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FontStyleProperty]] = null,
    variant: csstypeLib.csstypeMod.FontVariantProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FontVariantProperty]] = null,
    weight: csstypeLib.csstypeMod.FontWeightProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.FontWeightProperty]] = null
  ): Anon_Family = {
    val __obj = js.Dynamic.literal()
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stretch != null) __obj.updateDynamic("stretch")(stretch.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Family]
  }
}

