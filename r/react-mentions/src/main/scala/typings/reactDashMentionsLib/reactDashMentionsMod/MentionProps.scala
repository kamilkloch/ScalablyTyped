package typings
package reactDashMentionsLib.reactDashMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionProps extends js.Object {
  var appendSpaceOnAdd: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var data: js.Array[SuggestionDataItem] | DataFunc
  var isLoading: js.UndefOr[scala.Boolean] = js.undefined
  var onAdd: js.UndefOr[
    js.Function2[/* id */ java.lang.String | scala.Double, /* display */ java.lang.String, scala.Unit]
  ] = js.undefined
  var renderSuggestion: js.UndefOr[
    js.Function5[
      /* suggestion */ SuggestionDataItem, 
      /* search */ java.lang.String, 
      /* highlightedDisplay */ reactLib.reactMod.ReactNode, 
      /* index */ scala.Double, 
      /* focused */ scala.Boolean, 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var trigger: java.lang.String | stdLib.RegExp
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object MentionProps {
  @scala.inline
  def apply(
    data: js.Array[SuggestionDataItem] | DataFunc,
    trigger: java.lang.String | stdLib.RegExp,
    appendSpaceOnAdd: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    isLoading: js.UndefOr[scala.Boolean] = js.undefined,
    onAdd: (/* id */ java.lang.String | scala.Double, /* display */ java.lang.String) => scala.Unit = null,
    renderSuggestion: (/* suggestion */ SuggestionDataItem, /* search */ java.lang.String, /* highlightedDisplay */ reactLib.reactMod.ReactNode, /* index */ scala.Double, /* focused */ scala.Boolean) => reactLib.reactMod.ReactNode = null,
    style: js.Any = null,
    `type`: java.lang.String = null
  ): MentionProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(appendSpaceOnAdd)) __obj.updateDynamic("appendSpaceOnAdd")(appendSpaceOnAdd)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading)
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction2(onAdd))
    if (renderSuggestion != null) __obj.updateDynamic("renderSuggestion")(js.Any.fromFunction5(renderSuggestion))
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MentionProps]
  }
}

