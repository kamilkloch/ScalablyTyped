package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/PrivateMessage.html
	 */
@JSGlobal("PrivateMessage")
@js.native
class PrivateMessage () extends Message {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/PrivateMessage.html#method_getReceivingUsers
  		 */
  def getReceivingUsers(): js.Array[User] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/PrivateMessage.html#method_sendReply
  		 */
  def sendReply(text: java.lang.String): scala.Unit = js.native
}

