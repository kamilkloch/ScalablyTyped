package typings
package csstypeLib.csstypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardProperties[TLength]
  extends StandardLonghandProperties[TLength]
     with StandardShorthandProperties[TLength]

object StandardProperties {
  @scala.inline
  def apply[TLength](
    StandardLonghandProperties: StandardLonghandProperties[TLength] = null,
    StandardShorthandProperties: StandardShorthandProperties[TLength] = null
  ): StandardProperties[TLength] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StandardLonghandProperties)
    js.Dynamic.global.Object.assign(__obj, StandardShorthandProperties)
    __obj.asInstanceOf[StandardProperties[TLength]]
  }
}

