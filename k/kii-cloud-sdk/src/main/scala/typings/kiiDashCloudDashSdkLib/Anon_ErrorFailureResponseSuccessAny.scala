package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorFailureResponseSuccessAny extends js.Object {
  def failure(error: stdLib.Error): js.Any
  def success(response: kiiDashCloudDashSdkLib.KiiCloudNs.KiiMqttEndpoint): js.Any
}

object Anon_ErrorFailureResponseSuccessAny {
  @scala.inline
  def apply(
    failure: stdLib.Error => js.Any,
    success: kiiDashCloudDashSdkLib.KiiCloudNs.KiiMqttEndpoint => js.Any
  ): Anon_ErrorFailureResponseSuccessAny = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
  
    __obj.asInstanceOf[Anon_ErrorFailureResponseSuccessAny]
  }
}

