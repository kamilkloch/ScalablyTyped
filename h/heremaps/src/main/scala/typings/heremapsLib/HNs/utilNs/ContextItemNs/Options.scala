package typings
package heremapsLib.HNs.utilNs.ContextItemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * This type defines options which can be used to initialize the context item.
             * @property label {string=} - the label of the context item
             * @property disabled {boolean=} - flag indicatting whether context item is disabled or no, by default false
             * @property callback {function(H.util.Event)=} - Optional callback function to call once context item is selected
             */

trait Options extends js.Object {
  var callback: js.UndefOr[js.Function1[/* event */ heremapsLib.HNs.utilNs.Event, scala.Unit]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
}
