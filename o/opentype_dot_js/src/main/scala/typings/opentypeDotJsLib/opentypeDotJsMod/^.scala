package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentype.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def load(
    url: java.lang.String,
    callback: js.Function2[/* error */ js.Any, /* font */ js.UndefOr[Font], scala.Unit]
  ): scala.Unit = js.native
  def loadSync(url: java.lang.String): Font = js.native
  def parse(buffer: js.Any): Font = js.native
}

