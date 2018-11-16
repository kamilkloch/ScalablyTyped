package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BigNumberStatic
  extends ScalablyTyped.runtime.Instantiable0[BigNumber]
     with ScalablyTyped.runtime.Instantiable1[
      (/* n */ java.lang.String) | (/* n */ scala.Double) | (/* n */ BigNumber), 
      BigNumber
    ] {
  var prime: sjclLib.Anon_P521 = js.native
  var random: sjclLib.sjclMod.sjclNs.TypeHelpersNs.Bind1[scala.Double] = js.native
  def fromBits(bits: BitArray): BigNumber = js.native
  def pseudoMersennePrime(exponent: scala.Double, coeff: js.Array[js.Array[scala.Double]]): PseudoMersennePrimeStatic = js.native
}
