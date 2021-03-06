package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutConferencePreferenceRequest extends js.Object {
  /**
    * The conference preference of a specific conference provider.
    */
  var ConferencePreference: awsDashSdkLib.clientsAlexaforbusinessMod.ConferencePreference
}

object PutConferencePreferenceRequest {
  @scala.inline
  def apply(ConferencePreference: ConferencePreference): PutConferencePreferenceRequest = {
    val __obj = js.Dynamic.literal(ConferencePreference = ConferencePreference)
  
    __obj.asInstanceOf[PutConferencePreferenceRequest]
  }
}

