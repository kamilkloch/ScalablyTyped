package typings
package atBlueprintjsCoreLib.libEsmComponentsFormsTextAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps because var conflicts: className. Inlined  */ trait ITextAreaProps
  extends reactLib.reactMod.TextareaHTMLAttributes[stdLib.HTMLTextAreaElement]
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps {
  /**
    * Whether the text area should take up the full width of its container.
    */
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the text area should automatically grow vertically to accomodate content.
    */
  var growVertically: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Ref handler that receives HTML `<textarea>` element backing this component.
    */
  var inputRef: js.UndefOr[js.Function1[/* ref */ stdLib.HTMLTextAreaElement | scala.Null, _]] = js.undefined
  /**
    * Whether the text area should appear with large styling.
    */
  var large: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the text area should appear with small styling.
    */
  var small: js.UndefOr[scala.Boolean] = js.undefined
}

object ITextAreaProps {
  @scala.inline
  def apply(
    IIntentProps: atBlueprintjsCoreLib.libEsmCommonPropsMod.IIntentProps = null,
    IProps: atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps = null,
    TextareaHTMLAttributes: reactLib.reactMod.TextareaHTMLAttributes[stdLib.HTMLTextAreaElement] = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    growVertically: js.UndefOr[scala.Boolean] = js.undefined,
    inputRef: /* ref */ stdLib.HTMLTextAreaElement | scala.Null => _ = null,
    large: js.UndefOr[scala.Boolean] = js.undefined,
    small: js.UndefOr[scala.Boolean] = js.undefined
  ): ITextAreaProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IIntentProps)
    js.Dynamic.global.Object.assign(__obj, IProps)
    js.Dynamic.global.Object.assign(__obj, TextareaHTMLAttributes)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (!js.isUndefined(growVertically)) __obj.updateDynamic("growVertically")(growVertically)
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1(inputRef))
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large)
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small)
    __obj.asInstanceOf[ITextAreaProps]
  }
}

