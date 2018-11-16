package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NodeEditEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the event object
               */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the id of the element
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** returns the TreeView model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the newText of the element
               */
  var newText: js.UndefOr[java.lang.String] = js.undefined
  /** returns the given target node values
               */
  var nodeDetails: js.UndefOr[js.Any] = js.undefined
  /** returns the oldText of the element
               */
  var oldText: js.UndefOr[java.lang.String] = js.undefined
  /** returns the target element, the given node to be cut
               */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}
