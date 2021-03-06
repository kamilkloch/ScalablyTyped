package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FraudulentSafe extends js.Object {
  /**
    * If you believe a charge is fraudulent, include a user_report key with a value of fraudulent. If you believe a
    * charge is safe, include a user_report key with a value of safe. Note that you must refund a charge before setting
    * the user_report to fraudulent. Stripe will use the information you send to improve our fraud detection algorithm
    */
  var user_report: js.UndefOr[stripeLib.stripeLibStrings.fraudulent | stripeLib.stripeLibStrings.safe] = js.undefined
}

object Anon_FraudulentSafe {
  @scala.inline
  def apply(user_report: stripeLib.stripeLibStrings.fraudulent | stripeLib.stripeLibStrings.safe = null): Anon_FraudulentSafe = {
    val __obj = js.Dynamic.literal()
    if (user_report != null) __obj.updateDynamic("user_report")(user_report.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FraudulentSafe]
  }
}

