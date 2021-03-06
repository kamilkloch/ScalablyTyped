package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomchannelsResource extends js.Object {
  /** Get the specified custom channel from the specified ad client. */
  def get(request: gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAdClientId): gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel]
  /** List all custom channels in the specified ad client for this Ad Exchange account. */
  def list(request: gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAdClientIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[CustomChannels]
}

object CustomchannelsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAdClientId => gapiDotClientLib.gapiNs.clientNs.Request[CustomChannel],
    list: gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAdClientIdAlt => gapiDotClientLib.gapiNs.clientNs.Request[CustomChannels]
  ): CustomchannelsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CustomchannelsResource]
  }
}

