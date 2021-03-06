package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "identity")
@js.native
object identityNs extends js.Object {
  @js.native
  class Identity[A] protected ()
    extends fpDashTsLib.libIdentityMod.Identity[A] {
    def this(value: A) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Identity = js.native
  val identity: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libIdentityMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[fpDashTsLib.libIdentityMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[fpDashTsLib.libIdentityMod.URI] with fpDashTsLib.libAltMod.Alt1[fpDashTsLib.libIdentityMod.URI] with fpDashTsLib.libComonadMod.Comonad1[fpDashTsLib.libIdentityMod.URI] with fpDashTsLib.libChainRecMod.ChainRec1[fpDashTsLib.libIdentityMod.URI] = js.native
  def getSetoid[A](setoid: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libIdentityMod.Identity[A]] = js.native
}

