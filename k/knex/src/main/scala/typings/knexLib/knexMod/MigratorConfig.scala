package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigratorConfig extends js.Object {
  var database: js.UndefOr[java.lang.String] = js.undefined
  var directory: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var disableTransactions: js.UndefOr[scala.Boolean] = js.undefined
  var extension: js.UndefOr[java.lang.String] = js.undefined
  var schemaName: js.UndefOr[java.lang.String] = js.undefined
  var sortDirsSeparately: js.UndefOr[scala.Boolean] = js.undefined
  var tableName: js.UndefOr[java.lang.String] = js.undefined
}

object MigratorConfig {
  @scala.inline
  def apply(
    database: java.lang.String = null,
    directory: java.lang.String | js.Array[java.lang.String] = null,
    disableTransactions: js.UndefOr[scala.Boolean] = js.undefined,
    extension: java.lang.String = null,
    schemaName: java.lang.String = null,
    sortDirsSeparately: js.UndefOr[scala.Boolean] = js.undefined,
    tableName: java.lang.String = null
  ): MigratorConfig = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database)
    if (directory != null) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTransactions)) __obj.updateDynamic("disableTransactions")(disableTransactions)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName)
    if (!js.isUndefined(sortDirsSeparately)) __obj.updateDynamic("sortDirsSeparately")(sortDirsSeparately)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    __obj.asInstanceOf[MigratorConfig]
  }
}

