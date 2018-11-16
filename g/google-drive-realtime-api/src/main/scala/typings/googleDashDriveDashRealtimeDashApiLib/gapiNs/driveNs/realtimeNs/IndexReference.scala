package typings
package googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.drive.realtime.IndexReference")
@js.native
class IndexReference[V] () extends CollaborativeObject {
  //The index of the current location the reference points to. Write to this property to change the referenced index.
  var index: scala.Double = js.native
  // The behavior of this index reference when the element it points at is deleted.
  // @return one of the elements of DeleteMode
  def deleteMode(): java.lang.String = js.native
  // The object this reference points to. Read-only.
  def referencedObject(): V = js.native
}

@JSGlobal("gapi.drive.realtime.IndexReference")
@js.native
object IndexReference extends js.Object {
  // (Categories of) the shift behavior of an index reference when the element it points at is deleted.
  var DeleteMode: googleDashDriveDashRealtimeDashApiLib.Anon_SHIFTAFTERDELETE = js.native
}
