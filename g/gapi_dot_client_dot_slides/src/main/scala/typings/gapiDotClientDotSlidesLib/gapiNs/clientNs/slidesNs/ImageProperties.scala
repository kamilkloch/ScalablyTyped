package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProperties extends js.Object {
  /**
    * The brightness effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect. This property is read-only.
    */
  var brightness: js.UndefOr[scala.Double] = js.undefined
  /**
    * The contrast effect of the image. The value should be in the interval
    * [-1.0, 1.0], where 0 means no effect. This property is read-only.
    */
  var contrast: js.UndefOr[scala.Double] = js.undefined
  /**
    * The crop properties of the image. If not set, the image is not cropped.
    * This property is read-only.
    */
  var cropProperties: js.UndefOr[CropProperties] = js.undefined
  /** The hyperlink destination of the image. If unset, there is no link. */
  var link: js.UndefOr[Link] = js.undefined
  /** The outline of the image. If not set, the the image has no outline. */
  var outline: js.UndefOr[Outline] = js.undefined
  /**
    * The recolor effect of the image. If not set, the image is not recolored.
    * This property is read-only.
    */
  var recolor: js.UndefOr[Recolor] = js.undefined
  /**
    * The shadow of the image. If not set, the image has no shadow. This property
    * is read-only.
    */
  var shadow: js.UndefOr[Shadow] = js.undefined
  /**
    * The transparency effect of the image. The value should be in the interval
    * [0.0, 1.0], where 0 means no effect and 1 means completely transparent.
    * This property is read-only.
    */
  var transparency: js.UndefOr[scala.Double] = js.undefined
}

object ImageProperties {
  @scala.inline
  def apply(
    brightness: scala.Int | scala.Double = null,
    contrast: scala.Int | scala.Double = null,
    cropProperties: CropProperties = null,
    link: Link = null,
    outline: Outline = null,
    recolor: Recolor = null,
    shadow: Shadow = null,
    transparency: scala.Int | scala.Double = null
  ): ImageProperties = {
    val __obj = js.Dynamic.literal()
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (contrast != null) __obj.updateDynamic("contrast")(contrast.asInstanceOf[js.Any])
    if (cropProperties != null) __obj.updateDynamic("cropProperties")(cropProperties)
    if (link != null) __obj.updateDynamic("link")(link)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (recolor != null) __obj.updateDynamic("recolor")(recolor)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProperties]
  }
}

