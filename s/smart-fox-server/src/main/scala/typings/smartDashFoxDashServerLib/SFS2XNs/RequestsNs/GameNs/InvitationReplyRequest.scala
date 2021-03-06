package typings
package smartDashFoxDashServerLib.SFS2XNs.RequestsNs.GameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.Game.InvitationReplyRequest")
@js.native
class InvitationReplyRequest protected () extends js.Object {
  /**
    * Creates a new InvitationReplyRequest instance.
    * @param {IINVITATION} invitation      An instance of the Invitation class containing the invitation details (inviter, custom parameters, etc).
    * @param {number}      invitationReply The answer to be sent to the inviter, among those available as constants in the InvitationReply class.
    * @param {Object}      [params=null]          An object containing custom parameters to be returned to the inviter together with the reply (for example a message describing the reason of refusal).
    */
  def this(invitation: smartDashFoxDashServerLib.SFS2XNs.IINVITATION, invitationReply: scala.Double) = this()
  def this(invitation: smartDashFoxDashServerLib.SFS2XNs.IINVITATION, invitationReply: scala.Double, params: js.Object) = this()
}

