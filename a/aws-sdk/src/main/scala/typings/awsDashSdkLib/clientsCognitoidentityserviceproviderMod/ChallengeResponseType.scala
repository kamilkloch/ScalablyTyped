package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChallengeResponseType extends js.Object {
  /**
    * The challenge name
    */
  var ChallengeName: js.UndefOr[ChallengeName] = js.undefined
  /**
    * The challenge response.
    */
  var ChallengeResponse: js.UndefOr[ChallengeResponse] = js.undefined
}

object ChallengeResponseType {
  @scala.inline
  def apply(ChallengeName: ChallengeName = null, ChallengeResponse: ChallengeResponse = null): ChallengeResponseType = {
    val __obj = js.Dynamic.literal()
    if (ChallengeName != null) __obj.updateDynamic("ChallengeName")(ChallengeName.asInstanceOf[js.Any])
    if (ChallengeResponse != null) __obj.updateDynamic("ChallengeResponse")(ChallengeResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeResponseType]
  }
}

