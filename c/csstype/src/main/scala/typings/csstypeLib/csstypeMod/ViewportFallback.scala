package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportFallback[TLength] extends js.Object {
  var OOrientation: js.UndefOr[
    csstypeLib.ViewportOrientationProperty | js.Array[csstypeLib.ViewportOrientationProperty]
  ] = js.undefined
  var height: js.UndefOr[
    csstypeLib.ViewportHeightProperty[TLength] | js.Array[csstypeLib.ViewportHeightProperty[TLength]]
  ] = js.undefined
  var maxHeight: js.UndefOr[
    csstypeLib.ViewportMaxHeightProperty[TLength] | js.Array[csstypeLib.ViewportMaxHeightProperty[TLength]]
  ] = js.undefined
  var maxWidth: js.UndefOr[
    csstypeLib.ViewportMaxWidthProperty[TLength] | js.Array[csstypeLib.ViewportMaxWidthProperty[TLength]]
  ] = js.undefined
  var maxZoom: js.UndefOr[
    csstypeLib.ViewportMaxZoomProperty | js.Array[csstypeLib.ViewportMaxZoomProperty]
  ] = js.undefined
  var minHeight: js.UndefOr[
    csstypeLib.ViewportMinHeightProperty[TLength] | js.Array[csstypeLib.ViewportMinHeightProperty[TLength]]
  ] = js.undefined
  var minWidth: js.UndefOr[
    csstypeLib.ViewportMinWidthProperty[TLength] | js.Array[csstypeLib.ViewportMinWidthProperty[TLength]]
  ] = js.undefined
  var minZoom: js.UndefOr[
    csstypeLib.ViewportMinZoomProperty | js.Array[csstypeLib.ViewportMinZoomProperty]
  ] = js.undefined
  var msHeight: js.UndefOr[
    csstypeLib.ViewportHeightProperty[TLength] | js.Array[csstypeLib.ViewportHeightProperty[TLength]]
  ] = js.undefined
  var msMaxHeight: js.UndefOr[
    csstypeLib.ViewportMaxHeightProperty[TLength] | js.Array[csstypeLib.ViewportMaxHeightProperty[TLength]]
  ] = js.undefined
  var msMaxWidth: js.UndefOr[
    csstypeLib.ViewportMaxWidthProperty[TLength] | js.Array[csstypeLib.ViewportMaxWidthProperty[TLength]]
  ] = js.undefined
  var msMaxZoom: js.UndefOr[
    csstypeLib.ViewportMaxZoomProperty | js.Array[csstypeLib.ViewportMaxZoomProperty]
  ] = js.undefined
  var msMinHeight: js.UndefOr[
    csstypeLib.ViewportMinHeightProperty[TLength] | js.Array[csstypeLib.ViewportMinHeightProperty[TLength]]
  ] = js.undefined
  var msMinWidth: js.UndefOr[
    csstypeLib.ViewportMinWidthProperty[TLength] | js.Array[csstypeLib.ViewportMinWidthProperty[TLength]]
  ] = js.undefined
  var msMinZoom: js.UndefOr[
    csstypeLib.ViewportMinZoomProperty | js.Array[csstypeLib.ViewportMinZoomProperty]
  ] = js.undefined
  var msOrientation: js.UndefOr[
    csstypeLib.ViewportOrientationProperty | js.Array[csstypeLib.ViewportOrientationProperty]
  ] = js.undefined
  var msUserZoom: js.UndefOr[
    csstypeLib.ViewportUserZoomProperty | js.Array[csstypeLib.ViewportUserZoomProperty]
  ] = js.undefined
  var msWidth: js.UndefOr[
    csstypeLib.ViewportWidthProperty[TLength] | js.Array[csstypeLib.ViewportWidthProperty[TLength]]
  ] = js.undefined
  var msZoom: js.UndefOr[csstypeLib.ViewportZoomProperty | js.Array[csstypeLib.ViewportZoomProperty]] = js.undefined
  var orientation: js.UndefOr[
    csstypeLib.ViewportOrientationProperty | js.Array[csstypeLib.ViewportOrientationProperty]
  ] = js.undefined
  var userZoom: js.UndefOr[
    csstypeLib.ViewportUserZoomProperty | js.Array[csstypeLib.ViewportUserZoomProperty]
  ] = js.undefined
  var width: js.UndefOr[
    csstypeLib.ViewportWidthProperty[TLength] | js.Array[csstypeLib.ViewportWidthProperty[TLength]]
  ] = js.undefined
  var zoom: js.UndefOr[csstypeLib.ViewportZoomProperty | js.Array[csstypeLib.ViewportZoomProperty]] = js.undefined
}

