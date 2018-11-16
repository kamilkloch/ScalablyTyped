package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a combination of properties and/or materials from the material groups specified in ( MaterialGroupIndices ). */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DMultiplePropertyMaterial")
@js.native
class Printing3DMultiplePropertyMaterial () extends js.Object {
  /** Gets the indices of the properties and/or materials combined in the multi-property material. Each combination is defined by listing the index of an item from one material group with the index of an item from a secondary material group. The index values are specified in the same order as the material groups listed in MaterialGroupIndices . */
  var materialIndices: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[scala.Double] = js.native
}
