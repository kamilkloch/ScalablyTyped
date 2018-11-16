package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * A DiagramEvent represents a more abstract event than an InputEvent.
    * They are raised on the Diagram class.
    * One can receive such events by registering a DiagramEvent listener on a Diagram
    * by calling Diagram.addDiagramListener.
    * Some DiagramEvents such as "ObjectSingleClicked" are normally
    * associated with InputEvents.
    * Some DiagramEvents such as "SelectionMoved" or "PartRotated" are associated with the
    * results of Tool-handled gestures or CommandHandler actions.
    * Some DiagramEvents are not necessarily associated with any input events at all,
    * such as "ViewportBoundsChanged", which can happen due to programmatic
    * changes to the Diagram.position and Diagram.scale properties.
    */
@JSImport("go", "DiagramEvent")
@js.native
class DiagramEvent ()
  extends goLib.goMod.goNs.DiagramEvent {
  /**Gets or sets whether any default actions associated with this diagram event should be avoided or cancelled.*/
  /* CompleteClass */
  override var cancel: scala.Boolean = js.native
  /**This read-only property returns the diagram associated with the event.*/
  /* CompleteClass */
  override var diagram: goLib.goMod.goNs.Diagram = js.native
  /**Gets or sets the name of the kind of diagram event that this represents.*/
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**Gets or sets an optional object that describes the change to the subject of the diagram event.*/
  /* CompleteClass */
  override var parameter: js.Any = js.native
  /**Gets or sets an optional object that is the subject of the diagram event.*/
  /* CompleteClass */
  override var subject: js.Any = js.native
}
