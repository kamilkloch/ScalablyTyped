package typings
package atStorybookAddonDashStoryshotsLib.atStorybookAddonDashStoryshotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-storyshots", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val renderOnly: Test = js.native
  val shallowSnapshot: Test = js.native
  val snapshot: Test = js.native
  def default[Rendered](options: InitOptions[Rendered]): scala.Unit = js.native
  def getSnapshotFileName(context: StoryContext): java.lang.String = js.native
  def imageSnapshot(): Test = js.native
  def imageSnapshot(options: atStorybookAddonDashStoryshotsLib.Anon_BeforeScreenshot): Test = js.native
  def multiSnapshotWithOptions(options: SnapshotOptions): Test = js.native
  def renderWithOptions(): Test = js.native
  def renderWithOptions(options: SnapshotOptions): Test = js.native
  def snapshotWithOptions(options: SnapshotOptions): Test = js.native
}

