package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Builds strokes from raw pointer input. */
@JSGlobal("Windows.UI.Input.Inking.InkStrokeBuilder")
@js.native
/** Creates a new InkStrokeBuilder object that is used to construct InkStroke objects. */
class InkStrokeBuilder () extends js.Object {
  /**
    * Adds a new segment to the ink stroke.
    * @param pointerPoint The end point of the new segment.
    * @return The previous end point. This end point can be used when rendering the stroke.
    */
  def appendToStroke(pointerPoint: winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerPoint): winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerPoint = js.native
  /**
    * Starts building the ink stroke.
    * @param pointerPoint The first point for the stroke.
    */
  def beginStroke(pointerPoint: winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerPoint): scala.Unit = js.native
  /**
    * Creates a stroke from an array of Point coordinates.
    * @param points An array of Point coordinates.
    * @return The new stroke.
    */
  def createStroke(
    points: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.FoundationNs.Point]
  ): InkStroke = js.native
  /**
    * Creates a stroke from collection of InkPoint objects.
    * @param inkPoints The collection of InkPoint objects.
    * @param transform A 2-D transformation matrix.
    * @return The ink stroke, including the Bézier curve parameters used for final rendering of the stroke.
    */
  def createStrokeFromInkPoints(
    inkPoints: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[InkPoint],
    transform: winrtDashUwpLib.WindowsNs.FoundationNs.NumericsNs.Matrix3x2
  ): InkStroke = js.native
  /**
    * Stops building the ink stroke.
    * @param pointerPoint The last point for the stroke.
    * @return The stroke built from the points.
    */
  def endStroke(pointerPoint: winrtDashUwpLib.WindowsNs.UINs.InputNs.PointerPoint): InkStroke = js.native
  /**
    * Sets the default InkDrawingAttributes for all new ink strokes created after the current stroke.
    * @param drawingAttributes The default attributes.
    */
  def setDefaultDrawingAttributes(drawingAttributes: InkDrawingAttributes): scala.Unit = js.native
}

