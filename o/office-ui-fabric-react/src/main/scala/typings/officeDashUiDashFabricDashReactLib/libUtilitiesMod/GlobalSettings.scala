package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Utilities", "GlobalSettings")
@js.native
class GlobalSettings ()
  extends atUifabricUtilitiesLib.atUifabricUtilitiesMod.GlobalSettings

/* static members */
@JSImport("office-ui-fabric-react/lib/Utilities", "GlobalSettings")
@js.native
object GlobalSettings extends js.Object {
  def addChangeListener(cb: atUifabricUtilitiesLib.libGlobalSettingsMod.IChangeEventCallback): scala.Unit = js.native
  def getValue[T](key: java.lang.String): T = js.native
  def getValue[T](key: java.lang.String, defaultValue: T): T = js.native
  def getValue[T](key: java.lang.String, defaultValue: js.Function0[T]): T = js.native
  def removeChangeListener(cb: atUifabricUtilitiesLib.libGlobalSettingsMod.IChangeEventCallback): scala.Unit = js.native
  def setValue[T](key: java.lang.String, value: T): T = js.native
}

