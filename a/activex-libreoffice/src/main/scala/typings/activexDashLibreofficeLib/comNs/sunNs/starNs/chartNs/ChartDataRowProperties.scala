package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the properties for a group of graphic elements which belong to a data row (also known as data series).
  *
  * For this service, the properties supported by {@link ChartDataPointProperties} are applied to all data point elements contained in this group. They
  * serve as a template; thus, when changing a data point property afterwards
  * @see ChartDataPointProperties
  */
trait ChartDataRowProperties
  extends ChartDataPointProperties
     with ChartStatistics {
  /**
    * determines to which axis the data row is assigned.
    *
    * The axis must be a primary or secondary y-axis
    * @see ChartAxisAssign
    * @see ChartAxisYSupplier
    * @see ChartTwoAxisYSupplier
    */
  var Axis: scala.Double
  /**
    * holds the properties of the error markers, if those are enabled.
    * @see ChartLine
    * @see ChartStatistics
    */
  var DataErrorProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * holds the properties of the average line, if such one is enabled.
    * @see ChartLine
    * @see ChartStatistics
    */
  var DataMeanValueProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * holds the properties of the regression line, if such one is enabled.
    * @see ChartLine
    * @see ChartStatistics
    */
  var DataRegressionProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object ChartDataRowProperties {
  @scala.inline
  def apply(
    Axis: scala.Double,
    CharAutoKerning: scala.Boolean,
    CharBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharBackTransparent: scala.Boolean,
    CharBorderDistance: scala.Double,
    CharBottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    CharBottomBorderDistance: scala.Double,
    CharCaseMap: scala.Double,
    CharColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharCombineIsOn: scala.Boolean,
    CharCombinePrefix: java.lang.String,
    CharCombineSuffix: java.lang.String,
    CharContoured: scala.Boolean,
    CharCrossedOut: scala.Boolean,
    CharEmphasis: scala.Double,
    CharEscapement: scala.Double,
    CharEscapementHeight: scala.Double,
    CharFlash: scala.Boolean,
    CharFontCharSet: scala.Double,
    CharFontFamily: scala.Double,
    CharFontName: java.lang.String,
    CharFontPitch: scala.Double,
    CharFontStyleName: java.lang.String,
    CharFontType: scala.Double,
    CharHeight: scala.Double,
    CharHidden: scala.Boolean,
    CharHighlight: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharInteropGrabBag: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    CharKeepTogether: scala.Boolean,
    CharKerning: scala.Double,
    CharLeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    CharLeftBorderDistance: scala.Double,
    CharLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    CharNoHyphenation: scala.Boolean,
    CharNoLineBreak: scala.Boolean,
    CharPosture: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontSlant,
    CharRelief: scala.Double,
    CharRightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    CharRightBorderDistance: scala.Double,
    CharRotation: scala.Double,
    CharRotationIsFitToLine: scala.Boolean,
    CharScaleWidth: scala.Double,
    CharShadingValue: scala.Double,
    CharShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat,
    CharShadowed: scala.Boolean,
    CharStrikeout: scala.Double,
    CharStyleName: java.lang.String,
    CharStyleNames: stdLib.SafeArray[java.lang.String],
    CharTopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    CharTopBorderDistance: scala.Double,
    CharUnderline: scala.Double,
    CharUnderlineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CharUnderlineHasColor: scala.Boolean,
    CharWeight: scala.Double,
    CharWordMode: scala.Boolean,
    ConstantErrorHigh: scala.Double,
    ConstantErrorLow: scala.Double,
    DataCaption: scala.Double,
    DataErrorProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    DataMeanValueProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    DataRegressionProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ErrorBarRangeNegative: java.lang.String,
    ErrorBarRangePositive: java.lang.String,
    ErrorBarStyle: scala.Double,
    ErrorCategory: ChartErrorCategory,
    ErrorIndicator: ChartErrorIndicatorType,
    ErrorMargin: scala.Double,
    FillBackground: scala.Boolean,
    FillBitmap: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XBitmap,
    FillBitmapLogicalSize: scala.Boolean,
    FillBitmapMode: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.BitmapMode,
    FillBitmapName: java.lang.String,
    FillBitmapOffsetX: scala.Double,
    FillBitmapOffsetY: scala.Double,
    FillBitmapPositionOffsetX: scala.Double,
    FillBitmapPositionOffsetY: scala.Double,
    FillBitmapRectanglePoint: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.RectanglePoint,
    FillBitmapSizeX: scala.Double,
    FillBitmapSizeY: scala.Double,
    FillBitmapStretch: scala.Boolean,
    FillBitmapTile: scala.Boolean,
    FillBitmapURL: java.lang.String,
    FillColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    FillGradient: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Gradient,
    FillGradientName: java.lang.String,
    FillHatch: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Hatch,
    FillHatchName: java.lang.String,
    FillStyle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.FillStyle,
    FillTransparence: scala.Double,
    FillTransparenceGradient: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Gradient,
    FillTransparenceGradientName: java.lang.String,
    GraphicCrop: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.GraphicCrop,
    HyperLinkName: java.lang.String,
    HyperLinkTarget: java.lang.String,
    HyperLinkURL: java.lang.String,
    LabelPlacement: scala.Double,
    LabelSeparator: java.lang.String,
    LineCap: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineCap,
    LineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    LineDash: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineDash,
    LineDashName: java.lang.String,
    LineEnd: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolyPolygonBezierCoords,
    LineEndCenter: scala.Boolean,
    LineEndName: java.lang.String,
    LineEndWidth: scala.Double,
    LineJoint: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineJoint,
    LineStart: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolyPolygonBezierCoords,
    LineStartCenter: scala.Boolean,
    LineStartName: java.lang.String,
    LineStartWidth: scala.Double,
    LineStyle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineStyle,
    LineTransparence: scala.Double,
    LineWidth: scala.Double,
    MeanValue: scala.Boolean,
    NumberFormat: scala.Double,
    PercentageError: scala.Double,
    PercentageNumberFormat: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RegressionCurves: ChartRegressionCurveType,
    RubyAdjust: scala.Double,
    RubyCharStyleName: java.lang.String,
    RubyIsAbove: scala.Boolean,
    RubyText: java.lang.String,
    SegmentOffset: scala.Double,
    SolidType: scala.Double,
    SymbolBitmapURL: java.lang.String,
    SymbolType: scala.Double,
    TextUserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    TextWordWrap: scala.Boolean,
    UnvisitedCharStyleName: java.lang.String,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    VisitedCharStyleName: java.lang.String,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): ChartDataRowProperties = {
    val __obj = js.Dynamic.literal(Axis = Axis, CharAutoKerning = CharAutoKerning, CharBackColor = CharBackColor, CharBackTransparent = CharBackTransparent, CharBorderDistance = CharBorderDistance, CharBottomBorder = CharBottomBorder, CharBottomBorderDistance = CharBottomBorderDistance, CharCaseMap = CharCaseMap, CharColor = CharColor, CharCombineIsOn = CharCombineIsOn, CharCombinePrefix = CharCombinePrefix, CharCombineSuffix = CharCombineSuffix, CharContoured = CharContoured, CharCrossedOut = CharCrossedOut, CharEmphasis = CharEmphasis, CharEscapement = CharEscapement, CharEscapementHeight = CharEscapementHeight, CharFlash = CharFlash, CharFontCharSet = CharFontCharSet, CharFontFamily = CharFontFamily, CharFontName = CharFontName, CharFontPitch = CharFontPitch, CharFontStyleName = CharFontStyleName, CharFontType = CharFontType, CharHeight = CharHeight, CharHidden = CharHidden, CharHighlight = CharHighlight, CharInteropGrabBag = CharInteropGrabBag, CharKeepTogether = CharKeepTogether, CharKerning = CharKerning, CharLeftBorder = CharLeftBorder, CharLeftBorderDistance = CharLeftBorderDistance, CharLocale = CharLocale, CharNoHyphenation = CharNoHyphenation, CharNoLineBreak = CharNoLineBreak, CharPosture = CharPosture, CharRelief = CharRelief, CharRightBorder = CharRightBorder, CharRightBorderDistance = CharRightBorderDistance, CharRotation = CharRotation, CharRotationIsFitToLine = CharRotationIsFitToLine, CharScaleWidth = CharScaleWidth, CharShadingValue = CharShadingValue, CharShadowFormat = CharShadowFormat, CharShadowed = CharShadowed, CharStrikeout = CharStrikeout, CharStyleName = CharStyleName, CharStyleNames = CharStyleNames, CharTopBorder = CharTopBorder, CharTopBorderDistance = CharTopBorderDistance, CharUnderline = CharUnderline, CharUnderlineColor = CharUnderlineColor, CharUnderlineHasColor = CharUnderlineHasColor, CharWeight = CharWeight, CharWordMode = CharWordMode, ConstantErrorHigh = ConstantErrorHigh, ConstantErrorLow = ConstantErrorLow, DataCaption = DataCaption, DataErrorProperties = DataErrorProperties, DataMeanValueProperties = DataMeanValueProperties, DataRegressionProperties = DataRegressionProperties, ErrorBarRangeNegative = ErrorBarRangeNegative, ErrorBarRangePositive = ErrorBarRangePositive, ErrorBarStyle = ErrorBarStyle, ErrorCategory = ErrorCategory, ErrorIndicator = ErrorIndicator, ErrorMargin = ErrorMargin, FillBackground = FillBackground, FillBitmap = FillBitmap, FillBitmapLogicalSize = FillBitmapLogicalSize, FillBitmapMode = FillBitmapMode, FillBitmapName = FillBitmapName, FillBitmapOffsetX = FillBitmapOffsetX, FillBitmapOffsetY = FillBitmapOffsetY, FillBitmapPositionOffsetX = FillBitmapPositionOffsetX, FillBitmapPositionOffsetY = FillBitmapPositionOffsetY, FillBitmapRectanglePoint = FillBitmapRectanglePoint, FillBitmapSizeX = FillBitmapSizeX, FillBitmapSizeY = FillBitmapSizeY, FillBitmapStretch = FillBitmapStretch, FillBitmapTile = FillBitmapTile, FillBitmapURL = FillBitmapURL, FillColor = FillColor, FillGradient = FillGradient, FillGradientName = FillGradientName, FillHatch = FillHatch, FillHatchName = FillHatchName, FillStyle = FillStyle, FillTransparence = FillTransparence, FillTransparenceGradient = FillTransparenceGradient, FillTransparenceGradientName = FillTransparenceGradientName, GraphicCrop = GraphicCrop, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, LabelPlacement = LabelPlacement, LabelSeparator = LabelSeparator, LineCap = LineCap, LineColor = LineColor, LineDash = LineDash, LineDashName = LineDashName, LineEnd = LineEnd, LineEndCenter = LineEndCenter, LineEndName = LineEndName, LineEndWidth = LineEndWidth, LineJoint = LineJoint, LineStart = LineStart, LineStartCenter = LineStartCenter, LineStartName = LineStartName, LineStartWidth = LineStartWidth, LineStyle = LineStyle, LineTransparence = LineTransparence, LineWidth = LineWidth, MeanValue = MeanValue, NumberFormat = NumberFormat, PercentageError = PercentageError, PercentageNumberFormat = PercentageNumberFormat, PropertySetInfo = PropertySetInfo, RegressionCurves = RegressionCurves, RubyAdjust = RubyAdjust, RubyCharStyleName = RubyCharStyleName, RubyIsAbove = RubyIsAbove, RubyText = RubyText, SegmentOffset = SegmentOffset, SolidType = SolidType, SymbolBitmapURL = SymbolBitmapURL, SymbolType = SymbolType, TextUserDefinedAttributes = TextUserDefinedAttributes, TextWordWrap = TextWordWrap, UnvisitedCharStyleName = UnvisitedCharStyleName, UserDefinedAttributes = UserDefinedAttributes, VisitedCharStyleName = VisitedCharStyleName, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[ChartDataRowProperties]
  }
}

