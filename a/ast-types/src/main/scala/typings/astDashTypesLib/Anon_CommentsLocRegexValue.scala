package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocRegexValue extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var regex: js.UndefOr[Anon_Flags | scala.Null] = js.undefined
  var value: java.lang.String
}

object Anon_CommentsLocRegexValue {
  @scala.inline
  def apply(
    value: java.lang.String,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    regex: Anon_Flags = null
  ): Anon_CommentsLocRegexValue = {
    val __obj = js.Dynamic.literal(value = value)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[Anon_CommentsLocRegexValue]
  }
}

