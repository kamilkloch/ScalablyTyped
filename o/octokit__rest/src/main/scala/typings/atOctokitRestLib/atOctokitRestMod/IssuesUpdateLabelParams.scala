package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateLabelParams extends js.Object {
  /**
    * The [hexadecimal color code](http://www.color-hex.com/) for the label, without the leading `#`.
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  var current_name: java.lang.String
  /**
    * A short description of the label.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The new name of the label. Emoji can be added to label names, using either native emoji or colon-style markup. For example, typing `:strawberry:` will render the emoji ![:strawberry:](https://github.githubassets.com/images/icons/emoji/unicode/1f353.png ":strawberry:"). For a full list of available emoji and codes, see [emoji-cheat-sheet.com](http://emoji-cheat-sheet.com/).
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesUpdateLabelParams {
  @scala.inline
  def apply(
    current_name: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    color: java.lang.String = null,
    description: java.lang.String = null,
    name: java.lang.String = null
  ): IssuesUpdateLabelParams = {
    val __obj = js.Dynamic.literal(current_name = current_name, owner = owner, repo = repo)
    if (color != null) __obj.updateDynamic("color")(color)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IssuesUpdateLabelParams]
  }
}

