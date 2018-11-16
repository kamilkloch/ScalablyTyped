package typings
package gapiDotClientDotPlusdomainsLib.gapiNs.clientNs.plusdomainsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CirclesResource extends js.Object {
  /** Add a person to a circle. Google+ limits certain circle operations, including the number of circle adds. Learn More. */
  def addPeople(request: gapiDotClientDotPlusdomainsLib.Anon_Email): gapiDotClientLib.gapiNs.clientNs.Request[Circle]
  /** Get a circle. */
  def get(request: gapiDotClientDotPlusdomainsLib.Anon_PrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Circle]
  /** Create a new circle for the authenticated user. */
  def insert(request: gapiDotClientDotPlusdomainsLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[Circle]
  /** List all of the circles for a user. */
  def list(request: gapiDotClientDotPlusdomainsLib.Anon_MaxResultsPrettyPrintPageToken): gapiDotClientLib.gapiNs.clientNs.Request[CircleFeed]
  /** Update a circle's description. This method supports patch semantics. */
  def patch(request: gapiDotClientDotPlusdomainsLib.Anon_PrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Circle]
  /** Delete a circle. */
  def remove(request: gapiDotClientDotPlusdomainsLib.Anon_PrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Remove a person from a circle. */
  def removePeople(request: gapiDotClientDotPlusdomainsLib.Anon_Email): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Update a circle's description. */
  def update(request: gapiDotClientDotPlusdomainsLib.Anon_PrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Circle]
}
