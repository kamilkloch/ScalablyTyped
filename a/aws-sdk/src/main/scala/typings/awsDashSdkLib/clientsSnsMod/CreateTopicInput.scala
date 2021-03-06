package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTopicInput extends js.Object {
  /**
    * A map of attributes with their corresponding values. The following lists the names, descriptions, and values of the special request parameters that the CreateTopic action uses:    DeliveryPolicy – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S endpoints.    DisplayName – The display name to use for a topic with SMS subscriptions.    Policy – The policy that defines who can access your topic. By default, only the topic owner can publish or subscribe to the topic.   The following attribute applies only to server-side-encryption:    KmsMasterKeyId - The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK. For more information, see Key Terms. For more examples, see KeyId in the AWS Key Management Service API Reference.   
    */
  var Attributes: js.UndefOr[TopicAttributesMap] = js.undefined
  /**
    * The name of the topic you want to create. Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and hyphens, and must be between 1 and 256 characters long.
    */
  var Name: topicName
  /**
    * The list of tags to add to a new topic.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateTopicInput {
  @scala.inline
  def apply(Name: topicName, Attributes: TopicAttributesMap = null, Tags: TagList = null): CreateTopicInput = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateTopicInput]
  }
}

