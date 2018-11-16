package typings
package gapiDotClientDotPubsubLib.gapiNs.clientNs.pubsubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PushConfig extends js.Object {
  /**
               * Endpoint configuration attributes.
               *
               * Every endpoint has a set of API supported attributes that can be used to
               * control different aspects of the message delivery.
               *
               * The currently supported attribute is `x-goog-version`, which you can
               * use to change the format of the pushed message. This attribute
               * indicates the version of the data expected by the endpoint. This
               * controls the shape of the pushed message (i.e., its fields and metadata).
               * The endpoint version is based on the version of the Pub/Sub API.
               *
               * If not present during the `CreateSubscription` call, it will default to
               * the version of the API used to make such call. If not present during a
               * `ModifyPushConfig` call, its value will not be changed. `GetSubscription`
               * calls will always return a valid version, even if the subscription was
               * created without this attribute.
               *
               * The possible values for this attribute are:
               *
               * &#42; `v1beta1`: uses the push format defined in the v1beta1 Pub/Sub API.
               * &#42; `v1` or `v1beta2`: uses the push format defined in the v1 Pub/Sub API.
               */
  var attributes: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /**
               * A URL locating the endpoint to which messages should be pushed.
               * For example, a Webhook endpoint might use "https://example.com/push".
               */
  var pushEndpoint: js.UndefOr[java.lang.String] = js.undefined
}
