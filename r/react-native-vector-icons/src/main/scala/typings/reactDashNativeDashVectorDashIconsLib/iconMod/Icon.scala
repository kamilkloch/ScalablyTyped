package typings
package reactDashNativeDashVectorDashIconsLib.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-vector-icons/Icon", "Icon")
@js.native
class Icon ()
  extends reactLib.reactMod.Component[IconProps, js.Any, js.Any]

@JSImport("react-native-vector-icons/Icon", "Icon")
@js.native
object Icon extends js.Object {
  def getImageSource(name: java.lang.String): stdLib.Promise[reactDashNativeDashVectorDashIconsLib.iconMod.ImageSource] = js.native
  def getImageSource(name: java.lang.String, size: scala.Double): stdLib.Promise[reactDashNativeDashVectorDashIconsLib.iconMod.ImageSource] = js.native
  def getImageSource(name: java.lang.String, size: scala.Double, color: java.lang.String): stdLib.Promise[reactDashNativeDashVectorDashIconsLib.iconMod.ImageSource] = js.native
  def hasIcon(name: java.lang.String): scala.Boolean = js.native
  def loadFont(): stdLib.Promise[scala.Unit] = js.native
  def loadFont(file: java.lang.String): stdLib.Promise[scala.Unit] = js.native
}
