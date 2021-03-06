package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "Euler")
@js.native
class Euler ()
  extends threeLib.srcMathEulerMod.Euler {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double, order: java.lang.String) = this()
}

/* static members */
@JSImport("three", "Euler")
@js.native
object Euler extends js.Object {
  var DefaultOrder: java.lang.String = js.native
  var RotationOrders: js.Array[java.lang.String] = js.native
}

