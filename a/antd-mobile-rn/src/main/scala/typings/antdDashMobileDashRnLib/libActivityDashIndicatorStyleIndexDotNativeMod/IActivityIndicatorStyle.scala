package typings
package antdDashMobileDashRnLib.libActivityDashIndicatorStyleIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActivityIndicatorStyle extends js.Object {
  var container: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var innerContainer: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var spinner: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var tip: reactDashNativeLib.reactDashNativeMod.TextStyle
  var toast: reactDashNativeLib.reactDashNativeMod.TextStyle
  var wrapper: reactDashNativeLib.reactDashNativeMod.ViewStyle
}

object IActivityIndicatorStyle {
  @scala.inline
  def apply(
    container: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    innerContainer: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    spinner: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    tip: reactDashNativeLib.reactDashNativeMod.TextStyle,
    toast: reactDashNativeLib.reactDashNativeMod.TextStyle,
    wrapper: reactDashNativeLib.reactDashNativeMod.ViewStyle
  ): IActivityIndicatorStyle = {
    val __obj = js.Dynamic.literal(container = container, innerContainer = innerContainer, spinner = spinner, tip = tip, toast = toast, wrapper = wrapper)
  
    __obj.asInstanceOf[IActivityIndicatorStyle]
  }
}

