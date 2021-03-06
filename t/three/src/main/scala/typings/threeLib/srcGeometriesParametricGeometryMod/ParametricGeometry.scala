package typings
package threeLib.srcGeometriesParametricGeometryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/ParametricGeometry", "ParametricGeometry")
@js.native
class ParametricGeometry protected ()
  extends threeLib.srcCoreGeometryMod.Geometry {
  def this(func: js.Function3[
      /* u */ scala.Double, 
      /* v */ scala.Double, 
      /* dest */ threeLib.srcMathVector3Mod.Vector3, 
      scala.Unit
    ], slices: scala.Double, stacks: scala.Double) = this()
  var parameters: threeLib.Anon_Dest = js.native
}

