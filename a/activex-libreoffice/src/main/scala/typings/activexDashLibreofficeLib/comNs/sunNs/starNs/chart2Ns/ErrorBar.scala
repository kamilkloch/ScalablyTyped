package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorBar
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSink
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XDataSource {
  /** @see com.sun.star.chart.ErrorBarStyle */
  var ErrorBarStyle: scala.Double
  var NegativeError: scala.Double
  var PositiveError: scala.Double
  var ShowNegativeError: scala.Boolean
  var ShowPositiveError: scala.Boolean
  /** The weight for the standard deviation. */
  var Weight: scala.Double
}

object ErrorBar {
  @scala.inline
  def apply(
    DataSequences: stdLib.SafeArray[
      activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XLabeledDataSequence
    ],
    ErrorBarStyle: scala.Double,
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
    NegativeError: scala.Double,
    PositiveError: scala.Double,
    ShowNegativeError: scala.Boolean,
    ShowPositiveError: scala.Boolean,
    Weight: scala.Double,
    acquire: () => scala.Unit,
    getDataSequences: () => stdLib.SafeArray[
      activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XLabeledDataSequence
    ],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XLabeledDataSequence
    ] => scala.Unit
  ): ErrorBar = {
    val __obj = js.Dynamic.literal(DataSequences = DataSequences, ErrorBarStyle = ErrorBarStyle, LineCap = LineCap, LineColor = LineColor, LineDash = LineDash, LineDashName = LineDashName, LineEnd = LineEnd, LineEndCenter = LineEndCenter, LineEndName = LineEndName, LineEndWidth = LineEndWidth, LineJoint = LineJoint, LineStart = LineStart, LineStartCenter = LineStartCenter, LineStartName = LineStartName, LineStartWidth = LineStartWidth, LineStyle = LineStyle, LineTransparence = LineTransparence, LineWidth = LineWidth, NegativeError = NegativeError, PositiveError = PositiveError, ShowNegativeError = ShowNegativeError, ShowPositiveError = ShowPositiveError, Weight = Weight, acquire = js.Any.fromFunction0(acquire), getDataSequences = js.Any.fromFunction0(getDataSequences), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setData = js.Any.fromFunction1(setData))
  
    __obj.asInstanceOf[ErrorBar]
  }
}

