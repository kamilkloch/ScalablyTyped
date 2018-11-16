package typings
package atMaterialDashUiCoreLib.formcontrollabelFormControlLabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 3 members from Set(std.Pick, @material-ui/core.@material-ui/core.StandardProps) */ 
trait FormControlLabelProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[FormControlLabelClassKey] {
  var checked: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var control: reactLib.reactMod.ReactNs.ReactElement[_]
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var inputRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[_]] = js.undefined
  var label: reactLib.reactMod.ReactNs.ReactNode
  var labelPlacement: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.end | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.start
  ] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[js.Object], 
      /* checked */ scala.Boolean, 
      scala.Unit
    ]
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}
