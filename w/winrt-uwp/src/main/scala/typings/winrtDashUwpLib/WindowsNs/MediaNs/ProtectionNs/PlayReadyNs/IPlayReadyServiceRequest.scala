package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Base interface for all service request interfaces. */
trait IPlayReadyServiceRequest
  extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.IMediaProtectionServiceRequest {
  /** Gets or sets the custom data of the request challenge. */
  var challengeCustomData: java.lang.String
  /** Gets the custom data that was returned in the response from the service. */
  var responseCustomData: java.lang.String
  /** Gets or sets the URI used to perform a service request action. */
  var uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri
  /**
    * Begins an asynchronous service request operation.
    * @return The asynchronous service action.
    */
  def beginServiceRequest(): winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncAction
  /**
    * Begins the process of manually enabling.
    * @return Begins the process of manually enabling.
    */
  def generateManualEnablingChallenge(): PlayReadySoapMessage
  /**
    * Returns a new service request interface.
    * @return The new service request interface.
    */
  def nextServiceRequest(): IPlayReadyServiceRequest
  /**
    * Processes the raw binary result of a manual enabling challenge.
    * @param responseBytes The response result to be processed.
    * @return If the methods succeeds, it returns S_OK. If it fails, it returns an error code.
    */
  def processManualEnablingResponse(responseBytes: js.Array[scala.Double]): winrtDashUwpLib.WindowsNs.WinRTError
}

object IPlayReadyServiceRequest {
  @scala.inline
  def apply(
    beginServiceRequest: () => winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncAction,
    challengeCustomData: java.lang.String,
    generateManualEnablingChallenge: () => PlayReadySoapMessage,
    nextServiceRequest: () => IPlayReadyServiceRequest,
    processManualEnablingResponse: js.Array[scala.Double] => winrtDashUwpLib.WindowsNs.WinRTError,
    protectionSystem: java.lang.String,
    responseCustomData: java.lang.String,
    `type`: java.lang.String,
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri
  ): IPlayReadyServiceRequest = {
    val __obj = js.Dynamic.literal(beginServiceRequest = js.Any.fromFunction0(beginServiceRequest), challengeCustomData = challengeCustomData, generateManualEnablingChallenge = js.Any.fromFunction0(generateManualEnablingChallenge), nextServiceRequest = js.Any.fromFunction0(nextServiceRequest), processManualEnablingResponse = js.Any.fromFunction1(processManualEnablingResponse), protectionSystem = protectionSystem, responseCustomData = responseCustomData, uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPlayReadyServiceRequest]
  }
}

