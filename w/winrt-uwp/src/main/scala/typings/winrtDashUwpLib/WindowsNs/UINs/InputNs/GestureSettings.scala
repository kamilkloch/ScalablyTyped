package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GestureSettings extends js.Object

/** Specifies the interactions that are supported by an application. */
@JSGlobal("Windows.UI.Input.GestureSettings")
@js.native
object GestureSettings extends js.Object {
  /** Enable support for the CrossSliding interaction when using the slide or swipe gesture through a single touch contact. */
  @js.native
  sealed trait crossSlide
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings
  
  /** Enable support for the double-tap gesture. */
  @js.native
  sealed trait doubleTap
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings
  
  /** Enable support for the slide or swipe gesture with a mouse or pen/stylus (single contact). The Dragging event is raised when either gesture is detected. */
  @js.native
  sealed trait drag
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings
  
  /** Enable support for the press and hold gesture (from a single touch or pen/stylus contact). The Holding event is raised if a time threshold is crossed before the contact is lifted, an additional contact is detected, or a gesture is started. */
  @js.native
  sealed trait hold
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings
  
  /** Enable support for the press and hold gesture through the left button on a mouse. The Holding event is raised if a time threshold is crossed before the left button is released or a gesture is started. */
  @js.native
  sealed trait holdWithMouse
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings
  
  /** Enable panning and disable zoom when two or more touch contacts are detected. */
  @js.native
  sealed trait manipulationMultipleFingerPanning
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings
  
  /** Enable support for the rotation gesture through pointer input. The ManipulationStarted , ManipulationUpdated , and ManipulationCompleted events are all raised during the course of this interaction. */
  @js.native
  sealed trait manipulationRotate
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings
  
  /** Enable support for rotation inertia after the rotate gesture (through pointer input) is complete. The ManipulationInertiaStarting event is raised if inertia is enabled. */
  @js.native
  sealed trait manipulationRotateInertia
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings
  
  /** Enable support for the pinch or stretch gesture through pointer input. */
  @js.native
  sealed trait manipulationScale
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings
  
  /** Enable support for scaling inertia after the pinch or stretch gesture (through pointer input) is complete. The ManipulationInertiaStarting event is raised if inertia is enabled. */
  @js.native
  sealed trait manipulationScaleInertia
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings
  
  /** Enable support for translation inertia after the slide gesture (through pointer input) is complete. The ManipulationInertiaStarting event is raised if inertia is enabled. */
  @js.native
  sealed trait manipulationTranslateInertia
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings
  
  /** Enable support for the slide gesture through pointer input, on the horizontal axis using rails (guides). The ManipulationStarted , ManipulationUpdated , and ManipulationCompleted events are all raised during the course of this interaction. */
  @js.native
  sealed trait manipulationTranslateRailsX
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings
  
  /** Enable support for the slide gesture through pointer input, on the vertical axis using rails (guides). The ManipulationStarted , ManipulationUpdated , and ManipulationCompleted events are all raised during the course of this interaction. */
  @js.native
  sealed trait manipulationTranslateRailsY
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings
  
  /** Enable support for the slide gesture through pointer input, on the horizontal axis. The ManipulationStarted , ManipulationUpdated , and ManipulationCompleted events are all raised during the course of this interaction. */
  @js.native
  sealed trait manipulationTranslateX
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings
  
  /** Enable support for the slide gesture through pointer input, on the vertical axis. The ManipulationStarted , ManipulationUpdated , and ManipulationCompleted events are all raised during the course of this interaction. */
  @js.native
  sealed trait manipulationTranslateY
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings
  
  /** Disable support for gestures and manipulations. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings
  
  /** Enable support for a right-tap interaction. The RightTapped event is raised when the contact is lifted or the mouse button released. */
  @js.native
  sealed trait rightTap
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings
  
  /** Enable support for the tap gesture. */
  @js.native
  sealed trait tap
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings
  
  val crossSlide: crossSlide with java.lang.String = js.native
  val doubleTap: doubleTap with java.lang.String = js.native
  val drag: drag with java.lang.String = js.native
  val hold: hold with java.lang.String = js.native
  val holdWithMouse: holdWithMouse with java.lang.String = js.native
  val manipulationMultipleFingerPanning: manipulationMultipleFingerPanning with java.lang.String = js.native
  val manipulationRotate: manipulationRotate with java.lang.String = js.native
  val manipulationRotateInertia: manipulationRotateInertia with java.lang.String = js.native
  val manipulationScale: manipulationScale with java.lang.String = js.native
  val manipulationScaleInertia: manipulationScaleInertia with java.lang.String = js.native
  val manipulationTranslateInertia: manipulationTranslateInertia with java.lang.String = js.native
  val manipulationTranslateRailsX: manipulationTranslateRailsX with java.lang.String = js.native
  val manipulationTranslateRailsY: manipulationTranslateRailsY with java.lang.String = js.native
  val manipulationTranslateX: manipulationTranslateX with java.lang.String = js.native
  val manipulationTranslateY: manipulationTranslateY with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val rightTap: rightTap with java.lang.String = js.native
  val tap: tap with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.InputNs.GestureSettings with java.lang.String] = js.native
}
