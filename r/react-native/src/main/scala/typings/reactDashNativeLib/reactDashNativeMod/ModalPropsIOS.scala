package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ModalPropsIOS extends js.Object {
  /**
       * The `onDismiss` prop allows passing a function that will be called once the modal has been dismissed.
       */
  var onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * The `onOrientationChange` callback is called when the orientation changes while the modal is being displayed.
       * The orientation provided is only 'portrait' or 'landscape'. This callback is also called on initial render, regardless of the current orientation.
       */
  var onOrientationChange: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[_], scala.Unit]] = js.undefined
  /**
       * The `presentationStyle` determines the style of modal to show
       */
  var presentationStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.fullScreen | reactDashNativeLib.reactDashNativeLibStrings.pageSheet | reactDashNativeLib.reactDashNativeLibStrings.formSheet | reactDashNativeLib.reactDashNativeLibStrings.overFullScreen
  ] = js.undefined
  /**
       * The `supportedOrientations` prop allows the modal to be rotated to any of the specified orientations.
       * On iOS, the modal is still restricted by what's specified in your app's Info.plist's UISupportedInterfaceOrientations field.
       */
  var supportedOrientations: js.UndefOr[
    js.Array[
      reactDashNativeLib.reactDashNativeLibStrings.portrait | reactDashNativeLib.reactDashNativeLibStrings.`portrait-upside-down` | reactDashNativeLib.reactDashNativeLibStrings.landscape | reactDashNativeLib.reactDashNativeLibStrings.`landscape-left` | reactDashNativeLib.reactDashNativeLibStrings.`landscape-right`
    ]
  ] = js.undefined
}
