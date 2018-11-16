package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateDatabaseRequest extends js.Object {
  /**
               * Required. A `CREATE DATABASE` statement, which specifies the ID of the
               * new database.  The database ID must conform to the regular expression
               * `a-z&#42;[a-z0-9]` and be between 2 and 30 characters in length.
               * If the database ID is a reserved word or if it contains a hyphen, the
               * database ID must be enclosed in backticks (`` ` ``).
               */
  var createStatement: js.UndefOr[java.lang.String] = js.undefined
  /**
               * An optional list of DDL statements to run inside the newly created
               * database. Statements can create tables, indexes, etc. These
               * statements execute atomically with the creation of the database:
               * if there is an error in any statement, the database is not created.
               */
  var extraStatements: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}
