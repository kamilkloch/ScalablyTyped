package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchableWithoutFeedbackProps
  extends AccessibilityProps
     with TouchableWithoutFeedbackPropsIOS {
  /**
    * Delay in ms, from onPressIn, before onLongPress is called.
    */
  var delayLongPress: js.UndefOr[scala.Double] = js.undefined
  /**
    * Delay in ms, from the start of the touch, before onPressIn is called.
    */
  var delayPressIn: js.UndefOr[scala.Double] = js.undefined
  /**
    * Delay in ms, from the release of the touch, before onPressOut is called.
    */
  var delayPressOut: js.UndefOr[scala.Double] = js.undefined
  /**
    * If true, disable all interactions for this component.
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This defines how far your touch can start away from the button.
    * This is added to pressRetentionOffset when moving off of the button.
    * NOTE The touch area never extends past the parent view bounds and
    * the Z-index of sibling views always takes precedence if a touch hits
    * two overlapping views.
    */
  var hitSlop: js.UndefOr[Insets] = js.undefined
  /**
    * When `accessible` is true (which is the default) this may be called when
    * the OS-specific concept of "blur" occurs, meaning the element lost focus.
    * Some platforms may not have the concept of blur.
    */
  var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], scala.Unit]] = js.undefined
  /**
    * When `accessible` is true (which is the default) this may be called when
    * the OS-specific concept of "focus" occurs. Some platforms may not have
    * the concept of focus.
    */
  var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], scala.Unit]] = js.undefined
  /**
    * Invoked on mount and layout changes with
    * {nativeEvent: {layout: {x, y, width, height}}}
    */
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, scala.Unit]] = js.undefined
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  /**
    * Called when the touch is released,
    * but not if cancelled (e.g. by a scroll that steals the responder lock).
    */
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, scala.Unit]] = js.undefined
  /**
    * When the scroll view is disabled, this defines how far your
    * touch may move off of the button, before deactivating the button.
    * Once deactivated, try moving it back and you'll see that the button
    * is once again reactivated! Move it back and forth several times
    * while the scroll view is disabled. Ensure you pass in a constant
    * to reduce memory allocations.
    */
  var pressRetentionOffset: js.UndefOr[Insets] = js.undefined
  /**
    * //FIXME: not in doc but available in examples
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Used to locate this view in end-to-end tests.
    */
  var testID: js.UndefOr[java.lang.String] = js.undefined
}

object TouchableWithoutFeedbackProps {
  @scala.inline
  def apply(
    accessibilityComponentType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.button | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_checked | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityHint: java.lang.String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityLabel: java.lang.String = null,
    accessibilityLiveRegion: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.polite | reactDashNativeLib.reactDashNativeLibStrings.assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityStates: js.Array[AccessibilityState] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessible: js.UndefOr[scala.Boolean] = js.undefined,
    delayLongPress: scala.Int | scala.Double = null,
    delayPressIn: scala.Int | scala.Double = null,
    delayPressOut: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[scala.Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    onAccessibilityTap: () => scala.Unit = null,
    onBlur: /* e */ NativeSyntheticEvent[TargetedEvent] => scala.Unit = null,
    onFocus: /* e */ NativeSyntheticEvent[TargetedEvent] => scala.Unit = null,
    onLayout: /* event */ LayoutChangeEvent => scala.Unit = null,
    onLongPress: /* event */ GestureResponderEvent => scala.Unit = null,
    onMagicTap: () => scala.Unit = null,
    onPress: /* event */ GestureResponderEvent => scala.Unit = null,
    onPressIn: /* event */ GestureResponderEvent => scala.Unit = null,
    onPressOut: /* event */ GestureResponderEvent => scala.Unit = null,
    pressRetentionOffset: Insets = null,
    style: StyleProp[ViewStyle] = null,
    testID: java.lang.String = null,
    tvParallaxProperties: TVParallaxProperties = null
  ): TouchableWithoutFeedbackProps = {
    val __obj = js.Dynamic.literal()
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden)
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint)
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole)
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates)
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible)
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1(onLongPress))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction1(onPressOut))
    if (pressRetentionOffset != null) __obj.updateDynamic("pressRetentionOffset")(pressRetentionOffset)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties)
    __obj.asInstanceOf[TouchableWithoutFeedbackProps]
  }
}

