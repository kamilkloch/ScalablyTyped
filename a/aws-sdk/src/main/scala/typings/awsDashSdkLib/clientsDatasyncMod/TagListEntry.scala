package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagListEntry extends js.Object {
  /**
    * The key for an AWS resource tag.
    */
  var Key: js.UndefOr[TagKey] = js.undefined
  /**
    * The value for an AWS resource tag.
    */
  var Value: js.UndefOr[TagValue] = js.undefined
}

object TagListEntry {
  @scala.inline
  def apply(Key: TagKey = null, Value: TagValue = null): TagListEntry = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[TagListEntry]
  }
}

