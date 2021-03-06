package typings
package officeDashJsDashPreviewLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the binding that raised the section selection changed event
  *
  * [Api set: OneNoteApi 1.5]
  */
trait SectionSelectionChangedEventArgs extends js.Object {
  /**
    *
    * Active Section id before change
    *
    * [Api set: OneNoteApi 1.5]
    */
  var oldId: java.lang.String
  /**
    *
    * Gets the type of the event. See EventType for details.
    *
    * [Api set: OneNoteApi 1.5]
    */
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SectionSelectionChanged
}

object SectionSelectionChangedEventArgs {
  @scala.inline
  def apply(
    oldId: java.lang.String,
    `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SectionSelectionChanged
  ): SectionSelectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(oldId = oldId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SectionSelectionChangedEventArgs]
  }
}

