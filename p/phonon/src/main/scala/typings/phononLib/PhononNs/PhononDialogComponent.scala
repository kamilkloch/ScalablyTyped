package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononDialogComponent extends js.Object {
  def on(event: java.lang.String, callback: js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]): PhononDialogComponent
}

object PhononDialogComponent {
  @scala.inline
  def apply(
    on: (java.lang.String, js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]) => PhononDialogComponent
  ): PhononDialogComponent = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
  
    __obj.asInstanceOf[PhononDialogComponent]
  }
}

