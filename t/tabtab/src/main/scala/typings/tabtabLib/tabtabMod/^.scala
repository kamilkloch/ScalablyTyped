package typings
package tabtabLib.tabtabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabtab", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def completionItem(item: CompleteItemOrString): CompleteItem = js.native
  def install(option: InstallOption): js.Promise[scala.Unit] = js.native
  def log(args: js.Array[CompleteItem | CompleteItemOrString | java.lang.String]): scala.Unit = js.native
  def parseEnv(env: Json): TabtabEnv = js.native
  def uninstall(option: UninstallOption): js.Promise[scala.Unit] = js.native
}

