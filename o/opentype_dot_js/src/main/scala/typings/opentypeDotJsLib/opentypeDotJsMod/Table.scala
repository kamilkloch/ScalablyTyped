package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var fields: js.Array[Field]
  var tableName: java.lang.String
  var tables: js.Array[Table]
  def encode(): js.Array[scala.Double]
  def sizeOf(): scala.Double
}

object Table {
  @scala.inline
  def apply(
    encode: () => js.Array[scala.Double],
    fields: js.Array[Field],
    sizeOf: () => scala.Double,
    tableName: java.lang.String,
    tables: js.Array[Table],
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Table = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction0(encode), fields = fields, sizeOf = js.Any.fromFunction0(sizeOf), tableName = tableName, tables = tables)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Table]
  }
}

