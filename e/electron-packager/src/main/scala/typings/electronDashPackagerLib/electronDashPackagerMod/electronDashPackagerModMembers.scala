package typings
package electronDashPackagerLib.electronDashPackagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-packager", JSImport.Namespace)
@js.native
object electronDashPackagerModMembers extends js.Object {
  /**
   * This will:
   * - Find or download the correct release of Electron
   * - Use that version of electron to create a app in <out>/<appname>-<platform>-<arch>
   *
   * You should be able to launch the app on the platform you built for. If not, check your settings and try again.
   *
   * @param opts - Options to configure packaging.
   *
   * @returns A promise containing the path(s) to the newly created application(s)
   */
  def apply(opts: electronDashPackagerLib.electronDashPackagerMod.electronPackagerNs.Options): stdLib.Promise[java.lang.String | js.Array[java.lang.String]] = js.native
  /**
   * This will:
   * - Find or download the correct release of Electron
   * - Use that version of electron to create a app in <out>/<appname>-<platform>-<arch>
   *
   * You should be able to launch the app on the platform you built for. If not, check your settings and try again.
   *
   * @param opts - Options to configure packaging.
   * @param callback - Callback which is called when packaging is done or an error occured.
   *
   * @deprecated since version 12.0
   */
  def apply(
    opts: electronDashPackagerLib.electronDashPackagerMod.electronPackagerNs.Options,
    callback: electronDashPackagerLib.electronDashPackagerMod.electronPackagerNs.finalCallback
  ): scala.Unit = js.native
}
