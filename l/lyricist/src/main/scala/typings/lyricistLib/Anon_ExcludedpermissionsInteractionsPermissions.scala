package typings
package lyricistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExcludedpermissionsInteractionsPermissions extends js.Object {
  var excluded_permissions: js.Array[java.lang.String]
  var interactions: Anon_FollowingBoolean
  var permissions: js.Array[java.lang.String]
}

object Anon_ExcludedpermissionsInteractionsPermissions {
  @scala.inline
  def apply(
    excluded_permissions: js.Array[java.lang.String],
    interactions: Anon_FollowingBoolean,
    permissions: js.Array[java.lang.String]
  ): Anon_ExcludedpermissionsInteractionsPermissions = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions, interactions = interactions, permissions = permissions)
  
    __obj.asInstanceOf[Anon_ExcludedpermissionsInteractionsPermissions]
  }
}

