package typings
package grommetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object Anon_Label {
  @scala.inline
  def apply(label: reactLib.reactMod.ReactNode = null, value: js.Any = null): Anon_Label = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Label]
  }
}

