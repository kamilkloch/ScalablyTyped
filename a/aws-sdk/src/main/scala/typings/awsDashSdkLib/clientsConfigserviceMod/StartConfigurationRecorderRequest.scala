package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartConfigurationRecorderRequest extends js.Object {
  /**
    * The name of the recorder object that records each configuration change made to the resources.
    */
  var ConfigurationRecorderName: RecorderName
}

object StartConfigurationRecorderRequest {
  @scala.inline
  def apply(ConfigurationRecorderName: RecorderName): StartConfigurationRecorderRequest = {
    val __obj = js.Dynamic.literal(ConfigurationRecorderName = ConfigurationRecorderName)
  
    __obj.asInstanceOf[StartConfigurationRecorderRequest]
  }
}

