package typings
package officeDashJsDashPreviewLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the binding that raised the DataChanged event
  *
  * [Api set: OneNoteApi 1.1]
  */
trait NotebookChangedEventArgs extends js.Object {
  /**
    *
    * Notebook id before change
    *
    * [Api set: OneNoteApi 1.3]
    */
  var oldId: java.lang.String
  /**
    *
    * Gets the type of the event. See EventType for details.
    *
    * [Api set: OneNoteApi 1.3]
    */
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NotebookChanged
}

object NotebookChangedEventArgs {
  @scala.inline
  def apply(
    oldId: java.lang.String,
    `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NotebookChanged
  ): NotebookChangedEventArgs = {
    val __obj = js.Dynamic.literal(oldId = oldId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NotebookChangedEventArgs]
  }
}

