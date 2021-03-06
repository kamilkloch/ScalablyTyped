package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCreateParams extends js.Object {
  /**
    * The description of the team.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The logins of organization members to add as maintainers of the team.
    */
  var maintainers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The name of the team.
    */
  var name: java.lang.String
  var org: java.lang.String
  /**
    * The ID of a team to set as the parent team. **Note**: You must pass the `hellcat-preview` media type to use this parameter.
    */
  var parent_team_id: js.UndefOr[scala.Double] = js.undefined
  /**
    * **Deprecated**. The permission that new repositories will be added to the team with when none is specified. Can be one of:
    * \* `pull` - team members can pull, but not push to or administer newly-added repositories.
    * \* `push` - team members can pull and push, but not administer newly-added repositories.
    * \* `admin` - team members can pull, push and administer newly-added repositories.
    */
  var permission: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.pull | atOctokitRestLib.atOctokitRestLibStrings.push | atOctokitRestLib.atOctokitRestLibStrings.admin
  ] = js.undefined
  /**
    * The level of privacy this team should have. The options are:
    * **For a non-nested team:**
    * \* `secret` - only visible to organization owners and members of this team.
    * \* `closed` - visible to all members of this organization.
    * Default: `secret`
    * **For a parent or child team:**
    * \* `closed` - visible to all members of this organization.
    * Default for child team: `closed`
    * **Note**: You must pass the `hellcat-preview` media type to set privacy default to `closed` for child teams. **For a parent or child team:**
    */
  var privacy: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.secret | atOctokitRestLib.atOctokitRestLibStrings.closed
  ] = js.undefined
  /**
    * The full name (e.g., "organization-name/repository-name") of repositories to add the team to.
    */
  var repo_names: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TeamsCreateParams {
  @scala.inline
  def apply(
    name: java.lang.String,
    org: java.lang.String,
    description: java.lang.String = null,
    maintainers: js.Array[java.lang.String] = null,
    parent_team_id: scala.Int | scala.Double = null,
    permission: atOctokitRestLib.atOctokitRestLibStrings.pull | atOctokitRestLib.atOctokitRestLibStrings.push | atOctokitRestLib.atOctokitRestLibStrings.admin = null,
    privacy: atOctokitRestLib.atOctokitRestLibStrings.secret | atOctokitRestLib.atOctokitRestLibStrings.closed = null,
    repo_names: js.Array[java.lang.String] = null
  ): TeamsCreateParams = {
    val __obj = js.Dynamic.literal(name = name, org = org)
    if (description != null) __obj.updateDynamic("description")(description)
    if (maintainers != null) __obj.updateDynamic("maintainers")(maintainers)
    if (parent_team_id != null) __obj.updateDynamic("parent_team_id")(parent_team_id.asInstanceOf[js.Any])
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    if (privacy != null) __obj.updateDynamic("privacy")(privacy.asInstanceOf[js.Any])
    if (repo_names != null) __obj.updateDynamic("repo_names")(repo_names)
    __obj.asInstanceOf[TeamsCreateParams]
  }
}

