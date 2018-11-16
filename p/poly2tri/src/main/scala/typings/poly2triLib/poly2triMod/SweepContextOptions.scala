package typings
package poly2triLib.poly2triMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SweepContextOptions extends js.Object {
  /**
       * cloneArrays - if `true`, do a shallow copy of the Array parameters (contour, holes).
       * Points inside arrays are never copied.
       * Default is `false` : keep a reference to the array arguments, who will be modified in place.
       */
  var cloneArrays: js.UndefOr[scala.Boolean] = js.undefined
}
