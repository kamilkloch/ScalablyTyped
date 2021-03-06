package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointSendConfiguration extends js.Object {
  /**
    * Body override. If specified will override default body.
    */
  var BodyOverride: js.UndefOr[__string] = js.undefined
  /**
    * A map of custom attributes to attributes to be attached to the message for this address. This payload is added to the push notification's 'data.pinpoint' object or added to the email/sms delivery receipt event attributes.
    */
  var Context: js.UndefOr[MapOf__string] = js.undefined
  /**
    * The Raw JSON formatted string to be used as the payload. This value overrides the message.
    */
  var RawContent: js.UndefOr[__string] = js.undefined
  /**
    * A map of substitution values for the message to be merged with the DefaultMessage's substitutions. Substitutions on this map take precedence over the all other substitutions.
    */
  var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
  /**
    * Title override. If specified will override default title if applicable.
    */
  var TitleOverride: js.UndefOr[__string] = js.undefined
}

object EndpointSendConfiguration {
  @scala.inline
  def apply(
    BodyOverride: __string = null,
    Context: MapOf__string = null,
    RawContent: __string = null,
    Substitutions: MapOfListOf__string = null,
    TitleOverride: __string = null
  ): EndpointSendConfiguration = {
    val __obj = js.Dynamic.literal()
    if (BodyOverride != null) __obj.updateDynamic("BodyOverride")(BodyOverride)
    if (Context != null) __obj.updateDynamic("Context")(Context)
    if (RawContent != null) __obj.updateDynamic("RawContent")(RawContent)
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions)
    if (TitleOverride != null) __obj.updateDynamic("TitleOverride")(TitleOverride)
    __obj.asInstanceOf[EndpointSendConfiguration]
  }
}

