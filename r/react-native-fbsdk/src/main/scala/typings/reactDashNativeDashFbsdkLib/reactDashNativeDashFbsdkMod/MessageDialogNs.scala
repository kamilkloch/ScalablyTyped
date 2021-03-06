package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fbsdk", "MessageDialog")
@js.native
object MessageDialogNs extends js.Object {
  /**
    * Check if the dialog can be shown.
    */
  def canShow(shareContent: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod.ShareContent): js.Promise[scala.Boolean] = js.native
  /**
    * Sets whether or not the native message dialog should fail when it encounters a data error.
    */
  def setShouldFailOnDataError(shouldFailOnDataError: scala.Boolean): scala.Unit = js.native
  /**
    * Shows the dialog using the specified content.
    */
  def show(shareContent: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod.ShareContent): js.Promise[_] = js.native
}

