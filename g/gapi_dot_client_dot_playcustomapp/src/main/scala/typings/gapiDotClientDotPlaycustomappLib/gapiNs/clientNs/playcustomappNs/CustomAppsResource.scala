package typings
package gapiDotClientDotPlaycustomappLib.gapiNs.clientNs.playcustomappNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAppsResource extends js.Object {
  /** Create and publish a new custom app. */
  def create(request: gapiDotClientDotPlaycustomappLib.Anon_Account): gapiDotClientLib.gapiNs.clientNs.Request[CustomApp]
}

object CustomAppsResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotPlaycustomappLib.Anon_Account => gapiDotClientLib.gapiNs.clientNs.Request[CustomApp]
  ): CustomAppsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[CustomAppsResource]
  }
}

