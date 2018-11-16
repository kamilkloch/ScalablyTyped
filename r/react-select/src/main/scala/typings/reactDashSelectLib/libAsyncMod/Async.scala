package typings
package reactDashSelectLib.libAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/lib/Async", "Async")
@js.native
class Async[OptionType] ()
  extends reactLib.reactMod.Component[Props[OptionType], State[OptionType], js.Any] {
  var mounted: scala.Boolean = js.native
  var optionsCache: ScalablyTyped.runtime.StringDictionary[reactDashSelectLib.libTypesMod.OptionsType[OptionType]] = js.native
  var select: reactLib.reactMod.ReactNs.Ref[_] = js.native
  def blur(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def handleInputChange(newValue: java.lang.String, actionMeta: reactDashSelectLib.libTypesMod.InputActionMeta): java.lang.String = js.native
  def loadOptions(
    inputValue: java.lang.String,
    callback: js.Function1[/* options */ reactDashSelectLib.libTypesMod.OptionsType[OptionType], scala.Unit]
  ): scala.Unit = js.native
}

@JSImport("react-select/lib/Async", "Async")
@js.native
object Async extends js.Object {
  var defaultProps: reactDashSelectLib.libAsyncMod.Props[_] = js.native
}
