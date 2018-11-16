package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateNamedRangeRequest extends js.Object {
  /**
               * The fields that should be updated.  At least one field must be specified.
               * The root `namedRange` is implied and should not be specified.
               * A single `"&#42;"` can be used as short-hand for listing every field.
               */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** The named range to update with the new properties. */
  var namedRange: js.UndefOr[NamedRange] = js.undefined
}
