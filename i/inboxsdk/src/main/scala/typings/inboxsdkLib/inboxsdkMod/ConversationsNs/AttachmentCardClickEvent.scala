package typings
package inboxsdkLib.inboxsdkMod.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentCardClickEvent extends js.Object {
  def getDownloadURL(): js.Promise[java.lang.String]
}

object AttachmentCardClickEvent {
  @scala.inline
  def apply(getDownloadURL: () => js.Promise[java.lang.String]): AttachmentCardClickEvent = {
    val __obj = js.Dynamic.literal(getDownloadURL = js.Any.fromFunction0(getDownloadURL))
  
    __obj.asInstanceOf[AttachmentCardClickEvent]
  }
}

