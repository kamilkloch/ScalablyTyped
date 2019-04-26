package typings
package atMaterialDashUiCoreLib.inputBaseInputBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputBaseComponentProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLInputElement | stdLib.HTMLTextAreaElement]
     with // Accommodate arbitrary additional props coming from the `inputProps` prop
/* arbitrary */ org.scalablytyped.runtime.StringDictionary[js.Any]

object InputBaseComponentProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLInputElement | stdLib.HTMLTextAreaElement] = null,
    StringDictionary: // Accommodate arbitrary additional props coming from the `inputProps` prop
  /* arbitrary */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): InputBaseComponentProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[InputBaseComponentProps]
  }
}