object ViewportFallback {
  @scala.inline
  def apply[TLength](
    OOrientation: csstypeLib.ViewportOrientationProperty | js.Array[csstypeLib.ViewportOrientationProperty] = null,
    height: csstypeLib.ViewportHeightProperty[TLength] | js.Array[csstypeLib.ViewportHeightProperty[TLength]] = null,
    maxHeight: csstypeLib.ViewportMaxHeightProperty[TLength] | js.Array[csstypeLib.ViewportMaxHeightProperty[TLength]] = null,
    maxWidth: csstypeLib.ViewportMaxWidthProperty[TLength] | js.Array[csstypeLib.ViewportMaxWidthProperty[TLength]] = null,
    maxZoom: csstypeLib.ViewportMaxZoomProperty | js.Array[csstypeLib.ViewportMaxZoomProperty] = null,
    minHeight: csstypeLib.ViewportMinHeightProperty[TLength] | js.Array[csstypeLib.ViewportMinHeightProperty[TLength]] = null,
    minWidth: csstypeLib.ViewportMinWidthProperty[TLength] | js.Array[csstypeLib.ViewportMinWidthProperty[TLength]] = null,
    minZoom: csstypeLib.ViewportMinZoomProperty | js.Array[csstypeLib.ViewportMinZoomProperty] = null,
    msHeight: csstypeLib.ViewportHeightProperty[TLength] | js.Array[csstypeLib.ViewportHeightProperty[TLength]] = null,
    msMaxHeight: csstypeLib.ViewportMaxHeightProperty[TLength] | js.Array[csstypeLib.ViewportMaxHeightProperty[TLength]] = null,
    msMaxWidth: csstypeLib.ViewportMaxWidthProperty[TLength] | js.Array[csstypeLib.ViewportMaxWidthProperty[TLength]] = null,
    msMaxZoom: csstypeLib.ViewportMaxZoomProperty | js.Array[csstypeLib.ViewportMaxZoomProperty] = null,
    msMinHeight: csstypeLib.ViewportMinHeightProperty[TLength] | js.Array[csstypeLib.ViewportMinHeightProperty[TLength]] = null,
    msMinWidth: csstypeLib.ViewportMinWidthProperty[TLength] | js.Array[csstypeLib.ViewportMinWidthProperty[TLength]] = null,
    msMinZoom: csstypeLib.ViewportMinZoomProperty | js.Array[csstypeLib.ViewportMinZoomProperty] = null,
    msOrientation: csstypeLib.ViewportOrientationProperty | js.Array[csstypeLib.ViewportOrientationProperty] = null,
    msUserZoom: csstypeLib.ViewportUserZoomProperty | js.Array[csstypeLib.ViewportUserZoomProperty] = null,
    msWidth: csstypeLib.ViewportWidthProperty[TLength] | js.Array[csstypeLib.ViewportWidthProperty[TLength]] = null,
    msZoom: csstypeLib.ViewportZoomProperty | js.Array[csstypeLib.ViewportZoomProperty] = null,
    orientation: csstypeLib.ViewportOrientationProperty | js.Array[csstypeLib.ViewportOrientationProperty] = null,
    userZoom: csstypeLib.ViewportUserZoomProperty | js.Array[csstypeLib.ViewportUserZoomProperty] = null,
    width: csstypeLib.ViewportWidthProperty[TLength] | js.Array[csstypeLib.ViewportWidthProperty[TLength]] = null,
    zoom: csstypeLib.ViewportZoomProperty | js.Array[csstypeLib.ViewportZoomProperty] = null
  ): ViewportFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    if (OOrientation != null) __obj.updateDynamic("OOrientation")(OOrientation.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (msHeight != null) __obj.updateDynamic("msHeight")(msHeight.asInstanceOf[js.Any])
    if (msMaxHeight != null) __obj.updateDynamic("msMaxHeight")(msMaxHeight.asInstanceOf[js.Any])
    if (msMaxWidth != null) __obj.updateDynamic("msMaxWidth")(msMaxWidth.asInstanceOf[js.Any])
    if (msMaxZoom != null) __obj.updateDynamic("msMaxZoom")(msMaxZoom.asInstanceOf[js.Any])
    if (msMinHeight != null) __obj.updateDynamic("msMinHeight")(msMinHeight.asInstanceOf[js.Any])
    if (msMinWidth != null) __obj.updateDynamic("msMinWidth")(msMinWidth.asInstanceOf[js.Any])
    if (msMinZoom != null) __obj.updateDynamic("msMinZoom")(msMinZoom.asInstanceOf[js.Any])
    if (msOrientation != null) __obj.updateDynamic("msOrientation")(msOrientation.asInstanceOf[js.Any])
    if (msUserZoom != null) __obj.updateDynamic("msUserZoom")(msUserZoom.asInstanceOf[js.Any])
    if (msWidth != null) __obj.updateDynamic("msWidth")(msWidth.asInstanceOf[js.Any])
    if (msZoom != null) __obj.updateDynamic("msZoom")(msZoom.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (userZoom != null) __obj.updateDynamic("userZoom")(userZoom.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportFallback[TLength]]
  }
}

