package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StructType extends js.Object {
  /**
               * The list of fields that make up this struct. Order is
               * significant, because values of this struct type are represented as
               * lists, where the order of field values matches the order of
               * fields in the StructType. In turn, the order of fields
               * matches the order of columns in a read request, or the order of
               * fields in the `SELECT` clause of a query.
               */
  var fields: js.UndefOr[js.Array[Field]] = js.undefined
}
