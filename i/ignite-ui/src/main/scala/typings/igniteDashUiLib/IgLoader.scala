package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgLoader extends js.Object {
  var settings: js.UndefOr[IgLoaderSettings] = js.native
  def load(resources: java.lang.String): IgLoader = js.native
  def load(resources: java.lang.String, callback: js.Function): IgLoader = js.native
  def load(resources: java.lang.String, callback: js.Function, preinit: js.Function): IgLoader = js.native
  def preinit(callback: js.Function): IgLoader = js.native
}

