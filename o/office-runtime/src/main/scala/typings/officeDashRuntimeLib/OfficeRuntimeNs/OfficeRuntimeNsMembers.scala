package typings
package officeDashRuntimeLib.OfficeRuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OfficeRuntime")
@js.native
object OfficeRuntimeNsMembers extends js.Object {
  /**
       * Asynchronous, global, and persistent key-value storage that can be used by Excel Custom Functions.
       */
  val AsyncStorage: AsyncStorage = js.native
  /**
       * Enables you to pop up a web dialog box.
       * @param url
       * @param options
       */
  def displayWebDialog(url: java.lang.String, options: DisplayWebDialogOptions): stdLib.Promise[Dialog] = js.native
}
