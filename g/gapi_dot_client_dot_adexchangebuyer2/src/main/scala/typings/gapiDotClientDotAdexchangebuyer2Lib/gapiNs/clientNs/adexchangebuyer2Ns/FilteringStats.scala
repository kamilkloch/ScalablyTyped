package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FilteringStats extends js.Object {
  /**
               * The day during which the data was collected.
               * The data is collected from 00:00:00 to 23:59:59 PT.
               * During switches from PST to PDT and back, the day may
               * contain 23 or 25 hours of data instead of the usual 24.
               */
  var date: js.UndefOr[Date] = js.undefined
  /** The set of filtering reasons for this date. */
  var reasons: js.UndefOr[js.Array[Reason]] = js.undefined
}
