package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONInput extends js.Object {
  /**
    * The type of JSON. Valid values: Document, Lines.
    */
  var Type: js.UndefOr[JSONType] = js.undefined
}

object JSONInput {
  @scala.inline
  def apply(Type: JSONType = null): JSONInput = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONInput]
  }
}

