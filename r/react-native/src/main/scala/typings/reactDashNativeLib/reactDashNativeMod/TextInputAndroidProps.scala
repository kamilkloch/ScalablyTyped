package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TextInputAndroidProps extends js.Object {
  /**
       * When false, if there is a small amount of space available around a text input (e.g. landscape orientation on a phone),
       *   the OS may choose to have the user edit the text inside of a full screen text input mode.
       * When true, this feature is disabled and users will always edit the text directly inside of the text input.
       * Defaults to false.
       */
  var disableFullscreenUI: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If defined, the provided image resource will be rendered on the left.
       */
  var inlineImageLeft: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Padding between the inline image, if any, and the text input itself.
       */
  var inlineImagePadding: js.UndefOr[scala.Double] = js.undefined
  /**
       * Sets the number of lines for a TextInput.
       * Use it with multiline set to true to be able to fill the lines.
       */
  var numberOfLines: js.UndefOr[scala.Double] = js.undefined
  /**
       * Sets the return key to the label. Use it instead of `returnKeyType`.
       * @platform android
       */
  var returnKeyLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Set text break strategy on Android API Level 23+, possible values are simple, highQuality, balanced
       * The default value is simple.
       */
  var textBreakStrategy: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.simple | reactDashNativeLib.reactDashNativeLibStrings.highQuality | reactDashNativeLib.reactDashNativeLibStrings.balanced
  ] = js.undefined
  /**
       * The color of the textInput underline.
       */
  var underlineColorAndroid: js.UndefOr[java.lang.String] = js.undefined
}
