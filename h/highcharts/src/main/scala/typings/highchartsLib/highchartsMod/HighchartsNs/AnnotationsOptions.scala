package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options for configuring annotations, for example labels, arrows or shapes. Annotations can be tied to points,
     * axis coordinates or chart pixel coordinates.
     */

trait AnnotationsOptions extends js.Object {
  /**
           * Options for annotation's labels. Each label inherits options from the labelOptions object.
           * An option from the labelOptions can be overwritten by config for a specific label.
           * @since 6.0.0
           */
  var labelOptions: js.UndefOr[AnnotationsLabelOptions] = js.undefined
  /**
           * An array of labels for the annotation. For options that apply to multiple labels, they can be added to the labelOptions.
           * @since 6.0.0
           */
  var labels: js.UndefOr[js.Array[AnnotationsLabel]] = js.undefined
  /**
           * Options for annotation's shapes. Each shape inherits options from the shapeOptions object.
           * An option from the shapeOptions can be overwritten by config for a specific shape.
           * @since 6.0.0
           */
  var shapeOptions: js.UndefOr[AnnotationsShapeOptions] = js.undefined
  /**
           * An array of shapes for the annotation. For options that apply to multiple shapes, they can be added to the shapeOptions.
           * @since 6.0.0
           */
  var shapes: js.UndefOr[js.Array[AnnotationsShape]] = js.undefined
  /**
           * Whether the annotation is visible.
           * @default true
           * @since 6.0.0
           */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The Z index of the annotation.
           * @default 6
           * @since 6.0.0
           */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}
