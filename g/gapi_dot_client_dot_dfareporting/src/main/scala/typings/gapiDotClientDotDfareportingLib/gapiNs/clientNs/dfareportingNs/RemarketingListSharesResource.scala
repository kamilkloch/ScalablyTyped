package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingListSharesResource extends js.Object {
  /** Gets one remarketing list share by remarketing list ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[RemarketingListShare]
  /** Updates an existing remarketing list share. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[RemarketingListShare]
  /** Updates an existing remarketing list share. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[RemarketingListShare]
}

object RemarketingListSharesResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[RemarketingListShare],
    patch: gapiDotClientDotDfareportingLib.Anon_AltFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[RemarketingListShare],
    update: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[RemarketingListShare]
  ): RemarketingListSharesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RemarketingListSharesResource]
  }
}

