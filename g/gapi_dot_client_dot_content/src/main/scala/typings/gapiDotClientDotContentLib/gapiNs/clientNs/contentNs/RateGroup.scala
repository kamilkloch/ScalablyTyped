package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RateGroup extends js.Object {
  /**
               * A list of shipping labels defining the products to which this rate group applies to. This is a disjunction: only one of the labels has to match for the
               * rate group to apply. May only be empty for the last rate group of a service. Required.
               */
  var applicableShippingLabels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A list of carrier rates that can be referred to by mainTable or singleValue. */
  var carrierRates: js.UndefOr[js.Array[CarrierRate]] = js.undefined
  /** A table defining the rate group, when singleValue is not expressive enough. Can only be set if singleValue is not set. */
  var mainTable: js.UndefOr[Table] = js.undefined
  /** The value of the rate group (e.g. flat rate $10). Can only be set if mainTable and subtables are not set. */
  var singleValue: js.UndefOr[Value] = js.undefined
  /** A list of subtables referred to by mainTable. Can only be set if mainTable is set. */
  var subtables: js.UndefOr[js.Array[Table]] = js.undefined
}
