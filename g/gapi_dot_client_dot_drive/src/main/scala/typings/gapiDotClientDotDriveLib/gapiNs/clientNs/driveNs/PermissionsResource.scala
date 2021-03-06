package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsResource extends js.Object {
  /** Creates a permission for a file or Team Drive. */
  def create(request: gapiDotClientDotDriveLib.Anon_AltEmailMessage): gapiDotClientLib.gapiNs.clientNs.Request[Permission]
  /** Deletes a permission. */
  def delete(request: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a permission by ID. */
  def get(request: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Permission]
  /** Lists a file's or Team Drive's permissions. */
  def list(request: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtokenPageSize): gapiDotClientLib.gapiNs.clientNs.Request[PermissionList]
  /** Updates a permission with patch semantics. */
  def update(request: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtokenPermissionId): gapiDotClientLib.gapiNs.clientNs.Request[Permission]
}

object PermissionsResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotDriveLib.Anon_AltEmailMessage => gapiDotClientLib.gapiNs.clientNs.Request[Permission],
    delete: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[Permission],
    list: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtokenPageSize => gapiDotClientLib.gapiNs.clientNs.Request[PermissionList],
    update: gapiDotClientDotDriveLib.Anon_AltFieldsFileIdKeyOauthtokenPermissionId => gapiDotClientLib.gapiNs.clientNs.Request[Permission]
  ): PermissionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PermissionsResource]
  }
}

