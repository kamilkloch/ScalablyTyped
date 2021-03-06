package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProposalResource extends js.Object {
  /** Creates a GTM Workspace Proposal. */
  def create(request: gapiDotClientDotTagmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[WorkspaceProposal]
  /** Deletes a GTM Workspace Proposal. */
  def delete(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

object ProposalResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotTagmanagerLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[WorkspaceProposal],
    delete: gapiDotClientDotTagmanagerLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  ): ProposalResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete))
  
    __obj.asInstanceOf[ProposalResource]
  }
}

