package typings
package awsDashSdkLib.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SQS
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_SQS: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Adds a permission to a queue for a specific principal. This allows sharing access to the queue. When you create a queue, you have full control access rights for the queue. Only you, the owner of the queue, can grant or deny permissions to the queue. For more information about these permissions, see Allow Developers to Write Messages to a Shared Queue in the Amazon Simple Queue Service Developer Guide.   AddPermission writes an Amazon-SQS-generated policy. If you want to write your own policy, use  SetQueueAttributes  to upload your policy. For more information about writing your own policy, see Using Custom Policies with the Amazon SQS Access Policy Language in the Amazon Simple Queue Service Developer Guide. An Amazon SQS policy can have a maximum of 7 actions.  Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;Attribute.1=first   &amp;Attribute.2=second   Cross-account permissions don't apply to this action. For more information, see see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def addPermission(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addPermission(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds a permission to a queue for a specific principal. This allows sharing access to the queue. When you create a queue, you have full control access rights for the queue. Only you, the owner of the queue, can grant or deny permissions to the queue. For more information about these permissions, see Allow Developers to Write Messages to a Shared Queue in the Amazon Simple Queue Service Developer Guide.   AddPermission writes an Amazon-SQS-generated policy. If you want to write your own policy, use  SetQueueAttributes  to upload your policy. For more information about writing your own policy, see Using Custom Policies with the Amazon SQS Access Policy Language in the Amazon Simple Queue Service Developer Guide. An Amazon SQS policy can have a maximum of 7 actions.  Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;Attribute.1=first   &amp;Attribute.2=second   Cross-account permissions don't apply to this action. For more information, see see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def addPermission(params: AddPermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addPermission(
    params: AddPermissionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the visibility timeout of a specified message in a queue to a new value. The maximum allowed timeout value is 12 hours. For more information, see Visibility Timeout in the Amazon Simple Queue Service Developer Guide. For example, you have a message with a visibility timeout of 5 minutes. After 3 minutes, you call ChangeMessageVisibility with a timeout of 10 minutes. You can continue to call ChangeMessageVisibility to extend the visibility timeout to a maximum of 12 hours. If you try to extend the visibility timeout beyond 12 hours, your request is rejected. A message is considered to be in flight after it's received from a queue by a consumer, but not yet deleted from the queue. For standard queues, there can be a maximum of 120,000 inflight messages per queue. If you reach this limit, Amazon SQS returns the OverLimit error message. To avoid reaching the limit, you should delete messages from the queue after they're processed. You can also increase the number of queues you use to process your messages. For FIFO queues, there can be a maximum of 20,000 inflight messages per queue. If you reach this limit, Amazon SQS returns no error messages.  If you attempt to set the VisibilityTimeout to a value greater than the maximum time left, Amazon SQS returns an error. Amazon SQS doesn't automatically recalculate and increase the timeout to the maximum remaining time. Unlike with a queue, when you change the visibility timeout for a specific message the timeout value is applied immediately but isn't saved in memory for that message. If you don't delete a message after it is received, the visibility timeout for the message reverts to the original timeout value (not to the value you set using the ChangeMessageVisibility action) the next time the message is received. 
    */
  def changeMessageVisibility(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def changeMessageVisibility(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the visibility timeout of a specified message in a queue to a new value. The maximum allowed timeout value is 12 hours. For more information, see Visibility Timeout in the Amazon Simple Queue Service Developer Guide. For example, you have a message with a visibility timeout of 5 minutes. After 3 minutes, you call ChangeMessageVisibility with a timeout of 10 minutes. You can continue to call ChangeMessageVisibility to extend the visibility timeout to a maximum of 12 hours. If you try to extend the visibility timeout beyond 12 hours, your request is rejected. A message is considered to be in flight after it's received from a queue by a consumer, but not yet deleted from the queue. For standard queues, there can be a maximum of 120,000 inflight messages per queue. If you reach this limit, Amazon SQS returns the OverLimit error message. To avoid reaching the limit, you should delete messages from the queue after they're processed. You can also increase the number of queues you use to process your messages. For FIFO queues, there can be a maximum of 20,000 inflight messages per queue. If you reach this limit, Amazon SQS returns no error messages.  If you attempt to set the VisibilityTimeout to a value greater than the maximum time left, Amazon SQS returns an error. Amazon SQS doesn't automatically recalculate and increase the timeout to the maximum remaining time. Unlike with a queue, when you change the visibility timeout for a specific message the timeout value is applied immediately but isn't saved in memory for that message. If you don't delete a message after it is received, the visibility timeout for the message reverts to the original timeout value (not to the value you set using the ChangeMessageVisibility action) the next time the message is received. 
    */
  def changeMessageVisibility(params: ChangeMessageVisibilityRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def changeMessageVisibility(
    params: ChangeMessageVisibilityRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the visibility timeout of multiple messages. This is a batch version of  ChangeMessageVisibility. The result of the action on each message is reported individually in the response. You can send up to 10  ChangeMessageVisibility  requests with each ChangeMessageVisibilityBatch action.  Because the batch request can result in a combination of successful and unsuccessful actions, you should check for batch errors even when the call returns an HTTP status code of 200.  Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;Attribute.1=first   &amp;Attribute.2=second 
    */
  def changeMessageVisibilityBatch(): awsDashSdkLib.libRequestMod.Request[ChangeMessageVisibilityBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def changeMessageVisibilityBatch(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ChangeMessageVisibilityBatchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ChangeMessageVisibilityBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the visibility timeout of multiple messages. This is a batch version of  ChangeMessageVisibility. The result of the action on each message is reported individually in the response. You can send up to 10  ChangeMessageVisibility  requests with each ChangeMessageVisibilityBatch action.  Because the batch request can result in a combination of successful and unsuccessful actions, you should check for batch errors even when the call returns an HTTP status code of 200.  Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;Attribute.1=first   &amp;Attribute.2=second 
    */
  def changeMessageVisibilityBatch(params: ChangeMessageVisibilityBatchRequest): awsDashSdkLib.libRequestMod.Request[ChangeMessageVisibilityBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def changeMessageVisibilityBatch(
    params: ChangeMessageVisibilityBatchRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ChangeMessageVisibilityBatchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ChangeMessageVisibilityBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new standard or FIFO queue. You can pass one or more attributes in the request. Keep the following caveats in mind:   If you don't specify the FifoQueue attribute, Amazon SQS creates a standard queue.   You can't change the queue type after you create it and you can't convert an existing standard queue into a FIFO queue. You must either create a new FIFO queue for your application or delete your existing standard queue and recreate it as a FIFO queue. For more information, see Moving From a Standard Queue to a FIFO Queue in the Amazon Simple Queue Service Developer Guide.     If you don't provide a value for an attribute, the queue is created with the default value for the attribute.   If you delete a queue, you must wait at least 60 seconds before creating a queue with the same name.   To successfully create a new queue, you must provide a queue name that adheres to the limits related to queues and is unique within the scope of your queues. To get the queue URL, use the  GetQueueUrl  action.  GetQueueUrl  requires only the QueueName parameter. be aware of existing queue names:   If you provide the name of an existing queue along with the exact names and values of all the queue's attributes, CreateQueue returns the queue URL for the existing queue.   If the queue name, attribute names, or attribute values don't match an existing queue, CreateQueue returns an error.   Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;Attribute.1=first   &amp;Attribute.2=second   Cross-account permissions don't apply to this action. For more information, see see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def createQueue(): awsDashSdkLib.libRequestMod.Request[CreateQueueResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createQueue(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateQueueResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateQueueResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new standard or FIFO queue. You can pass one or more attributes in the request. Keep the following caveats in mind:   If you don't specify the FifoQueue attribute, Amazon SQS creates a standard queue.   You can't change the queue type after you create it and you can't convert an existing standard queue into a FIFO queue. You must either create a new FIFO queue for your application or delete your existing standard queue and recreate it as a FIFO queue. For more information, see Moving From a Standard Queue to a FIFO Queue in the Amazon Simple Queue Service Developer Guide.     If you don't provide a value for an attribute, the queue is created with the default value for the attribute.   If you delete a queue, you must wait at least 60 seconds before creating a queue with the same name.   To successfully create a new queue, you must provide a queue name that adheres to the limits related to queues and is unique within the scope of your queues. To get the queue URL, use the  GetQueueUrl  action.  GetQueueUrl  requires only the QueueName parameter. be aware of existing queue names:   If you provide the name of an existing queue along with the exact names and values of all the queue's attributes, CreateQueue returns the queue URL for the existing queue.   If the queue name, attribute names, or attribute values don't match an existing queue, CreateQueue returns an error.   Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;Attribute.1=first   &amp;Attribute.2=second   Cross-account permissions don't apply to this action. For more information, see see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def createQueue(params: CreateQueueRequest): awsDashSdkLib.libRequestMod.Request[CreateQueueResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createQueue(
    params: CreateQueueRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateQueueResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateQueueResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified message from the specified queue. To select the message to delete, use the ReceiptHandle of the message (not the MessageId which you receive when you send the message). Amazon SQS can delete a message from a queue even if a visibility timeout setting causes the message to be locked by another consumer. Amazon SQS automatically deletes messages left in a queue longer than the retention period configured for the queue.   The ReceiptHandle is associated with a specific instance of receiving a message. If you receive a message more than once, the ReceiptHandle is different each time you receive a message. When you use the DeleteMessage action, you must provide the most recently received ReceiptHandle for the message (otherwise, the request succeeds, but the message might not be deleted). For standard queues, it is possible to receive a message even after you delete it. This might happen on rare occasions if one of the servers which stores a copy of the message is unavailable when you send the request to delete the message. The copy remains on the server and might be returned to you during a subsequent receive request. You should ensure that your application is idempotent, so that receiving a message more than once does not cause issues. 
    */
  def deleteMessage(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMessage(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified message from the specified queue. To select the message to delete, use the ReceiptHandle of the message (not the MessageId which you receive when you send the message). Amazon SQS can delete a message from a queue even if a visibility timeout setting causes the message to be locked by another consumer. Amazon SQS automatically deletes messages left in a queue longer than the retention period configured for the queue.   The ReceiptHandle is associated with a specific instance of receiving a message. If you receive a message more than once, the ReceiptHandle is different each time you receive a message. When you use the DeleteMessage action, you must provide the most recently received ReceiptHandle for the message (otherwise, the request succeeds, but the message might not be deleted). For standard queues, it is possible to receive a message even after you delete it. This might happen on rare occasions if one of the servers which stores a copy of the message is unavailable when you send the request to delete the message. The copy remains on the server and might be returned to you during a subsequent receive request. You should ensure that your application is idempotent, so that receiving a message more than once does not cause issues. 
    */
  def deleteMessage(params: DeleteMessageRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMessage(
    params: DeleteMessageRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes up to ten messages from the specified queue. This is a batch version of  DeleteMessage. The result of the action on each message is reported individually in the response.  Because the batch request can result in a combination of successful and unsuccessful actions, you should check for batch errors even when the call returns an HTTP status code of 200.  Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;Attribute.1=first   &amp;Attribute.2=second 
    */
  def deleteMessageBatch(): awsDashSdkLib.libRequestMod.Request[DeleteMessageBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMessageBatch(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteMessageBatchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteMessageBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes up to ten messages from the specified queue. This is a batch version of  DeleteMessage. The result of the action on each message is reported individually in the response.  Because the batch request can result in a combination of successful and unsuccessful actions, you should check for batch errors even when the call returns an HTTP status code of 200.  Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;Attribute.1=first   &amp;Attribute.2=second 
    */
  def deleteMessageBatch(params: DeleteMessageBatchRequest): awsDashSdkLib.libRequestMod.Request[DeleteMessageBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMessageBatch(
    params: DeleteMessageBatchRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteMessageBatchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteMessageBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the queue specified by the QueueUrl, regardless of the queue's contents. If the specified queue doesn't exist, Amazon SQS returns a successful response.  Be careful with the DeleteQueue action: When you delete a queue, any messages in the queue are no longer available.   When you delete a queue, the deletion process takes up to 60 seconds. Requests you send involving that queue during the 60 seconds might succeed. For example, a  SendMessage  request might succeed, but after 60 seconds the queue and the message you sent no longer exist. When you delete a queue, you must wait at least 60 seconds before creating a queue with the same name.  Cross-account permissions don't apply to this action. For more information, see see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def deleteQueue(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteQueue(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the queue specified by the QueueUrl, regardless of the queue's contents. If the specified queue doesn't exist, Amazon SQS returns a successful response.  Be careful with the DeleteQueue action: When you delete a queue, any messages in the queue are no longer available.   When you delete a queue, the deletion process takes up to 60 seconds. Requests you send involving that queue during the 60 seconds might succeed. For example, a  SendMessage  request might succeed, but after 60 seconds the queue and the message you sent no longer exist. When you delete a queue, you must wait at least 60 seconds before creating a queue with the same name.  Cross-account permissions don't apply to this action. For more information, see see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def deleteQueue(params: DeleteQueueRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteQueue(
    params: DeleteQueueRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets attributes for the specified queue.  To determine whether a queue is FIFO, you can check whether QueueName ends with the .fifo suffix.  Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;Attribute.1=first   &amp;Attribute.2=second 
    */
  def getQueueAttributes(): awsDashSdkLib.libRequestMod.Request[GetQueueAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getQueueAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetQueueAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetQueueAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets attributes for the specified queue.  To determine whether a queue is FIFO, you can check whether QueueName ends with the .fifo suffix.  Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;Attribute.1=first   &amp;Attribute.2=second 
    */
  def getQueueAttributes(params: GetQueueAttributesRequest): awsDashSdkLib.libRequestMod.Request[GetQueueAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getQueueAttributes(
    params: GetQueueAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetQueueAttributesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetQueueAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the URL of an existing Amazon SQS queue. To access a queue that belongs to another AWS account, use the QueueOwnerAWSAccountId parameter to specify the account ID of the queue's owner. The queue's owner must grant you permission to access the queue. For more information about shared queue access, see  AddPermission  or see Allow Developers to Write Messages to a Shared Queue in the Amazon Simple Queue Service Developer Guide. 
    */
  def getQueueUrl(): awsDashSdkLib.libRequestMod.Request[GetQueueUrlResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getQueueUrl(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetQueueUrlResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetQueueUrlResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the URL of an existing Amazon SQS queue. To access a queue that belongs to another AWS account, use the QueueOwnerAWSAccountId parameter to specify the account ID of the queue's owner. The queue's owner must grant you permission to access the queue. For more information about shared queue access, see  AddPermission  or see Allow Developers to Write Messages to a Shared Queue in the Amazon Simple Queue Service Developer Guide. 
    */
  def getQueueUrl(params: GetQueueUrlRequest): awsDashSdkLib.libRequestMod.Request[GetQueueUrlResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getQueueUrl(
    params: GetQueueUrlRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetQueueUrlResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetQueueUrlResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of your queues that have the RedrivePolicy queue attribute configured with a dead-letter queue. For more information about using dead-letter queues, see Using Amazon SQS Dead-Letter Queues in the Amazon Simple Queue Service Developer Guide.
    */
  def listDeadLetterSourceQueues(): awsDashSdkLib.libRequestMod.Request[ListDeadLetterSourceQueuesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeadLetterSourceQueues(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeadLetterSourceQueuesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeadLetterSourceQueuesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of your queues that have the RedrivePolicy queue attribute configured with a dead-letter queue. For more information about using dead-letter queues, see Using Amazon SQS Dead-Letter Queues in the Amazon Simple Queue Service Developer Guide.
    */
  def listDeadLetterSourceQueues(params: ListDeadLetterSourceQueuesRequest): awsDashSdkLib.libRequestMod.Request[ListDeadLetterSourceQueuesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeadLetterSourceQueues(
    params: ListDeadLetterSourceQueuesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeadLetterSourceQueuesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeadLetterSourceQueuesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List all cost allocation tags added to the specified Amazon SQS queue. For an overview, see Tagging Your Amazon SQS Queues in the Amazon Simple Queue Service Developer Guide. When you use queue tags, keep the following guidelines in mind:   Adding more than 50 tags to a queue isn't recommended.   Tags don't have any semantic meaning. Amazon SQS interprets tags as character strings.   Tags are case-sensitive.   A new tag with a key identical to that of an existing tag overwrites the existing tag.   Tagging actions are limited to 5 TPS per AWS account. If your application requires a higher throughput, file a technical support request.   For a full list of tag restrictions, see Limits Related to Queues in the Amazon Simple Queue Service Developer Guide.  Cross-account permissions don't apply to this action. For more information, see see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def listQueueTags(): awsDashSdkLib.libRequestMod.Request[ListQueueTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listQueueTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListQueueTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListQueueTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * List all cost allocation tags added to the specified Amazon SQS queue. For an overview, see Tagging Your Amazon SQS Queues in the Amazon Simple Queue Service Developer Guide. When you use queue tags, keep the following guidelines in mind:   Adding more than 50 tags to a queue isn't recommended.   Tags don't have any semantic meaning. Amazon SQS interprets tags as character strings.   Tags are case-sensitive.   A new tag with a key identical to that of an existing tag overwrites the existing tag.   Tagging actions are limited to 5 TPS per AWS account. If your application requires a higher throughput, file a technical support request.   For a full list of tag restrictions, see Limits Related to Queues in the Amazon Simple Queue Service Developer Guide.  Cross-account permissions don't apply to this action. For more information, see see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def listQueueTags(params: ListQueueTagsRequest): awsDashSdkLib.libRequestMod.Request[ListQueueTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listQueueTags(
    params: ListQueueTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListQueueTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListQueueTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of your queues. The maximum number of queues that can be returned is 1,000. If you specify a value for the optional QueueNamePrefix parameter, only queues with a name that begins with the specified value are returned.  Cross-account permissions don't apply to this action. For more information, see see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def listQueues(): awsDashSdkLib.libRequestMod.Request[ListQueuesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listQueues(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListQueuesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListQueuesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of your queues. The maximum number of queues that can be returned is 1,000. If you specify a value for the optional QueueNamePrefix parameter, only queues with a name that begins with the specified value are returned.  Cross-account permissions don't apply to this action. For more information, see see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def listQueues(params: ListQueuesRequest): awsDashSdkLib.libRequestMod.Request[ListQueuesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listQueues(
    params: ListQueuesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListQueuesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListQueuesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the messages in a queue specified by the QueueURL parameter.  When you use the PurgeQueue action, you can't retrieve any messages deleted from a queue. The message deletion process takes up to 60 seconds. We recommend waiting for 60 seconds regardless of your queue's size.   Messages sent to the queue before you call PurgeQueue might be received but are deleted within the next minute. Messages sent to the queue after you call PurgeQueue might be deleted while the queue is being purged.
    */
  def purgeQueue(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def purgeQueue(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the messages in a queue specified by the QueueURL parameter.  When you use the PurgeQueue action, you can't retrieve any messages deleted from a queue. The message deletion process takes up to 60 seconds. We recommend waiting for 60 seconds regardless of your queue's size.   Messages sent to the queue before you call PurgeQueue might be received but are deleted within the next minute. Messages sent to the queue after you call PurgeQueue might be deleted while the queue is being purged.
    */
  def purgeQueue(params: PurgeQueueRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def purgeQueue(
    params: PurgeQueueRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves one or more messages (up to 10), from the specified queue. Using the WaitTimeSeconds parameter enables long-poll support. For more information, see Amazon SQS Long Polling in the Amazon Simple Queue Service Developer Guide.  Short poll is the default behavior where a weighted random set of machines is sampled on a ReceiveMessage call. Thus, only the messages on the sampled machines are returned. If the number of messages in the queue is small (fewer than 1,000), you most likely get fewer messages than you requested per ReceiveMessage call. If the number of messages in the queue is extremely small, you might not receive any messages in a particular ReceiveMessage response. If this happens, repeat the request.  For each message returned, the response includes the following:   The message body.   An MD5 digest of the message body. For information about MD5, see RFC1321.   The MessageId you received when you sent the message to the queue.   The receipt handle.   The message attributes.   An MD5 digest of the message attributes.   The receipt handle is the identifier you must provide when deleting the message. For more information, see Queue and Message Identifiers in the Amazon Simple Queue Service Developer Guide. You can provide the VisibilityTimeout parameter in your request. The parameter is applied to the messages that Amazon SQS returns in the response. If you don't include the parameter, the overall visibility timeout for the queue is used for the returned messages. For more information, see Visibility Timeout in the Amazon Simple Queue Service Developer Guide. A message that isn't deleted or a message whose visibility isn't extended before the visibility timeout expires counts as a failed receive. Depending on the configuration of the queue, the message might be sent to the dead-letter queue.  In the future, new attributes might be added. If you write code that calls this action, we recommend that you structure your code so that it can handle new attributes gracefully. 
    */
  def receiveMessage(): awsDashSdkLib.libRequestMod.Request[ReceiveMessageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def receiveMessage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ReceiveMessageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ReceiveMessageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves one or more messages (up to 10), from the specified queue. Using the WaitTimeSeconds parameter enables long-poll support. For more information, see Amazon SQS Long Polling in the Amazon Simple Queue Service Developer Guide.  Short poll is the default behavior where a weighted random set of machines is sampled on a ReceiveMessage call. Thus, only the messages on the sampled machines are returned. If the number of messages in the queue is small (fewer than 1,000), you most likely get fewer messages than you requested per ReceiveMessage call. If the number of messages in the queue is extremely small, you might not receive any messages in a particular ReceiveMessage response. If this happens, repeat the request.  For each message returned, the response includes the following:   The message body.   An MD5 digest of the message body. For information about MD5, see RFC1321.   The MessageId you received when you sent the message to the queue.   The receipt handle.   The message attributes.   An MD5 digest of the message attributes.   The receipt handle is the identifier you must provide when deleting the message. For more information, see Queue and Message Identifiers in the Amazon Simple Queue Service Developer Guide. You can provide the VisibilityTimeout parameter in your request. The parameter is applied to the messages that Amazon SQS returns in the response. If you don't include the parameter, the overall visibility timeout for the queue is used for the returned messages. For more information, see Visibility Timeout in the Amazon Simple Queue Service Developer Guide. A message that isn't deleted or a message whose visibility isn't extended before the visibility timeout expires counts as a failed receive. Depending on the configuration of the queue, the message might be sent to the dead-letter queue.  In the future, new attributes might be added. If you write code that calls this action, we recommend that you structure your code so that it can handle new attributes gracefully. 
    */
  def receiveMessage(params: ReceiveMessageRequest): awsDashSdkLib.libRequestMod.Request[ReceiveMessageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def receiveMessage(
    params: ReceiveMessageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ReceiveMessageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ReceiveMessageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Revokes any permissions in the queue policy that matches the specified Label parameter.  Only the owner of a queue can remove permissions from it. Cross-account permissions don't apply to this action. For more information, see see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def removePermission(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removePermission(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Revokes any permissions in the queue policy that matches the specified Label parameter.  Only the owner of a queue can remove permissions from it. Cross-account permissions don't apply to this action. For more information, see see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def removePermission(params: RemovePermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removePermission(
    params: RemovePermissionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delivers a message to the specified queue.  A message can include only XML, JSON, and unformatted text. The following Unicode characters are allowed:  #x9 | #xA | #xD | #x20 to #xD7FF | #xE000 to #xFFFD | #x10000 to #x10FFFF  Any characters not included in this list will be rejected. For more information, see the W3C specification for characters. 
    */
  def sendMessage(): awsDashSdkLib.libRequestMod.Request[SendMessageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def sendMessage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SendMessageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SendMessageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delivers a message to the specified queue.  A message can include only XML, JSON, and unformatted text. The following Unicode characters are allowed:  #x9 | #xA | #xD | #x20 to #xD7FF | #xE000 to #xFFFD | #x10000 to #x10FFFF  Any characters not included in this list will be rejected. For more information, see the W3C specification for characters. 
    */
  def sendMessage(params: SendMessageRequest): awsDashSdkLib.libRequestMod.Request[SendMessageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def sendMessage(
    params: SendMessageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SendMessageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SendMessageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delivers up to ten messages to the specified queue. This is a batch version of  SendMessage. For a FIFO queue, multiple messages within a single batch are enqueued in the order they are sent. The result of sending each message is reported individually in the response. Because the batch request can result in a combination of successful and unsuccessful actions, you should check for batch errors even when the call returns an HTTP status code of 200. The maximum allowed individual message size and the maximum total payload size (the sum of the individual lengths of all of the batched messages) are both 256 KB (262,144 bytes).  A message can include only XML, JSON, and unformatted text. The following Unicode characters are allowed:  #x9 | #xA | #xD | #x20 to #xD7FF | #xE000 to #xFFFD | #x10000 to #x10FFFF  Any characters not included in this list will be rejected. For more information, see the W3C specification for characters.  If you don't specify the DelaySeconds parameter for an entry, Amazon SQS uses the default value for the queue. Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;Attribute.1=first   &amp;Attribute.2=second 
    */
  def sendMessageBatch(): awsDashSdkLib.libRequestMod.Request[SendMessageBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def sendMessageBatch(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SendMessageBatchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SendMessageBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Delivers up to ten messages to the specified queue. This is a batch version of  SendMessage. For a FIFO queue, multiple messages within a single batch are enqueued in the order they are sent. The result of sending each message is reported individually in the response. Because the batch request can result in a combination of successful and unsuccessful actions, you should check for batch errors even when the call returns an HTTP status code of 200. The maximum allowed individual message size and the maximum total payload size (the sum of the individual lengths of all of the batched messages) are both 256 KB (262,144 bytes).  A message can include only XML, JSON, and unformatted text. The following Unicode characters are allowed:  #x9 | #xA | #xD | #x20 to #xD7FF | #xE000 to #xFFFD | #x10000 to #x10FFFF  Any characters not included in this list will be rejected. For more information, see the W3C specification for characters.  If you don't specify the DelaySeconds parameter for an entry, Amazon SQS uses the default value for the queue. Some actions take lists of parameters. These lists are specified using the param.n notation. Values of n are integers starting from 1. For example, a parameter list with two elements looks like this:  &amp;Attribute.1=first   &amp;Attribute.2=second 
    */
  def sendMessageBatch(params: SendMessageBatchRequest): awsDashSdkLib.libRequestMod.Request[SendMessageBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def sendMessageBatch(
    params: SendMessageBatchRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SendMessageBatchResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SendMessageBatchResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the value of one or more queue attributes. When you change a queue's attributes, the change can take up to 60 seconds for most of the attributes to propagate throughout the Amazon SQS system. Changes made to the MessageRetentionPeriod attribute can take up to 15 minutes.  In the future, new attributes might be added. If you write code that calls this action, we recommend that you structure your code so that it can handle new attributes gracefully. Cross-account permissions don't apply to this action. For more information, see see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def setQueueAttributes(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setQueueAttributes(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the value of one or more queue attributes. When you change a queue's attributes, the change can take up to 60 seconds for most of the attributes to propagate throughout the Amazon SQS system. Changes made to the MessageRetentionPeriod attribute can take up to 15 minutes.  In the future, new attributes might be added. If you write code that calls this action, we recommend that you structure your code so that it can handle new attributes gracefully. Cross-account permissions don't apply to this action. For more information, see see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def setQueueAttributes(params: SetQueueAttributesRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setQueueAttributes(
    params: SetQueueAttributesRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add cost allocation tags to the specified Amazon SQS queue. For an overview, see Tagging Your Amazon SQS Queues in the Amazon Simple Queue Service Developer Guide. When you use queue tags, keep the following guidelines in mind:   Adding more than 50 tags to a queue isn't recommended.   Tags don't have any semantic meaning. Amazon SQS interprets tags as character strings.   Tags are case-sensitive.   A new tag with a key identical to that of an existing tag overwrites the existing tag.   Tagging actions are limited to 5 TPS per AWS account. If your application requires a higher throughput, file a technical support request.   For a full list of tag restrictions, see Limits Related to Queues in the Amazon Simple Queue Service Developer Guide.  Cross-account permissions don't apply to this action. For more information, see see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def tagQueue(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagQueue(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add cost allocation tags to the specified Amazon SQS queue. For an overview, see Tagging Your Amazon SQS Queues in the Amazon Simple Queue Service Developer Guide. When you use queue tags, keep the following guidelines in mind:   Adding more than 50 tags to a queue isn't recommended.   Tags don't have any semantic meaning. Amazon SQS interprets tags as character strings.   Tags are case-sensitive.   A new tag with a key identical to that of an existing tag overwrites the existing tag.   Tagging actions are limited to 5 TPS per AWS account. If your application requires a higher throughput, file a technical support request.   For a full list of tag restrictions, see Limits Related to Queues in the Amazon Simple Queue Service Developer Guide.  Cross-account permissions don't apply to this action. For more information, see see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def tagQueue(params: TagQueueRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagQueue(
    params: TagQueueRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove cost allocation tags from the specified Amazon SQS queue. For an overview, see Tagging Your Amazon SQS Queues in the Amazon Simple Queue Service Developer Guide. When you use queue tags, keep the following guidelines in mind:   Adding more than 50 tags to a queue isn't recommended.   Tags don't have any semantic meaning. Amazon SQS interprets tags as character strings.   Tags are case-sensitive.   A new tag with a key identical to that of an existing tag overwrites the existing tag.   Tagging actions are limited to 5 TPS per AWS account. If your application requires a higher throughput, file a technical support request.   For a full list of tag restrictions, see Limits Related to Queues in the Amazon Simple Queue Service Developer Guide.  Cross-account permissions don't apply to this action. For more information, see see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def untagQueue(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagQueue(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove cost allocation tags from the specified Amazon SQS queue. For an overview, see Tagging Your Amazon SQS Queues in the Amazon Simple Queue Service Developer Guide. When you use queue tags, keep the following guidelines in mind:   Adding more than 50 tags to a queue isn't recommended.   Tags don't have any semantic meaning. Amazon SQS interprets tags as character strings.   Tags are case-sensitive.   A new tag with a key identical to that of an existing tag overwrites the existing tag.   Tagging actions are limited to 5 TPS per AWS account. If your application requires a higher throughput, file a technical support request.   For a full list of tag restrictions, see Limits Related to Queues in the Amazon Simple Queue Service Developer Guide.  Cross-account permissions don't apply to this action. For more information, see see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer Guide. 
    */
  def untagQueue(params: UntagQueueRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagQueue(
    params: UntagQueueRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

