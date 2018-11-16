package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Outline extends js.Object {
  /** The dash style of the outline. */
  var dashStyle: js.UndefOr[java.lang.String] = js.undefined
  /** The fill of the outline. */
  var outlineFill: js.UndefOr[OutlineFill] = js.undefined
  /**
               * The outline property state.
               *
               * Updating the the outline on a page element will implicitly update this
               * field to`RENDERED`, unless another value is specified in the same request.
               * To have no outline on a page element, set this field to `NOT_RENDERED`. In
               * this case, any other outline fields set in the same request will be
               * ignored.
               */
  var propertyState: js.UndefOr[java.lang.String] = js.undefined
  /** The thickness of the outline. */
  var weight: js.UndefOr[Dimension] = js.undefined
}
