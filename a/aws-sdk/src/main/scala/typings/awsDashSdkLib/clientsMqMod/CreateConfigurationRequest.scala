package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConfigurationRequest extends js.Object {
  /**
    * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
    */
  var EngineType: js.UndefOr[EngineType] = js.undefined
  /**
    * Required. The version of the broker engine. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var EngineVersion: js.UndefOr[__string] = js.undefined
  /**
    * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * Create tags when creating the configuration.
    */
  var Tags: js.UndefOr[__mapOf__string] = js.undefined
}

object CreateConfigurationRequest {
  @scala.inline
  def apply(
    EngineType: EngineType = null,
    EngineVersion: __string = null,
    Name: __string = null,
    Tags: __mapOf__string = null
  ): CreateConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (EngineType != null) __obj.updateDynamic("EngineType")(EngineType.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateConfigurationRequest]
  }
}

