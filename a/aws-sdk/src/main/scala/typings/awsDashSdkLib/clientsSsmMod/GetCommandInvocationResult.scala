package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCommandInvocationResult extends js.Object {
  /**
    * CloudWatch Logs information where Systems Manager sent the command output.
    */
  var CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig] = js.undefined
  /**
    * The parent command ID of the invocation plugin.
    */
  var CommandId: js.UndefOr[CommandId] = js.undefined
  /**
    * The comment text for the command.
    */
  var Comment: js.UndefOr[Comment] = js.undefined
  /**
    * The name of the document that was run. For example, AWS-RunShellScript.
    */
  var DocumentName: js.UndefOr[DocumentName] = js.undefined
  /**
    * The SSM document version used in the request.
    */
  var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
  /**
    * Duration since ExecutionStartDateTime.
    */
  var ExecutionElapsedTime: js.UndefOr[StringDateTime] = js.undefined
  /**
    * The date and time the plugin was finished running. Date and time are written in ISO 8601 format. For example, June 7, 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the InvokedAfter filter.  aws ssm list-commands --filters key=InvokedAfter,value=2017-06-07T00:00:00Z  If the plugin has not started to run, the string is empty.
    */
  var ExecutionEndDateTime: js.UndefOr[StringDateTime] = js.undefined
  /**
    * The date and time the plugin started running. Date and time are written in ISO 8601 format. For example, June 7, 2017 is represented as 2017-06-7. The following sample AWS CLI command uses the InvokedBefore filter.  aws ssm list-commands --filters key=InvokedBefore,value=2017-06-07T00:00:00Z  If the plugin has not started to run, the string is empty.
    */
  var ExecutionStartDateTime: js.UndefOr[StringDateTime] = js.undefined
  /**
    * The ID of the managed instance targeted by the command. A managed instance can be an Amazon EC2 instance or an instance in your hybrid environment that is configured for Systems Manager.
    */
  var InstanceId: js.UndefOr[InstanceId] = js.undefined
  /**
    * The name of the plugin for which you want detailed results. For example, aws:RunShellScript is a plugin.
    */
  var PluginName: js.UndefOr[CommandPluginName] = js.undefined
  /**
    * The error level response code for the plugin script. If the response code is -1, then the command has not started running on the instance, or it was not received by the instance.
    */
  var ResponseCode: js.UndefOr[ResponseCode] = js.undefined
  /**
    * The first 8,000 characters written by the plugin to stderr. If the command has not finished running, then this string is empty.
    */
  var StandardErrorContent: js.UndefOr[StandardErrorContent] = js.undefined
  /**
    * The URL for the complete text written by the plugin to stderr. If the command has not finished running, then this string is empty.
    */
  var StandardErrorUrl: js.UndefOr[Url] = js.undefined
  /**
    * The first 24,000 characters written by the plugin to stdout. If the command has not finished running, if ExecutionStatus is neither Succeeded nor Failed, then this string is empty.
    */
  var StandardOutputContent: js.UndefOr[StandardOutputContent] = js.undefined
  /**
    * The URL for the complete text written by the plugin to stdout in Amazon S3. If an Amazon S3 bucket was not specified, then this string is empty.
    */
  var StandardOutputUrl: js.UndefOr[Url] = js.undefined
  /**
    * The status of this invocation plugin. This status can be different than StatusDetails.
    */
  var Status: js.UndefOr[CommandInvocationStatus] = js.undefined
  /**
    * A detailed status of the command execution for an invocation. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding Command Statuses in the AWS Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command has not been sent to the instance.   In Progress: The command has been sent to the instance but has not reached a terminal state.   Delayed: The system attempted to send the command to the target, but the target was not available. The instance might not be available because of network issues, the instance was stopped, etc. The system will try to deliver the command again.   Success: The command or plugin was run successfully. This is a terminal state.   Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Execution Timed Out: The command started to run on the instance, but the execution was not complete before the timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.   Failed: The command wasn't run successfully on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.   Canceled: The command was terminated before it was completed. This is a terminal state.   Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.  
    */
  var StatusDetails: js.UndefOr[StatusDetails] = js.undefined
}

object GetCommandInvocationResult {
  @scala.inline
  def apply(
    CloudWatchOutputConfig: CloudWatchOutputConfig = null,
    CommandId: CommandId = null,
    Comment: Comment = null,
    DocumentName: DocumentName = null,
    DocumentVersion: DocumentVersion = null,
    ExecutionElapsedTime: StringDateTime = null,
    ExecutionEndDateTime: StringDateTime = null,
    ExecutionStartDateTime: StringDateTime = null,
    InstanceId: InstanceId = null,
    PluginName: CommandPluginName = null,
    ResponseCode: js.UndefOr[ResponseCode] = js.undefined,
    StandardErrorContent: StandardErrorContent = null,
    StandardErrorUrl: Url = null,
    StandardOutputContent: StandardOutputContent = null,
    StandardOutputUrl: Url = null,
    Status: CommandInvocationStatus = null,
    StatusDetails: StatusDetails = null
  ): GetCommandInvocationResult = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchOutputConfig != null) __obj.updateDynamic("CloudWatchOutputConfig")(CloudWatchOutputConfig)
    if (CommandId != null) __obj.updateDynamic("CommandId")(CommandId)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    if (DocumentName != null) __obj.updateDynamic("DocumentName")(DocumentName)
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (ExecutionElapsedTime != null) __obj.updateDynamic("ExecutionElapsedTime")(ExecutionElapsedTime)
    if (ExecutionEndDateTime != null) __obj.updateDynamic("ExecutionEndDateTime")(ExecutionEndDateTime)
    if (ExecutionStartDateTime != null) __obj.updateDynamic("ExecutionStartDateTime")(ExecutionStartDateTime)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (PluginName != null) __obj.updateDynamic("PluginName")(PluginName)
    if (!js.isUndefined(ResponseCode)) __obj.updateDynamic("ResponseCode")(ResponseCode)
    if (StandardErrorContent != null) __obj.updateDynamic("StandardErrorContent")(StandardErrorContent)
    if (StandardErrorUrl != null) __obj.updateDynamic("StandardErrorUrl")(StandardErrorUrl)
    if (StandardOutputContent != null) __obj.updateDynamic("StandardOutputContent")(StandardOutputContent)
    if (StandardOutputUrl != null) __obj.updateDynamic("StandardOutputUrl")(StandardOutputUrl)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetails != null) __obj.updateDynamic("StatusDetails")(StatusDetails)
    __obj.asInstanceOf[GetCommandInvocationResult]
  }
}

