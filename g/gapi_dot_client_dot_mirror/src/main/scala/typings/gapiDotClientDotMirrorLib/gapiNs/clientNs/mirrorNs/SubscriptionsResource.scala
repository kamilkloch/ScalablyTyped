package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsResource extends js.Object {
  /** Deletes a subscription. */
  def delete(request: gapiDotClientDotMirrorLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Creates a new subscription. */
  def insert(request: gapiDotClientDotMirrorLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  /** Retrieves a list of subscriptions for the authenticated user and service. */
  def list(request: gapiDotClientDotMirrorLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[SubscriptionsListResponse]
  /** Updates an existing subscription in place. */
  def update(request: gapiDotClientDotMirrorLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
}

object SubscriptionsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotMirrorLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    insert: gapiDotClientDotMirrorLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Subscription],
    list: gapiDotClientDotMirrorLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[SubscriptionsListResponse],
    update: gapiDotClientDotMirrorLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Subscription]
  ): SubscriptionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[SubscriptionsResource]
  }
}

