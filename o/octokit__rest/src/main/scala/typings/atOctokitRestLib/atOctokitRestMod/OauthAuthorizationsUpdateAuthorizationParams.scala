package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsUpdateAuthorizationParams extends js.Object {
  /**
    * A list of scopes to add to this authorization.
    */
  var add_scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var authorization_id: scala.Double
  /**
    * A unique string to distinguish an authorization from others created for the same client ID and user.
    */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A note to remind you what the OAuth token is for. Tokens not associated with a specific OAuth application (i.e. personal access tokens) must have a unique note.
    */
  var note: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A URL to remind you what app the OAuth token is for.
    */
  var note_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of scopes to remove from this authorization.
    */
  var remove_scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Replaces the authorization scopes with these.
    */
  var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object OauthAuthorizationsUpdateAuthorizationParams {
  @scala.inline
  def apply(
    authorization_id: scala.Double,
    add_scopes: js.Array[java.lang.String] = null,
    fingerprint: java.lang.String = null,
    note: java.lang.String = null,
    note_url: java.lang.String = null,
    remove_scopes: js.Array[java.lang.String] = null,
    scopes: js.Array[java.lang.String] = null
  ): OauthAuthorizationsUpdateAuthorizationParams = {
    val __obj = js.Dynamic.literal(authorization_id = authorization_id)
    if (add_scopes != null) __obj.updateDynamic("add_scopes")(add_scopes)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (note != null) __obj.updateDynamic("note")(note)
    if (note_url != null) __obj.updateDynamic("note_url")(note_url)
    if (remove_scopes != null) __obj.updateDynamic("remove_scopes")(remove_scopes)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[OauthAuthorizationsUpdateAuthorizationParams]
  }
}

