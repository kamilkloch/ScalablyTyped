package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Schema extends js.Object {
  var schema: js.UndefOr[java.lang.String] = js.undefined
  var tableName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Schema {
  @scala.inline
  def apply(schema: java.lang.String = null, tableName: java.lang.String = null): Anon_Schema = {
    val __obj = js.Dynamic.literal()
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    __obj.asInstanceOf[Anon_Schema]
  }
}

