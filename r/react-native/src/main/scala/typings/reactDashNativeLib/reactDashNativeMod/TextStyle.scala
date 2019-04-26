package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashNativeLib.reactDashNativeMod.TextStyleAndroid because var conflicts: alignContent, alignItems, alignSelf, aspectRatio, backfaceVisibility, backgroundColor, borderBottomColor, borderBottomEndRadius, borderBottomLeftRadius, borderBottomRightRadius, borderBottomStartRadius, borderBottomWidth, borderColor, borderEndColor, borderEndWidth, borderLeftColor, borderLeftWidth, borderRadius, borderRightColor, borderRightWidth, borderStartColor, borderStartWidth, borderStyle, borderTopColor, borderTopEndRadius, borderTopLeftRadius, borderTopRightRadius, borderTopStartRadius, borderTopWidth, borderWidth, bottom, direction, display, elevation, end, flex, flexBasis, flexDirection, flexGrow, flexShrink, flexWrap, height, justifyContent, left, margin, marginBottom, marginEnd, marginHorizontal, marginLeft, marginRight, marginStart, marginTop, marginVertical, maxHeight, maxWidth, minHeight, minWidth, opacity, overflow, padding, paddingBottom, paddingEnd, paddingHorizontal, paddingLeft, paddingRight, paddingStart, paddingTop, paddingVertical, position, right, rotation, scaleX, scaleY, shadowColor, shadowOffset, shadowOpacity, shadowRadius, start, testID, top, transform, transformMatrix, translateX, translateY, width, zIndex. Inlined textAlignVertical, includeFontPadding */ trait TextStyle extends TextStyleIOS {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var fontStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.normal | reactDashNativeLib.reactDashNativeLibStrings.italic
  ] = js.undefined
  /**
    * Specifies font weight. The values 'normal' and 'bold' are supported
    * for most fonts. Not all fonts have a variant for each of the numeric
    * values, in that case the closest one is chosen.
    */
  var fontWeight: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.normal | reactDashNativeLib.reactDashNativeLibStrings.bold | reactDashNativeLib.reactDashNativeLibStrings.`100` | reactDashNativeLib.reactDashNativeLibStrings.`200` | reactDashNativeLib.reactDashNativeLibStrings.`300` | reactDashNativeLib.reactDashNativeLibStrings.`400` | reactDashNativeLib.reactDashNativeLibStrings.`500` | reactDashNativeLib.reactDashNativeLibStrings.`600` | reactDashNativeLib.reactDashNativeLibStrings.`700` | reactDashNativeLib.reactDashNativeLibStrings.`800` | reactDashNativeLib.reactDashNativeLibStrings.`900`
  ] = js.undefined
  var includeFontPadding: js.UndefOr[scala.Boolean] = js.undefined
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  var textAlign: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.left | reactDashNativeLib.reactDashNativeLibStrings.right | reactDashNativeLib.reactDashNativeLibStrings.center | reactDashNativeLib.reactDashNativeLibStrings.justify
  ] = js.undefined
  var textAlignVertical: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.top | reactDashNativeLib.reactDashNativeLibStrings.bottom | reactDashNativeLib.reactDashNativeLibStrings.center
  ] = js.undefined
  var textDecorationLine: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.underline | reactDashNativeLib.reactDashNativeLibStrings.`line-through` | (reactDashNativeLib.reactDashNativeLibStrings.`underline line-through`)
  ] = js.undefined
  var textShadowColor: js.UndefOr[java.lang.String] = js.undefined
  var textShadowOffset: js.UndefOr[reactDashNativeLib.Anon_Height] = js.undefined
  var textShadowRadius: js.UndefOr[scala.Double] = js.undefined
}

object TextStyle {
  @scala.inline
  def apply(
    TextStyleAndroid: TextStyleAndroid = null,
    TextStyleIOS: TextStyleIOS = null,
    color: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    fontStyle: reactDashNativeLib.reactDashNativeLibStrings.normal | reactDashNativeLib.reactDashNativeLibStrings.italic = null,
    fontWeight: reactDashNativeLib.reactDashNativeLibStrings.normal | reactDashNativeLib.reactDashNativeLibStrings.bold | reactDashNativeLib.reactDashNativeLibStrings.`100` | reactDashNativeLib.reactDashNativeLibStrings.`200` | reactDashNativeLib.reactDashNativeLibStrings.`300` | reactDashNativeLib.reactDashNativeLibStrings.`400` | reactDashNativeLib.reactDashNativeLibStrings.`500` | reactDashNativeLib.reactDashNativeLibStrings.`600` | reactDashNativeLib.reactDashNativeLibStrings.`700` | reactDashNativeLib.reactDashNativeLibStrings.`800` | reactDashNativeLib.reactDashNativeLibStrings.`900` = null,
    letterSpacing: scala.Int | scala.Double = null,
    lineHeight: scala.Int | scala.Double = null,
    testID: java.lang.String = null,
    textAlign: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.left | reactDashNativeLib.reactDashNativeLibStrings.right | reactDashNativeLib.reactDashNativeLibStrings.center | reactDashNativeLib.reactDashNativeLibStrings.justify = null,
    textDecorationColor: java.lang.String = null,
    textDecorationLine: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.underline | reactDashNativeLib.reactDashNativeLibStrings.`line-through` | (reactDashNativeLib.reactDashNativeLibStrings.`underline line-through`) = null,
    textDecorationStyle: reactDashNativeLib.reactDashNativeLibStrings.solid | reactDashNativeLib.reactDashNativeLibStrings.double | reactDashNativeLib.reactDashNativeLibStrings.dotted | reactDashNativeLib.reactDashNativeLibStrings.dashed = null,
    textShadowColor: java.lang.String = null,
    textShadowOffset: reactDashNativeLib.Anon_Height = null,
    textShadowRadius: scala.Int | scala.Double = null
  ): TextStyle = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, TextStyleAndroid)
    js.Dynamic.global.Object.assign(__obj, TextStyleIOS)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textDecorationColor != null) __obj.updateDynamic("textDecorationColor")(textDecorationColor)
    if (textDecorationLine != null) __obj.updateDynamic("textDecorationLine")(textDecorationLine.asInstanceOf[js.Any])
    if (textDecorationStyle != null) __obj.updateDynamic("textDecorationStyle")(textDecorationStyle.asInstanceOf[js.Any])
    if (textShadowColor != null) __obj.updateDynamic("textShadowColor")(textShadowColor)
    if (textShadowOffset != null) __obj.updateDynamic("textShadowOffset")(textShadowOffset)
    if (textShadowRadius != null) __obj.updateDynamic("textShadowRadius")(textShadowRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
}

